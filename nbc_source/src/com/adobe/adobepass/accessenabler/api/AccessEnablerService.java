// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.adobe.adobepass.accessenabler.api;

import android.app.IntentService;
import android.content.Intent;
import android.os.Bundle;
import android.webkit.CookieManager;
import com.adobe.adobepass.accessenabler.models.AuthenticationToken;
import com.adobe.adobepass.accessenabler.models.AuthorizationToken;
import com.adobe.adobepass.accessenabler.models.DeviceInfo;
import com.adobe.adobepass.accessenabler.models.Event;
import com.adobe.adobepass.accessenabler.models.MetadataKey;
import com.adobe.adobepass.accessenabler.models.MetadataStatus;
import com.adobe.adobepass.accessenabler.models.Mvpd;
import com.adobe.adobepass.accessenabler.models.PreauthorizationCache;
import com.adobe.adobepass.accessenabler.models.PreauthorizationCacheEntry;
import com.adobe.adobepass.accessenabler.models.Requestor;
import com.adobe.adobepass.accessenabler.models.UserMetadata;
import com.adobe.adobepass.accessenabler.network.HttpConnector;
import com.adobe.adobepass.accessenabler.network.HttpSessionManager;
import com.adobe.adobepass.accessenabler.storage.StorageManager;
import com.adobe.adobepass.accessenabler.utils.Log;
import com.adobe.adobepass.accessenabler.utils.Utils;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.zip.GZIPInputStream;
import org.apache.http.Header;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.StatusLine;
import org.apache.http.message.BasicNameValuePair;

// Referenced classes of package com.adobe.adobepass.accessenabler.api:
//            AccessEnablerContext, IAccessEnablerDelegate, AccessEnabler, PassiveAuthnService

public class AccessEnablerService extends IntentService
{
    public static interface AccessEnablerWorker
    {

        public abstract void work(Bundle bundle);
    }

    private class AccessEnablerWorkerThread extends Thread
    {

        private int opCode;
        private Bundle params;
        final AccessEnablerService this$0;

        public void run()
        {
            if (_flddelegate == null)
            {
                Log.e("AccessEnablerService", "No implementation for the IAccessEnablerDelegate was provided.");
                return;
            }
            if (context == null)
            {
                Log.e("AccessEnablerService", "AccessEnabler context not initialized.");
                return;
            }
            try
            {
                accessEnablerWorkers[opCode].work(params);
                return;
            }
            catch (RuntimeException runtimeexception)
            {
                runtimeexception.printStackTrace();
                Log.e("AccessEnablerService", (new StringBuilder()).append("Exception in the worker thread. ").append(runtimeexception.getClass().getSimpleName()).append(" | ").append(runtimeexception.getMessage()).toString());
                return;
            }
        }

        public AccessEnablerWorkerThread(int i, Bundle bundle)
        {
            this$0 = AccessEnablerService.this;
            super();
            params = bundle;
            opCode = i;
        }
    }

    private class InternalStatus
    {

        public Boolean cachedFromStorage;
        public String errorCode;
        public int statusCode;
        final AccessEnablerService this$0;

        public InternalStatus()
        {
            this$0 = AccessEnablerService.this;
            super();
        }

        public InternalStatus(int i, String s, Boolean boolean1)
        {
            this$0 = AccessEnablerService.this;
            super();
            statusCode = i;
            errorCode = s;
            cachedFromStorage = boolean1;
        }
    }


    private static final String SP_DEFAULT_URL = "sp.auth.adobe.com/adobe-services";
    protected static boolean USE_HTTPS = true;
    private static Queue pendingCalls = new LinkedList();
    private final String LOG_TAG = "AccessEnablerService";
    private AccessEnablerWorker accessEnablerWorkers[] = {
        new AccessEnablerWorker() {

            final AccessEnablerService this$0;

            public void work(Bundle bundle)
            {
                doSetRequestor(bundle);
            }

            
            {
                this$0 = AccessEnablerService.this;
                super();
            }
        }, new AccessEnablerWorker() {

            final AccessEnablerService this$0;

            public void work(Bundle bundle)
            {
                getRequestorConfigInfo(bundle);
            }

            
            {
                this$0 = AccessEnablerService.this;
                super();
            }
        }, new AccessEnablerWorker() {

            final AccessEnablerService this$0;

            public void work(Bundle bundle)
            {
                doCheckAuthentication();
            }

            
            {
                this$0 = AccessEnablerService.this;
                super();
            }
        }, new AccessEnablerWorker() {

            final AccessEnablerService this$0;

            public void work(Bundle bundle)
            {
                doGetAuthentication(bundle);
            }

            
            {
                this$0 = AccessEnablerService.this;
                super();
            }
        }, new AccessEnablerWorker() {

            final AccessEnablerService this$0;

            public void work(Bundle bundle)
            {
                doGetAuthenticationToken();
            }

            
            {
                this$0 = AccessEnablerService.this;
                super();
            }
        }, new AccessEnablerWorker() {

            final AccessEnablerService this$0;

            public void work(Bundle bundle)
            {
                doCheckAuthorization(bundle);
            }

            
            {
                this$0 = AccessEnablerService.this;
                super();
            }
        }, new AccessEnablerWorker() {

            final AccessEnablerService this$0;

            public void work(Bundle bundle)
            {
                doGetAuthorization(bundle);
            }

            
            {
                this$0 = AccessEnablerService.this;
                super();
            }
        }, new AccessEnablerWorker() {

            final AccessEnablerService this$0;

            public void work(Bundle bundle)
            {
                doSetSelectedProvider(bundle);
            }

            
            {
                this$0 = AccessEnablerService.this;
                super();
            }
        }, new AccessEnablerWorker() {

            final AccessEnablerService this$0;

            public void work(Bundle bundle)
            {
                doGetSelectedProvider();
            }

            
            {
                this$0 = AccessEnablerService.this;
                super();
            }
        }, new AccessEnablerWorker() {

            final AccessEnablerService this$0;

            public void work(Bundle bundle)
            {
                doGetMetadata(bundle);
            }

            
            {
                this$0 = AccessEnablerService.this;
                super();
            }
        }, 
        new AccessEnablerWorker() {

            final AccessEnablerService this$0;

            public void work(Bundle bundle)
            {
                doLogout();
            }

            
            {
                this$0 = AccessEnablerService.this;
                super();
            }
        }, new AccessEnablerWorker() {

            final AccessEnablerService this$0;

            public void work(Bundle bundle)
            {
                doCheckPreauthorizedResources(bundle);
            }

            
            {
                this$0 = AccessEnablerService.this;
                super();
            }
        }, new AccessEnablerWorker() {

            final AccessEnablerService this$0;

            public void work(Bundle bundle)
            {
                setRequestorComplete();
            }

            
            {
                this$0 = AccessEnablerService.this;
                super();
            }
        }
    };
    private AccessEnablerContext context;
    private IAccessEnablerDelegate _flddelegate;

    public AccessEnablerService()
    {
        super("AccessEnablerService");
    }

    private InternalStatus checkAuthenticationInternal()
    {
        if (!context.requestor.getIsValid())
        {
            return new InternalStatus(0, "Generic Authentication Error", null);
        }
        context.storageManager.readFromStorage();
        AuthenticationToken authenticationtoken = context.storageManager.getAuthenticationToken(true);
        InternalStatus internalstatus = new InternalStatus();
        if (authenticationtoken != null && authenticationtoken.isValid())
        {
            if (context.requestor.isMvpdValid(authenticationtoken.getMvpdId()))
            {
                internalstatus.errorCode = "";
                internalstatus.statusCode = 1;
                internalstatus.cachedFromStorage = Boolean.TRUE;
                context.storageManager.setCurrentMvpdId(authenticationtoken.getMvpdId());
                return internalstatus;
            } else
            {
                Log.d("AccessEnablerService", (new StringBuilder()).append("Unknown MVPD: ").append(authenticationtoken.getMvpdId()).toString());
                internalstatus.statusCode = 0;
                internalstatus.errorCode = "Generic Authentication Error";
                internalstatus.cachedFromStorage = null;
                return internalstatus;
            }
        } else
        {
            internalstatus.statusCode = 0;
            internalstatus.errorCode = "User Not Authenticated Error";
            internalstatus.cachedFromStorage = null;
            return internalstatus;
        }
    }

