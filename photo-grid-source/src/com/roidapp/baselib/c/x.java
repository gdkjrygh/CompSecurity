// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.baselib.c;


public final class x
{

    public final Object a;
    public final Object b;

    public x(Object obj, Object obj1)
    {
        a = obj;
        b = obj1;
    }

    public final boolean equals(Object obj)
    {
        if (obj instanceof x)
        {
            if (a.equals(((x) (obj = (x)obj)).a) && b.equals(((x) (obj)).b))
            {
                return true;
            }
        }
        return false;
    }

    public final int hashCode()
    {
        int j = 0;
        int i;
        if (a == null)
        {
            i = 0;
        } else
        {
            i = a.hashCode();
        }
        if (b != null)
        {
            j = b.hashCode();
        }
        return i ^ j;
    }
}
