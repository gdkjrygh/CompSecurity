// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.amazon.device.associates;

import java.io.ByteArrayInputStream;
import java.io.UnsupportedEncodingException;

// Referenced classes of package com.amazon.device.associates:
//            ac, aq, s, p, 
//            as, bx, bo

class bn extends ac
{

    private static String b = "getCategorySearchDetails";

    bn()
    {
    }

    protected void a()
    {
        a = new aq((new StringBuilder((new StringBuilder()).append("http://assoc-msdk-us.amazon-adsystem.com/").append(b).toString())).toString());
        a.a("MarketplaceID", "ATVPDKIKX0DER");
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
        p.a("getCategorySearchDetails", "Call to get ad URL failed. Ex=", new Object[] {
            obj
        });
          goto _L1
        obj;
        throw obj;
        obj;
        p.a("getCategorySearchDetails", "Call to get ad URL failed. Ex=", new Object[] {
            obj
        });
          goto _L1
    }

    protected String c()
    {
        return "getCategorySearchDetails";
    }

    public bx d()
    {
        bx bx1;
        String s1;
        as as1;
        int i;
        bx1 = null;
        s1 = a.a();
        if (s1 == null)
        {
            p.a("getCategorySearchDetails", "DirectionShopping Response:Could not complete service call");
            return null;
        }
        as1 = new as();
        i = as1.c(s1);
        if (i == -1)
        {
            p.a("getCategorySearchDetails", "DirectionShopping Response:Could not complete service call");
            return null;
        }
        p.a("getCategorySearchDetails", (new StringBuilder()).append("DirectionShopping Response:").append(as1.b(s1)).toString());
        bx bx2 = as1.a(new ByteArrayInputStream(s1.getBytes("UTF-8")));
        bx1 = bx2;
        bx2.b(System.currentTimeMillis());
        bx1 = bx2;
_L2:
        bx1.c(as1.a(s1));
        bx1.a(bo.b());
        bx1.a(i);
        return bx1;
        Exception exception;
        exception;
        p.a("getCategorySearchDetails", (new StringBuilder()).append("Parsing reponse failed. Ex=").append(exception).toString());
        if (true) goto _L2; else goto _L1
_L1:
    }

}
