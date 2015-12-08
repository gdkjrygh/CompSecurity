// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.worklight.wlclient;

import android.content.Context;
import android.content.Intent;
import com.worklight.common.Logger;
import com.worklight.common.WLConfig;
import com.worklight.nativeandroid.common.WLUtils;
import com.worklight.wlclient.api.WLAuthorizationException;
import com.worklight.wlclient.api.WLClient;
import com.worklight.wlclient.api.WLErrorCode;
import com.worklight.wlclient.api.WLFailResponse;
import com.worklight.wlclient.api.WLRequestOptions;
import com.worklight.wlclient.api.WLResponse;
import com.worklight.wlclient.api.challengehandler.ChallengeHandler;
import com.worklight.wlclient.api.challengehandler.WLChallengeHandler;
import com.worklight.wlclient.ui.UIActivity;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.net.URLEncoder;
import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.ResourceBundle;
import java.util.Set;
import java.util.TreeMap;
import java.util.zip.GZIPOutputStream;
import org.apache.http.Header;
import org.apache.http.HttpRequest;
import org.apache.http.NameValuePair;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpDelete;
import org.apache.http.client.methods.HttpEntityEnclosingRequestBase;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.methods.HttpPut;
import org.apache.http.client.methods.HttpRequestBase;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.entity.ByteArrayEntity;
import org.apache.http.message.BasicNameValuePair;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.worklight.wlclient:
//            RequestMethod, WLRequestPiggybacker, WLRequestListener, WLAuthorizationManagerInternal, 
//            WLClientInstanceIdListener, AsynchronousRequestSender

public class WLRequest
{
    public static interface RequestPaths
    {

        public static final String AUTHENTICATE = "authenticate";
        public static final String DELETE_USER_PREF = "deleteup";
        public static final String EVENTS = "events";
        public static final String GET_CONFIG = "apps/services/configprofile";
        public static final String HEART_BEAT = "heartbeat";
        public static final String INIT = "init";
        public static final String INVOKE_PROCEDURE = "query";
        public static final String LOGIN = "login";
        public static final String LOGOUT = "logout";
        public static final String LOG_ACTIVITY = "logactivity";
        public static final String NOTIFICATION = "notifications";
        public static final String SEND_INVOKE_PROCEDURE = "invoke";
        public static final String SET_USER_PREFS = "setup";
        public static final String SSL_CLIENT_AUTH = "sslclientauth";
        public static final String UPLOAD_LOGS = "apps/services/loguploader";
    }


    private static final String ACCESS_DENIED_ID = "WLClient.accessDenied";
    private static final String AUTH_FAIL_ID = "WLClient.authFailure";
    private static final String CLIENT_ID_HEADER = "X-WL-ClientId";
    private static final String CLOSE_BUTTON_ID = "WLClient.close";
    private static final String ERROR_ID = "WLClient.error";
    private static final int OAUTH_REDIRECT_STATUS = 222;
    private static final Set PIGGYBACKERS = Collections.synchronizedSet(new HashSet());
    private static final String RESOURCE_BUNDLE = "com/worklight/wlclient/messages";
    private static Logger logger = Logger.getInstance(com/worklight/wlclient/WLRequest.getName());
    private WLConfig config;
    private Context context;
    private RequestMethod method;
    private HttpUriRequest request;
    private WLRequestListener requestListener;
    protected WLRequestOptions requestOptions;
    private String requestURL;
    private boolean shouldFailOnChallengeCancel;
    private HashMap wlAnswers;

    public WLRequest(WLRequestListener wlrequestlistener, WLRequestOptions wlrequestoptions, WLConfig wlconfig, Context context1)
    {
        this(wlrequestlistener, wlrequestoptions, wlconfig, context1, false);
    }

    public WLRequest(WLRequestListener wlrequestlistener, WLRequestOptions wlrequestoptions, WLConfig wlconfig, Context context1, boolean flag)
    {
        requestURL = null;
        method = RequestMethod.POST;
        wlAnswers = new HashMap();
        requestListener = wlrequestlistener;
        requestOptions = wlrequestoptions;
        config = wlconfig;
        context = context1;
        shouldFailOnChallengeCancel = flag;
    }

