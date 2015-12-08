// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.paypal.android.sdk.payments;

import com.paypal.android.sdk.R;
import com.paypal.android.sdk.ar;
import com.paypal.android.sdk.au;
import com.paypal.android.sdk.b;
import com.paypal.android.sdk.bH;
import com.paypal.android.sdk.bn;
import com.paypal.android.sdk.bx;
import com.paypal.android.sdk.cm;
import com.paypal.android.sdk.co;
import com.paypal.android.sdk.cp;
import java.util.Map;

// Referenced classes of package com.paypal.android.sdk.payments:
//            h, aE, PayPalService

final class i extends h
{

    public i(PayPalService paypalservice)
    {
        super(new aE(paypalservice));
    }

    protected final void a(String s, Map map)
    {
        if (!a().a().b.b())
        {
            a().a().b = new cm();
        }
        map.put("v49", s);
        map.put("v51", a().c().d().d());
        map.put("v52", (new StringBuilder()).append(co.a).append(" ").append(co.d).toString());
        map.put("v53", co.e);
        map.put("clid", a().b());
        map.put("apid", (new StringBuilder()).append(bH.b()).append("|").append(s).append("|").append(a().f()).toString());
        au au1 = new au(a().a().b.a(), map, co.c, co.b, false);
        map = null;
        s = map;
        if (a().a() != null)
        {
            s = map;
            if (a().a().c != null)
            {
                s = a().a().c.a();
            }
        }
        a().a(au1, s);
    }

    protected final void a(Map map, cp cp1, String s, String s1)
    {
        map.put("g", a().e());
        map.put("vers", (new StringBuilder()).append(co.a).append(":").append(a().d()).append(":").toString());
        map.put("srce", "msdk");
        map.put("sv", "mobile");
        map.put("bchn", "msdk");
        map.put("adte", "FALSE");
        map.put("bzsr", "mobile");
        if (R.c(s))
        {
            map.put("calc", s);
        }
        if (R.c(s1))
        {
            map.put("prid", s1);
        }
        if (cp1.b())
        {
            cp1 = "cl";
        } else
        {
            cp1 = "im";
        }
        map.put("e", cp1);
    }

    protected final String b()
    {
        return "msdk";
    }
}
