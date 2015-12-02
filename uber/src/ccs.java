// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.paypal.android.sdk.bN;
import com.paypal.android.sdk.payments.PayPalService;
import java.util.Map;

final class ccs extends ccq
{

    public ccs(PayPalService paypalservice)
    {
        super(new bzz(paypalservice));
    }

    protected final void a(String s, Map map)
    {
        if (!a().a().a.c())
        {
            a().a().a = new bN();
            map.put("v49", s);
            map.put("v51", a().c().d().d());
            map.put("v52", (new StringBuilder()).append(buu.a).append(" ").append(buu.d).toString());
            map.put("v53", buu.e);
        }
        s = new bqz(a().a().a.b(), map, buu.c, buu.b, true);
        a().a(s);
    }

    protected final String b()
    {
        return "mpl";
    }
}