    private void addExpectedAnswers(HttpRequest httprequest)
    {
        if (!wlAnswers.isEmpty()) goto _L2; else goto _L1
_L1:
        return;
_L2:
        JSONObject jsonobject;
        jsonobject = new JSONObject();
        Iterator iterator = wlAnswers.entrySet().iterator();
label0:
        do
        {
label1:
            {
                if (!iterator.hasNext())
                {
                    break label1;
                }
                Object obj = (java.util.Map.Entry)iterator.next();
                String s = (String)((java.util.Map.Entry) (obj)).getKey();
                obj = ((java.util.Map.Entry) (obj)).getValue();
                if (obj == null)
                {
                    continue;
                }
                try
                {
                    jsonobject.accumulate(s, obj);
                }
                // Misplaced declaration of an exception variable
                catch (HttpRequest httprequest)
                {
                    logger.error(httprequest.getMessage(), httprequest);
                    throw new RuntimeException(httprequest);
                }
            }
        } while (true);
        if (true) goto _L1; else goto _L3
_L3:
        httprequest.addHeader("Authorization", jsonobject.toString());
        wlAnswers.clear();
        return;
    }

    private void addExtraHeaders(HttpRequest httprequest)
    {
        Object obj = requestOptions.getHeaders();
        if (obj != null)
        {
            obj = ((ArrayList) (obj)).iterator();
            while (((Iterator) (obj)).hasNext()) 
            {
                httprequest.addHeader((Header)((Iterator) (obj)).next());
            }
        }
    }

    private void addHeaders(WLConfig wlconfig, HttpRequest httprequest)
    {
        httprequest.addHeader("X-Requested-With", "XMLHttpRequest");
        httprequest.addHeader("x-wl-app-version", wlconfig.getApplicationVersion());
        httprequest.addHeader("Accept-Language", Locale.getDefault().toString());
        httprequest.addHeader("x-wl-platform-version", wlconfig.getPlatformVersion());
    }

    private void addParams(WLRequestOptions wlrequestoptions, HttpRequest httprequest)
    {
        if (httprequest instanceof HttpEntityEnclosingRequestBase)
        {
            addParamsEntityEnclosedReq(wlrequestoptions, (HttpEntityEnclosingRequestBase)httprequest);
        } else
        if (httprequest instanceof HttpRequestBase)
        {
            addParamsBaseRequest(wlrequestoptions, (HttpRequestBase)httprequest);
            return;
        }
    }

    private void addParamsBaseRequest(WLRequestOptions wlrequestoptions, HttpRequestBase httprequestbase)
    {
        HashMap hashmap = new HashMap();
        if (wlrequestoptions.getParameters() != null && !wlrequestoptions.getParameters().isEmpty())
        {
            String s;
            for (Iterator iterator = wlrequestoptions.getParameters().keySet().iterator(); iterator.hasNext(); hashmap.put(s, wlrequestoptions.getParameters().get(s)))
            {
                s = (String)iterator.next();
            }

        }
        hashmap.put("isAjaxRequest", "true");
        hashmap.put("x", String.valueOf(Math.random()));
        try
        {
            httprequestbase.setURI(new URI((new StringBuilder()).append(httprequestbase.getURI().toString()).append(parseQueryParams(hashmap)).toString()));
            return;
        }
        // Misplaced declaration of an exception variable
        catch (WLRequestOptions wlrequestoptions)
        {
            return;
        }
    }

