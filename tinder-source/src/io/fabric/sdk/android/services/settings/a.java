// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package io.fabric.sdk.android.services.settings;

import android.content.Context;
import android.content.res.Resources;
import io.fabric.sdk.android.c;
import io.fabric.sdk.android.h;
import io.fabric.sdk.android.j;
import io.fabric.sdk.android.k;
import io.fabric.sdk.android.services.common.CommonUtils;
import io.fabric.sdk.android.services.common.o;
import io.fabric.sdk.android.services.network.HttpMethod;
import io.fabric.sdk.android.services.network.HttpRequest;
import java.net.HttpURLConnection;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.Locale;

// Referenced classes of package io.fabric.sdk.android.services.settings:
//            d, n

abstract class a extends io.fabric.sdk.android.services.common.a
{

    public a(h h1, String s, String s1, io.fabric.sdk.android.services.network.c c1, HttpMethod httpmethod)
    {
        super(h1, s, s1, c1, httpmethod);
    }

    private HttpRequest a(HttpRequest httprequest, d d1)
    {
        Object obj;
        HttpRequest httprequest1;
        httprequest1 = httprequest.b("app[identifier]", d1.b).b("app[name]", d1.f).b("app[display_version]", d1.c).b("app[build_version]", d1.d).a("app[source]", Integer.valueOf(d1.g)).b("app[minimum_sdk_version]", d1.h).b("app[built_sdk_version]", d1.i);
        if (!CommonUtils.d(d1.e))
        {
            httprequest1.b("app[instance_identifier]", d1.e);
        }
        if (d1.j == null)
        {
            break MISSING_BLOCK_LABEL_193;
        }
        obj = null;
        httprequest = null;
        java.io.InputStream inputstream = b.n.getResources().openRawResource(d1.j.b);
        httprequest = inputstream;
        obj = inputstream;
        httprequest1.b("app[icon][hash]", d1.j.a).a("app[icon][data]", "icon.png", "application/octet-stream", inputstream).a("app[icon][width]", Integer.valueOf(d1.j.c)).a("app[icon][height]", Integer.valueOf(d1.j.d));
        CommonUtils.a(inputstream, "Failed to close app icon InputStream.");
_L2:
        if (d1.k != null)
        {
            for (httprequest = d1.k.iterator(); httprequest.hasNext(); httprequest1.b(String.format(Locale.US, "app[build][libraries][%s][type]", new Object[] {
    ((j) (d1)).a
}), ((j) (d1)).c))
            {
                d1 = (j)httprequest.next();
                httprequest1.b(String.format(Locale.US, "app[build][libraries][%s][version]", new Object[] {
                    ((j) (d1)).a
                }), ((j) (d1)).b);
            }

        }
        break MISSING_BLOCK_LABEL_346;
        android.content.res.Resources.NotFoundException notfoundexception;
        notfoundexception;
        obj = httprequest;
        c.a().c("Fabric", (new StringBuilder("Failed to find app icon with resource ID: ")).append(d1.j.b).toString(), notfoundexception);
        CommonUtils.a(httprequest, "Failed to close app icon InputStream.");
        if (true) goto _L2; else goto _L1
_L1:
        httprequest;
        CommonUtils.a(((java.io.Closeable) (obj)), "Failed to close app icon InputStream.");
        throw httprequest;
        return httprequest1;
    }

    public boolean a(d d1)
    {
        HttpRequest httprequest = a(a(Collections.emptyMap()).a("X-CRASHLYTICS-API-KEY", d1.a).a("X-CRASHLYTICS-API-CLIENT-TYPE", "android").a("X-CRASHLYTICS-API-CLIENT-VERSION", b.a()), d1);
        c.a().a("Fabric", (new StringBuilder("Sending app info to ")).append(super.a).toString());
        if (d1.j != null)
        {
            c.a().a("Fabric", (new StringBuilder("App icon hash is ")).append(d1.j.a).toString());
            c.a().a("Fabric", (new StringBuilder("App icon size is ")).append(d1.j.c).append("x").append(d1.j.d).toString());
        }
        int i = httprequest.b();
        if ("POST".equals(httprequest.a().getRequestMethod()))
        {
            d1 = "Create";
        } else
        {
            d1 = "Update";
        }
        c.a().a("Fabric", (new StringBuilder()).append(d1).append(" app request ID: ").append(httprequest.a("X-REQUEST-ID")).toString());
        c.a().a("Fabric", (new StringBuilder("Result was ")).append(i).toString());
        return o.a(i) == 0;
    }
}