    private void checkAuthorizationInternal(String s, String s1, boolean flag)
    {
        context.storageManager.readFromStorage();
        if (checkAuthenticationInternal().statusCode != 0)
        {
            break MISSING_BLOCK_LABEL_83;
        }
        if (!flag) goto _L2; else goto _L1
_L1:
        _flddelegate.tokenRequestFailed(s, "User Not Authenticated Error", "");
        sendTrackingData(new Event(1, "User Not Authenticated Error", null), false, null);
_L4:
        return;
_L2:
        if (context.markResourceAsPendingForAuthorization(s, s1) != 1) goto _L4; else goto _L3
_L3:
        (new AccessEnablerWorkerThread(2, null)).start();
        return;
        AuthorizationToken authorizationtoken = context.storageManager.getAuthorizationToken(s);
        if (authorizationtoken != null && authorizationtoken.isValid())
        {
            Log.d("AccessEnablerService", (new StringBuilder()).append("Authorization token found and valid for resource: ").append(s).toString());
            getShortMediaToken(authorizationtoken, Boolean.TRUE);
            return;
        } else
        {
            getAuthorizationToken(s, s1);
            return;
        }
    }

    private void checkPreauthorizedResourcesInternal(ArrayList arraylist)
    {
        Log.d("AccessEnablerService", (new StringBuilder()).append("Retrieving preauthorization for: ").append(Utils.joinStrings(arraylist, " ")).toString());
        String s = (new StringBuilder()).append(getSpUrl()).append("/preauthorize").toString();
        ArrayList arraylist1 = new ArrayList();
        Object obj = context.storageManager.getAuthenticationToken(true);
        if (obj != null)
        {
            obj = ((AuthenticationToken) (obj)).toXml();
        } else
        {
            obj = null;
        }
        arraylist1.add(new BasicNameValuePair("authentication_token", ((String) (obj))));
        arraylist1.add(new BasicNameValuePair("requestor_id", context.requestor.getId()));
        for (arraylist = arraylist.iterator(); arraylist.hasNext(); arraylist1.add(new BasicNameValuePair("resource_id", (String)arraylist.next()))) { }
        arraylist = (new HttpConnector()).post(s, null, null, arraylist1, USE_HTTPS);
        if (arraylist == null)
        {
            Log.d("AccessEnablerService", "No response from server.");
            _flddelegate.preauthorizedResources(new ArrayList());
            return;
        }
        if (arraylist.getStatusLine().getStatusCode() != 200)
        {
            break MISSING_BLOCK_LABEL_366;
        }
        try
        {
            arraylist = new PreauthorizationCache(getResponseContent(arraylist));
            Object obj1 = arraylist.getPreauthorizedResources();
            context.storageManager.setPreauthorizationCache(arraylist);
            arraylist = new ArrayList();
            obj1 = ((List) (obj1)).iterator();
            do
            {
                if (!((Iterator) (obj1)).hasNext())
                {
                    break;
                }
                PreauthorizationCacheEntry preauthorizationcacheentry = (PreauthorizationCacheEntry)((Iterator) (obj1)).next();
                if (preauthorizationcacheentry.isAuthorized())
                {
                    arraylist.add(preauthorizationcacheentry.getId());
                }
            } while (true);
        }
        // Misplaced declaration of an exception variable
        catch (ArrayList arraylist)
        {
            Log.e("AccessEnablerService", arraylist.toString());
            _flddelegate.preauthorizedResources(new ArrayList());
            return;
        }
        _flddelegate.preauthorizedResources(arraylist);
        return;
        _flddelegate.preauthorizedResources(new ArrayList());
        return;
    }

    private void displayAuthenticationResult(int i, String s, Boolean boolean1)
    {
        switch (i)
        {
        default:
            return;

        case 1: // '\001'
            _flddelegate.setAuthenticationStatus(1, "");
            sendTrackingData(new Event(0), true, boolean1);
            return;

        case 0: // '\0'
            _flddelegate.setAuthenticationStatus(0, s);
            sendTrackingData(new Event(0), false, null);
            return;
        }
    }

    private void doCheckAuthentication()
    {
        if (!context.requestor.getIsValid())
        {
            throw new RuntimeException("The requestor is not configured.");
        } else
        {
            InternalStatus internalstatus = checkAuthenticationInternal();
            displayAuthenticationResult(internalstatus.statusCode, internalstatus.errorCode, internalstatus.cachedFromStorage);
            return;
        }
    }

    private void doCheckAuthorization(Bundle bundle)
    {
        if (!context.requestor.getIsValid())
        {
            throw new RuntimeException("The requestor is not configured.");
        } else
        {
            checkAuthorizationInternal(bundle.getString("resource_id"), bundle.getString("generic_data"), true);
            return;
        }
    }

