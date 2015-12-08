// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;

public final class gjv
{

    public static final String a = gjj.getName();
    public static final String b = mmu.getName();
    public static final String c = gjz.getName();
    public static final String d = gjr.getName();
    public static final String e = evf.getName();
    public static final String f = myc.getName();
    public static final String g = gjo.getName();
    private static gju h;

    public static void a(Context context, olm olm1)
    {
        if (h == null)
        {
            h = new gju();
        }
        olm1.a(gjj, new gjj(context, (gjr)olm1.a(gjr)));
    }

    public static void a(olm olm1)
    {
        if (h == null)
        {
            h = new gju();
        }
        olm1.a(evf, new evf[] {
            (gjo)olm1.a(gjo)
        });
    }

    public static void b(Context context, olm olm1)
    {
        if (h == null)
        {
            h = new gju();
        }
        olm1.a(mmu, new mmu[] {
            new gji(context)
        });
    }

    public static void b(olm olm1)
    {
        if (h == null)
        {
            h = new gju();
        }
        olm1.a(myc, new myc[] {
            gjn.a
        });
    }

    public static void c(Context context, olm olm1)
    {
        if (h == null)
        {
            h = new gju();
        }
        olm1.a(gjz, new gjz[] {
            new gjt(context, (gjr)olm1.a(gjr))
        });
    }

    public static void d(Context context, olm olm1)
    {
        if (h == null)
        {
            h = new gju();
        }
        olm1.a(gjr, new gjr(context));
    }

    public static void e(Context context, olm olm1)
    {
        if (h == null)
        {
            h = new gju();
        }
        olm1.a(gjo, new gjo(context));
    }

}
