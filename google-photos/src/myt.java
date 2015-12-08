// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;

public final class myt
{

    public static final String a = nya.getName();
    public static final String b = ngo.getName();
    public static final String c = mye.getName();
    public static final String d = mym.getName();
    public static final String e = myf.getName();
    public static final String f = myc.getName();
    public static final String g = onc.getName();
    private static mys h;

    public static void a(Context context, olm olm1)
    {
        if (h == null)
        {
            h = new mys();
        }
        olm1.a(ngo, new ngo[] {
            new myk(context)
        });
    }

    public static void a(olm olm1)
    {
        if (h == null)
        {
            h = new mys();
        }
        olm1.a(nya, new nya[] {
            new myu()
        });
    }

    public static void b(Context context, olm olm1)
    {
        if (h == null)
        {
            h = new mys();
        }
        olm1.a(mye, new myo(context));
    }

    public static void b(olm olm1)
    {
        if (h == null)
        {
            h = new mys();
        }
        olm1.a(myc, new myc[] {
            myh.a, myh.b
        });
    }

    public static void c(Context context, olm olm1)
    {
        if (h == null)
        {
            h = new mys();
        }
        olm1.a(mym, new myn(context));
    }

    public static void c(olm olm1)
    {
        if (h == null)
        {
            h = new mys();
        }
        olm1.a(onc, new onc[0]);
    }

    public static void d(Context context, olm olm1)
    {
        if (h == null)
        {
            h = new mys();
        }
        olm1.a(myf, new myp(context, (mym)olm.a(context, mym), (mye)olm.a(context, mye)));
    }

}
