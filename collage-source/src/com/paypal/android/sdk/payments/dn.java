// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.paypal.android.sdk.payments;

import com.paypal.android.sdk.ah;
import com.paypal.android.sdk.cl;
import com.paypal.android.sdk.cn;
import com.paypal.android.sdk.cz;
import com.paypal.android.sdk.ed;
import com.paypal.android.sdk.eh;
import com.paypal.android.sdk.ej;
import com.paypal.android.sdk.gd;
import java.util.Map;

// Referenced classes of package com.paypal.android.sdk.payments:
//            dm, ao, PayPalService

final class dn extends dm
{

    public dn(PayPalService paypalservice)
    {
        super(new ao(paypalservice));
    }

    protected final void a(String s, Map map)
    {
        if (!a().a().b.c())
        {
            a().a().b = new cz();
        }
        map.put("v49", s);
        map.put("v51", a().c().d().d());
        map.put("v52", (new StringBuilder()).append(eh.a).append(" ").append(eh.d).toString());
        map.put("v53", eh.e);
        map.put("clid", a().b());
        map.put("apid", (new StringBuilder()).append(a().c().d().c()).append("|").append(s).append("|").append(a().f()).toString());
        s = new ah(a().a().b.b(), map, eh.c, eh.b, false);
        a().a(s);
    }

    protected final void a(Map map, ej ej1, String s, String s1)
    {
        map.put("g", a().e());
        map.put("vers", (new StringBuilder()).append(eh.a).append(":").append(a().d()).append(":").toString());
        map.put("srce", "msdk");
        map.put("sv", "mobile");
        map.put("bchn", "msdk");
        map.put("adte", "FALSE");
        map.put("bzsr", "mobile");
        if (gd.d(s))
        {
            map.put("calc", s);
        }
        if (gd.d(s1))
        {
            map.put("prid", s1);
        }
        if (ej1.b())
        {
            ej1 = "cl";
        } else
        {
            ej1 = "im";
        }
        map.put("e", ej1);
    }

    protected final String b()
    {
        return "msdk";
    }
}
