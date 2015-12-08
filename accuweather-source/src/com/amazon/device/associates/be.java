// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.amazon.device.associates;

import java.io.UnsupportedEncodingException;

// Referenced classes of package com.amazon.device.associates:
//            ac, aq, s, p

class be extends ac
{

    private static final String b = com/amazon/device/associates/be.getName();
    private static String c = "e/ir";
    private String d;
    private String e;
    private String f;
    private String g;

    be()
    {
        e = "1";
    }

    protected void a()
    {
        a = new aq((new StringBuilder((new StringBuilder()).append("http://ir-na.amazon-adsystem.com/").append(c).toString())).toString());
        a.a("t", d);
        a.a("o", e);
        a.a("l", g);
        a.a("a", f);
    }

    public void a(String s1, String s2, String s3)
    {
        d = s1;
        f = s3;
        g = s2;
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
        p.c(b, "Call to ImpressionRecorderCall URL failed. Ex=", new Object[] {
            obj
        });
          goto _L1
        obj;
        throw obj;
        obj;
        p.c(b, "Call to get ImpressionRecorderCall URL failed. Ex=");
          goto _L1
    }

    protected String c()
    {
        return "ImpressionRecorderCall";
    }

}
