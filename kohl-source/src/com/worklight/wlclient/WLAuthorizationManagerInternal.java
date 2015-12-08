// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.worklight.wlclient;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import com.worklight.common.Logger;
import com.worklight.common.WLConfig;
import com.worklight.common.security.WLDeviceAuthManager;
import com.worklight.common.security.WLOAuthCertManager;
import com.worklight.nativeandroid.common.WLUtils;
import com.worklight.utils.Base64;
import com.worklight.wlclient.api.WLAuthorizationException;
import com.worklight.wlclient.api.WLAuthorizationPersistencePolicy;
import com.worklight.wlclient.api.WLClient;
import com.worklight.wlclient.api.WLErrorCode;
import com.worklight.wlclient.api.WLFailResponse;
import com.worklight.wlclient.api.WLRequestOptions;
import com.worklight.wlclient.api.WLResponse;
import com.worklight.wlclient.api.WLResponseListener;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URLConnection;
import java.security.KeyPair;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.UnrecoverableEntryException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.CertificateNotYetValidException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.UUID;
import java.util.regex.Pattern;
import org.apache.http.Header;
import org.apache.http.HttpRequest;
import org.apache.http.HttpResponse;
import org.apache.http.StatusLine;
import org.apache.http.client.methods.HttpUriRequest;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.worklight.wlclient:
//            AsynchronousRequestSender, RequestMethod, WLRequest, WLClientInstanceRegistrationRequest, 
//            WLClientInstanceIdListener, WLRequestListener

public class WLAuthorizationManagerInternal
{

    private static final String AUTHORIZATION_HEADER = "Authorization";
    private static final String BEARER = "Bearer";
    private static final String CLIENT_ID_HEADER = "X-WL-ClientId";
    private static final String CLIENT_ID_OAUTH_LABEL = "com.worklight.oauth.clientid";
    private static final String INSTANCE_REG_PATH = "clients/instance";
    private static final String JSON_ACCESS_TOKEN_KEY = "access_token";
    private static final String JSON_APPLICATION_ID_KEY = "applicationId";
    private static final String JSON_APPLICATION_VERSION_KEY = "applicationVersion";
    private static final String JSON_CERTIFICATE_KEY = "certificate";
    private static final String JSON_DEVICE_ID_KEY = "deviceId";
    private static final String JSON_ENVIRONMENT_KEY = "environment";
    private static final String JSON_ERROR_DESCRIPTION_KEY = "error_description";
    private static final String JSON_ERROR_KEY = "error";
    private static final String JSON_ID_TOKEN_KEY = "id_token";
    private static final String JSON_MODEL_KEY = "deviceModel";
    private static final String JSON_OS_KEY = "deviceOs";
    private static final String LOCATION = "location";
    private static final String LOCATION_HEADER = "Location";
    private static final String OAUTH_ACCESS_TOKEN_LABEL = "com.worklight.oauth.accesstoken";
    private static final String OAUTH_AUTHORIZATION_PATH = "authorization";
    private static final String OAUTH_ID_TOKEN_LABEL = "com.worklight.oauth.idtoken";
    private static final String OAUTH_PREVENT_REDIRECT = "wl-oauth-prevent-redirect";
    private static final String OAUTH_TOKEN_PATH = "token";
    private static final String PARAM_AUTHORIZATION_CODE_VALUE = "authorization_code";
    private static final String PARAM_CLIENT_ID_KEY = "client_id";
    private static final String PARAM_CODE_KEY = "code";
    private static final String PARAM_CODE_VALUE = "code";
    private static final String PARAM_CSR_KEY = "CSR";
    private static final String PARAM_GRANT_TYPE_KEY = "grant_type";
    private static final String PARAM_REDIRECT_URI_KEY = "redirect_uri";
    private static final String PARAM_REDIRECT_URI_VALUE = "http://mfpredirecturi";
    private static final String PARAM_RESPONSE_TYPE_KEY = "response_type";
    private static final String PARAM_SCOPE_KEY = "scope";
    private static final String PROVISIONING_ENTITY_FOR_KEYS = "WLAuthorizationManagerProvisioningEntity";
    private static final String REALM_IMF_AUTHENTICATION = "realm=\"imfAuthentication\"";
    private static final String TOKEN_PERSISTENCE_POLICY = "com.worklight.oauth.token.persistence.policy";
    private static final String UNAUTHORIZED_CLIENT_ERROR = "unauthorized_client";
    private static final String UNKNOWN_CLIENT_ERROR_DESCRIPTION = "Unknown client";
    private static final String WL_RESULT = "wl_result";
    private static final String WL_X_SESSION_ID_HEADER = "X-WL-Session";
    private static final String WWW_AUTHENTICATE_HEADER = "WWW-Authenticate";
    private static final String X_WL_AUTHENTICATE_HEADER = "X-WL-Authenticate";
    private static WLAuthorizationManagerInternal instance = null;
    private static Logger logger = Logger.getInstance(com/worklight/wlclient/WLAuthorizationManagerInternal.getSimpleName());
    private String accessToken;
    private boolean authorizationInProgress;
    private HashMap authorizationQueue;
    private String clientId;
    private String idToken;
    private WLAuthorizationPersistencePolicy persistencePolicy;
    private ArrayList registrationQueue;
    private boolean shouldCallRegistrationAfterUnknowClientError;
    private String wlSessionID;

