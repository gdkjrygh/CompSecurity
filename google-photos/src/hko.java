// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;

public final class hko
    implements ds
{

    private static final int b;
    public boolean a;
    private final noz c;
    private final String d;
    private final String e;

    public hko(Context context, String s, String s1)
    {
        e = (String)p.a(s1, "Must have non-empty media key");
        d = (String)p.a(s, "Must have non-empty gaiaId");
        c = noz.a(context, "LeaveEnvelope", new String[0]);
    }

    public final void a(hpr hpr)
    {
        a = false;
        if (c.a())
        {
            noy.a("mediaKey", e);
            noy.a("rpcError", hpr);
        }
    }

    public final void a(qlw qlw)
    {
        a = true;
    }

    public final qlr f()
    {
        return qrj.a;
    }

    public final int g()
    {
        return b;
    }

    public final qlr g_()
    {
        return qri.a;
    }

    public final String k_()
    {
        return "LeaveEnvelope";
    }

    public final qlw l_()
    {
        qri qri1 = new qri();
        qri1.b = new qbx();
        qri1.b.a = e;
        qri1.c = new qki[1];
        qki qki1 = new qki();
        qki1.a = new qky();
        qki1.a.b = d;
        qki1.a.a = 2;
        qri1.c[0] = qki1;
        return qri1;
    }

    static 
    {
        b = qmb.b(qrj.a.b);
    }
}
