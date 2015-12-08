// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.util;


public class Triple
{

    public final Object first;
    public final Object second;
    public final Object third;

    public Triple(Object obj, Object obj1, Object obj2)
    {
        first = obj;
        second = obj1;
        third = obj2;
    }

    public boolean equals(Object obj)
    {
        if (this != obj) goto _L2; else goto _L1
_L1:
        return true;
_L2:
        if (obj == null)
        {
            return false;
        }
        if (!(obj instanceof Triple))
        {
            return false;
        }
        obj = (Triple)obj;
        if (first == null)
        {
            if (((Triple) (obj)).first != null)
            {
                return false;
            }
        } else
        if (!first.equals(((Triple) (obj)).first))
        {
            return false;
        }
        if (second == null)
        {
            if (((Triple) (obj)).second != null)
            {
                return false;
            }
        } else
        if (!second.equals(((Triple) (obj)).second))
        {
            return false;
        }
        if (third != null)
        {
            continue; /* Loop/switch isn't completed */
        }
        if (((Triple) (obj)).third == null) goto _L1; else goto _L3
_L3:
        return false;
        if (third.equals(((Triple) (obj)).third)) goto _L1; else goto _L4
_L4:
        return false;
    }

    public int hashCode()
    {
        int k = 0;
        int i;
        int j;
        if (first == null)
        {
            i = 0;
        } else
        {
            i = first.hashCode();
        }
        if (second == null)
        {
            j = 0;
        } else
        {
            j = second.hashCode();
        }
        if (third != null)
        {
            k = third.hashCode();
        }
        return ((i + 31) * 31 + j) * 31 + k;
    }
}
