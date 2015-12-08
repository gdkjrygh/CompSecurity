// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.ads;

import android.util.Log;
import org.apache.http.HttpResponse;
import org.apache.http.StatusLine;
import org.apache.http.client.methods.HttpRequestBase;
import org.apache.http.util.EntityUtils;

// Referenced classes of package com.skype.android.ads:
//            ConfigManager

static final class b
    implements r.HTTPResponseListener
{

    final long a;
    final HttpRequestBase b;

    public final void a(HttpRequestBase httprequestbase, Exception exception)
    {
        ConfigManager.q();
        ConfigManager.a(exception);
        if (httprequestbase == b)
        {
            ConfigManager.a(a, exception);
        }
    }

    public final void a(HttpRequestBase httprequestbase, HttpResponse httpresponse)
    {
        ConfigManager.q();
        if (httpresponse.getStatusLine().getStatusCode() != 304) goto _L2; else goto _L1
_L1:
        ConfigManager.a(a, null);
_L4:
        return;
_L2:
        Object obj = httpresponse.getEntity();
        if (obj == null) goto _L4; else goto _L3
_L3:
        if (httprequestbase != b) goto _L4; else goto _L5
_L5:
        String s;
        String s1;
        s = ConfigManager.a(httpresponse, "x-ms-meta-signature");
        s1 = ConfigManager.a(httpresponse, "x-ms-meta-token");
        if (!ConfigManager.a(httpresponse, "Content-Encoding").equals("gzip"))
        {
            break MISSING_BLOCK_LABEL_193;
        }
        obj = ConfigManager.a(((org.apache.http.HttpEntity) (obj)));
_L7:
        if (!ConfigManager.a(((String) (obj)).getBytes(), s, s1))
        {
            break MISSING_BLOCK_LABEL_213;
        }
        if (ConfigManager.a(((String) (obj)), a))
        {
            ConfigManager.a("CONFIGLOAD", "file", System.currentTimeMillis() - a);
            ConfigManager.a(System.currentTimeMillis());
            ConfigManager.b();
            ConfigManager.c(((String) (obj)));
            ConfigManager.a(httpresponse);
            return;
        }
        break MISSING_BLOCK_LABEL_203;
        httpresponse;
        Log.e("SkypeAdConfigManager", (new StringBuilder("Read config response exception ")).append(httpresponse.getMessage()).toString());
        ConfigManager.a(httpresponse);
        if (httprequestbase != b) goto _L4; else goto _L6
_L6:
        ConfigManager.a(a, httpresponse);
        return;
        obj = EntityUtils.toString(((org.apache.http.HttpEntity) (obj)), "UTF-8");
          goto _L7
        throw new Exception("loading remote config file failed!");
        int i = httpresponse.getStatusLine().getStatusCode();
        if (i < 400)
        {
            break MISSING_BLOCK_LABEL_264;
        }
        throw new Exception((new StringBuilder("Configuration server throwing ")).append(i).append(" error code.").toString());
        throw new Exception("Verification of the signature failed!");
    }

    uestBase(long l, HttpRequestBase httprequestbase)
    {
        a = l;
        b = httprequestbase;
        super();
    }
}
