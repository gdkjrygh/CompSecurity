// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;

public final class mrl
{

    public static final String a = mrb.getName();
    public static final String b = mro.getName();
    public static final String c = mqw.getName();
    public static final String d = mrh.getName();
    public static final String e = mrf.getName();
    public static final String f = mvi.getName();
    private static mrk g;

    public static void a(Context context, olm olm1)
    {
        if (g == null)
        {
            g = new mrk();
        }
        olm1.a(mrb, new mrb(context));
    }

    public static void a(olm olm1)
    {
        if (g == null)
        {
            g = new mrk();
        }
        olm1.a(mvi, new mvi[] {
            new mrj()
        });
    }

    public static void b(Context context, olm olm1)
    {
        if (g == null)
        {
            g = new mrk();
        }
        olm1.a(mro, new mro(context));
    }

    public static void c(Context context, olm olm1)
    {
        if (g == null)
        {
            g = new mrk();
        }
        olm1.a(mqw, new mrt(context));
    }

    public static void d(Context context, olm olm1)
    {
        if (g == null)
        {
            g = new mrk();
        }
        olm1.a(mrh, new mrh(context));
    }

    public static void e(Context context, olm olm1)
    {
        if (g == null)
        {
            g = new mrk();
        }
        olm1.a(mrf, new mrf(context));
    }

}
