// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.paypal.android.sdk;

import android.os.Message;
import java.util.Map;

// Referenced classes of package com.paypal.android.sdk:
//            bv, aG, aC, aA, 
//            bs, bq, bu, ac, 
//            b, aI

public class aB
    implements bv
{

    private static final String a = com/paypal/android/sdk/aB.getSimpleName();
    private final b b;
    private aC c;
    private aA d;
    private final aG e = new aG();
    private bq f;

    public aB(b b1, aA aa)
    {
        b = b1;
        d = aa;
        c = new aC(this);
    }

    static void a(aB ab, bu bu1)
    {
        ab.e.a(bu1);
    }

    public final String a(bs bs1)
    {
        (new StringBuilder("environment:")).append(d).append(" environment.getEndpoints():").append(d.c());
        if (d != null && d.c() != null)
        {
            return (String)d.c().get(bs1.a());
        } else
        {
            return null;
        }
    }

    public final void a()
    {
        f.a();
    }

    public final void a(aI ai)
    {
        e.a(ai);
    }

    public final void a(bq bq1)
    {
        if (f != null)
        {
            throw new IllegalStateException();
        } else
        {
            f = bq1;
            return;
        }
    }

    public final void a(bu bu1)
    {
        bu1.m();
        ac.a().e();
        if (!bu1.a())
        {
            Message message = new Message();
            message.what = 2;
            message.obj = bu1;
            c.sendMessage(message);
        }
    }

    public final void b()
    {
        e.a();
    }

    public final void b(bu bu1)
    {
        f.a(bu1);
    }

    public final String c()
    {
        return d.a();
    }

    public final b d()
    {
        return b;
    }

    public final String e()
    {
        return d.b();
    }

}
