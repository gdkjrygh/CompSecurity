// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;

public final class jas
{

    public static final String a = dur.getName();
    public static final String b = jan.getName();
    public static final String c = izq.getName();
    public static final String d = duq.getName();
    public static final String e = dxy.getName();
    public static final String f = izt.getName();
    private static jar g;

    public static void a(Context context, olm olm1)
    {
        if (g == null)
        {
            g = new jar();
        }
        olm1.a(dur, new dur[] {
            new jaq(context)
        });
    }

    public static void a(olm olm1)
    {
        if (g == null)
        {
            g = new jar();
        }
        olm1.a(dxy, new dxy[] {
            new jam("com.google.android.apps.photos.trash.local.assistant")
        });
    }

    public static void b(Context context, olm olm1)
    {
        if (g == null)
        {
            g = new jar();
        }
        olm1.a(jan, new jan(context, jaq.a));
    }

    public static void c(Context context, olm olm1)
    {
        if (g == null)
        {
            g = new jar();
        }
        olm1.a(izq, new izq[] {
            (izq)olm.a(context, jan)
        });
    }

    public static void d(Context context, olm olm1)
    {
        if (g == null)
        {
            g = new jar();
        }
        olm1.a(duq, new duq[] {
            new jap()
        });
    }

    public static void e(Context context, olm olm1)
    {
        if (g == null)
        {
            g = new jar();
        }
        olm1.a(izt, new izt[] {
            (izt)olm.a(context, jan)
        });
    }

}
