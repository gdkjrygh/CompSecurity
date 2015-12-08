// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.worklight.androidgap.plugin;

import com.worklight.common.Logger;
import com.worklight.nativeandroid.common.WLUtils;
import com.worklight.wlclient.WLHybridHttpListener;
import com.worklight.wlclient.api.WLErrorCode;
import java.net.SocketTimeoutException;
import java.util.concurrent.ExecutorService;
import org.apache.cordova.CallbackContext;
import org.apache.cordova.CordovaInterface;
import org.apache.cordova.CordovaPlugin;
import org.apache.cordova.CordovaWebView;
import org.apache.http.Header;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.StatusLine;
import org.apache.http.conn.ConnectTimeoutException;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.worklight.androidgap.plugin:
//            WLNativeXHRSender

public class WLNativeXHRPlugin extends CordovaPlugin
{
    class NativeXHRPostListener
        implements WLHybridHttpListener
    {

        CallbackContext callbackContext;
        boolean isHeartBeatRequest;
        final WLNativeXHRPlugin this$0;

        private JSONObject buildResponseJSON(int i, String s, String s1, Header aheader[], String s2)
        {
            WLNativeXHRPlugin.logger.trace("buildResultJSON");
            JSONObject jsonobject = new JSONObject();
            int j;
            try
            {
                jsonobject.put("status", i);
                jsonobject.put("statusText", s);
                jsonobject.put("responseText", s1);
                s = new JSONObject();
                j = aheader.length;
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                throw new RuntimeException("Failed to add JSON property");
            }
            i = 0;
_L2:
            if (i >= j)
            {
                break MISSING_BLOCK_LABEL_107;
            }
            s1 = aheader[i];
            if (!s1.getName().toLowerCase().contains("set-cookie"))
            {
                s.put(s1.getName(), s1.getValue());
            }
            break MISSING_BLOCK_LABEL_145;
            jsonobject.put("headers", s);
            if (s2 == null)
            {
                break MISSING_BLOCK_LABEL_131;
            }
            jsonobject.put("wlFailureStatus", s2);
            return jsonobject;
            i++;
            if (true) goto _L2; else goto _L1
_L1:
        }

        private WLErrorCode exceptionToErrorCode(Exception exception)
        {
            if (exception instanceof SocketTimeoutException)
            {
                return WLErrorCode.REQUEST_TIMEOUT;
            }
            if (exception instanceof ConnectTimeoutException)
            {
                return WLErrorCode.UNRESPONSIVE_HOST;
            } else
            {
                return WLErrorCode.UNEXPECTED_ERROR;
            }
        }

        public void onException(Exception exception)
        {
            if (!isHeartBeatRequest)
            {
                WLNativeXHRPlugin.logger.error("onException", exception);
            }
            Object obj = exceptionToErrorCode(exception);
            exception = callbackContext;
            String s = ((WLErrorCode) (obj)).getDescription();
            obj = ((WLErrorCode) (obj)).name();
            exception.success(buildResponseJSON(0, s, "", new Header[0], ((String) (obj))));
        }

        public void onResponse(HttpResponse httpresponse)
        {
            Object obj;
            Object obj1;
            Header header;
            WLNativeXHRPlugin.logger.trace("onResponse");
            obj1 = httpresponse.getEntity();
            header = ((HttpEntity) (obj1)).getContentEncoding();
            obj = "";
            if (header == null) goto _L2; else goto _L1
_L1:
            if (!header.getValue().toLowerCase().contains("gzip")) goto _L2; else goto _L3
_L3:
            obj1 = WLUtils.convertGZIPStreamToString(((HttpEntity) (obj1)).getContent());
            obj = obj1;
_L5:
            int i = httpresponse.getStatusLine().getStatusCode();
            String s = httpresponse.getStatusLine().getReasonPhrase();
            Header aheader[] = httpresponse.getAllHeaders();
            obj1 = null;
            if (httpresponse.getStatusLine().getReasonPhrase().equals("wl-oauth-prevent-redirect"))
            {
                obj1 = httpresponse.getHeaders("Location")[0].getValue();
            }
            callbackContext.success(buildResponseJSON(i, s, ((String) (obj)), aheader, ((String) (obj1))));
            return;
_L2:
            obj1 = WLUtils.convertStreamToString(((HttpEntity) (obj1)).getContent());
            obj = obj1;
            continue; /* Loop/switch isn't completed */
            Exception exception;
            exception;
            onException(exception);
            if (true) goto _L5; else goto _L4
_L4:
        }

        public NativeXHRPostListener(CallbackContext callbackcontext, boolean flag)
        {
            this$0 = WLNativeXHRPlugin.this;
            super();
            callbackContext = callbackcontext;
            isHeartBeatRequest = flag;
        }
    }


