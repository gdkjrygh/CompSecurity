// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.amazon.device.associates;

import java.io.Serializable;

// Referenced classes of package com.amazon.device.associates:
//            p

final class br
    implements Serializable
{

    private String a;
    private String b;
    private String c;
    private String d;
    private double e;
    private String f;
    private String g;
    private String h;
    private boolean i;

    public br(String s, String s1, String s2, String s3, String s4, String s5, String s6, 
            String s7)
    {
        a = "";
        b = "";
        c = "";
        d = "";
        e = 0.0D;
        f = "";
        g = "";
        h = "";
        i = false;
        try
        {
            a = s;
            b = s1;
            c = s2;
            d = a(s3);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            p.b("PopoverDataLog", "Failed to load data.");
            return;
        }
        if (s5 == null)
        {
            break MISSING_BLOCK_LABEL_131;
        }
        if (!s5.trim().equals(""))
        {
            f = (new StringBuilder()).append("(").append(s5.trim()).append(")").toString();
        }
        g = s6;
        h = s7;
        if (s4 == null)
        {
            break MISSING_BLOCK_LABEL_170;
        }
        if (!s4.trim().equals(""))
        {
            e = Double.parseDouble(s4);
        }
    }

    private String a(String s)
    {
        if (s == null)
        {
            break MISSING_BLOCK_LABEL_63;
        }
        if (s.trim().equals("") || s.length() <= 2)
        {
            break MISSING_BLOCK_LABEL_63;
        }
        String s1 = s;
        if (Double.parseDouble(s.trim().substring(1).replace(",", "").replace(" ", "")) < 0.0D)
        {
            break MISSING_BLOCK_LABEL_113;
        }
        i = true;
        return s;
        if (s == null)
        {
            break MISSING_BLOCK_LABEL_81;
        }
        s1 = s;
        if (!s.trim().equals(""))
        {
            break MISSING_BLOCK_LABEL_113;
        }
        i = true;
        return "";
        s;
        p.d("PopoverData", "Parsing of price failed, invalidating the data", new Object[] {
            s
        });
        i = false;
        s1 = "";
        return s1;
    }

    public String a()
    {
        return b;
    }

    public String b()
    {
        return c;
    }

    public String c()
    {
        return d;
    }

    public double d()
    {
        return e;
    }

    public String e()
    {
        return f;
    }

    public String f()
    {
        return g;
    }

    public boolean g()
    {
        return i;
    }

    public String h()
    {
        return h;
    }

    public String toString()
    {
        return (new StringBuilder()).append("PopoverData [asin=").append(a).append(", iconPath=").append(b).append(", title=").append(c).append(", price=").append(d).append(", rating=").append(e).append(", reviewersCount=").append(f).append(", detailPageURL=").append(g).append(", category=").append(h).append(", valid=").append(i).append("]").toString();
    }
}