    private void addParamsEntityEnclosedReq(WLRequestOptions wlrequestoptions, HttpEntityEnclosingRequestBase httpentityenclosingrequestbase)
    {
        Object obj = new ArrayList();
        if (wlrequestoptions.getParameters() != null && !wlrequestoptions.getParameters().isEmpty())
        {
            String s;
            for (Iterator iterator = wlrequestoptions.getParameters().keySet().iterator(); iterator.hasNext(); ((List) (obj)).add(new BasicNameValuePair(s, (String)wlrequestoptions.getParameters().get(s))))
            {
                s = (String)iterator.next();
            }

        }
        ((List) (obj)).add(new BasicNameValuePair("isAjaxRequest", "true"));
        ((List) (obj)).add(new BasicNameValuePair("x", String.valueOf(Math.random())));
        try
        {
            wlrequestoptions = new UrlEncodedFormEntity(((List) (obj)), "UTF-8");
        }
        // Misplaced declaration of an exception variable
        catch (WLRequestOptions wlrequestoptions)
        {
            logger.error(wlrequestoptions.getMessage(), wlrequestoptions);
            throw new RuntimeException(wlrequestoptions);
        }
        if (httpentityenclosingrequestbase.getURI().getPath().endsWith("apps/services/loguploader"))
        {
            httpentityenclosingrequestbase.setHeader("x-wl-compressed", "true");
            httpentityenclosingrequestbase.setHeader("Content-Encoding", "gzip");
            httpentityenclosingrequestbase.setHeader("Content-Type", "application/json");
            wlrequestoptions = new JSONObject();
            for (obj = ((List) (obj)).iterator(); ((Iterator) (obj)).hasNext();)
            {
                NameValuePair namevaluepair = (NameValuePair)((Iterator) (obj)).next();
                try
                {
                    wlrequestoptions.put(namevaluepair.getName(), namevaluepair.getValue());
                }
                // Misplaced declaration of an exception variable
                catch (WLRequestOptions wlrequestoptions)
                {
                    throw new RuntimeException(wlrequestoptions);
                }
            }

            obj = new ByteArrayOutputStream();
            try
            {
                GZIPOutputStream gzipoutputstream = new GZIPOutputStream(((java.io.OutputStream) (obj)));
                gzipoutputstream.write(wlrequestoptions.toString().getBytes("UTF-8"));
                gzipoutputstream.finish();
                gzipoutputstream.close();
                httpentityenclosingrequestbase.setEntity(new ByteArrayEntity(((ByteArrayOutputStream) (obj)).toByteArray()));
                return;
            }
            // Misplaced declaration of an exception variable
            catch (WLRequestOptions wlrequestoptions)
            {
                logger.error(wlrequestoptions.getMessage(), wlrequestoptions);
                throw new RuntimeException(wlrequestoptions);
            }
            // Misplaced declaration of an exception variable
            catch (WLRequestOptions wlrequestoptions)
            {
                logger.error(wlrequestoptions.getMessage(), wlrequestoptions);
            }
            throw new RuntimeException(wlrequestoptions);
        } else
        {
            httpentityenclosingrequestbase.setEntity(wlrequestoptions);
            return;
        }
    }

    public static void addRequestPiggybacker(WLRequestPiggybacker wlrequestpiggybacker)
    {
        PIGGYBACKERS.add(wlrequestpiggybacker);
    }

