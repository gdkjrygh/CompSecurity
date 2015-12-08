// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;

public final class ggc
{

    public static final String a = ggd.getName();
    public static final String b = gfw.getName();
    public static final String c = myc.getName();
    public static final String d = nog.getName();
    private static ggb e;

    public static void a(Context context, olm olm1)
    {
        if (e == null)
        {
            e = new ggb();
        }
        olm1.a(gfw, new gfw(context));
    }

    public static void a(olm olm1)
    {
        if (e == null)
        {
            e = new ggb();
        }
        olm1.a(ggd, new ggd());
    }

    public static void b(Context context, olm olm1)
    {
        if (e == null)
        {
            e = new ggb();
        }
        olm1.a(nog, new nog(context));
    }

    public static void b(olm olm1)
    {
        if (e == null)
        {
            e = new ggb();
        }
        olm1.a(myc, new myc[] {
            gfx.a
        });
    }

}
