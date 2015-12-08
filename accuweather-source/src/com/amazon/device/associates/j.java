// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.amazon.device.associates;

import java.io.ByteArrayInputStream;
import java.io.UnsupportedEncodingException;

// Referenced classes of package com.amazon.device.associates:
//            ac, aq, s, p, 
//            bd, i

class j extends ac
{

    private static String b = "getURLTemplates";
    private String c;
    private String d;

    j()
    {
    }

    protected void a()
    {
        a = new aq((new StringBuilder((new StringBuilder()).append("http://assoc-msdk-us.amazon-adsystem.com/").append(b).toString())).toString());
        a.a("AppID", c);
        a.a("MarketplaceID", d);
    }

    public void a(String s1)
    {
        c = s1;
        d = "ATVPDKIKX0DER";
    }

    protected void b()
    {
        this;
        JVM INSTR monitorenter ;
        a.a(s.a);
_L1:
        this;
        JVM INSTR monitorexit ;
        return;
        Object obj;
        obj;
        p.b("GetAmazonURLCall", "Call to get ad URL failed. Ex=", new Object[] {
            obj
        });
          goto _L1
        obj;
        throw obj;
        obj;
        p.b("GetAmazonURLCall", "Call to get ad URL failed. Ex=", new Object[] {
            obj
        });
          goto _L1
    }

    protected String c()
    {
        return "GetAmazonURLService";
    }

    public i d()
    {
        i k;
        String s1;
        bd bd1;
        int i1;
        k = null;
        s1 = a.a();
        if (s1 == null)
        {
            p.a("GetAmazonURLCall", "AmazonPurchasingAPI Response:Could not complete service call");
            return null;
        }
        bd1 = new bd();
        i1 = bd1.c(s1);
        if (i1 == -1)
        {
            p.a("GetAmazonURLCall", "AmazonPurchasingAPI Response:Could not complete service call");
            return null;
        }
        p.a("GetAmazonURLCall", (new StringBuilder()).append("AmazonPurchasingAPI Response:").append(bd1.b(s1)).toString());
        i l = bd1.a(new ByteArrayInputStream(s1.getBytes("UTF-8")));
        k = l;
        l.b(System.currentTimeMillis());
        k = l;
_L2:
        k.c(bd1.a(s1));
        k.a(c);
        k.a(i1);
        return k;
        Exception exception;
        exception;
        p.b("GetAmazonURLCall", (new StringBuilder()).append("Parsing reponse failed. Ex=").append(exception).toString());
        if (true) goto _L2; else goto _L1
_L1:
    }

}
