// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.bumptech.glide.load.resource.e;

import android.content.res.Resources;
import android.graphics.Bitmap;
import com.bumptech.glide.load.b.a.e;
import com.bumptech.glide.load.b.x;
import com.bumptech.glide.load.resource.bitmap.m;
import com.bumptech.glide.load.resource.bitmap.o;

// Referenced classes of package com.bumptech.glide.load.resource.e:
//            c

public final class b
    implements c
{

    private final Resources a;
    private final e b;

    public b(Resources resources, e e)
    {
        a = resources;
        b = e;
    }

    public final x a(x x1)
    {
        return new o(new m(a, (Bitmap)x1.b()), b);
    }

    public final String a()
    {
        return "GlideBitmapDrawableTranscoder.com.bumptech.glide.load.resource.transcode";
    }
}
