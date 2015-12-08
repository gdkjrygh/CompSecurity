// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;

public final class gbl
{

    public static final String a = gbf.getName();
    public static final String b = gba.getName();
    public static final String c = gbb.getName();
    public static final String d = gbg.getName();
    public static final String e = gbh.getName();
    public static final String f = gbm.getName();
    public static final String g = gbd.getName();
    public static final String h = gbo.getName();
    private static gbk i;

    public static void a(Context context, olm olm1)
    {
        if (i == null)
        {
            i = new gbk();
        }
        olm1.a(gba, new gba(context, (gbg)olm1.a(gbg)));
    }

    public static void a(olm olm1)
    {
        if (i == null)
        {
            i = new gbk();
        }
        gbb gbb1 = (gbb)olm1.a(gbb);
        olm1.a(gbf, new gbf[] {
            new gbe(), new gbi(), gbb1, new gbp(), new gbn(), new gbj(), new gbc()
        });
    }

    public static void b(Context context, olm olm1)
    {
        if (i == null)
        {
            i = new gbk();
        }
        olm1.a(gbg, new gbg(context));
    }

    public static void b(olm olm1)
    {
        if (i == null)
        {
            i = new gbk();
        }
        olm1.a(gbb, new gbb());
    }

    public static void c(Context context, olm olm1)
    {
        if (i == null)
        {
            i = new gbk();
        }
        olm1.a(gbh, new gbh(context, (gbg)olm1.a(gbg)));
    }

    public static void d(Context context, olm olm1)
    {
        if (i == null)
        {
            i = new gbk();
        }
        olm1.a(gbm, new gbm((gbg)olm1.a(gbg), new jfj(context)));
    }

    public static void e(Context context, olm olm1)
    {
        if (i == null)
        {
            i = new gbk();
        }
        olm1.a(gbd, new gbd(context, (gbg)olm1.a(gbg)));
    }

    public static void f(Context context, olm olm1)
    {
        if (i == null)
        {
            i = new gbk();
        }
        olm1.a(gbo, new gbo((gbg)olm1.a(gbg), new jfl(context)));
    }

}
