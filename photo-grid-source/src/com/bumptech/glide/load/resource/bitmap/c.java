// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap;
import com.bumptech.glide.i.h;
import com.bumptech.glide.load.b.a.e;
import com.bumptech.glide.load.b.x;

public final class c
    implements x
{

    private final Bitmap a;
    private final e b;

    public c(Bitmap bitmap, e e1)
    {
        if (bitmap == null)
        {
            throw new NullPointerException("Bitmap must not be null");
        }
        if (e1 == null)
        {
            throw new NullPointerException("BitmapPool must not be null");
        } else
        {
            a = bitmap;
            b = e1;
            return;
        }
    }

    public static c a(Bitmap bitmap, e e1)
    {
        if (bitmap == null)
        {
            return null;
        } else
        {
            return new c(bitmap, e1);
        }
    }

    public final volatile Object b()
    {
        return a;
    }

    public final int c()
    {
        return h.a(a);
    }

    public final void d()
    {
        if (!b.a(a))
        {
            a.recycle();
        }
    }
}