    private boolean checkResponseForChallenges(WLResponse wlresponse)
    {
        ResourceBundle resourcebundle;
        Object obj;
        resourcebundle = WLUtils.getMessagesBundle();
        if (!isWl401(wlresponse))
        {
            break MISSING_BLOCK_LABEL_232;
        }
        wlresponse = wlresponse.getResponseJSON();
        obj = new ArrayList();
        Object obj1;
        wlresponse = wlresponse.getJSONObject("challenges");
        obj1 = wlresponse.names();
        int i = 0;
_L2:
        if (i >= ((JSONArray) (obj1)).length())
        {
            break; /* Loop/switch isn't completed */
        }
        ((List) (obj)).add(((JSONArray) (obj1)).getString(i));
        i++;
        if (true) goto _L2; else goto _L1
_L1:
        setExpectedAnswers(((List) (obj)));
        obj = ((List) (obj)).iterator();
_L5:
        if (!((Iterator) (obj)).hasNext()) goto _L4; else goto _L3
_L3:
        Object obj2;
        Object obj3;
        obj1 = (String)((Iterator) (obj)).next();
        obj2 = wlresponse.getJSONObject(((String) (obj1)));
        obj3 = WLClient.getInstance().getWLChallengeHandler(((String) (obj1)));
        if (obj3 != null)
        {
            break MISSING_BLOCK_LABEL_221;
        }
        logger.error((new StringBuilder()).append("Application will exit, because unexpected challenge handler arrived while using realm ").append(((String) (obj1))).append(". Register the challenge handler using registerChallengeHandler().").toString());
        showErrorDialogue(resourcebundle.getString("WLClient.error"), resourcebundle.getString("WLClient.authFailure"), resourcebundle.getString("WLClient.close"));
          goto _L5
        wlresponse;
        logger.debug((new StringBuilder()).append("Wrong JSON arrived when processing a challenge in a 401 response. With ").append(wlresponse.getMessage()).toString(), wlresponse);
_L4:
        return true;
        ((WLChallengeHandler) (obj3)).startHandleChallenge(this, obj2);
          goto _L5
        if (!isWl403(wlresponse)) goto _L7; else goto _L6
_L6:
        wlresponse = wlresponse.getResponseJSON();
        wlresponse = wlresponse.getJSONObject("WL-Authentication-Failure");
        obj = wlresponse.names();
        i = 0;
_L14:
        if (i >= ((JSONArray) (obj)).length()) goto _L9; else goto _L8
_L8:
        obj1 = ((JSONArray) (obj)).getString(i);
        obj2 = wlresponse.getJSONObject(((String) (obj1)));
        obj3 = WLClient.getInstance().getWLChallengeHandler(((String) (obj1)));
        if (obj3 == null) goto _L11; else goto _L10
_L10:
        ((WLChallengeHandler) (obj3)).handleFailure(((JSONObject) (obj2)));
        ((WLChallengeHandler) (obj3)).clearWaitingList();
          goto _L12
_L11:
        obj2 = new StringBuilder(resourcebundle.getString("WLClient.accessDenied"));
        obj3 = MessageFormat.format(resourcebundle.getString("WLClient.missingHandler"), new Object[] {
            obj1
        });
        if (obj3 == null)
        {
            break MISSING_BLOCK_LABEL_405;
        }
        obj3 = MessageFormat.format(resourcebundle.getString("WLClient.reason"), new Object[] {
            obj3
        });
        ((StringBuilder) (obj2)).append((new StringBuilder()).append("\n").append(((String) (obj3))).toString());
        logger.error((new StringBuilder()).append("Connect to MobileFirst Platform server failed due to missing challenge handler to handle ").append(((String) (obj1))).toString());
        showErrorDialogue(resourcebundle.getString("WLClient.error"), ((StringBuilder) (obj2)).toString(), resourcebundle.getString("WLClient.close"));
          goto _L12
        wlresponse;
        logger.debug((new StringBuilder()).append("Wrong JSON arrived when processing a challenge in a 403 response. with ").append(wlresponse.getMessage()).toString(), wlresponse);
_L9:
        return true;
_L7:
        return handleCustomChallenges(wlresponse);
_L12:
        i++;
        if (true) goto _L14; else goto _L13
_L13:
    }

