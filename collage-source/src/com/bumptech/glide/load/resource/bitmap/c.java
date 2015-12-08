// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap;
import com.bumptech.glide.g.h;
import com.bumptech.glide.load.engine.j;

public class c
    implements j
{

    private final Bitmap a;
    private final com.bumptech.glide.load.engine.a.c b;

    public c(Bitmap bitmap, com.bumptech.glide.load.engine.a.c c1)
    {
        if (bitmap == null)
        {
            throw new NullPointerException("Bitmap must not be null");
        }
        if (c1 == null)
        {
            throw new NullPointerException("BitmapPool must not be null");
        } else
        {
            a = bitmap;
            b = c1;
            return;
        }
    }

    public static c a(Bitmap bitmap, com.bumptech.glide.load.engine.a.c c1)
    {
        if (bitmap == null)
        {
            return null;
        } else
        {
            return new c(bitmap, c1);
        }
    }

    public Bitmap a()
    {
        return a;
    }

    public Object b()
    {
        return a();
    }

    public int c()
    {
        return h.a(a);
    }

    public void d()
    {
        if (!b.a(a))
        {
            a.recycle();
        }
    }
}
