// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;

public final class fhs
    implements ds
{

    private static final int b;
    boolean a;
    private final String c;
    private final String d;
    private final boolean e;
    private final noz f;

    private fhs(Context context, String s, String s1, boolean flag)
    {
        c = s;
        d = s1;
        e = flag;
        f = noz.a(context, "JoinOrPinEnvelope", new String[0]);
    }

    public static fhs a(Context context, String s, String s1)
    {
        return new fhs(context, s, s1, true);
    }

    public static fhs b(Context context, String s, String s1)
    {
        return new fhs(context, s, s1, false);
    }

    public final void a(hpr hpr)
    {
        a = false;
        if (f.a())
        {
            noy.a("mediaKey", d);
            noy.a("rpcError", hpr);
        }
    }

    public final void a(qlw qlw)
    {
        a = true;
    }

    public final qlr f()
    {
        return qqx.a;
    }

    public final int g()
    {
        return b;
    }

    public final qlr g_()
    {
        return qqw.a;
    }

    public final String k_()
    {
        return "JoinOrPinEnvelope";
    }

    public final qlw l_()
    {
        qqw qqw1 = new qqw();
        qqw1.d = c;
        qqw1.b = new qbx();
        qqw1.b.a = d;
        qqw1.c = Boolean.valueOf(e);
        return qqw1;
    }

    static 
    {
        b = qmb.b(qqx.a.b);
    }
}
