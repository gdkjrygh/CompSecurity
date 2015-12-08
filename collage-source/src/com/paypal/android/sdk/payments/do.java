// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.paypal.android.sdk.payments;

import com.paypal.android.sdk.ah;
import com.paypal.android.sdk.bN;
import com.paypal.android.sdk.cl;
import com.paypal.android.sdk.cn;
import com.paypal.android.sdk.ed;
import com.paypal.android.sdk.eh;
import java.util.Map;

// Referenced classes of package com.paypal.android.sdk.payments:
//            dm, ao, PayPalService

final class do extends dm
{

    public do(PayPalService paypalservice)
    {
        super(new ao(paypalservice));
    }

    protected final void a(String s, Map map)
    {
        if (!a().a().a.c())
        {
            a().a().a = new bN();
            map.put("v49", s);
            map.put("v51", a().c().d().d());
            map.put("v52", (new StringBuilder()).append(eh.a).append(" ").append(eh.d).toString());
            map.put("v53", eh.e);
        }
        s = new ah(a().a().a.b(), map, eh.c, eh.b, true);
        a().a(s);
    }

    protected final String b()
    {
        return "mpl";
    }
}
