// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.bumptech.glide.load.resource;

import com.bumptech.glide.load.b.x;

public class c
    implements x
{

    protected final Object a;

    public c(Object obj)
    {
        if (obj == null)
        {
            throw new NullPointerException("Data must not be null");
        } else
        {
            a = obj;
            return;
        }
    }

    public final Object b()
    {
        return a;
    }

    public final int c()
    {
        return 1;
    }

    public final void d()
    {
    }
}
