// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.crashlytics.android;

import android.content.Context;
import android.content.res.Resources;
import com.crashlytics.android.internal.ba;
import com.crashlytics.android.internal.bu;
import com.crashlytics.android.internal.bw;
import com.crashlytics.android.internal.bx;
import com.crashlytics.android.internal.cj;
import com.crashlytics.android.internal.ck;
import com.crashlytics.android.internal.cm;
import com.crashlytics.android.internal.y;

// Referenced classes of package com.crashlytics.android:
//            ak, ac

abstract class ae extends y
{

    public ae(String s, String s1, bu bu, bw bw)
    {
        super(s, s1, bu, bw);
    }

    private static bx a(bx bx1, ak ak1)
    {
        Object obj;
        bx bx2;
        bx2 = bx1.b("app[identifier]", ak1.b).b("app[name]", ak1.f).b("app[display_version]", ak1.c).b("app[build_version]", ak1.d).a("app[source]", Integer.valueOf(ak1.g)).b("app[minimum_sdk_version]", ak1.h).b("app[built_sdk_version]", ak1.i);
        if (!ba.e(ak1.e))
        {
            bx2.b("app[instance_identifier]", ak1.e);
        }
        if (ak1.j == null)
        {
            break MISSING_BLOCK_LABEL_187;
        }
        obj = null;
        bx1 = null;
        java.io.InputStream inputstream = cm.a().w().getResources().openRawResource(ak1.j.b);
        bx1 = inputstream;
        obj = inputstream;
        bx2.b("app[icon][hash]", ak1.j.a).a("app[icon][data]", "icon.png", "application/octet-stream", inputstream).a("app[icon][width]", Integer.valueOf(ak1.j.c)).a("app[icon][height]", Integer.valueOf(ak1.j.d));
        ba.a(inputstream, "Failed to close app icon InputStream.");
        return bx2;
        android.content.res.Resources.NotFoundException notfoundexception;
        notfoundexception;
        obj = bx1;
        cm.a().b().a("Crashlytics", (new StringBuilder("Failed to find app icon with resource ID: ")).append(ak1.j.b).toString(), notfoundexception);
        ba.a(bx1, "Failed to close app icon InputStream.");
        return bx2;
        bx1;
        ba.a(((java.io.Closeable) (obj)), "Failed to close app icon InputStream.");
        throw bx1;
    }

    public final boolean a(ak ak1)
    {
        bx bx1 = a(b().a("X-CRASHLYTICS-API-KEY", ak1.a).a("X-CRASHLYTICS-API-CLIENT-TYPE", "android").a("X-CRASHLYTICS-API-CLIENT-VERSION", cm.a().f()), ak1);
        cm.a().b().a("Crashlytics", (new StringBuilder("Sending app info to ")).append(a()).toString());
        if (ak1.j != null)
        {
            cm.a().b().a("Crashlytics", (new StringBuilder("App icon hash is ")).append(ak1.j.a).toString());
            cm.a().b().a("Crashlytics", (new StringBuilder("App icon size is ")).append(ak1.j.c).append("x").append(ak1.j.d).toString());
        }
        int i = bx1.b();
        if ("POST".equals(bx1.d()))
        {
            ak1 = "Create";
        } else
        {
            ak1 = "Update";
        }
        cm.a().b().a("Crashlytics", (new StringBuilder()).append(ak1).append(" app request ID: ").append(bx1.a("X-REQUEST-ID")).toString());
        cm.a().b().a("Crashlytics", (new StringBuilder("Result was ")).append(i).toString());
        return ck.a(i) == 0;
    }
}
