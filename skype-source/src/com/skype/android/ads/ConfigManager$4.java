// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.ads;

import android.util.Log;
import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpRequestBase;
import org.apache.http.util.EntityUtils;
import org.json.JSONObject;

// Referenced classes of package com.skype.android.ads:
//            ConfigManager

static final class uestBase
    implements r.HTTPResponseListener
{

    public final void a(HttpRequestBase httprequestbase, Exception exception)
    {
        Log.e("SkypeAdConfigManager", (new StringBuilder("Get country code exception ")).append(exception.getMessage()).toString());
        ConfigManager.b(exception);
    }

    public final void a(HttpRequestBase httprequestbase, HttpResponse httpresponse)
    {
        httprequestbase = httpresponse.getEntity();
        if (httprequestbase == null)
        {
            break MISSING_BLOCK_LABEL_58;
        }
        ConfigManager.d((new JSONObject(EntityUtils.toString(httprequestbase, "UTF-8"))).getString("country_code"));
        (new StringBuilder("AkamaiCountryCode: ")).append(ConfigManager.r());
        ConfigManager.e(ConfigManager.r());
        ConfigManager.f();
        return;
        httprequestbase;
        Log.e("SkypeAdConfigManager", (new StringBuilder("Read country code response exception ")).append(httprequestbase.getMessage()).toString());
        ConfigManager.b(httprequestbase);
        return;
    }

    uestBase()
    {
    }
}
