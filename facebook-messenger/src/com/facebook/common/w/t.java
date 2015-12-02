// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.common.w;

import com.facebook.debug.log.b;
import com.facebook.debug.log.l;

public class t
{

    private static final Class a = com/facebook/common/w/t;
    private static final l b = new l();

    private t()
    {
    }

    public static double a(Object obj, double d)
    {
        double d1;
        if (obj instanceof Double)
        {
            d1 = ((Double)obj).doubleValue();
        } else
        {
            if (obj instanceof Float)
            {
                return (double)((Float)obj).floatValue();
            }
            if (obj instanceof Integer)
            {
                return (double)((Integer)obj).intValue();
            }
            if (obj instanceof Long)
            {
                return (double)((Long)obj).longValue();
            }
            if (obj instanceof String)
            {
                try
                {
                    d1 = Double.parseDouble((String)obj);
                }
                // Misplaced declaration of an exception variable
                catch (Object obj)
                {
                    com.facebook.debug.log.b.a(b, a, "Failed to parse value", ((Throwable) (obj)));
                    return d;
                }
                return d1;
            }
            d1 = d;
            if (obj != null)
            {
                com.facebook.debug.log.b.a(b, a, (new StringBuilder()).append("Unexpected type: ").append(obj.getClass()).toString());
                return d;
            }
        }
        return d1;
    }

    public static int a(Object obj, int i)
    {
        int j;
        if (obj instanceof Integer)
        {
            j = ((Integer)obj).intValue();
        } else
        {
            if (obj instanceof String)
            {
                try
                {
                    j = Integer.parseInt((String)obj);
                }
                // Misplaced declaration of an exception variable
                catch (Object obj)
                {
                    com.facebook.debug.log.b.a(b, a, "Failed to parse value", ((Throwable) (obj)));
                    return i;
                }
                return j;
            }
            j = i;
            if (obj != null)
            {
                com.facebook.debug.log.b.a(b, a, (new StringBuilder()).append("Unexpected type: ").append(obj.getClass()).toString());
                return i;
            }
        }
        return j;
    }

}