    private WLAuthorizationManagerInternal()
    {
        clientId = null;
        shouldCallRegistrationAfterUnknowClientError = true;
        String s = WLConfig.getInstance().readWLPref("com.worklight.oauth.token.persistence.policy");
        if (s != null)
        {
            persistencePolicy = WLAuthorizationPersistencePolicy.valueOf(s);
        } else
        {
            persistencePolicy = WLAuthorizationPersistencePolicy.ALWAYS;
        }
        registrationQueue = new ArrayList();
        authorizationQueue = new HashMap();
        authorizationInProgress = false;
        addNewSessionGlobalHeader();
    }

    private void abortAuthorization(WLFailResponse wlfailresponse)
    {
        for (Iterator iterator = authorizationQueue.keySet().iterator(); iterator.hasNext();)
        {
            Object obj = (String)iterator.next();
            obj = ((ArrayList)authorizationQueue.get(obj)).iterator();
            while (((Iterator) (obj)).hasNext()) 
            {
                ((WLResponseListener)((Iterator) (obj)).next()).onFailure(wlfailresponse);
            }
        }

        authorizationQueue.clear();
        authorizationInProgress = false;
    }

    private void addNewSessionGlobalHeader()
    {
        if (!AsynchronousRequestSender.getInstance().getGlobalHeaders().keySet().contains("X-WL-Session"))
        {
            wlSessionID = UUID.randomUUID().toString();
            WLClient.getInstance().addGlobalHeader("X-WL-Session", wlSessionID);
        }
    }

    private void addToAuthorizationQueue(String s, WLResponseListener wlresponselistener)
    {
        String s1 = s;
        if (s == null)
        {
            s1 = "";
        }
        ArrayList arraylist = (ArrayList)authorizationQueue.get(s1);
        s = arraylist;
        if (arraylist == null)
        {
            s = new ArrayList();
            authorizationQueue.put(s1, s);
        }
        s.add(wlresponselistener);
    }

    private void clearPersistedToken()
    {
        persistToken(null, null);
    }

    private X509Certificate createCertificateFromString(String s)
        throws CertificateException, IOException
    {
        s = new ByteArrayInputStream(Base64.decode(s.getBytes()));
        X509Certificate x509certificate = (X509Certificate)CertificateFactory.getInstance("X.509").generateCertificate(s);
        s.close();
        return x509certificate;
    }

    private String getAccessToken()
    {
        if (accessToken == null && persistencePolicy == WLAuthorizationPersistencePolicy.ALWAYS)
        {
            accessToken = WLConfig.getInstance().readWLPref("com.worklight.oauth.accesstoken");
        }
        return accessToken;
    }

    private Header[] getAuthenticationHeaders(HttpResponse httpresponse)
    {
        return httpresponse.getHeaders("WWW-Authenticate");
    }

    private String getIdToken()
    {
        if (idToken == null && persistencePolicy == WLAuthorizationPersistencePolicy.ALWAYS)
        {
            idToken = WLConfig.getInstance().readWLPref("com.worklight.oauth.idtoken");
        }
        return idToken;
    }

    private JSONObject getIdTokenJSON()
    {
        JSONObject jsonobject = null;
        if (getIdToken() != null)
        {
            try
            {
                jsonobject = new JSONObject(new String(android.util.Base64.decode(idToken.split("\\.")[1], 0)));
            }
            catch (JSONException jsonexception)
            {
                return null;
            }
        }
        return jsonobject;
    }

    public static WLAuthorizationManagerInternal getInstance()
    {
        com/worklight/wlclient/WLAuthorizationManagerInternal;
        JVM INSTR monitorenter ;
        WLAuthorizationManagerInternal wlauthorizationmanagerinternal;
        if (instance == null)
        {
            instance = new WLAuthorizationManagerInternal();
        }
        wlauthorizationmanagerinternal = instance;
        com/worklight/wlclient/WLAuthorizationManagerInternal;
        JVM INSTR monitorexit ;
        return wlauthorizationmanagerinternal;
        Exception exception;
        exception;
        throw exception;
    }

