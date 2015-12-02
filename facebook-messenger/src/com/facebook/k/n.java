// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.k;

import com.google.common.base.Optional;

class n
    implements Comparable
{

    public final Runnable a;
    public final Optional b;

    private long a()
    {
        if (b.isPresent())
        {
            return ((Long)b.get()).longValue();
        } else
        {
            return 0x7fffffffffffffffL;
        }
    }

    public int a(n n1)
    {
        return Long.valueOf(a()).compareTo(Long.valueOf(n1.a()));
    }

    public int compareTo(Object obj)
    {
        return a((n)obj);
    }
}
