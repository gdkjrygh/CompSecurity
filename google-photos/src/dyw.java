// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;

public final class dyw
{

    public static final String a = dur.getName();
    public static final String b = duq.getName();
    public static final String c = dxy.getName();
    private static dyv d;

    public static void a(Context context, olm olm1)
    {
        if (d == null)
        {
            d = new dyv();
        }
        olm1.a(dur, new dur[] {
            new dyt(context)
        });
    }

    public static void a(olm olm1)
    {
        if (d == null)
        {
            d = new dyv();
        }
        olm1.a(duq, new duq[] {
            new dyp()
        });
    }

    public static void b(olm olm1)
    {
        if (d == null)
        {
            d = new dyv();
        }
        olm1.a(dxy, new dxy[] {
            new dyn()
        });
    }

}
