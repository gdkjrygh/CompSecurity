// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.a.b;

import java.math.BigDecimal;

public final class v extends Number
{

    private final String a;

    public v(String s)
    {
        a = s;
    }

    public double doubleValue()
    {
        return Double.parseDouble(a);
    }

    public float floatValue()
    {
        return Float.parseFloat(a);
    }

    public int intValue()
    {
        int i;
        try
        {
            i = Integer.parseInt(a);
        }
        catch (NumberFormatException numberformatexception)
        {
            long l;
            try
            {
                l = Long.parseLong(a);
            }
            catch (NumberFormatException numberformatexception1)
            {
                return (new BigDecimal(a)).intValue();
            }
            return (int)l;
        }
        return i;
    }

    public long longValue()
    {
        long l;
        try
        {
            l = Long.parseLong(a);
        }
        catch (NumberFormatException numberformatexception)
        {
            return (new BigDecimal(a)).longValue();
        }
        return l;
    }

    public String toString()
    {
        return a;
    }
}
