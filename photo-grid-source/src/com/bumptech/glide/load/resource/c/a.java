// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.bumptech.glide.load.resource.c;

import android.graphics.Bitmap;
import com.bumptech.glide.b.b;
import com.bumptech.glide.load.b.a.e;

final class a
    implements b
{

    private final e a;

    public a(e e1)
    {
        a = e1;
    }

    public final Bitmap a(int i, int j, android.graphics.Bitmap.Config config)
    {
        return a.b(i, j, config);
    }

    public final void a(Bitmap bitmap)
    {
        if (!a.a(bitmap))
        {
            bitmap.recycle();
        }
    }
}
