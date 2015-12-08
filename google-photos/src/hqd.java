// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;

public final class hqd
{

    public static final String a = hpp.getName();
    public static final String b = hpy.getName();
    public static final String c = hpu.getName();
    public static final String d = hpq.getName();
    public static final String e = hpz.getName();
    private static hqc f;

    public static void a(Context context, olm olm1)
    {
        if (f == null)
        {
            f = new hqc();
        }
        olm1.a(hpz, new hpz(context));
    }

    public static void a(olm olm1)
    {
        if (f == null)
        {
            f = new hqc();
        }
        olm1.a(hpp, new hqa((hpy)olm1.a(hpy)));
    }

    public static void b(olm olm1)
    {
        if (f == null)
        {
            f = new hqc();
        }
        olm1.a(hpy, new hqe());
    }

    public static void c(olm olm1)
    {
        if (f == null)
        {
            f = new hqc();
        }
        olm1.a(hpu, (hpq)olm1.a(hpq));
    }

    public static void d(olm olm1)
    {
        if (f == null)
        {
            f = new hqc();
        }
        olm1.a(hpq, new hqb());
    }

}
