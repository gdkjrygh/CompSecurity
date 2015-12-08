// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.bumptech.glide.load.resource.d;

import com.bumptech.glide.load.engine.j;

public class a
{

    private final j a;
    private final j b;

    public a(j j1, j j2)
    {
        if (j1 != null && j2 != null)
        {
            throw new IllegalArgumentException("Can only contain either a bitmap resource or a gif resource, not both");
        }
        if (j1 == null && j2 == null)
        {
            throw new IllegalArgumentException("Must contain either a bitmap resource or a gif resource");
        } else
        {
            b = j1;
            a = j2;
            return;
        }
    }

    public int a()
    {
        if (b != null)
        {
            return b.c();
        } else
        {
            return a.c();
        }
    }

    public j b()
    {
        return b;
    }

    public j c()
    {
        return a;
    }
}
