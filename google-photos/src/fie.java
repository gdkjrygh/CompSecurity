// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.text.TextUtils;

final class fie
    implements ds
{

    private static final int b;
    hpr a;
    private final String c;
    private final boolean d;

    public fie(int i, String s, boolean flag)
    {
        boolean flag2 = true;
        super();
        boolean flag1;
        if (i != -1)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        p.a(flag1);
        if (!TextUtils.isEmpty(s))
        {
            flag1 = flag2;
        } else
        {
            flag1 = false;
        }
        p.a(flag1);
        c = s;
        d = flag;
    }

    public final void a(hpr hpr)
    {
        a = hpr;
    }

    public final volatile void a(qlw qlw)
    {
    }

    public final qlr f()
    {
        return qrp.a;
    }

    public final int g()
    {
        return b;
    }

    public final qlr g_()
    {
        return qro.a;
    }

    public final String k_()
    {
        return "UpdateEnvelopeSettingOp";
    }

    public final qlw l_()
    {
        qro qro1 = new qro();
        qro1.b = new qbx();
        qro1.b.a = c;
        qro1.c = Boolean.valueOf(d);
        return qro1;
    }

    static 
    {
        b = qmb.b(qrp.a.b);
    }
}
