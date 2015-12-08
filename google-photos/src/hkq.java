// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.List;

public final class hkq
    implements ds
{

    public boolean a;
    private final String b;
    private final List c;

    public hkq(String s, List list)
    {
        b = s;
        c = list;
    }

    public final void a(hpr hpr)
    {
        a = false;
    }

    public final void a(qlw qlw)
    {
        a = true;
    }

    public final qlr f()
    {
        return qrh.a;
    }

    public final int g()
    {
        return qmb.b(qrh.a.b);
    }

    public final qlr g_()
    {
        return qrg.a;
    }

    public final String k_()
    {
        return "RemoveMediaFromEnv";
    }

    public final qlw l_()
    {
        qrg qrg1 = new qrg();
        qrg1.b = new qbx();
        qrg1.b.a = b;
        qeo aqeo[] = new qeo[c.size()];
        for (int i = 0; i < c.size(); i++)
        {
            aqeo[i] = new qeo();
            aqeo[i].a = (String)c.get(i);
        }

        qrg1.c = aqeo;
        return qrg1;
    }
}
