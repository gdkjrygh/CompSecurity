// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;

public final class hol
{

    public static final String a = epb.getName();
    public static final String b = dia.getName();
    public static final String c = hny.getName();
    public static final String d = hon.getName();
    public static final String e = myc.getName();
    private static hok f;

    public static void a(Context context, olm olm1)
    {
        if (f == null)
        {
            f = new hok();
        }
        olm1.a(epb, new hod(context));
    }

    public static void a(olm olm1)
    {
        if (f == null)
        {
            f = new hok();
        }
        olm1.a(dia, new dia[] {
            new hml()
        });
    }

    public static void b(olm olm1)
    {
        if (f == null)
        {
            f = new hok();
        }
        olm1.a(hny, new hny());
    }

    public static void c(olm olm1)
    {
        if (f == null)
        {
            f = new hok();
        }
        olm1.a(hon, new hmi());
    }

    public static void d(olm olm1)
    {
        if (f == null)
        {
            f = new hok();
        }
        olm1.a(myc, new myc[] {
            hoj.a
        });
    }

}
