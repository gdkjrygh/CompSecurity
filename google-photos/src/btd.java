// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Bundle;

public class btd extends bmb
{

    private static final String b = btd.getSimpleName();
    public final bto a = new bte(this, this, btj);
    private final btk e = new btf(this);
    private final bqa f;
    private final brl g;
    private final bsm h;
    private String i;
    private boolean j;

    btd(bmb bmb1, Bundle bundle, cag cag, bqa bqa1, bnm bnm1, brl brl1)
    {
        super(bmb1);
        new btg(this, this, new bxg[] {
            bxg.g
        });
        new bth(this, this, new bxg[] {
            bxg.t
        });
        f = (bqa)b.a(bqa1, "playerScreenController", null);
        b.a(bnm1, "initEditorFlow", null);
        g = (brl)b.a(brl1, "saveFlow", null);
        h = (new bsp()).a(bnm1.a).a(this, b, bundle, cag).a(new bti(this));
    }

    static btk a(btd btd1)
    {
        return btd1.e;
    }

    static String a(btd btd1, String s)
    {
        btd1.i = s;
        return s;
    }

    static boolean a(btd btd1, boolean flag)
    {
        btd1.j = flag;
        return flag;
    }

    static void b(btd btd1)
    {
        if (btd1.i != null && ((bmb) (btd1)).d && ((bmb) (btd1.g)).d)
        {
            String s = btd1.i;
            btd1.i = null;
            btd1.c.a(s);
            if (!btd1.j)
            {
                ((btj)btd1.a.b).q();
                btd1.g.b();
                return;
            }
        }
    }

    static bqa c(btd btd1)
    {
        return btd1.f;
    }

    static bsm d(btd btd1)
    {
        return btd1.h;
    }

    static String d()
    {
        return b;
    }

    static bto e(btd btd1)
    {
        return btd1.a;
    }

    public final void b()
    {
        ((btj)a.b).o();
    }

}
