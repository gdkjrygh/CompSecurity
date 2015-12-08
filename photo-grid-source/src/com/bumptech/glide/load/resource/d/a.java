// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.bumptech.glide.load.resource.d;

import com.bumptech.glide.load.b.x;

public class a
{

    private final x a;
    private final x b;

    public a(x x1, x x2)
    {
        if (x1 != null && x2 != null)
        {
            throw new IllegalArgumentException("Can only contain either a bitmap resource or a gif resource, not both");
        }
        if (x1 == null && x2 == null)
        {
            throw new IllegalArgumentException("Must contain either a bitmap resource or a gif resource");
        } else
        {
            b = x1;
            a = x2;
            return;
        }
    }

    public final int a()
    {
        if (b != null)
        {
            return b.c();
        } else
        {
            return a.c();
        }
    }

    public final x b()
    {
        return b;
    }

    public final x c()
    {
        return a;
    }
}
