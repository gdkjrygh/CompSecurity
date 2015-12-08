// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.cloudlib;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import com.roidapp.cloudlib.ads.l;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Map;

// Referenced classes of package com.roidapp.cloudlib:
//            aj, ak

public final class al
    implements aj
{

    public static final String a = "http://dl.pg.ksmobile.com/conf";
    public static final String b = "http://dl.pg.ksmobile.com/templates/everyday";
    public static final String c = "http://dl.pg.ksmobile.com/filter2/info";
    public static final String d = "http://dl.pg.ksmobile.com/ga/web/cdn.php?path=/templete/getTemplateFromPicNum&picnum=%s";
    public static final String e = "http://dl.pg.ksmobile.com/cloudpush/info_v2";
    public static final String f = "http://wide.adr.pt.ksmobile.com/api/emoji_json";
    private static al g;
    private aj h;

    private al()
    {
    }

    public static al g()
    {
        if (g == null)
        {
            g = new al();
        }
        return g;
    }

    public final Intent a(Context context, String s, String s1)
    {
        return h.a(context, s, s1);
    }

    public final InputStream a(Context context, int i)
    {
        return h.a(context, i);
    }

    public final InputStream a(Context context, String s, int i)
    {
        return h.a(context, s, i);
    }

    public final Class a()
    {
        return h.a();
    }

    public final void a(Activity activity)
    {
        h.a(activity);
    }

    public final void a(Activity activity, Bundle bundle)
    {
        h.a(activity, bundle);
    }

    public final void a(Context context)
    {
        h.a(context);
    }

    public final void a(Context context, int i, String s)
    {
        h.a(context, i, s);
    }

    public final void a(Context context, String s)
    {
        h.a(context, s);
    }

    public final void a(Context context, String s, String s1, String s2, Long long1)
    {
        h.a(context, s, s1, s2, long1, null);
    }

    public final void a(Context context, String s, String s1, String s2, Long long1, Map map)
    {
        h.a(context, s, s1, s2, long1, map);
    }

    public final void a(aj aj1)
    {
        h = aj1;
    }

    public final void a(String s)
    {
        h.a(s);
    }

    public final void a(String s, int i, int j)
    {
        h.a(s, i, j);
    }

    public final boolean a(Bundle bundle)
    {
        return h.a(bundle);
    }

    public final String[] a(Context context, Uri uri, boolean flag)
    {
        return h.a(context, uri, flag);
    }

    public final ak b(String s)
    {
        return h.b(s);
    }

    public final InputStream b(Context context)
    {
        return h.b(context);
    }

    public final Class b()
    {
        return h.b();
    }

    public final void b(Context context, String s)
    {
        h.b(context, s);
    }

    public final InputStream c(Context context, String s)
    {
        return h.c(context, s);
    }

    public final Class c()
    {
        return h.c();
    }

    public final boolean c(Context context)
    {
        return h.c(context);
    }

    public final l d(Context context, String s)
    {
        return h.d(context, s);
    }

    public final Class d()
    {
        return h.d();
    }

    public final boolean d(Context context)
    {
        return h.d(context);
    }

    public final Intent e(Context context, String s)
    {
        return h.e(context, s);
    }

    public final ArrayList e()
    {
        return h.e();
    }

    public final boolean e(Context context)
    {
        return h.e(context);
    }

    public final boolean f()
    {
        return h.f();
    }

}