    private void doCheckPreauthorizedResources(Bundle bundle)
    {
        HashMap hashmap;
        Object obj;
        Object obj1;
        boolean flag1;
        if (!context.requestor.getIsValid())
        {
            throw new RuntimeException("The requestor is not configured.");
        }
        context.storageManager.readFromStorage();
        obj = bundle.getStringArrayList("resource_id");
        if (obj == null)
        {
            _flddelegate.preauthorizedResources(new ArrayList());
            return;
        }
        obj1 = context.storageManager.getAuthenticationToken(true);
        bundle = new ArrayList();
        if (obj1 == null)
        {
            break MISSING_BLOCK_LABEL_398;
        }
        hashmap = new HashMap();
        String s;
        for (Iterator iterator = ((ArrayList) (obj)).iterator(); iterator.hasNext(); hashmap.put(s.toUpperCase(), s))
        {
            s = (String)iterator.next();
        }

        if (((AuthenticationToken) (obj1)).hasAuthorizedResources())
        {
            obj = ((AuthenticationToken) (obj1)).getAuthorizedResources().iterator();
            do
            {
                if (!((Iterator) (obj)).hasNext())
                {
                    break;
                }
                obj1 = (String)hashmap.get(((String)((Iterator) (obj)).next()).toUpperCase());
                if (obj1 != null)
                {
                    bundle.add(obj1);
                }
            } while (true);
            _flddelegate.preauthorizedResources(bundle);
            return;
        }
        flag1 = true;
        obj1 = context.storageManager.getPreauthorizationCache();
        if (obj1 == null) goto _L2; else goto _L1
_L1:
        Object obj2 = ((PreauthorizationCache) (obj1)).getPreauthorizedResources();
        if (((List) (obj2)).size() != ((ArrayList) (obj)).size()) goto _L4; else goto _L3
_L3:
        boolean flag;
label0:
        {
            obj2 = ((List) (obj2)).iterator();
            do
            {
                flag = flag1;
                if (!((Iterator) (obj2)).hasNext())
                {
                    break label0;
                }
            } while (hashmap.get(((PreauthorizationCacheEntry)((Iterator) (obj2)).next()).getId().toUpperCase()) != null);
            flag = false;
        }
_L6:
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_392;
        }
        obj = ((PreauthorizationCache) (obj1)).getPreauthorizedResources().iterator();
        do
        {
            if (!((Iterator) (obj)).hasNext())
            {
                break;
            }
            PreauthorizationCacheEntry preauthorizationcacheentry = (PreauthorizationCacheEntry)((Iterator) (obj)).next();
            if (preauthorizationcacheentry.isAuthorized())
            {
                bundle.add(hashmap.get(preauthorizationcacheentry.getId().toUpperCase()));
            }
        } while (true);
        break; /* Loop/switch isn't completed */
_L4:
        flag = false;
        continue; /* Loop/switch isn't completed */
_L2:
        flag = false;
        if (true) goto _L6; else goto _L5
_L5:
        _flddelegate.preauthorizedResources(bundle);
        return;
        checkPreauthorizedResourcesInternal(((ArrayList) (obj)));
        return;
        _flddelegate.preauthorizedResources(new ArrayList());
        return;
    }

    private void doGetAuthentication(Bundle bundle)
    {
        if (!context.requestor.getIsValid())
        {
            throw new RuntimeException("The requestor is not configured.");
        }
        boolean flag = bundle.getBoolean("force_authn");
        context.genericAuthNData = bundle.getString("generic_data");
        context.setAuthenticationInProgress(true);
        bundle = checkAuthenticationInternal();
        if (!flag && ((InternalStatus) (bundle)).statusCode == 1)
        {
            handleAuthenticationResult(1, "", ((InternalStatus) (bundle)).cachedFromStorage);
            return;
        }
        context.getAuthenticationWasCalled = true;
        bundle = context.storageManager.getCurrentMvpdId();
        if (context.storageManager.getCanAuthenticate() && bundle != null && !context.setSelectedProviderWasCalled && context.requestor.isMvpdValid(bundle))
        {
            getAuthenticationInternal();
            return;
        }
        context.setSelectedProviderWasCalled = false;
        bundle = context.requestor.getMvpds();
        if (bundle.size() > 0)
        {
            _flddelegate.displayProviderDialog(new ArrayList(bundle));
            return;
        } else
        {
            Log.d("AccessEnablerService", "The list of known MVPDs is empty.");
            handleAuthenticationResult(0, "Generic Authentication Error", null);
            return;
        }
    }

    private void doGetAuthorization(Bundle bundle)
    {
        if (!context.requestor.getIsValid())
        {
            throw new RuntimeException("The requestor is not configured.");
        }
        Object obj = bundle.getString("resource_id");
        bundle = bundle.getString("generic_data");
        if ("User Not Authenticated Error".equals(checkAuthenticationInternal().errorCode))
        {
            context.markResourceAsPendingForAuthorization(((String) (obj)), bundle);
            obj = new Bundle();
            ((Bundle) (obj)).putBoolean("force_authn", false);
            ((Bundle) (obj)).putString("generid_data", bundle);
            doGetAuthentication(((Bundle) (obj)));
            return;
        } else
        {
            checkAuthorizationInternal(((String) (obj)), bundle, false);
            return;
        }
    }

    private void doGetMetadata(Bundle bundle)
    {
        MetadataStatus metadatastatus;
        MetadataKey metadatakey;
        Log.d("AccessEnablerService", "Retrieving meta-data.");
        metadatastatus = new MetadataStatus();
        metadatakey = (MetadataKey)bundle.getSerializable("metadata_key");
        metadatakey.getKey();
        JVM INSTR tableswitch 0 3: default 60
    //                   0 102
    //                   1 146
    //                   2 235
    //                   3 501;
           goto _L1 _L2 _L3 _L4 _L5
_L1:
        Log.d("AccessEnablerService", (new StringBuilder()).append("Detected request for invalid metadata key: ").append(metadatakey.getKey()).toString());
        bundle = metadatastatus;
_L9:
        _flddelegate.setMetadataStatus(metadatakey, bundle);
        return;
_L2:
        bundle = context.storageManager.getAuthenticationToken(true);
        if (bundle != null)
        {
            bundle = new MetadataStatus(bundle.getExpires());
        } else
        {
            Log.d("AccessEnablerService", "Cannot retrieve authN token exp. date - token not available.");
            bundle = metadatastatus;
        }
        continue; /* Loop/switch isn't completed */
_L3:
        bundle = metadatakey.getArgument("resource_id");
        if (bundle != null)
        {
            AuthorizationToken authorizationtoken = context.storageManager.getAuthorizationToken(bundle);
            if (authorizationtoken != null)
            {
                bundle = new MetadataStatus(authorizationtoken.getTtl());
            } else
            {
                Log.d("AccessEnablerService", (new StringBuilder()).append("Cannot retrieve authZ token exp. date - no such resource: ").append(bundle).toString());
                bundle = metadatastatus;
            }
        } else
        {
            Log.d("AccessEnablerService", "Cannot retrieve authZ token exp. date - no resource specified.");
            bundle = metadatastatus;
        }
        continue; /* Loop/switch isn't completed */
_L4:
        AuthenticationToken authenticationtoken = context.storageManager.getAuthenticationToken(true);
        bundle = metadatastatus;
        if (context.requestor.getIsValid())
        {
            bundle = metadatastatus;
            if (authenticationtoken != null)
            {
                bundle = (new StringBuilder()).append(getSpUrl()).append("/getMetadataDevice").toString();
                ArrayList arraylist = new ArrayList();
                arraylist.add(new BasicNameValuePair("requestor_id", context.requestor.getId()));
                arraylist.add(new BasicNameValuePair("signed_requestor_id", context.requestor.getSignedId()));
                arraylist.add(new BasicNameValuePair("device_id", authenticationtoken.getDeviceId()));
                bundle = (new HttpConnector()).post(bundle, null, null, arraylist, USE_HTTPS);
                if (bundle == null)
                {
                    Log.d("AccessEnablerService", "No response from server.");
                    bundle = metadatastatus;
                } else
                {
                    int i = bundle.getStatusLine().getStatusCode();
                    if (i == 200)
                    {
                        try
                        {
                            bundle = new MetadataStatus(getResponseContent(bundle));
                        }
                        // Misplaced declaration of an exception variable
                        catch (Bundle bundle)
                        {
                            Log.e("AccessEnablerService", bundle.toString());
                            bundle = metadatastatus;
                        }
                    } else
                    {
                        Log.e("AccessEnablerService", (new StringBuilder()).append("Bad response from server. SC=").append(i).toString());
                        bundle = metadatastatus;
                    }
                }
            }
        }
        continue; /* Loop/switch isn't completed */
_L5:
        String s;
        Object obj;
        s = metadatakey.getArgument("user_metadata_name");
        obj = context.storageManager.getAuthenticationToken(true);
        bundle = metadatastatus;
        if (obj == null)
        {
            continue; /* Loop/switch isn't completed */
        }
        bundle = metadatastatus;
        if (!((AuthenticationToken) (obj)).isValid())
        {
            continue; /* Loop/switch isn't completed */
        }
        obj = context.storageManager.getUserMetadata();
        bundle = metadatastatus;
        if (s == null)
        {
            continue; /* Loop/switch isn't completed */
        }
        bundle = metadatastatus;
        if (obj == null)
        {
            continue; /* Loop/switch isn't completed */
        }
        bundle = metadatastatus;
        if (!((UserMetadata) (obj)).isValid())
        {
            continue; /* Loop/switch isn't completed */
        }
        bundle = context.metadataCache;
        if (bundle != null && bundle.isValid() && bundle.getUpdated() >= ((UserMetadata) (obj)).getUpdated()) goto _L7; else goto _L6
_L6:
        context.metadataCache = null;
        Log.d("AccessEnablerService", "Metadata is null, waiting for a thread to make server request.");
        this;
        JVM INSTR monitorenter ;
        bundle = context.metadataCache;
        if (bundle == null)
        {
            break MISSING_BLOCK_LABEL_658;
        }
        if (bundle.isValid() && bundle.getUpdated() >= ((UserMetadata) (obj)).getUpdated())
        {
            break MISSING_BLOCK_LABEL_713;
        }
        context.metadataCache = null;
        Log.d("AccessEnablerService", "Making server call for encrypted metadata");
        bundle = getEncryptedUserMetadata(((UserMetadata) (obj)).toJsonString());
        if (bundle == null)
        {
            break MISSING_BLOCK_LABEL_770;
        }
        Log.d("AccessEnablerService", "Retrieved encrypted metadata from server.");
        bundle = UserMetadata.parseJsonString(bundle);
        if (bundle == null)
        {
            break MISSING_BLOCK_LABEL_750;
        }
        context.metadataCache = bundle;
        this;
        JVM INSTR monitorexit ;
_L7:
        bundle = new MetadataStatus(context.metadataCache.getMetadata(s), context.metadataCache.isKeyEncrypted(s));
        continue; /* Loop/switch isn't completed */
        Log.d("AccessEnablerService", "Error parsing the encrypted metadata.");
        this;
        JVM INSTR monitorexit ;
        bundle = metadatastatus;
        continue; /* Loop/switch isn't completed */
        bundle;
        this;
        JVM INSTR monitorexit ;
        throw bundle;
        Log.d("AccessEnablerService", "No encrypted metadata retrieved from server.");
        this;
        JVM INSTR monitorexit ;
        bundle = metadatastatus;
        if (true) goto _L9; else goto _L8
_L8:
    }

    private void doGetSelectedProvider()
    {
        String s = context.storageManager.getCurrentMvpdId();
        _flddelegate.selectedProvider(context.requestor.getMvpd(s));
    }

    private void doLogout()
    {
        if (!context.requestor.getIsValid())
        {
            throw new RuntimeException("The requestor is not configured.");
        }
        Log.d("AccessEnablerService", "Logging out.");
        AuthenticationToken authenticationtoken = context.storageManager.getAuthenticationToken(true);
        if (authenticationtoken != null && authenticationtoken.isValid())
        {
            String s = (new StringBuilder()).append(getSpUrl()).append("/logout").toString();
            ArrayList arraylist = new ArrayList();
            arraylist.add(new BasicNameValuePair("mso_id", context.storageManager.getCurrentMvpdId()));
            arraylist.add(new BasicNameValuePair("requestor_id", context.requestor.getId()));
            if (authenticationtoken.getSamlNameId() != null)
            {
                arraylist.add(new BasicNameValuePair("name_id", URLEncoder.encode(authenticationtoken.getSamlNameId())));
            }
            if (authenticationtoken.getSessionIndex() != null)
            {
                arraylist.add(new BasicNameValuePair("session_index", URLEncoder.encode(authenticationtoken.getSessionIndex())));
            }
            arraylist.add(new BasicNameValuePair("authentication_token", URLEncoder.encode(authenticationtoken.toXml())));
            arraylist.add(new BasicNameValuePair("redirect_url", AccessEnabler.ADOBEPASS_REDIRECT_URL));
            _flddelegate.navigateToUrl(Utils.buildUrl(s, arraylist, USE_HTTPS));
        } else
        {
            _flddelegate.navigateToUrl(URLDecoder.decode(AccessEnabler.ADOBEPASS_REDIRECT_URL));
        }
        context.storageManager.clearAll();
        context.metadataCache = null;
        context.getAuthenticationWasCalled = false;
        context.setSelectedProviderWasCalled = false;
    }

    private void doSetRequestor(Bundle bundle)
    {
        String s = bundle.getString("requestor_id");
        bundle = bundle.getStringArrayList("sp_urls");
        context.metadataCache = null;
        context.genericAuthNData = null;
        context.resetStatusBeforeSetRequestor();
        Object obj;
        for (bundle = bundle.iterator(); bundle.hasNext(); ((AccessEnablerWorkerThread) (obj)).start())
        {
            obj = (String)bundle.next();
            Bundle bundle1 = new Bundle();
            bundle1.putString("requestor_id", s);
            bundle1.putString("sp_url", ((String) (obj)));
            obj = new AccessEnablerWorkerThread(1, bundle1);
            context.startSetRequestorThread();
        }

        while (context.getSetRequestorThreadCount() != 0) 
        {
            try
            {
                Thread.sleep(50L);
            }
            // Misplaced declaration of an exception variable
            catch (Bundle bundle) { }
        }
        if (context.getIsConfigDataReceived())
        {
            context.requestor.validate(true);
            context.storageManager.setCurrentRequestor(context.requestor);
            context.storageManager.importStorage();
            bundle = PassiveAuthnService.getInstance(context, this);
            if (bundle.canPerformPassiveAuthentication())
            {
                bundle.doPassiveAuthentication();
                return;
            } else
            {
                setRequestorComplete();
                return;
            }
        } else
        {
            _flddelegate.setRequestorComplete(0);
            return;
        }
    }

    private void doSetSelectedProvider(Bundle bundle)
    {
        if (!context.requestor.getIsValid())
        {
            throw new RuntimeException("The requestor is not configured.");
        }
        bundle = bundle.getString("mvpd_id");
        if (bundle == null)
        {
            handleAuthenticationResult(0, "Provider not Selected Error", null);
        } else
        {
            context.setSelectedProviderWasCalled = true;
            if (!context.requestor.isMvpdValid(bundle))
            {
                handleAuthenticationResult(0, "Provider not Selected Error", null);
                return;
            }
            if (!bundle.equals(context.storageManager.getCurrentMvpdId()))
            {
                context.storageManager.clearAllTokens();
                context.storageManager.setCurrentMvpdId(bundle);
                context.metadataCache = null;
                sendTrackingData(new Event(2), false, null);
            }
            if (context.getAuthenticationWasCalled)
            {
                context.getAuthenticationWasCalled = false;
                getAuthenticationInternal();
                return;
            }
        }
    }

    private void getAuthenticationInternal()
    {
        String s = context.storageManager.getCurrentMvpdId();
        if (s == null)
        {
            throw new RuntimeException("The currently selected MVPD ID is null.");
        }
        Mvpd mvpd = context.requestor.getMvpd(s);
        if (mvpd != null)
        {
            s = buildAuthnUrl(mvpd, false);
            _flddelegate.navigateToUrl(s);
            return;
        } else
        {
            Log.d("AccessEnablerService", (new StringBuilder()).append("Unknown MVPD: ").append(s).toString());
            handleAuthenticationResult(0, "Generic Authentication Error", null);
            return;
        }
    }

    private void getAuthorizationToken(String s, String s1)
    {
        int i;
        Log.d("AccessEnablerService", (new StringBuilder()).append("Retrieving the authZ token for resource: ").append(s).toString());
        String s2 = (new StringBuilder()).append(getSpUrl()).append("/authorizeDevice").toString();
        ArrayList arraylist = new ArrayList();
        arraylist.add(context.httpSessionManager.getCookiesHeader());
        ArrayList arraylist1 = new ArrayList();
        arraylist1.add(new BasicNameValuePair("resource_id", s));
        arraylist1.add(new BasicNameValuePair("requestor_id", context.requestor.getId()));
        arraylist1.add(new BasicNameValuePair("signed_requestor_id", context.requestor.getSignedId()));
        arraylist1.add(new BasicNameValuePair("mso_id", context.storageManager.getCurrentMvpdId()));
        arraylist1.add(new BasicNameValuePair("device_id", AccessEnabler.getCurrentInstance().getDeviceId()));
        arraylist1.add(new BasicNameValuePair("userMeta", "1"));
        Object obj = context.storageManager.getAuthenticationToken(true);
        if (obj != null)
        {
            obj = ((AuthenticationToken) (obj)).toXml();
        } else
        {
            obj = null;
        }
        arraylist1.add(new BasicNameValuePair("authentication_token", ((String) (obj))));
        if (s1 != null && s1.trim().length() > 0)
        {
            arraylist1.add(new BasicNameValuePair("generic_data", s1));
        }
        s1 = (new HttpConnector()).post(s2, null, arraylist, arraylist1, USE_HTTPS);
        if (s1 == null)
        {
            Log.d("AccessEnablerService", "No response from server.");
            _flddelegate.tokenRequestFailed(s, "Generic Authorization Error", "");
            sendTrackingData(new Event(1), false, null);
            return;
        }
        try
        {
            i = s1.getStatusLine().getStatusCode();
        }
        // Misplaced declaration of an exception variable
        catch (String s1)
        {
            Log.e("AccessEnablerService", s1.toString());
            _flddelegate.tokenRequestFailed(s, "Generic Authorization Error", "");
            sendTrackingData(new Event(1), false, null);
            return;
        }
        if (i != 200)
        {
            break MISSING_BLOCK_LABEL_655;
        }
        s2 = getResponseContent(s1);
        s1 = new AuthorizationToken(s2, true);
        obj = UserMetadata.parseXMLResponse(s2);
        context.storageManager.addAuthorizationToken(s, s1);
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_462;
        }
        if (((UserMetadata) (obj)).isValid())
        {
            context.storageManager.updateUserMetadata(((UserMetadata) (obj)));
            context.metadataCache = null;
        }
        getShortMediaToken(s1, Boolean.FALSE);
        return;
        s1;
        Log.e("AccessEnablerService", s1.toString());
        obj = "";
        s1 = ((String) (obj));
        if (s2 == null)
        {
            break MISSING_BLOCK_LABEL_572;
        }
        s1 = ((String) (obj));
        if (!s2.contains("<error>"))
        {
            break MISSING_BLOCK_LABEL_572;
        }
        s1 = ((String) (obj));
        if (!s2.contains("</error>"))
        {
            break MISSING_BLOCK_LABEL_572;
        }
        s1 = ((String) (obj));
        if (!s2.contains("<details>"))
        {
            break MISSING_BLOCK_LABEL_572;
        }
        s1 = ((String) (obj));
        if (s2.contains("</details>"))
        {
            s1 = s2.substring(s2.indexOf("<details>") + "<details>".length(), s2.indexOf("</details>"));
        }
        _flddelegate.tokenRequestFailed(s, "User not Authorized Error", s1);
        obj = new Event(1);
        ((Event) (obj)).setErrorCode("User not Authorized Error");
        ((Event) (obj)).setErrorDetail(s1);
        sendTrackingData(((Event) (obj)), false, null);
        return;
        if (i != 401)
        {
            break MISSING_BLOCK_LABEL_701;
        }
        Log.e("AccessEnablerService", "401 Unauthorized - from the AP server.");
        _flddelegate.tokenRequestFailed(s, "User not Authorized Error", "");
        sendTrackingData(new Event(1), false, null);
        return;
        Log.e("AccessEnablerService", (new StringBuilder()).append("Bad response from server. SC=").append(i).toString());
        _flddelegate.tokenRequestFailed(s, "Internal Authorization Error", "");
        sendTrackingData(new Event(1), false, null);
        return;
    }

    private String getEncryptedUserMetadata(String s)
    {
        String s1 = (new StringBuilder()).append(getSpUrl()).append("/usermetadata").toString();
        ArrayList arraylist = new ArrayList();
        arraylist.add(new BasicNameValuePair("requestor", context.requestor.getId()));
        arraylist.add(new BasicNameValuePair("authn", context.storageManager.getAuthenticationToken(true).toXml()));
        arraylist.add(new BasicNameValuePair("metadata", s));
        s = (new HttpConnector()).post(s1, null, null, arraylist, USE_HTTPS);
        if (s == null)
        {
            int i;
            try
            {
                Log.d("AccessEnablerService", "No response from server for encrypted metadata.");
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                Log.e("AccessEnablerService", s.toString());
            }
            break MISSING_BLOCK_LABEL_207;
        }
        i = s.getStatusLine().getStatusCode();
        if (i != 200)
        {
            break MISSING_BLOCK_LABEL_168;
        }
        return getResponseContent(s);
        Log.e("AccessEnablerService", (new StringBuilder()).append("Bad response from server. SC=").append(i).toString());
        return null;
    }

    private void getRequestorConfigInfo(Bundle bundle)
    {
        boolean flag;
        boolean flag1;
        boolean flag2;
        boolean flag3;
        boolean flag4;
        flag3 = false;
        flag4 = false;
        flag2 = false;
        flag = flag3;
        flag1 = flag4;
        String s = bundle.getString("requestor_id");
        flag = flag3;
        flag1 = flag4;
        bundle = (new StringBuilder()).append(bundle.getString("sp_url")).append("/").append("1.0").toString();
        flag = flag3;
        flag1 = flag4;
        s = (new StringBuilder()).append(bundle).append("/config/").append(s).toString();
        flag = flag3;
        flag1 = flag4;
        Log.d("AccessEnablerService", (new StringBuilder()).append("Starting the thread that handles the setRequestor() call for URL: ").append(bundle).toString());
        flag = flag3;
        flag1 = flag4;
        Object obj1 = new ArrayList();
        flag = flag3;
        flag1 = flag4;
        ((List) (obj1)).add(new BasicNameValuePair("Accept-Encoding", "gzip, deflate"));
        flag = flag3;
        flag1 = flag4;
        Object obj = context.httpSessionManager.getCookiesHeader();
        flag = flag3;
        flag1 = flag4;
        if (((BasicNameValuePair) (obj)).getValue() == null)
        {
            break MISSING_BLOCK_LABEL_250;
        }
        flag = flag3;
        flag1 = flag4;
        if (((BasicNameValuePair) (obj)).getValue().trim().isEmpty())
        {
            break MISSING_BLOCK_LABEL_250;
        }
        flag = flag3;
        flag1 = flag4;
        ((List) (obj1)).add(obj);
        flag = flag3;
        flag1 = flag4;
        obj = new HttpConnector();
        flag = flag3;
        flag1 = flag4;
        obj1 = ((HttpConnector) (obj)).get(s, null, ((List) (obj1)), USE_HTTPS);
        if (obj1 != null) goto _L2; else goto _L1
_L1:
        flag = flag3;
        flag1 = flag4;
        Log.d("AccessEnablerService", (new StringBuilder()).append("No response from server: ").append(s).toString());
_L3:
        context.setIsConfigDataReceived(flag2);
        context.stopSetRequestorThread();
        return;
_L2:
        flag = flag3;
        flag1 = flag4;
        int i = ((HttpResponse) (obj1)).getStatusLine().getStatusCode();
        if (i != 410)
        {
            break MISSING_BLOCK_LABEL_427;
        }
        flag = flag3;
        flag1 = flag4;
        _flddelegate.setAuthenticationStatus(0, "API version too old. Please update your application.");
          goto _L3
        bundle;
        flag1 = flag;
        Log.e("AccessEnablerService", bundle.toString());
        context.setIsConfigDataReceived(flag);
        context.stopSetRequestorThread();
        return;
        if (i != 200)
        {
            break MISSING_BLOCK_LABEL_627;
        }
        flag = flag3;
        flag1 = flag4;
        s = getResponseContent(((HttpResponse) (obj1)));
        flag = flag3;
        flag1 = flag4;
        context.httpSessionManager.addCookies(((HttpResponse) (obj1)));
        flag = flag3;
        flag1 = flag4;
        HttpSessionManager.syncCookiesToCookieManager(((HttpConnector) (obj)).retrieveCookies());
        flag = flag3;
        flag1 = flag4;
        flag2 = context.requestor.parseConfigFromXml(s, bundle);
        flag = flag2;
        flag1 = flag2;
        context.requestor.setSignedId(AccessEnabler.getCurrentInstance().getSignedRequestorId());
        if (!flag2)
        {
            break MISSING_BLOCK_LABEL_591;
        }
        flag = flag2;
        flag1 = flag2;
        Log.d("AccessEnablerService", (new StringBuilder()).append("Configuration info. parsed successfully from: ").append(bundle).toString());
          goto _L3
        bundle;
        context.setIsConfigDataReceived(flag1);
        context.stopSetRequestorThread();
        throw bundle;
        flag = flag2;
        flag1 = flag2;
        Log.d("AccessEnablerService", (new StringBuilder()).append("Configuration info. parsing failed from: ").append(bundle).toString());
          goto _L3
        flag = flag3;
        flag1 = flag4;
        Log.e("AccessEnablerService", (new StringBuilder()).append("Status code not OK: ").append(i).toString());
          goto _L3
    }

    private String getResponseContent(HttpResponse httpresponse)
        throws IOException
    {
        Header aheader[];
        boolean flag;
        boolean flag1;
        aheader = httpresponse.getHeaders("Content-Encoding");
        flag1 = false;
        flag = flag1;
        if (aheader == null) goto _L2; else goto _L1
_L1:
        flag = flag1;
        if (aheader.length <= 0) goto _L2; else goto _L3
_L3:
        int i;
        int j;
        j = aheader.length;
        i = 0;
_L12:
        flag = flag1;
        if (i >= j) goto _L2; else goto _L4
_L4:
        Object obj1 = aheader[i];
        if (((Header) (obj1)).getValue() == null || !"gzip".equals(((Header) (obj1)).getValue())) goto _L6; else goto _L5
_L5:
        flag = true;
_L2:
        Object obj;
        obj1 = null;
        obj = null;
        Object obj2 = httpresponse.getEntity().getContent();
        httpresponse = ((HttpResponse) (obj2));
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_121;
        }
        obj = obj2;
        obj1 = obj2;
        httpresponse = new GZIPInputStream(((InputStream) (obj2)));
        obj = httpresponse;
        obj1 = httpresponse;
        obj2 = new ByteArrayOutputStream();
        obj = httpresponse;
        obj1 = httpresponse;
        byte abyte0[] = new byte[1024];
