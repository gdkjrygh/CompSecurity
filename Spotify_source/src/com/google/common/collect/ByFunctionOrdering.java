// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import ctv;
import ctz;
import cva;
import java.io.Serializable;
import java.util.Arrays;

public final class ByFunctionOrdering extends cva
    implements Serializable
{

    private static final long serialVersionUID = 0L;
    final ctv function;
    final cva ordering;

    public ByFunctionOrdering(ctv ctv1, cva cva1)
    {
        function = (ctv)ctz.a(ctv1);
        ordering = (cva)ctz.a(cva1);
    }

    public final int compare(Object obj, Object obj1)
    {
        return ordering.compare(function.a(obj), function.a(obj1));
    }

    public final boolean equals(Object obj)
    {
        if (obj != this)
        {
            if (obj instanceof ByFunctionOrdering)
            {
                if (!function.equals(((ByFunctionOrdering) (obj = (ByFunctionOrdering)obj)).function) || !ordering.equals(((ByFunctionOrdering) (obj)).ordering))
                {
                    return false;
                }
            } else
            {
                return false;
            }
        }
        return true;
    }

    public final int hashCode()
    {
        return Arrays.hashCode(new Object[] {
            function, ordering
        });
    }

    public final String toString()
    {
        String s = String.valueOf(String.valueOf(ordering));
        String s1 = String.valueOf(String.valueOf(function));
        return (new StringBuilder(s.length() + 13 + s1.length())).append(s).append(".onResultOf(").append(s1).append(")").toString();
    }
}
