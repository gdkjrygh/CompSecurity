// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.vungle.publisher.protocol.message;

import java.util.Comparator;

public static class 
    implements Comparator
{

    public int compare(Object obj, Object obj1)
    {
        float f1 = 2.0F;
        obj = ()obj;
        obj1 = ()obj1;
        obj = (() (obj)).;
        obj1 = (() (obj1)).;
        float f;
        if (obj == null)
        {
            f = 2.0F;
        } else
        {
            f = ((Float) (obj)).floatValue();
        }
        if (obj1 != null)
        {
            f1 = ((Float) (obj1)).floatValue();
        }
        f -= f1;
        if (f < 0.0F)
        {
            return -1;
        }
        return f != 0.0F ? 1 : 0;
    }

    protected ()
    {
    }
}