_L8:
        obj = httpresponse;
        obj1 = httpresponse;
        i = httpresponse.read(abyte0);
        if (i == -1)
        {
            break; /* Loop/switch isn't completed */
        }
        obj = httpresponse;
        obj1 = httpresponse;
        ((ByteArrayOutputStream) (obj2)).write(abyte0, 0, i);
        if (true) goto _L8; else goto _L7
        httpresponse;
        obj1 = obj;
        Log.e("AccessEnablerService", (new StringBuilder()).append("Error deserializing HTTP response: ").append(httpresponse.toString()).toString());
        if (obj != null)
        {
            ((InputStream) (obj)).close();
        }
        obj = null;
_L10:
        return ((String) (obj));
_L6:
        i++;
        continue; /* Loop/switch isn't completed */
_L7:
        obj = httpresponse;
        obj1 = httpresponse;
        obj2 = new String(((ByteArrayOutputStream) (obj2)).toByteArray());
        obj = obj2;
        if (httpresponse == null) goto _L10; else goto _L9
_L9:
        httpresponse.close();
        return ((String) (obj2));
        httpresponse;
        if (obj1 != null)
        {
            ((InputStream) (obj1)).close();
        }
        throw httpresponse;
        if (true) goto _L12; else goto _L11
_L11:
    }

    private void getShortMediaToken(AuthorizationToken authorizationtoken, Boolean boolean1)
    {
        Object obj;
        ArrayList arraylist;
        ArrayList arraylist1;
        boolean flag;
        Log.d("AccessEnablerService", (new StringBuilder()).append("Retrieving the short-media token for resource: ").append(authorizationtoken.getResourceId()).toString());
        if (!authorizationtoken.isValid())
        {
            Log.e("AccessEnablerService", "Found an expired authZ token");
            _flddelegate.tokenRequestFailed(authorizationtoken.getResourceId(), "Generic Authorization Error", "");
        }
        obj = (new StringBuilder()).append(getSpUrl()).append("/deviceShortAuthorize").toString();
        arraylist = new ArrayList();
        arraylist.add(context.httpSessionManager.getCookiesHeader());
        arraylist1 = new ArrayList();
        arraylist1.add(new BasicNameValuePair("session_guid", context.storageManager.getAuthenticationToken(false).getSessionGuid()));
        arraylist1.add(new BasicNameValuePair("hashed_guid", "false"));
        arraylist1.add(new BasicNameValuePair("authz_token", authorizationtoken.toXml()));
        arraylist1.add(new BasicNameValuePair("requestor_id", context.requestor.getId()));
        arraylist1.add(new BasicNameValuePair("signed_requestor_id", context.requestor.getSignedId()));
        arraylist1.add(new BasicNameValuePair("mso_id", context.storageManager.getCurrentMvpdId()));
        arraylist1.add(new BasicNameValuePair("device_id", AccessEnabler.getCurrentInstance().getDeviceId()));
        flag = false;
        obj = (new HttpConnector()).post(((String) (obj)), null, arraylist, arraylist1, USE_HTTPS);
        if (obj != null) goto _L2; else goto _L1
_L1:
        Log.d("AccessEnablerService", "No response from server.");
        _flddelegate.tokenRequestFailed(authorizationtoken.getResourceId(), "Generic Authorization Error", "");
_L3:
        sendTrackingData(new Event(1), flag, boolean1);
        return;
_L2:
        int i = ((HttpResponse) (obj)).getStatusLine().getStatusCode();
        if (i != 200)
        {
            break MISSING_BLOCK_LABEL_420;
        }
        obj = getResponseContent(((HttpResponse) (obj)));
        _flddelegate.setToken(((String) (obj)), authorizationtoken.getResourceId());
        flag = true;
          goto _L3
        Log.e("AccessEnablerService", (new StringBuilder()).append("Bad response from server. SC=").append(i).toString());
        _flddelegate.tokenRequestFailed(authorizationtoken.getResourceId(), "Internal Authorization Error", "");
          goto _L3
        IOException ioexception;
        ioexception;
        Log.e("AccessEnablerService", ioexception.toString());
        _flddelegate.tokenRequestFailed(authorizationtoken.getResourceId(), "Generic Authorization Error", "");
        sendTrackingData(new Event(1), false, boolean1);
        return;
        authorizationtoken;
        sendTrackingData(new Event(1), false, boolean1);
        throw authorizationtoken;
    }

    private void handleAuthenticationResult(int i, String s, Boolean boolean1)
    {
        context.setAuthenticationInProgress(false);
        switch (i)
        {
        default:
            throw new RuntimeException("Invalid AccessEnabler status code");

        case 1: // '\001'
            Bundle bundle;
            for (s = context.getResourcesPendingForAuthorization().iterator(); s.hasNext(); (new AccessEnablerWorkerThread(6, bundle)).start())
            {
                Map map = (Map)s.next();
                bundle = new Bundle();
                String s1;
                for (Iterator iterator = map.keySet().iterator(); iterator.hasNext(); bundle.putString(s1, (String)map.get(s1)))
                {
                    s1 = (String)iterator.next();
                }

            }

            context.clearAllResourcesPendingForAuthorization();
            context.storageManager.setCanAuthenticate(true);
            _flddelegate.setAuthenticationStatus(1, "");
            sendTrackingData(new Event(0), true, boolean1);
            return;

        case 0: // '\0'
            context.storageManager.setCanAuthenticate(false);
            context.storageManager.clearAllTokens();
            context.storageManager.setCurrentMvpdId(null);
            context.metadataCache = null;
            context.genericAuthNData = null;
            context.clearAllResourcesPendingForAuthorization();
            _flddelegate.setAuthenticationStatus(0, s);
            sendTrackingData(new Event(0), false, null);
            return;
        }
    }

    private void sendTrackingData(Event event, boolean flag, Boolean boolean1)
    {
        Object obj;
        AuthenticationToken authenticationtoken;
        ArrayList arraylist;
        authenticationtoken = null;
        obj = null;
        arraylist = new ArrayList();
        event.getType();
        JVM INSTR tableswitch 0 2: default 44
    //                   0 130
    //                   1 247
    //                   2 53;
           goto _L1 _L2 _L3 _L4
_L1:
        Log.d("AccessEnablerService", "Invalid event type.");
        return;
_L4:
        arraylist.add(context.storageManager.getCurrentMvpdId());
_L6:
        arraylist.add(context.getDeviceInfo().getDeviceType());
        arraylist.add(context.getDeviceInfo().getClientType());
        arraylist.add(context.getDeviceInfo().getOs());
        _flddelegate.sendTrackingData(event, arraylist);
        return;
_L2:
        if (flag)
        {
            authenticationtoken = context.storageManager.getAuthenticationToken(false);
            arraylist.add("true");
            arraylist.add(context.storageManager.getCurrentMvpdId());
            arraylist.add(Utils.hash(authenticationtoken.getSessionGuid(), "MD5"));
            if (boolean1 == null)
            {
                boolean1 = obj;
            } else
            {
                boolean1 = boolean1.toString();
            }
            arraylist.add(boolean1);
        } else
        {
            arraylist.add("false");
            arraylist.add(null);
            arraylist.add(null);
            arraylist.add(null);
        }
        continue; /* Loop/switch isn't completed */
_L3:
        AuthenticationToken authenticationtoken1 = context.storageManager.getAuthenticationToken(false);
        String s;
        if (flag && authenticationtoken1 != null)
        {
            s = "true";
        } else
        {
            s = "false";
        }
        arraylist.add(s);
        arraylist.add(context.storageManager.getCurrentMvpdId());
        if (authenticationtoken1 != null)
        {
            s = Utils.hash(authenticationtoken1.getSessionGuid(), "MD5");
        } else
        {
            s = null;
        }
        arraylist.add(s);
        if (boolean1 == null)
        {
            boolean1 = authenticationtoken;
        } else
        {
            boolean1 = boolean1.toString();
        }
        arraylist.add(boolean1);
        arraylist.add(event.getErrorCode());
        arraylist.add(event.getErrorDetail());
        if (true) goto _L6; else goto _L5
_L5:
    }

    private List setupRequestData()
    {
        ArrayList arraylist = new ArrayList();
        arraylist.add(new BasicNameValuePair("_method", "GET"));
        arraylist.add(new BasicNameValuePair("requestor_id", context.requestor.getId()));
        arraylist.add(new BasicNameValuePair("signed_requestor_id", context.requestor.getSignedId()));
        arraylist.add(new BasicNameValuePair("device_id", AccessEnabler.getCurrentInstance().getDeviceId()));
        return arraylist;
    }

    private boolean shouldPersistCookies(AuthenticationToken authenticationtoken)
    {
        if (context.passiveAuthnState == PassiveAuthnService.PassiveAuthnState.PASSIVE_IN_PROGRESS)
        {
            return false;
        } else
        {
            return context.requestor.getMvpd(authenticationtoken.getMvpdId()).hasAuthPerAggregator();
        }
    }

    public String buildAuthnUrl(Mvpd mvpd, boolean flag)
    {
        String s = (new StringBuilder()).append(getSpUrl()).append("/authenticate/saml").toString();
        ArrayList arraylist = new ArrayList();
        arraylist.add(new BasicNameValuePair("domain_name", "adobe.com"));
        arraylist.add(new BasicNameValuePair("noflash", "true"));
        arraylist.add(new BasicNameValuePair("no_iframe", "true"));
        arraylist.add(new BasicNameValuePair("mso_id", mvpd.getId()));
        arraylist.add(new BasicNameValuePair("requestor_id", context.requestor.getId()));
        if (flag)
        {
            StringBuilder stringbuilder = new StringBuilder();
            if (USE_HTTPS)
            {
                mvpd = "https://";
            } else
            {
                mvpd = "http://";
            }
            mvpd = URLEncoder.encode(stringbuilder.append(mvpd).append(getSpUrl()).append("/completePassiveAuthentication").toString());
        } else
        {
            mvpd = AccessEnabler.ADOBEPASS_REDIRECT_URL;
        }
        arraylist.add(new BasicNameValuePair("redirect_url", mvpd));
        arraylist.add(new BasicNameValuePair("client_type", "android"));
        arraylist.add(new BasicNameValuePair("client_version", "1.8"));
        if (flag)
        {
            arraylist.add(new BasicNameValuePair("passive", "true"));
        }
        if (context.genericAuthNData != null && context.genericAuthNData.trim().length() > 0)
        {
            arraylist.add(new BasicNameValuePair("generic_data", URLEncoder.encode(context.genericAuthNData)));
            context.genericAuthNData = null;
        }
        return Utils.buildUrl(s, arraylist, USE_HTTPS);
    }

    public void doGetAuthenticationToken()
    {
        Log.d("AccessEnablerService", "Retrieving the authN token.");
        if (!context.requestor.getIsValid())
        {
            throw new RuntimeException("The requestor is not configured.");
        }
        Object obj = (new StringBuilder()).append(getSpUrl()).append("/sessionDevice").toString();
        Object obj1 = new ArrayList();
        context.httpSessionManager.addCookies(CookieManager.getInstance().getCookie(getSpUrl()));
        ((List) (obj1)).add(context.httpSessionManager.getCookiesHeader());
        List list = setupRequestData();
        obj = (new HttpConnector()).post(((String) (obj)), null, ((List) (obj1)), list, USE_HTTPS);
        if (obj == null)
        {
            Log.d("AccessEnablerService", "No response from server.");
            if (context.passiveAuthnState == PassiveAuthnService.PassiveAuthnState.PASSIVE_IN_PROGRESS)
            {
                Log.d("AccessEnablerService", "Passive authN flow failed");
                setRequestorComplete();
                return;
            } else
            {
                handleAuthenticationResult(0, "Provider not Available Error", null);
                return;
            }
        }
        int i;
        try
        {
            i = ((HttpResponse) (obj)).getStatusLine().getStatusCode();
        }
        catch (Exception exception)
        {
            if (context.passiveAuthnState == PassiveAuthnService.PassiveAuthnState.PASSIVE_IN_PROGRESS)
            {
                setRequestorComplete();
                return;
            } else
            {
                Log.d("AccessEnablerService", exception.toString());
                handleAuthenticationResult(0, "Generic Authentication Error", null);
                return;
            }
        }
        if (i != 200)
        {
            break MISSING_BLOCK_LABEL_355;
        }
        obj1 = getResponseContent(((HttpResponse) (obj)));
        obj = new AuthenticationToken(((String) (obj1)), true);
        obj1 = UserMetadata.parseXMLResponse(((String) (obj1)));
        if (shouldPersistCookies(((AuthenticationToken) (obj))))
        {
            list = retrieveCookieDomains(((AuthenticationToken) (obj)).getMvpdId());
            PassiveAuthnService.getInstance(context, this).persistCookies(list);
        }
        if (!((AuthenticationToken) (obj)).isValid())
        {
            break MISSING_BLOCK_LABEL_309;
        }
        context.storageManager.setAuthenticationToken(((AuthenticationToken) (obj)));
        if (obj1 == null)
        {
            break MISSING_BLOCK_LABEL_291;
        }
        if (((UserMetadata) (obj1)).isValid())
        {
            context.storageManager.updateUserMetadata(((UserMetadata) (obj1)));
            context.metadataCache = null;
        }
        if (context.passiveAuthnState == PassiveAuthnService.PassiveAuthnState.PASSIVE_IN_PROGRESS)
        {
            setRequestorComplete();
            return;
        } else
        {
            handleAuthenticationResult(1, "", Boolean.FALSE);
            return;
        }
        if (context.passiveAuthnState == PassiveAuthnService.PassiveAuthnState.PASSIVE_IN_PROGRESS)
        {
            setRequestorComplete();
            return;
        }
        handleAuthenticationResult(0, "Generic Authentication Error", null);
        return;
        if (context.passiveAuthnState == PassiveAuthnService.PassiveAuthnState.PASSIVE_IN_PROGRESS)
        {
            setRequestorComplete();
            return;
        }
        Log.d("AccessEnablerService", (new StringBuilder()).append("Bad response from server. ( ").append(i).append(" )").toString());
        handleAuthenticationResult(0, "Internal Authentication Error", null);
        return;
    }

    public String getSpUrl()
    {
        Mvpd mvpd = context.requestor.getMvpd(context.storageManager.getCurrentMvpdId());
        if (mvpd != null)
        {
            return mvpd.getSpUrl();
        } else
        {
            throw new RuntimeException("Current MVPD is null. Cannot compute SP URL.");
        }
    }

    protected void onHandleIntent(Intent intent)
    {
        AccessEnabler accessenabler = AccessEnabler.getCurrentInstance();
        if (accessenabler == null)
        {
            Log.e("AccessEnablerService", "No Access Enabler instance detected, ignoring request.");
            return;
        }
        _flddelegate = accessenabler.getDelegate();
        context = accessenabler.getContext();
        intent = intent.getExtras();
        int i = intent.getInt("op_code");
        switch (i)
        {
        default:
            Log.e("AccessEnablerService", (new StringBuilder()).append("Invalid AccessEanbler op. code: ").append(i).toString());
            return;

        case 0: // '\0'
            context.requestor.validate(false);
            Object obj = intent.getString("requestor_id");
            intent = new Bundle();
            intent.putString("requestor_id", ((String) (obj)));
            obj = new ArrayList();
            ((ArrayList) (obj)).add("sp.auth.adobe.com/adobe-services");
            intent.putStringArrayList("sp_urls", ((ArrayList) (obj)));
            (new AccessEnablerWorkerThread(0, intent)).start();
            return;

        case 1: // '\001'
            context.requestor.validate(false);
            context.spUrls = intent.getStringArrayList("sp_urls");
            intent = intent.getString("requestor_id");
            Bundle bundle = new Bundle();
            bundle.putString("requestor_id", intent);
            bundle.putStringArrayList("sp_urls", context.spUrls);
            (new AccessEnablerWorkerThread(0, bundle)).start();
            return;

        case 2: // '\002'
            intent = new AccessEnablerWorkerThread(2, null);
            if (context.requestor.getIsValid())
            {
                intent.start();
                return;
            } else
            {
                pendingCalls.add(intent);
                return;
            }

        case 3: // '\003'
            Bundle bundle1 = new Bundle();
            bundle1.putBoolean("force_authn", intent.getBoolean("force_authn"));
            bundle1.putString("generic_data", intent.getString("generic_data"));
            intent = new AccessEnablerWorkerThread(3, bundle1);
            if (context.requestor.getIsValid())
            {
                intent.start();
                return;
            } else
            {
                pendingCalls.add(intent);
                return;
            }

        case 4: // '\004'
            intent = new AccessEnablerWorkerThread(4, null);
            if (context.requestor.getIsValid())
            {
                intent.start();
                return;
            } else
            {
                pendingCalls.add(intent);
                return;
            }

        case 5: // '\005'
            Bundle bundle2 = new Bundle();
            bundle2.putString("resource_id", intent.getString("resource_id"));
            bundle2.putString("generic_data", intent.getString("generic_data"));
            intent = new AccessEnablerWorkerThread(5, bundle2);
            if (context.requestor.getIsValid())
            {
                intent.start();
                return;
            } else
            {
                pendingCalls.add(intent);
                return;
            }

        case 6: // '\006'
            Bundle bundle3 = new Bundle();
            bundle3.putString("resource_id", intent.getString("resource_id"));
            bundle3.putString("generic_data", intent.getString("generic_data"));
            intent = new AccessEnablerWorkerThread(6, bundle3);
            if (context.requestor.getIsValid())
            {
                intent.start();
                return;
            } else
            {
                pendingCalls.add(intent);
                return;
            }

        case 7: // '\007'
            Bundle bundle4 = new Bundle();
            bundle4.putString("mvpd_id", intent.getString("mvpd_id"));
            (new AccessEnablerWorkerThread(7, bundle4)).start();
            return;

        case 8: // '\b'
            (new AccessEnablerWorkerThread(8, null)).start();
            return;

        case 9: // '\t'
            Bundle bundle5 = new Bundle();
            bundle5.putSerializable("metadata_key", intent.getSerializable("metadata_key"));
            intent = new AccessEnablerWorkerThread(9, bundle5);
            if (context.requestor.getIsValid())
            {
                intent.start();
                return;
            } else
            {
                pendingCalls.add(intent);
                return;
            }

        case 10: // '\n'
            intent = new AccessEnablerWorkerThread(10, null);
            if (context.requestor.getIsValid())
            {
                intent.start();
                return;
            } else
            {
                pendingCalls.add(intent);
                return;
            }

        case 11: // '\013'
            intent = intent.getStringArrayList("resource_id");
            Bundle bundle6 = new Bundle();
            bundle6.putStringArrayList("resource_id", intent);
            intent = new AccessEnablerWorkerThread(11, bundle6);
            if (context.requestor.getIsValid())
            {
                intent.start();
                return;
            } else
            {
                pendingCalls.add(intent);
                return;
            }

        case 12: // '\f'
            intent = new AccessEnablerWorkerThread(12, null);
            break;
        }
        if (context.requestor.getIsValid())
        {
            intent.start();
            return;
        } else
        {
            pendingCalls.add(intent);
            return;
        }
    }

    public int onStartCommand(Intent intent, int i, int j)
    {
        super.onStartCommand(intent, i, j);
        return 2;
    }

    public List retrieveCookieDomains(String s)
    {
        ArrayList arraylist;
        String s1;
        arraylist = new ArrayList();
        s1 = (new StringBuilder()).append(getSpUrl()).append("/cookieDomains").toString();
        HttpResponse httpresponse;
        Log.d("AccessEnablerService", "Retrieving cookie domains from server.");
        httpresponse = (new HttpConnector()).get(s1, null, null, USE_HTTPS);
        if (httpresponse != null)
        {
            break MISSING_BLOCK_LABEL_90;
        }
        Log.d("AccessEnablerService", (new StringBuilder()).append("No response from server: ").append(s1).toString());
        return arraylist;
        int i = httpresponse.getStatusLine().getStatusCode();
        if (i != 200) goto _L2; else goto _L1
_L1:
        s1 = getResponseContent(httpresponse);
        s = (new JsonParser()).parse(s1).getAsJsonObject().getAsJsonArray(s);
        if (s == null) goto _L4; else goto _L3
_L3:
        int j = s.size();
        i = 0;
_L9:
        if (i >= j) goto _L4; else goto _L5
_L5:
        s1 = s.get(i).getAsString();
        if (s1 == null) goto _L7; else goto _L6
_L6:
        arraylist.add(s1);
          goto _L7
_L2:
        Log.e("AccessEnablerService", (new StringBuilder()).append("Status code not OK: ").append(i).toString());
        return arraylist;
        s;
        Log.e("AccessEnablerService", (new StringBuilder()).append("Error retrieving cookie domains from server: ").append(s.toString()).toString());
        return arraylist;
        s;
        Log.e("AccessEnablerService", (new StringBuilder()).append("Error parsing domain cookie list: ").append(s.toString()).toString());
_L4:
        return arraylist;
_L7:
        i++;
        if (true) goto _L9; else goto _L8
_L8:
    }

    public void setRequestorComplete()
    {
        if (context.passiveAuthnState == PassiveAuthnService.PassiveAuthnState.PASSIVE_IN_PROGRESS)
        {
            context.passiveAuthnState = PassiveAuthnService.PassiveAuthnState.PASSIVE_STOPPED;
            PassiveAuthnService.getInstance(context, this).clearPassiveCookies();
        }
        for (; pendingCalls.size() > 0; ((Thread)pendingCalls.remove()).start()) { }
        _flddelegate.setRequestorComplete(1);
    }















}
