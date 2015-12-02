// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.paypal.android.sdk.cz;
import com.paypal.android.sdk.payments.PayPalService;
import java.util.Map;

final class ccr extends ccq
{

    public ccr(PayPalService paypalservice)
    {
        super(new bzz(paypalservice));
    }

    protected final void a(String s, Map map)
    {
        if (!a().a().b.c())
        {
            a().a().b = new cz();
        }
        map.put("v49", s);
        map.put("v51", a().c().d().d());
        map.put("v52", (new StringBuilder()).append(buu.a).append(" ").append(buu.d).toString());
        map.put("v53", buu.e);
        map.put("clid", a().b());
        map.put("apid", (new StringBuilder()).append(a().c().d().c()).append("|").append(s).append("|").append(a().f()).toString());
        s = new bqz(a().a().b.b(), map, buu.c, buu.b, false);
        a().a(s);
    }

    protected final void a(Map map, buw buw1, String s, String s1)
    {
        map.put("g", a().e());
        map.put("vers", (new StringBuilder()).append(buu.a).append(":").append(a().d()).append(":").toString());
        map.put("srce", "msdk");
        map.put("sv", "mobile");
        map.put("bchn", "msdk");
        map.put("adte", "FALSE");
        map.put("bzsr", "mobile");
        if (bwq.d(s))
        {
            map.put("calc", s);
        }
        if (bwq.d(s1))
        {
            map.put("prid", s1);
        }
        if (buw1.b())
        {
            buw1 = "cl";
        } else
        {
            buw1 = "im";
        }
        map.put("e", buw1);
    }

    protected final String b()
    {
        return "msdk";
    }
}