    private void checkResponseForSuccesses(WLResponse wlresponse)
    {
        wlresponse = wlresponse.getResponseJSON();
        if (wlresponse != null) goto _L2; else goto _L1
_L1:
        return;
_L2:
        if (!wlresponse.has("WL-Authentication-Success") || (wlresponse = wlresponse.getJSONObject("WL-Authentication-Success")) == null)
        {
            continue; /* Loop/switch isn't completed */
        }
        JSONArray jsonarray;
        JSONObject jsonobject;
        Object obj;
        int i;
        try
        {
            jsonarray = wlresponse.names();
        }
        // Misplaced declaration of an exception variable
        catch (WLResponse wlresponse)
        {
            triggerUnexpectedOnFailure(wlresponse);
            return;
        }
        i = 0;
        if (i >= wlresponse.length())
        {
            continue; /* Loop/switch isn't completed */
        }
        obj = jsonarray.getString(i);
        jsonobject = wlresponse.getJSONObject(((String) (obj)));
        obj = WLClient.getInstance().getWLChallengeHandler(((String) (obj)));
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_90;
        }
        ((WLChallengeHandler) (obj)).handleSuccess(jsonobject);
        ((WLChallengeHandler) (obj)).releaseWaitingList();
        i++;
        if (true) goto _L4; else goto _L3
_L3:
        break MISSING_BLOCK_LABEL_95;
_L4:
        break MISSING_BLOCK_LABEL_40;
        if (true) goto _L1; else goto _L5
_L5:
    }

    private HttpUriRequest createRequest(String s)
    {
        static class _cls3
        {

            static final int $SwitchMap$com$worklight$wlclient$RequestMethod[];

            static 
            {
                $SwitchMap$com$worklight$wlclient$RequestMethod = new int[RequestMethod.values().length];
                try
                {
                    $SwitchMap$com$worklight$wlclient$RequestMethod[RequestMethod.POST.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror3) { }
                try
                {
                    $SwitchMap$com$worklight$wlclient$RequestMethod[RequestMethod.GET.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror2) { }
                try
                {
                    $SwitchMap$com$worklight$wlclient$RequestMethod[RequestMethod.DELETE.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    $SwitchMap$com$worklight$wlclient$RequestMethod[RequestMethod.PUT.ordinal()] = 4;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        switch (_cls3..SwitchMap.com.worklight.wlclient.RequestMethod[method.ordinal()])
        {
        default:
            throw new Error((new StringBuilder()).append("Unhandled request method: ").append(method).toString());

        case 1: // '\001'
            return new HttpPost(s);

        case 2: // '\002'
            return new HttpGet(s);

        case 3: // '\003'
            return new HttpDelete(s);

        case 4: // '\004'
            return new HttpPut(s);
        }
    }

    private void extractJSONFromRedirectResponse(WLResponse wlresponse)
    {
        wlresponse.setResponseText((String)WLUtils.extractParametersFromURL(wlresponse.getHeader("Location").getValue()).get("wl_result"));
    }

    private boolean handleCustomChallenges(WLResponse wlresponse)
    {
        boolean flag = false;
        ChallengeHandler challengehandler = WLClient.getInstance().getChallengeHandler(wlresponse);
        if (challengehandler != null)
        {
            challengehandler.startHandleChallenge(this, wlresponse);
            flag = true;
        }
        return flag;
    }

    private boolean isWl401(WLResponse wlresponse)
    {
        if (wlresponse.getStatus() == 401)
        {
            wlresponse = wlresponse.getHeader("WWW-Authenticate");
            if (wlresponse != null && wlresponse.getValue().equalsIgnoreCase("WL-Composite-Challenge"))
            {
                return true;
            }
        }
        return false;
    }

    private boolean isWl403(WLResponse wlresponse)
    {
        return (wlresponse.getStatus() == 403 || wlresponse.getStatus() == 222) && wlresponse.getResponseJSON() != null && wlresponse.getResponseJSON().has("WL-Authentication-Failure");
    }

    private String parseQueryParams(Map map)
    {
        StringBuilder stringbuilder;
        if (map.isEmpty())
        {
            break MISSING_BLOCK_LABEL_128;
        }
        stringbuilder = new StringBuilder("?");
        for (Iterator iterator = map.keySet().iterator(); iterator.hasNext(); stringbuilder.append("&"))
        {
            String s = (String)iterator.next();
            String s1 = (String)map.get(s);
            stringbuilder.append(URLEncoder.encode(s, "UTF8"));
            stringbuilder.append("=");
            stringbuilder.append(URLEncoder.encode(s1, "UTF8"));
        }

        try
        {
            stringbuilder.deleteCharAt(stringbuilder.length() - 1);
            map = stringbuilder.toString();
        }
        // Misplaced declaration of an exception variable
        catch (Map map)
        {
            return null;
        }
        return map;
        return "";
    }

    private void processSuccessResponse(WLResponse wlresponse)
    {
        Set set = PIGGYBACKERS;
        set;
        JVM INSTR monitorenter ;
        for (Iterator iterator = PIGGYBACKERS.iterator(); iterator.hasNext(); ((WLRequestPiggybacker)iterator.next()).onSuccess(wlresponse)) { }
        break MISSING_BLOCK_LABEL_47;
        wlresponse;
        set;
        JVM INSTR monitorexit ;
        throw wlresponse;
        set;
        JVM INSTR monitorexit ;
        requestListener.onSuccess(wlresponse);
        return;
    }

    public static void removeRequestPiggybacker(WLRequestPiggybacker wlrequestpiggybacker)
    {
        PIGGYBACKERS.remove(wlrequestpiggybacker);
    }

    private void resendIfNeeded()
    {
        boolean flag1 = true;
        if (wlAnswers != null) goto _L2; else goto _L1
_L1:
        boolean flag = true;
_L4:
        if (flag)
        {
            resendRequest();
        }
        return;
_L2:
        Iterator iterator = wlAnswers.values().iterator();
        do
        {
            flag = flag1;
            if (!iterator.hasNext())
            {
                continue; /* Loop/switch isn't completed */
            }
        } while (iterator.next() != null);
        flag = false;
        if (true) goto _L4; else goto _L3
_L3:
    }

    private void sendRequest(String s)
    {
        request = createRequest(s);
        addHeaders(config, request);
        addExtraHeaders(request);
        addParams(requestOptions, request);
        addExpectedAnswers(request);
        addClientInstanceHeader(request, new WLClientInstanceIdListener() {

            final WLRequest this$0;

            public void onFailure(WLAuthorizationException wlauthorizationexception)
            {
                wlauthorizationexception = wlauthorizationexception.getWLFailResponse();
                wlauthorizationexception.setOptions(requestOptions);
                requestListener.onFailure(wlauthorizationexception);
            }

            public void onSuccess(String s1)
            {
                try
                {
                    AsynchronousRequestSender.getInstance().sendWLRequestAsync(WLRequest.this);
                    return;
                }
                // Misplaced declaration of an exception variable
                catch (String s1)
                {
                    WLRequest.logger.error(s1.getMessage(), s1);
                }
                triggerUnexpectedOnFailure(s1);
            }

            
            {
                this$0 = WLRequest.this;
                super();
            }
        });
    }

    private void setExpectedAnswers(List list)
    {
        String s;
        for (list = list.iterator(); list.hasNext(); wlAnswers.put(s, null))
        {
            s = (String)list.next();
        }

    }

    private void showErrorDialogue(String s, String s1, String s2)
    {
        Context context1 = WLClient.getInstance().getContext();
        Intent intent = new Intent(context1, com/worklight/wlclient/ui/UIActivity);
        intent.putExtra("action", "exit");
        intent.putExtra("dialogue_message", s1);
        intent.putExtra("dialogue_title", s);
        intent.putExtra("positive_button_text", s2);
        context1.startActivity(intent);
    }

    private void triggerUnexpectedOnFailure(Exception exception)
    {
        getRequestListener().onFailure(new WLFailResponse(WLErrorCode.UNEXPECTED_ERROR, exception.getMessage(), getOptions()));
    }

    protected void addClientInstanceHeader(final HttpRequest request, final WLClientInstanceIdListener listener)
    {
        WLAuthorizationManagerInternal.getInstance().getClientInstanceIdHeader(new WLClientInstanceIdListener() {

            final WLRequest this$0;
            final WLClientInstanceIdListener val$listener;
            final HttpRequest val$request;

            public void onFailure(WLAuthorizationException wlauthorizationexception)
            {
                listener.onFailure(wlauthorizationexception);
            }

            public void onSuccess(String s)
            {
                request.addHeader("X-WL-ClientId", s);
                listener.onSuccess(s);
            }

            
            {
                this$0 = WLRequest.this;
                request = httprequest;
                listener = wlclientinstanceidlistener;
                super();
            }
        });
    }

    public WLConfig getConfig()
    {
        return config;
    }

    public Context getContext()
    {
        return context;
    }

    public RequestMethod getMethod()
    {
        return method;
    }

    public WLRequestOptions getOptions()
    {
        return requestOptions;
    }

    public WLRequestListener getRequestListener()
    {
        return requestListener;
    }

    public URI getURI()
    {
        return request.getURI();
    }

    public HttpUriRequest getURIRequest()
    {
        return request;
    }

    public void makeRequest(String s)
    {
        makeRequest(s, false);
    }

    public void makeRequest(String s, boolean flag)
    {
        Set set = PIGGYBACKERS;
        set;
        JVM INSTR monitorenter ;
        for (Iterator iterator = PIGGYBACKERS.iterator(); iterator.hasNext(); ((WLRequestPiggybacker)iterator.next()).processOptions(s, requestOptions)) { }
        break MISSING_BLOCK_LABEL_54;
        s;
        set;
        JVM INSTR monitorexit ;
        throw s;
        set;
        JVM INSTR monitorexit ;
        requestURL = null;
        if (!flag)
        {
            requestURL = (new StringBuilder()).append(config.getAppURL().toExternalForm()).append(s).toString();
        } else
        {
            requestURL = (new StringBuilder()).append(config.getRootURL()).append("/").append(s).toString();
        }
        sendRequest(requestURL);
        return;
    }

    public void processFailureResponse(WLResponse wlresponse)
    {
        Set set;
        Iterator iterator;
        if (wlresponse instanceof WLFailResponse)
        {
            wlresponse = (WLFailResponse)wlresponse;
        } else
        {
            wlresponse = new WLFailResponse(wlresponse);
        }
        wlresponse.setOptions(requestOptions);
        set = PIGGYBACKERS;
        set;
        JVM INSTR monitorenter ;
        for (iterator = PIGGYBACKERS.iterator(); iterator.hasNext(); ((WLRequestPiggybacker)iterator.next()).onFailure(wlresponse)) { }
        break MISSING_BLOCK_LABEL_79;
        wlresponse;
        set;
        JVM INSTR monitorexit ;
        throw wlresponse;
        set;
        JVM INSTR monitorexit ;
        requestListener.onFailure(wlresponse);
        return;
    }

    public void removeExpectedAnswer(String s)
    {
        wlAnswers.remove(s);
        resendIfNeeded();
    }

    public void requestFinished(WLResponse wlresponse)
    {
        boolean flag;
        if (wlresponse.getStatus() == 222)
        {
            extractJSONFromRedirectResponse(wlresponse);
        }
        try
        {
            checkResponseForSuccesses(wlresponse);
        }
        // Misplaced declaration of an exception variable
        catch (WLResponse wlresponse)
        {
            triggerUnexpectedOnFailure(wlresponse);
            return;
        }
        try
        {
            flag = checkResponseForChallenges(wlresponse);
        }
        // Misplaced declaration of an exception variable
        catch (WLResponse wlresponse)
        {
            triggerUnexpectedOnFailure(wlresponse);
            return;
        }
        if (wlresponse.getStatus() != 222) goto _L2; else goto _L1
_L1:
        processSuccessResponse(wlresponse);
_L4:
        return;
_L2:
        if (flag) goto _L4; else goto _L3
_L3:
        if (wlresponse.getStatus() != 200)
        {
            break MISSING_BLOCK_LABEL_103;
        }
        Object obj = wlresponse.getResponseJSON();
        if (obj != null)
        {
            try
            {
                obj = ((JSONObject) (obj)).get("notificationSubscriptionState");
                WLClient.getInstance().setNotificationSubscriptionState((JSONObject)obj);
            }
            catch (JSONException jsonexception) { }
        }
        processSuccessResponse(wlresponse);
        return;
        if (wlresponse.getStatus() == 201 || wlresponse.getStatus() == 204)
        {
            logger.debug((new StringBuilder()).append("requestFinished with status: ").append(wlresponse.getStatus()).toString());
            processSuccessResponse(wlresponse);
            return;
        } else
        {
            processFailureResponse(wlresponse);
            return;
        }
    }

    public void resendRequest()
    {
        if (requestURL != null)
        {
            sendRequest(requestURL);
            return;
        } else
        {
            logger.debug("resendRequest failed: requestURL is null.");
            return;
        }
    }

    public void setMethod(RequestMethod requestmethod)
    {
        method = requestmethod;
    }

    public boolean shouldFailOnChallengeCancel()
    {
        return shouldFailOnChallengeCancel;
    }

    public void submitAnswer(String s, Object obj)
    {
        wlAnswers.put(s, obj);
        resendIfNeeded();
    }




}