    private String getNextScopeToObtain()
    {
        String s = "";
        Iterator iterator = authorizationQueue.keySet().iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            String s1 = (String)iterator.next();
            if (s1.length() > s.length())
            {
                s = s1;
            }
        } while (true);
        return s;
    }

    private void invokeAuthorizationRequest(final String scope)
    {
        HashMap hashmap = new HashMap();
        hashmap.put("response_type", "code");
        hashmap.put("client_id", getClientId());
        hashmap.put("redirect_uri", "http://mfpredirecturi");
        hashmap.put("scope", scope);
        sendRequest("authorization", hashmap, null, RequestMethod.GET, new WLResponseListener() {

            final WLAuthorizationManagerInternal this$0;
            final String val$scope;

            public void onFailure(WLFailResponse wlfailresponse)
            {
                onAuthFailure(scope, wlfailresponse);
            }

            public void onSuccess(WLResponse wlresponse)
            {
                Object obj = wlresponse.getHeader("location");
                if (obj == null)
                {
                    onAuthFailure(scope, new WLFailResponse(wlresponse));
                    return;
                }
                obj = (String)WLUtils.extractParametersFromURL(((Header) (obj)).getValue()).get("code");
                if (obj == null)
                {
                    onAuthFailure(scope, new WLFailResponse(wlresponse));
                    return;
                } else
                {
                    invokeTokenRequest(((String) (obj)), new WLResponseListener() {

                        final _cls5 this$1;

                        public void onFailure(WLFailResponse wlfailresponse)
                        {
                            onAuthFailure(scope, wlfailresponse);
                        }

                        public void onSuccess(WLResponse wlresponse)
                        {
                            try
                            {
                                onTokenSuccess(wlresponse);
                                return;
                            }
                            catch (JSONException jsonexception)
                            {
                                onFailure(new WLFailResponse(wlresponse));
                            }
                        }

            
            {
                this$1 = _cls5.this;
                super();
            }
                    });
                    return;
                }
            }

            
            {
                this$0 = WLAuthorizationManagerInternal.this;
                scope = s;
                super();
            }
        });
    }

    private void invokeInstanceRegistrationRequest(WLResponseListener wlresponselistener)
    {
        registrationQueue.add(wlresponselistener);
        invokeRegistrationRequest();
    }

    private void invokeInstanceRegistrationRequest(final String scope, final WLResponseListener listener)
    {
        this;
        JVM INSTR monitorenter ;
        invokeInstanceRegistrationRequest(new WLResponseListener() {

            final WLAuthorizationManagerInternal this$0;
            final WLResponseListener val$listener;
            final String val$scope;

            public void onFailure(WLFailResponse wlfailresponse)
            {
                listener.onFailure(wlfailresponse);
            }

            public void onSuccess(WLResponse wlresponse)
            {
                addToAuthorizationQueue(scope, listener);
                invokeAuthorizationRequest(scope);
            }

            
            {
                this$0 = WLAuthorizationManagerInternal.this;
                scope = s;
                listener = wlresponselistener;
                super();
            }
        });
        this;
        JVM INSTR monitorexit ;
        return;
        scope;
        throw scope;
    }

    private void invokeNextAuthorizationRequest()
    {
        if (!authorizationQueue.isEmpty())
        {
            invokeAuthorizationRequest(getNextScopeToObtain());
            return;
        } else
        {
            authorizationInProgress = false;
            return;
        }
    }

    private void invokeRegistrationRequest()
    {
        Object obj;
        Object obj2;
        if (registrationQueue.size() != 1)
        {
            break MISSING_BLOCK_LABEL_182;
        }
        obj = new JSONObject();
        obj2 = WLClient.getInstance().getContext();
        ((JSONObject) (obj)).put("deviceId", WLDeviceAuthManager.getInstance().getDeviceUUID(((Context) (obj2))));
        ((JSONObject) (obj)).put("deviceOs", (new StringBuilder()).append("").append(Integer.toString(((Context) (obj2)).getPackageManager().getPackageInfo(((Context) (obj2)).getPackageName(), 0).versionCode)).toString());
        ((JSONObject) (obj)).put("deviceModel", Build.MODEL);
        ((JSONObject) (obj)).put("applicationId", WLConfig.getInstance().getAppId());
        ((JSONObject) (obj)).put("applicationVersion", WLConfig.getInstance().getApplicationVersion());
        ((JSONObject) (obj)).put("environment", WLConfig.getInstance().getWLEnvironment());
        WLOAuthCertManager.getInstance().generateKeyPair();
        obj = WLOAuthCertManager.getInstance().signCsr(((JSONObject) (obj)));
        obj2 = new HashMap();
        ((HashMap) (obj2)).put("CSR", obj);
        sendRequest("clients/instance", ((HashMap) (obj2)), null, RequestMethod.POST, new WLResponseListener() {

            final WLAuthorizationManagerInternal this$0;

            public void onFailure(WLFailResponse wlfailresponse)
            {
                WLAuthorizationManagerInternal wlauthorizationmanagerinternal = WLAuthorizationManagerInternal.this;
                wlauthorizationmanagerinternal;
                JVM INSTR monitorenter ;
                onRegistrationFailure(wlfailresponse);
                for (Iterator iterator = registrationQueue.iterator(); iterator.hasNext(); ((WLResponseListener)iterator.next()).onFailure(wlfailresponse)) { }
                break MISSING_BLOCK_LABEL_58;
                wlfailresponse;
                wlauthorizationmanagerinternal;
                JVM INSTR monitorexit ;
                throw wlfailresponse;
                registrationQueue.clear();
                wlauthorizationmanagerinternal;
                JVM INSTR monitorexit ;
            }

            public void onSuccess(WLResponse wlresponse)
            {
                WLAuthorizationManagerInternal wlauthorizationmanagerinternal = WLAuthorizationManagerInternal.this;
                wlauthorizationmanagerinternal;
                JVM INSTR monitorenter ;
                onRegistrationSuccess(wlresponse);
_L1:
                for (Iterator iterator = registrationQueue.iterator(); iterator.hasNext(); ((WLResponseListener)iterator.next()).onSuccess(wlresponse)) { }
                break MISSING_BLOCK_LABEL_90;
                wlresponse;
                wlauthorizationmanagerinternal;
                JVM INSTR monitorexit ;
                throw wlresponse;
                Exception exception;
                exception;
                WLAuthorizationManagerInternal.logger.error("Unable to finish client instance registration process. ", exception);
                onFailure(new WLFailResponse(WLErrorCode.AUTHORIZATION_FAILURE, exception.getMessage(), null));
                  goto _L1
                registrationQueue.clear();
                wlauthorizationmanagerinternal;
                JVM INSTR monitorexit ;
            }

            
            {
                this$0 = WLAuthorizationManagerInternal.this;
                super();
            }
        });
        return;
        Object obj1;
        obj1;
        throw new Error(((Throwable) (obj1)));
        obj1;
        throw new Error(((Throwable) (obj1)));
        obj1;
        throw new Error(((Throwable) (obj1)));
    }

    private void invokeTokenRequest(String s, WLResponseListener wlresponselistener)
    {
        try
        {
            Object obj = new JSONObject();
            ((JSONObject) (obj)).put("code", s);
            HashMap hashmap = new HashMap();
            hashmap.put("code", s);
            hashmap.put("client_id", getClientId());
            hashmap.put("grant_type", "authorization_code");
            hashmap.put("redirect_uri", "http://mfpredirecturi");
            s = WLOAuthCertManager.getInstance().signJWS(((JSONObject) (obj)));
            obj = new HashMap();
            ((HashMap) (obj)).put("X-WL-Authenticate", s);
            sendRequest("token", hashmap, ((HashMap) (obj)), RequestMethod.POST, wlresponselistener);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw new Error(s);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw new Error(s);
        }
    }

    private boolean isContainedScope(String s, String s1)
    {
        if (s.equals(""))
        {
            return true;
        } else
        {
            s = Arrays.asList(s.split(" "));
            return Arrays.asList(s1.split(" ")).containsAll(s);
        }
    }

    private boolean isUnknownClientError(WLResponse wlresponse)
    {
        wlresponse = wlresponse.getResponseJSON();
        if (wlresponse == null)
        {
            break MISSING_BLOCK_LABEL_42;
        }
        boolean flag;
        if (!wlresponse.getString("error").equals("unauthorized_client"))
        {
            break MISSING_BLOCK_LABEL_42;
        }
        flag = wlresponse.getString("error_description").equals("Unknown client");
        if (flag)
        {
            return true;
        }
        break MISSING_BLOCK_LABEL_42;
        wlresponse;
        return false;
    }

    private void onAuthFailure(final String scope, WLFailResponse wlfailresponse)
    {
        this;
        JVM INSTR monitorenter ;
        if (!isUnknownClientError(wlfailresponse) || !shouldCallRegistrationAfterUnknowClientError) goto _L2; else goto _L1
_L1:
        shouldCallRegistrationAfterUnknowClientError = false;
        logger.error("Client instance registration information is incorrect, attempting to re-register client instance.");
        clearRegistration();
        invokeInstanceRegistrationRequest(new WLResponseListener() {

            final WLAuthorizationManagerInternal this$0;
            final String val$scope;

            public void onFailure(WLFailResponse wlfailresponse1)
            {
                releaseAuthorizationQueueOnFailure(scope, wlfailresponse1);
            }

            public void onSuccess(WLResponse wlresponse)
            {
                invokeAuthorizationRequest(scope);
            }

            
            {
                this$0 = WLAuthorizationManagerInternal.this;
                scope = s;
                super();
            }
        });
_L4:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        Object obj = wlfailresponse;
        if (wlfailresponse.getHeader("location") == null)
        {
            break MISSING_BLOCK_LABEL_111;
        }
        obj = (String)WLUtils.extractParametersFromURL(wlfailresponse.getHeader("location").getValue()).get("error_description");
        wlfailresponse = ((WLFailResponse) (obj));
        if (obj != null)
        {
            break MISSING_BLOCK_LABEL_98;
        }
        wlfailresponse = WLErrorCode.AUTHORIZATION_FAILURE.getDescription();
        obj = new WLFailResponse(WLErrorCode.AUTHORIZATION_FAILURE, wlfailresponse, null);
        releaseAuthorizationQueueOnFailure(scope, ((WLFailResponse) (obj)));
        if (true) goto _L4; else goto _L3
_L3:
        scope;
        throw scope;
    }

    private void onRegistrationFailure(WLFailResponse wlfailresponse)
    {
        this;
        JVM INSTR monitorenter ;
        clearRegistration();
        abortAuthorization(wlfailresponse);
        this;
        JVM INSTR monitorexit ;
        return;
        wlfailresponse;
        throw wlfailresponse;
    }

    private void onRegistrationSuccess(WLResponse wlresponse)
        throws Exception
    {
        this;
        JVM INSTR monitorenter ;
        wlresponse = WLUtils.convertStringToJSON(wlresponse.getResponseText());
        if (wlresponse.getString("certificate") == null)
        {
            break MISSING_BLOCK_LABEL_32;
        }
        saveCertificate(wlresponse);
        shouldCallRegistrationAfterUnknowClientError = true;
        this;
        JVM INSTR monitorexit ;
        return;
        throw new Exception("Saving certificate failed");
        wlresponse;
        this;
        JVM INSTR monitorexit ;
        throw wlresponse;
    }

    private void onTokenSuccess(WLResponse wlresponse)
        throws JSONException
    {
        this;
        JVM INSTR monitorenter ;
        Object obj = wlresponse.getResponseJSON();
        if (obj == null) goto _L2; else goto _L1
_L1:
        saveToken(((JSONObject) (obj)));
        String s = null;
        if (((JSONObject) (obj)).has("scope"))
        {
            s = ((JSONObject) (obj)).getString("scope");
        }
          goto _L3
_L5:
        releaseAuthorizationQueueOnSuccess(((String) (obj)), wlresponse);
_L2:
        this;
        JVM INSTR monitorexit ;
        return;
        wlresponse;
        throw wlresponse;
_L3:
        obj = s;
        if (s == null)
        {
            obj = "";
        }
        if (true) goto _L5; else goto _L4
_L4:
    }

    private void persistToken(String s, String s1)
    {
        WLConfig.getInstance().writeWLPref("com.worklight.oauth.accesstoken", s);
        WLConfig.getInstance().writeWLPref("com.worklight.oauth.idtoken", s1);
    }

    private void releaseAuthorizationQueueOnFailure(String s, WLFailResponse wlfailresponse)
    {
        Iterator iterator = authorizationQueue.keySet().iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            Object obj = (String)iterator.next();
            if (scopesEqual(s, ((String) (obj))))
            {
                for (obj = ((ArrayList)authorizationQueue.get(obj)).iterator(); ((Iterator) (obj)).hasNext(); ((WLResponseListener)((Iterator) (obj)).next()).onFailure(wlfailresponse)) { }
                iterator.remove();
            }
        } while (true);
        invokeNextAuthorizationRequest();
    }

    private void releaseAuthorizationQueueOnSuccess(String s, WLResponse wlresponse)
    {
        Iterator iterator = authorizationQueue.keySet().iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            Object obj = (String)iterator.next();
            if (isContainedScope(((String) (obj)), s))
            {
                for (obj = ((ArrayList)authorizationQueue.get(obj)).iterator(); ((Iterator) (obj)).hasNext(); ((WLResponseListener)((Iterator) (obj)).next()).onSuccess(wlresponse)) { }
                iterator.remove();
            }
        } while (true);
        invokeNextAuthorizationRequest();
    }

    private void saveCertificate(JSONObject jsonobject)
        throws JSONException, Exception
    {
        jsonobject = createCertificateFromString(jsonobject.getString("certificate"));
        validateCertificate(jsonobject);
        clientId = WLOAuthCertManager.getInstance().extractClientIdFromCertificate(jsonobject);
        WLConfig.getInstance().writeWLPref("com.worklight.oauth.clientid", clientId);
        WLOAuthCertManager.getInstance().saveCertificate("WLAuthorizationManagerProvisioningEntity", jsonobject, null);
    }

    private void saveToken(String s, String s1)
    {
        accessToken = s;
        idToken = s1;
        if (persistencePolicy == WLAuthorizationPersistencePolicy.ALWAYS)
        {
            persistToken(s, s1);
        }
    }

    private void saveToken(JSONObject jsonobject)
        throws JSONException
    {
        this;
        JVM INSTR monitorenter ;
        if (jsonobject.has("access_token") && jsonobject.has("id_token"))
        {
            saveToken(jsonobject.getString("access_token"), jsonobject.getString("id_token"));
        }
        this;
        JVM INSTR monitorexit ;
        return;
        jsonobject;
        throw jsonobject;
    }

    private boolean scopesEqual(String s, String s1)
    {
        s = Arrays.asList(s.split(" "));
        s1 = Arrays.asList(s1.split(" "));
        return s.containsAll(s1) && s1.containsAll(s);
    }

    private void sendRequest(String s, HashMap hashmap, HashMap hashmap1, RequestMethod requestmethod, final WLResponseListener responseListener)
    {
        String s1 = (new StringBuilder()).append("authorization/v1/").append(s).toString();
        s = new WLRequestOptions();
        String s3;
        for (Iterator iterator = hashmap.keySet().iterator(); iterator.hasNext(); s.addParameter(s3, hashmap.get(s3).toString()))
        {
            s3 = (String)iterator.next();
        }

        if (hashmap1 != null)
        {
            String s2;
            for (hashmap = hashmap1.keySet().iterator(); hashmap.hasNext(); s.addHeader(s2, (String)hashmap1.get(s2)))
            {
                s2 = (String)hashmap.next();
            }

        }
        s.setResponseListener(responseListener);
        hashmap = new WLRequestListener() {

            final WLAuthorizationManagerInternal this$0;
            final WLResponseListener val$responseListener;

            public void onFailure(WLFailResponse wlfailresponse)
            {
                responseListener.onFailure(wlfailresponse);
            }

            public void onSuccess(WLResponse wlresponse)
            {
                responseListener.onSuccess(wlresponse);
            }

            
            {
                this$0 = WLAuthorizationManagerInternal.this;
                responseListener = wlresponselistener;
                super();
            }
        };
        if (getClientId() != null)
        {
            s = new WLRequest(hashmap, s, WLConfig.getInstance(), WLClient.getInstance().getContext(), true);
        } else
        {
            s = new WLClientInstanceRegistrationRequest(hashmap, s, WLConfig.getInstance(), WLClient.getInstance().getContext());
        }
        s.setMethod(requestmethod);
        s.makeRequest(s1, true);
    }

    private void validateCertificate(X509Certificate x509certificate)
        throws CertificateException
    {
        java.security.PublicKey publickey;
        try
        {
            x509certificate.checkValidity();
        }
        catch (CertificateNotYetValidException certificatenotyetvalidexception) { }
        try
        {
            publickey = WLOAuthCertManager.getInstance().getKeyPair().getPublic();
        }
        // Misplaced declaration of an exception variable
        catch (X509Certificate x509certificate)
        {
            throw new RuntimeException(x509certificate);
        }
        // Misplaced declaration of an exception variable
        catch (X509Certificate x509certificate)
        {
            throw new Error(x509certificate);
        }
        // Misplaced declaration of an exception variable
        catch (X509Certificate x509certificate)
        {
            throw new RuntimeException(x509certificate);
        }
        x509certificate = x509certificate.getPublicKey();
        if (x509certificate == null || !x509certificate.equals(publickey))
        {
            throw new CertificateException("Invalid certificate received, public keys do not match.");
        } else
        {
            return;
        }
    }

    public void addCachedAuthorizationHeader(URLConnection urlconnection)
    {
        String s = getCachedAuthorizationHeader();
        if (!s.equals(""))
        {
            urlconnection.setRequestProperty("Authorization", s);
        }
    }

    public void addCachedAuthorizationHeader(HttpUriRequest httpurirequest)
    {
        String s = getCachedAuthorizationHeader();
        if (!s.equals(""))
        {
            httpurirequest.setHeader("Authorization", s);
        }
    }

    public void addClientIdHeaderToRequest(HttpRequest httprequest)
    {
        String s = getClientId();
        if (s != null)
        {
            httprequest.addHeader("X-WL-ClientId", s);
        }
        if (httprequest.getFirstHeader("X-WL-Session") == null)
        {
            httprequest.addHeader("X-WL-Session", wlSessionID);
        }
    }

    public void clearRegistration()
    {
        this;
        JVM INSTR monitorenter ;
        saveToken(null, null);
        clientId = null;
        WLConfig.getInstance().writeWLPref("com.worklight.oauth.clientid", null);
        WLOAuthCertManager.getInstance().clearKeystore("WLAuthorizationManagerProvisioningEntity");
        addNewSessionGlobalHeader();
        this;
        JVM INSTR monitorexit ;
        return;
        Object obj;
        obj;
        logger.error("Unable to clear registration data from keystore.");
        throw new RuntimeException(((Throwable) (obj)));
        obj;
        this;
        JVM INSTR monitorexit ;
        throw obj;
    }

    public JSONObject getAppIdentity()
    {
        JSONObject jsonobject = null;
        JSONObject jsonobject1;
        try
        {
            jsonobject1 = getIdTokenJSON();
        }
        catch (JSONException jsonexception)
        {
            return null;
        }
        if (jsonobject1 == null)
        {
            break MISSING_BLOCK_LABEL_19;
        }
        jsonobject = jsonobject1.getJSONObject("imf.application");
        return jsonobject;
    }

    public WLAuthorizationPersistencePolicy getAuthorizationPersistencePolicy()
    {
        return persistencePolicy;
    }

    public String getAuthorizationScope(String s)
    {
        String s1 = null;
        int i = s.indexOf("scope=");
        if (i >= 0)
        {
            s1 = s.substring(i + 6).replaceAll(Pattern.quote("\""), "");
        }
        return s1;
    }

    public String getAuthorizationScope(HttpResponse httpresponse)
    {
        Object obj = null;
        Header aheader[] = getAuthenticationHeaders(httpresponse);
        int j = aheader.length;
        int i = 0;
        httpresponse = obj;
        for (; i < j; i++)
        {
            Header header = aheader[i];
            if (httpresponse != null)
            {
                throw new Error("Multiple values for 'WWW-Authenticate' header were detected");
            }
            httpresponse = getAuthorizationScope(header.getValue());
        }

        return httpresponse;
    }

    public String getCachedAuthorizationHeader()
    {
        this;
        JVM INSTR monitorenter ;
        String s;
        String s1;
        s = getAccessToken();
        s1 = getIdToken();
        if (s == null || s1 == null) goto _L2; else goto _L1
_L1:
        s = (new StringBuilder()).append("Bearer ").append(s).append(" ").append(s1).toString();
_L4:
        this;
        JVM INSTR monitorexit ;
        return s;
_L2:
        s = "";
        if (true) goto _L4; else goto _L3
_L3:
        Exception exception;
        exception;
        throw exception;
    }

    public String getClientId()
    {
        if (clientId == null)
        {
            clientId = WLConfig.getInstance().readWLPref("com.worklight.oauth.clientid");
            if (clientId == null)
            {
                try
                {
                    clientId = WLOAuthCertManager.getInstance().getClientIdFromCertificate();
                }
                catch (Exception exception)
                {
                    clientId = null;
                }
            }
        }
        return clientId;
    }

    public void getClientInstanceIdHeader(final WLClientInstanceIdListener listener)
    {
        this;
        JVM INSTR monitorenter ;
        String s = getClientId();
        if (s == null) goto _L2; else goto _L1
_L1:
        listener.onSuccess(s);
_L4:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        invokeInstanceRegistrationRequest(new WLResponseListener() {

            final WLAuthorizationManagerInternal this$0;
            final WLClientInstanceIdListener val$listener;

            public void onFailure(WLFailResponse wlfailresponse)
            {
                listener.onFailure(new WLAuthorizationException(wlfailresponse));
            }

            public void onSuccess(WLResponse wlresponse)
            {
                listener.onSuccess(getClientId());
            }

            
            {
                this$0 = WLAuthorizationManagerInternal.this;
                listener = wlclientinstanceidlistener;
                super();
            }
        });
        if (true) goto _L4; else goto _L3
_L3:
        listener;
        throw listener;
    }

    public JSONObject getDeviceIdentity()
    {
        JSONObject jsonobject = null;
        JSONObject jsonobject1;
        try
        {
            jsonobject1 = getIdTokenJSON();
        }
        catch (JSONException jsonexception)
        {
            return null;
        }
        if (jsonobject1 == null)
        {
            break MISSING_BLOCK_LABEL_19;
        }
        jsonobject = jsonobject1.getJSONObject("imf.device");
        return jsonobject;
    }

    public JSONObject getUserIdentity()
    {
        JSONObject jsonobject = null;
        JSONObject jsonobject1;
        try
        {
            jsonobject1 = getIdTokenJSON();
        }
        catch (JSONException jsonexception)
        {
            return null;
        }
        if (jsonobject1 == null)
        {
            break MISSING_BLOCK_LABEL_19;
        }
        jsonobject = jsonobject1.getJSONObject("imf.user");
        return jsonobject;
    }

    public String getWlSessionId()
    {
        return wlSessionID;
    }

    public void invokeTokenRequestWithGrantCode(String s, final WLResponseListener responseListener)
    {
        invokeTokenRequest(s, new WLResponseListener() {

            final WLAuthorizationManagerInternal this$0;
            final WLResponseListener val$responseListener;

            public void onFailure(WLFailResponse wlfailresponse)
            {
                responseListener.onFailure(wlfailresponse);
            }

            public void onSuccess(WLResponse wlresponse)
            {
                try
                {
                    saveToken(wlresponse.getResponseJSON());
                    responseListener.onSuccess(wlresponse);
                    return;
                }
                catch (JSONException jsonexception)
                {
                    onFailure(new WLFailResponse(wlresponse));
                }
            }

            
            {
                this$0 = WLAuthorizationManagerInternal.this;
                responseListener = wlresponselistener;
                super();
            }
        });
    }

    public boolean isAuthorizationRequired(int i, String s)
    {
        return (i == 401 || i == 403) && s.contains("Bearer") && s.contains("realm=\"imfAuthentication\"");
    }

    public boolean isAuthorizationRequired(HttpResponse httpresponse)
    {
        int i = httpresponse.getStatusLine().getStatusCode();
        if (i == 401 || i == 403)
        {
            httpresponse = getAuthenticationHeaders(httpresponse);
            if (httpresponse.length != 0)
            {
                int k = httpresponse.length;
                int j = 0;
                while (j < k) 
                {
                    String s = httpresponse[j].getValue();
                    if (s.contains("Bearer") && s.contains("realm=\"imfAuthentication\""))
                    {
                        return true;
                    }
                    j++;
                }
            }
        }
        return false;
    }

    public void obtainAuthorizationHeader(String s, WLResponseListener wlresponselistener)
    {
        this;
        JVM INSTR monitorenter ;
        if (!authorizationInProgress) goto _L2; else goto _L1
_L1:
        addToAuthorizationQueue(s, wlresponselistener);
_L3:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        authorizationInProgress = true;
        if (getClientId() == null)
        {
            break MISSING_BLOCK_LABEL_49;
        }
        addToAuthorizationQueue(s, wlresponselistener);
        invokeAuthorizationRequest(s);
          goto _L3
        s;
        throw s;
        invokeInstanceRegistrationRequest(s, wlresponselistener);
          goto _L3
    }

    public void setAuthorizationPersistencePolicy(WLAuthorizationPersistencePolicy wlauthorizationpersistencepolicy)
    {
label0:
        {
            if (wlauthorizationpersistencepolicy == null)
            {
                throw new IllegalArgumentException("The policy argument cannot be null");
            }
            if (persistencePolicy != wlauthorizationpersistencepolicy)
            {
                persistencePolicy = wlauthorizationpersistencepolicy;
                WLConfig.getInstance().writeWLPref("com.worklight.oauth.token.persistence.policy", wlauthorizationpersistencepolicy.name());
                if (wlauthorizationpersistencepolicy != WLAuthorizationPersistencePolicy.ALWAYS)
                {
                    break label0;
                }
                persistToken(accessToken, idToken);
            }
            return;
        }
        clearPersistedToken();
    }

    public boolean shouldIgnoreRedirect(HttpResponse httpresponse)
    {
        Object obj = httpresponse.getFirstHeader("Location");
        if (obj != null)
        {
            obj = ((Header) (obj)).getValue();
            if (obj != null && ((String) (obj)).startsWith("http://mfpredirecturi"))
            {
                httpresponse.setStatusCode(222);
                httpresponse.setReasonPhrase("wl-oauth-prevent-redirect");
                return true;
            }
        }
        return false;
    }












}