    private static final String TAG = "WLNativeXHRPlugin";
    private static final Logger logger = Logger.getInstance(com/worklight/androidgap/plugin/WLNativeXHRPlugin.getName());
    private WLNativeXHRSender sender;

    public WLNativeXHRPlugin()
    {
    }

    private void doAddGlobalHeader(JSONArray jsonarray, CallbackContext callbackcontext)
        throws JSONException
    {
        logger.trace("doAddGlobalHeader");
        jsonarray = jsonarray.getJSONObject(0);
        sender.addGlobalHeader(jsonarray);
        callbackcontext.success();
    }

    private void doGetGlobalHeaders(CallbackContext callbackcontext)
        throws JSONException
    {
        logger.trace("doGetGlobalHeaders");
        callbackcontext.success(sender.getGlobalHeaders());
    }

    private void doRemoveGlobalHeader(JSONArray jsonarray, CallbackContext callbackcontext)
        throws JSONException
    {
        logger.trace("doRemoveGlobalHeader");
        jsonarray = jsonarray.getJSONObject(0);
        sender.removeGlobalHeader(jsonarray);
        callbackcontext.success();
    }

    private void doSend(final JSONArray requestOptions, final CallbackContext callbackContext)
        throws JSONException
    {
        logger.trace("doSend");
        requestOptions = requestOptions.getJSONObject(0);
        cordova.getThreadPool().execute(new Runnable() {

            final WLNativeXHRPlugin this$0;
            final CallbackContext val$callbackContext;
            final JSONObject val$requestOptions;

            public void run()
            {
                boolean flag = false;
                boolean flag1;
                try
                {
                    String s = requestOptions.getString("url");
                    flag1 = s.substring(s.lastIndexOf('/') + 1).equals("heartbeat");
                }
                catch (JSONException jsonexception)
                {
                    throw new RuntimeException((new StringBuilder()).append("Failed to send request. JSONException :: ").append(jsonexception.getMessage()).toString());
                }
                if (flag1)
                {
                    flag = true;
                }
                sender.sendRequest(requestOptions, new NativeXHRPostListener(callbackContext, flag));
            }

            
            {
                this$0 = WLNativeXHRPlugin.this;
                requestOptions = jsonobject;
                callbackContext = callbackcontext;
                super();
            }
        });
    }

    public boolean execute(String s, JSONArray jsonarray, CallbackContext callbackcontext)
        throws JSONException
    {
        logger.trace("execute");
        if ("send".equals(s))
        {
            doSend(jsonarray, callbackcontext);
            return true;
        }
        if ("addGlobalHeader".equals(s))
        {
            doAddGlobalHeader(jsonarray, callbackcontext);
            return true;
        }
        if ("removeGlobalHeader".equals(s))
        {
            doRemoveGlobalHeader(jsonarray, callbackcontext);
            return true;
        }
        if ("getGlobalHeaders".equals(s))
        {
            doGetGlobalHeaders(callbackcontext);
            return true;
        } else
        {
            return false;
        }
    }

    public void initialize(CordovaInterface cordovainterface, CordovaWebView cordovawebview)
    {
        super.initialize(cordovainterface, cordovawebview);
        sender = new WLNativeXHRSender();
    }



}
