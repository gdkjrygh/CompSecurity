// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package ly.kite.util;

import android.content.Context;
import android.os.AsyncTask;
import java.util.Map;
import org.json.JSONObject;

public class HTTPJSONRequest
{
    public static interface HTTPJSONRequestListener
    {

        public abstract void onError(Exception exception);

        public abstract void onSuccess(int i, JSONObject jsonobject);
    }

    public static final class HttpMethod extends Enum
    {

        private static final HttpMethod $VALUES[];
        public static final HttpMethod GET;
        public static final HttpMethod PATCH;
        public static final HttpMethod POST;
        private final String methodName;

        public static HttpMethod valueOf(String s)
        {
            return (HttpMethod)Enum.valueOf(ly/kite/util/HTTPJSONRequest$HttpMethod, s);
        }

        public static HttpMethod[] values()
        {
            return (HttpMethod[])$VALUES.clone();
        }

        static 
        {
            POST = new HttpMethod("POST", 0, "POST");
            GET = new HttpMethod("GET", 1, "GET");
            PATCH = new HttpMethod("PATCH", 2, "PATCH");
            $VALUES = (new HttpMethod[] {
                POST, GET, PATCH
            });
        }

        private HttpMethod(String s, int i, String s1)
        {
            super(s, i);
            methodName = s1;
        }
    }


    static final boolean $assertionsDisabled;
    public static final String ERROR_RESPONSE_CODE_JSON_NAME = "code";
    public static final String ERROR_RESPONSE_JSON_OBJECT_NAME = "error";
    public static final String ERROR_RESPONSE_MESSAGE_JSON_NAME = "message";
    private static final String LOG_TAG = "HTTPJSONRequest";
    private final String body;
    private final Map headers;
    private final Context mContext;
    private final HttpMethod method;
    private AsyncTask requestTask;
    private final String url;

    public HTTPJSONRequest(Context context, HttpMethod httpmethod, String s, Map map, String s1)
    {
        mContext = context;
        method = httpmethod;
        url = s;
        headers = map;
        body = s1;
    }

    public void cancel()
    {
        if (requestTask != null)
        {
            requestTask.cancel(true);
            requestTask = null;
        }
    }

    public void start(HTTPJSONRequestListener httpjsonrequestlistener)
    {
        if (!$assertionsDisabled && requestTask != null)
        {
            throw new AssertionError("Oops a request has previously been started");
        } else
        {
            requestTask = new _cls1(httpjsonrequestlistener);
            requestTask.execute(new Void[0]);
            return;
        }
    }

    static 
    {
        boolean flag;
        if (!ly/kite/util/HTTPJSONRequest.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        $assertionsDisabled = flag;
    }






    // Unreferenced inner class ly/kite/util/HTTPJSONRequest$HttpPatch
    /* block-local class not found */
    class HttpPatch {}


    // Unreferenced inner class ly/kite/util/HTTPJSONRequest$JSONHttpResponse
    /* block-local class not found */
    class JSONHttpResponse {}


    /* member class not found */
    class _cls1 {}

}
