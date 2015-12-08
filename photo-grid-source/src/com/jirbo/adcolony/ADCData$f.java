// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jirbo.adcolony;

import java.io.Serializable;

// Referenced classes of package com.jirbo.adcolony:
//            af

class a extends a
    implements Serializable
{

    String a;

    void a(af af)
    {
        a(af, a);
    }

    String b()
    {
        return a;
    }

    double d()
    {
        double d1;
        try
        {
            d1 = Double.parseDouble(a);
        }
        catch (NumberFormatException numberformatexception)
        {
            return 0.0D;
        }
        return d1;
    }

    int e()
    {
        return (int)d();
    }

    boolean k()
    {
        return true;
    }

    boolean l()
    {
        String s = a.toLowerCase();
        return s.equals("true") || s.equals("yes");
    }

    on(String s)
    {
        a = s;
    }
}
