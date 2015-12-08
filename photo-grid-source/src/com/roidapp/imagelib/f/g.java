// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.imagelib.f;

import org.xml.sax.Attributes;

// Referenced classes of package com.roidapp.imagelib.f:
//            d, i

final class g
{

    i a;
    Attributes b;

    private g(Attributes attributes)
    {
        a = null;
        b = attributes;
        attributes = d.a("style", attributes);
        if (attributes != null)
        {
            a = new i(attributes, (byte)0);
        }
    }

    g(Attributes attributes, byte byte0)
    {
        this(attributes);
    }

    public final String a(String s)
    {
        String s1 = null;
        if (a != null)
        {
            s1 = a.a(s);
        }
        String s2 = s1;
        if (s1 == null)
        {
            s2 = d.a(s, b);
        }
        return s2;
    }

    public final Integer b(String s)
    {
        s = a(s);
        if (s == null || !s.startsWith("#"))
        {
            return null;
        }
        int j;
        try
        {
            j = Integer.parseInt(s.substring(1), 16);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            return null;
        }
        return Integer.valueOf(j);
    }

    public final Float c(String s)
    {
        s = a(s);
        if (s == null)
        {
            return null;
        }
        float f;
        try
        {
            f = Float.parseFloat(s);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            return null;
        }
        return Float.valueOf(f);
    }
}
