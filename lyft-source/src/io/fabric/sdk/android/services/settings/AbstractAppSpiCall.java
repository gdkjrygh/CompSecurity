// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package io.fabric.sdk.android.services.settings;

import android.content.Context;
import android.content.res.Resources;
import io.fabric.sdk.android.Fabric;
import io.fabric.sdk.android.Kit;
import io.fabric.sdk.android.Logger;
import io.fabric.sdk.android.services.common.AbstractSpiCall;
import io.fabric.sdk.android.services.common.CommonUtils;
import io.fabric.sdk.android.services.common.ResponseParser;
import io.fabric.sdk.android.services.network.HttpMethod;
import io.fabric.sdk.android.services.network.HttpRequest;
import io.fabric.sdk.android.services.network.HttpRequestFactory;
import java.util.Collection;
import java.util.Iterator;

// Referenced classes of package io.fabric.sdk.android.services.settings:
//            AppRequestData, IconRequest

abstract class AbstractAppSpiCall extends AbstractSpiCall
{

    public AbstractAppSpiCall(Kit kit, String s, String s1, HttpRequestFactory httprequestfactory, HttpMethod httpmethod)
    {
        super(kit, s, s1, httprequestfactory, httpmethod);
    }

    private HttpRequest a(HttpRequest httprequest, AppRequestData apprequestdata)
    {
        return httprequest.a("X-CRASHLYTICS-API-KEY", apprequestdata.a).a("X-CRASHLYTICS-API-CLIENT-TYPE", "android").a("X-CRASHLYTICS-API-CLIENT-VERSION", a.d());
    }

    private HttpRequest b(HttpRequest httprequest, AppRequestData apprequestdata)
    {
        Object obj;
        HttpRequest httprequest1;
        httprequest1 = httprequest.e("app[identifier]", apprequestdata.b).e("app[name]", apprequestdata.f).e("app[display_version]", apprequestdata.c).e("app[build_version]", apprequestdata.d).a("app[source]", Integer.valueOf(apprequestdata.g)).e("app[minimum_sdk_version]", apprequestdata.h).e("app[built_sdk_version]", apprequestdata.i);
        if (!CommonUtils.c(apprequestdata.e))
        {
            httprequest1.e("app[instance_identifier]", apprequestdata.e);
        }
        if (apprequestdata.j == null)
        {
            break MISSING_BLOCK_LABEL_193;
        }
        obj = null;
        httprequest = null;
        java.io.InputStream inputstream = a.C().getResources().openRawResource(apprequestdata.j.b);
        httprequest = inputstream;
        obj = inputstream;
        httprequest1.e("app[icon][hash]", apprequestdata.j.a).a("app[icon][data]", "icon.png", "application/octet-stream", inputstream).a("app[icon][width]", Integer.valueOf(apprequestdata.j.c)).a("app[icon][height]", Integer.valueOf(apprequestdata.j.d));
        CommonUtils.a(inputstream, "Failed to close app icon InputStream.");
_L1:
        if (apprequestdata.k != null)
        {
            apprequestdata = apprequestdata.k.iterator();
            while (apprequestdata.hasNext()) 
            {
                obj = (Kit)apprequestdata.next();
                android.content.res.Resources.NotFoundException notfoundexception;
                if (((Kit) (obj)).d() == null)
                {
                    httprequest = "";
                } else
                {
                    httprequest = ((Kit) (obj)).d();
                }
                httprequest1.e(a(((Kit) (obj))), httprequest);
            }
        }
        break MISSING_BLOCK_LABEL_321;
        notfoundexception;
        obj = httprequest;
        Fabric.g().d("Fabric", (new StringBuilder()).append("Failed to find app icon with resource ID: ").append(apprequestdata.j.b).toString(), notfoundexception);
        CommonUtils.a(httprequest, "Failed to close app icon InputStream.");
          goto _L1
        httprequest;
        CommonUtils.a(((java.io.Closeable) (obj)), "Failed to close app icon InputStream.");
        throw httprequest;
        return httprequest1;
    }

    String a(Kit kit)
    {
        if (kit.c() == null)
        {
            kit = "";
        } else
        {
            kit = kit.c();
        }
        return (new StringBuilder()).append("app[build][libraries][").append(kit).append("]").toString();
    }

    public boolean a(AppRequestData apprequestdata)
    {
        HttpRequest httprequest = b(a(b(), apprequestdata), apprequestdata);
        Fabric.g().a("Fabric", (new StringBuilder()).append("Sending app info to ").append(a()).toString());
        if (apprequestdata.j != null)
        {
            Fabric.g().a("Fabric", (new StringBuilder()).append("App icon hash is ").append(apprequestdata.j.a).toString());
            Fabric.g().a("Fabric", (new StringBuilder()).append("App icon size is ").append(apprequestdata.j.c).append("x").append(apprequestdata.j.d).toString());
        }
        int i = httprequest.b();
        if ("POST".equals(httprequest.p()))
        {
            apprequestdata = "Create";
        } else
        {
            apprequestdata = "Update";
        }
        Fabric.g().a("Fabric", (new StringBuilder()).append(apprequestdata).append(" app request ID: ").append(httprequest.b("X-REQUEST-ID")).toString());
        Fabric.g().a("Fabric", (new StringBuilder()).append("Result was ").append(i).toString());
        return ResponseParser.a(i) == 0;
    }
}
