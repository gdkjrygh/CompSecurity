// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.res.Resources;
import io.fabric.sdk.android.services.common.CommonUtils;
import io.fabric.sdk.android.services.network.HttpMethod;
import io.fabric.sdk.android.services.network.HttpRequest;
import java.net.HttpURLConnection;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.Locale;

abstract class hbf extends gyp
{

    public hbf(gyh gyh1, String s, String s1, hba hba, HttpMethod httpmethod)
    {
        super(gyh1, s, s1, hba, httpmethod);
    }

    private HttpRequest a(HttpRequest httprequest, hbi hbi1)
    {
        Object obj;
        HttpRequest httprequest1;
        httprequest1 = httprequest.b("app[identifier]", hbi1.b).b("app[name]", hbi1.f).b("app[display_version]", hbi1.c).b("app[build_version]", hbi1.d).a("app[source]", Integer.valueOf(hbi1.g)).b("app[minimum_sdk_version]", hbi1.h).b("app[built_sdk_version]", hbi1.i);
        if (!CommonUtils.d(hbi1.e))
        {
            httprequest1.b("app[instance_identifier]", hbi1.e);
        }
        if (hbi1.j == null)
        {
            break MISSING_BLOCK_LABEL_193;
        }
        obj = null;
        httprequest = null;
        java.io.InputStream inputstream = b.k.getResources().openRawResource(hbi1.j.b);
        httprequest = inputstream;
        obj = inputstream;
        httprequest1.b("app[icon][hash]", hbi1.j.a).a("app[icon][data]", "icon.png", "application/octet-stream", inputstream).a("app[icon][width]", Integer.valueOf(hbi1.j.c)).a("app[icon][height]", Integer.valueOf(hbi1.j.d));
        CommonUtils.a(inputstream, "Failed to close app icon InputStream.");
_L2:
        if (hbi1.k != null)
        {
            for (httprequest = hbi1.k.iterator(); httprequest.hasNext(); httprequest1.b(String.format(Locale.US, "app[build][libraries][%s][type]", new Object[] {
    ((gyj) (hbi1)).a
}), ((gyj) (hbi1)).c))
            {
                hbi1 = (gyj)httprequest.next();
                httprequest1.b(String.format(Locale.US, "app[build][libraries][%s][version]", new Object[] {
                    ((gyj) (hbi1)).a
                }), ((gyj) (hbi1)).b);
            }

        }
        break MISSING_BLOCK_LABEL_346;
        android.content.res.Resources.NotFoundException notfoundexception;
        notfoundexception;
        obj = httprequest;
        gya.a().c("Fabric", (new StringBuilder("Failed to find app icon with resource ID: ")).append(hbi1.j.b).toString(), notfoundexception);
        CommonUtils.a(httprequest, "Failed to close app icon InputStream.");
        if (true) goto _L2; else goto _L1
_L1:
        httprequest;
        CommonUtils.a(((java.io.Closeable) (obj)), "Failed to close app icon InputStream.");
        throw httprequest;
        return httprequest1;
    }

    public boolean a(hbi hbi1)
    {
        HttpRequest httprequest = a(a(Collections.emptyMap()).a("X-CRASHLYTICS-API-KEY", hbi1.a).a("X-CRASHLYTICS-API-CLIENT-TYPE", "android").a("X-CRASHLYTICS-API-CLIENT-VERSION", b.a()), hbi1);
        gya.a().a("Fabric", (new StringBuilder("Sending app info to ")).append(super.a).toString());
        if (hbi1.j != null)
        {
            gya.a().a("Fabric", (new StringBuilder("App icon hash is ")).append(hbi1.j.a).toString());
            gya.a().a("Fabric", (new StringBuilder("App icon size is ")).append(hbi1.j.c).append("x").append(hbi1.j.d).toString());
        }
        int i = httprequest.b();
        if ("POST".equals(httprequest.a().getRequestMethod()))
        {
            hbi1 = "Create";
        } else
        {
            hbi1 = "Update";
        }
        gya.a().a("Fabric", (new StringBuilder()).append(hbi1).append(" app request ID: ").append(httprequest.a("X-REQUEST-ID")).toString());
        gya.a().a("Fabric", (new StringBuilder("Result was ")).append(i).toString());
        return gzk.a(i) == 0;
    }
}
