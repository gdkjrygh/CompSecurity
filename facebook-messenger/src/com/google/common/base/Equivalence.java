// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.base;


public abstract class Equivalence
{

    protected Equivalence()
    {
    }

    protected abstract boolean doEquivalent(Object obj, Object obj1);

    protected abstract int doHash(Object obj);

    public final boolean equivalent(Object obj, Object obj1)
    {
        if (obj == obj1)
        {
            return true;
        }
        if (obj == null || obj1 == null)
        {
            return false;
        } else
        {
            return doEquivalent(obj, obj1);
        }
    }

    public final int hash(Object obj)
    {
        if (obj == null)
        {
            return 0;
        } else
        {
            return doHash(obj);
        }
    }
}
