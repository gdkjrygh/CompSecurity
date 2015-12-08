// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.auditude.ads.util;

import com.auditude.ads.util.log.ILogger;
import com.auditude.ads.util.log.Log;
import com.squareup.okhttp.Call;
import com.squareup.okhttp.OkHttpClient;
import com.squareup.okhttp.Response;
import java.io.IOException;
import java.net.SocketTimeoutException;
import java.util.List;
import java.util.concurrent.TimeUnit;

// Referenced classes of package com.auditude.ads.util:
//            PingUtil, UserAgentInterceptor

class val.url
    implements Runnable
{

    private final int val$redirect;
    private final String val$url;
    private final String val$userAgent;

    public void run()
    {
        Object obj;
        String s;
        Object obj2;
        Object obj3;
        Object obj4;
        boolean flag1;
        boolean flag2;
        boolean flag3;
        boolean flag4;
        boolean flag5;
        boolean flag6;
        boolean flag7;
        boolean flag8;
        boolean flag9;
        flag6 = false;
        flag7 = false;
        flag8 = false;
        flag9 = false;
        flag5 = false;
        s = "";
        obj2 = s;
        flag2 = flag6;
        obj3 = s;
        flag3 = flag7;
        obj4 = s;
        flag4 = flag8;
        obj = s;
        flag1 = flag9;
        Object obj1 = new OkHttpClient();
        obj2 = s;
        flag2 = flag6;
        obj3 = s;
        flag3 = flag7;
        obj4 = s;
        flag4 = flag8;
        obj = s;
        flag1 = flag9;
        ((OkHttpClient) (obj1)).setFollowRedirects(false);
        obj2 = s;
        flag2 = flag6;
        obj3 = s;
        flag3 = flag7;
        obj4 = s;
        flag4 = flag8;
        obj = s;
        flag1 = flag9;
        ((OkHttpClient) (obj1)).networkInterceptors().add(new UserAgentInterceptor(val$userAgent));
        obj2 = s;
        flag2 = flag6;
        obj3 = s;
        flag3 = flag7;
        obj4 = s;
        flag4 = flag8;
        obj = s;
        flag1 = flag9;
        ((OkHttpClient) (obj1)).setConnectTimeout(PingUtil.access$1().intValue(), TimeUnit.MILLISECONDS);
        obj2 = s;
        flag2 = flag6;
        obj3 = s;
        flag3 = flag7;
        obj4 = s;
        flag4 = flag8;
        obj = s;
        flag1 = flag9;
        ((OkHttpClient) (obj1)).setReadTimeout(PingUtil.access$1().intValue(), TimeUnit.MILLISECONDS);
        obj2 = s;
        flag2 = flag6;
        obj3 = s;
        flag3 = flag7;
        obj4 = s;
        flag4 = flag8;
        obj = s;
        flag1 = flag9;
        Response response = ((OkHttpClient) (obj1)).newCall((new com.squareup.okhttp.lder()).url(val$url).build()).execute();
        obj2 = s;
        flag2 = flag6;
        obj3 = s;
        flag3 = flag7;
        obj4 = s;
        flag4 = flag8;
        obj = s;
        flag1 = flag9;
        if (response.code() == 302)
        {
            break MISSING_BLOCK_LABEL_350;
        }
        boolean flag;
        obj1 = s;
        flag = flag5;
        obj2 = s;
        flag2 = flag6;
        obj3 = s;
        flag3 = flag7;
        obj4 = s;
        flag4 = flag8;
        obj = s;
        flag1 = flag9;
        if (response.code() != 301)
        {
            break MISSING_BLOCK_LABEL_475;
        }
        obj2 = s;
        flag2 = flag6;
        obj3 = s;
        flag3 = flag7;
        obj4 = s;
        flag4 = flag8;
        obj = s;
        flag1 = flag9;
        s = response.header("Location");
        obj1 = s;
        flag = flag5;
        obj2 = s;
        flag2 = flag6;
        obj3 = s;
        flag3 = flag7;
        obj4 = s;
        flag4 = flag8;
        obj = s;
        flag1 = flag9;
        if (s.length() <= 0)
        {
            break MISSING_BLOCK_LABEL_475;
        }
        obj1 = s;
        flag = flag5;
        obj2 = s;
        flag2 = flag6;
        obj3 = s;
        flag3 = flag7;
        obj4 = s;
        flag4 = flag8;
        obj = s;
        flag1 = flag9;
        if (s.toLowerCase().startsWith("http"))
        {
            flag = true;
            obj1 = s;
        }
        obj2 = obj1;
        flag2 = flag;
        obj3 = obj1;
        flag3 = flag;
        obj4 = obj1;
        flag4 = flag;
        obj = obj1;
        flag1 = flag;
        if (response.isSuccessful()) goto _L2; else goto _L1
_L1:
        obj2 = obj1;
        flag2 = flag;
        obj3 = obj1;
        flag3 = flag;
        obj4 = obj1;
        flag4 = flag;
        obj = obj1;
        flag1 = flag;
        throw new IOException((new StringBuilder("Unexpected code ")).append(response).toString());
        obj;
        obj = obj2;
        flag1 = flag2;
        Log.getLogger("Ping").info((new StringBuilder("Pinging Url: Timed out sending request to ")).append(val$url).toString());
        if (flag2)
        {
            Log.getLogger("Ping").info((new StringBuilder("Redirect to Url [")).append(val$redirect).append("]: ").append(((String) (obj2))).toString());
            PingUtil.pingUrl(((String) (obj2)), val$redirect + 1);
        }
_L4:
        return;
        obj1;
        obj = obj3;
        flag1 = flag3;
        Log.getLogger("Ping").info((new StringBuilder("Pinging Url: IOException while sending request, may retry(")).append(((IOException) (obj1)).getLocalizedMessage()).append(")").toString());
        if (flag3)
        {
            Log.getLogger("Ping").info((new StringBuilder("Redirect to Url [")).append(val$redirect).append("]: ").append(((String) (obj3))).toString());
            PingUtil.pingUrl(((String) (obj3)), val$redirect + 1);
            return;
        }
        continue; /* Loop/switch isn't completed */
        obj;
        obj = obj4;
        flag1 = flag4;
        Log.getLogger("Ping").info((new StringBuilder("Pinging Url: Unable to create HTTP connection to ")).append(val$url).toString());
        if (flag4)
        {
            Log.getLogger("Ping").info((new StringBuilder("Redirect to Url [")).append(val$redirect).append("]: ").append(((String) (obj4))).toString());
            PingUtil.pingUrl(((String) (obj4)), val$redirect + 1);
            return;
        }
        continue; /* Loop/switch isn't completed */
        obj1;
        if (flag1)
        {
            Log.getLogger("Ping").info((new StringBuilder("Redirect to Url [")).append(val$redirect).append("]: ").append(((String) (obj))).toString());
            PingUtil.pingUrl(((String) (obj)), val$redirect + 1);
        }
        throw obj1;
_L2:
        if (flag)
        {
            Log.getLogger("Ping").info((new StringBuilder("Redirect to Url [")).append(val$redirect).append("]: ").append(((String) (obj1))).toString());
            PingUtil.pingUrl(((String) (obj1)), val$redirect + 1);
            return;
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    ()
    {
        val$redirect = i;
        val$userAgent = s;
        val$url = s1;
        super();
    }
}
