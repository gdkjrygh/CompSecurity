// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.bumptech.glide.load.resource.e;

import com.bumptech.glide.load.b.x;

// Referenced classes of package com.bumptech.glide.load.resource.e:
//            c

public final class a
    implements c
{

    private final c a;

    public a(c c1)
    {
        a = c1;
    }

    public final x a(x x1)
    {
        x1 = (com.bumptech.glide.load.resource.d.a)x1.b();
        x x2 = x1.b();
        if (x2 != null)
        {
            return a.a(x2);
        } else
        {
            return x1.c();
        }
    }

    public final String a()
    {
        return "GifBitmapWrapperDrawableTranscoder.com.bumptech.glide.load.resource.transcode";
    }
}
