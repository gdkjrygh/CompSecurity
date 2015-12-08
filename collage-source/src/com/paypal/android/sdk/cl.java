// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.paypal.android.sdk;

import android.os.Message;
import java.util.Map;

// Referenced classes of package com.paypal.android.sdk:
//            dx, am, cm, ck, 
//            du, bn, dw, ad, 
//            cn, ef, ao

public class cl
    implements dx
{

    private static final String a = com/paypal/android/sdk/cl.getSimpleName();
    private final cn b;
    private cm c;
    private ck d;
    private final am e = new am();
    private bn f;

    public cl(cn cn, ck ck1, ef ef)
    {
        b = cn;
        d = ck1;
        c = new cm(this);
    }

    static void a(cl cl1, dw dw1)
    {
        cl1.e.a(dw1, 0L);
    }

    public final String a(du du1)
    {
        (new StringBuilder("environment:")).append(d).append(" environment.getEndpoints():").append(d.b());
        if (d != null && d.b() != null)
        {
            du1 = (String)d.b().get(du1.a());
            (new StringBuilder("returning:")).append(du1);
            return du1;
        } else
        {
            return null;
        }
    }

    public final void a()
    {
        f.a();
    }

    public final void a(ao ao)
    {
        e.a(ao);
    }

    public final void a(bn bn1)
    {
        if (f != null)
        {
            throw new IllegalStateException();
        } else
        {
            f = bn1;
            return;
        }
    }

    public final void a(dw dw1)
    {
        dw1.m();
        ad.a().f();
        if (!dw1.a())
        {
            Message message = new Message();
            message.what = 2;
            message.obj = dw1;
            c.sendMessage(message);
        }
    }

    public final void b()
    {
        e.a();
    }

    public final void b(dw dw1)
    {
        f.a(dw1);
    }

    public final String c()
    {
        return d.a();
    }

    public final cn d()
    {
        return b;
    }

}
