// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.paypal.android.sdk.payments;

import com.paypal.android.sdk.aB;
import com.paypal.android.sdk.aE;
import com.paypal.android.sdk.b;
import com.paypal.android.sdk.bB;
import com.paypal.android.sdk.cA;
import com.paypal.android.sdk.cC;
import com.paypal.android.sdk.cE;
import com.paypal.android.sdk.d;
import java.util.Map;

// Referenced classes of package com.paypal.android.sdk.payments:
//            h, aK, PayPalService

final class i extends h
{

    public i(PayPalService paypalservice)
    {
        super(new aK(paypalservice));
    }

    protected final void a(String s, Map map)
    {
        if (!a().a().b.b())
        {
            a().a().b = new cA();
        }
        map.put("v49", s);
        map.put("v51", a().c().d().d());
        map.put("v52", (new StringBuilder()).append(cC.a).append(" ").append(cC.d).toString());
        map.put("v53", cC.e);
        map.put("clid", a().b());
        map.put("apid", (new StringBuilder()).append(a().c().d().c()).append("|").append(s).append("|").append(a().f()).toString());
        s = new aE(a().a().b.a(), map, cC.c, cC.b, false);
        a().a(s);
    }

    protected final void a(Map map, cE ce, String s, String s1)
    {
        map.put("g", a().e());
        map.put("vers", (new StringBuilder()).append(cC.a).append(":").append(a().d()).append(":").toString());
        map.put("srce", "msdk");
        map.put("sv", "mobile");
        map.put("bchn", "msdk");
        map.put("adte", "FALSE");
        map.put("bzsr", "mobile");
        if (d.c(s))
        {
            map.put("calc", s);
        }
        if (d.c(s1))
        {
            map.put("prid", s1);
        }
        if (ce.b())
        {
            ce = "cl";
        } else
        {
            ce = "im";
        }
        map.put("e", ce);
    }

    protected final String b()
    {
        return "msdk";
    }
}
