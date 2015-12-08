// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.bumptech.glide.load.resource.e;

import android.content.res.Resources;
import android.graphics.Bitmap;
import com.bumptech.glide.load.engine.a.c;
import com.bumptech.glide.load.resource.bitmap.j;
import com.bumptech.glide.load.resource.bitmap.k;

// Referenced classes of package com.bumptech.glide.load.resource.e:
//            c

public class b
    implements com.bumptech.glide.load.resource.e.c
{

    private final Resources a;
    private final c b;

    public b(Resources resources, c c1)
    {
        a = resources;
        b = c1;
    }

    public com.bumptech.glide.load.engine.j a(com.bumptech.glide.load.engine.j j1)
    {
        return new k(new j(a, (Bitmap)j1.b()), b);
    }

    public String a()
    {
        return "GlideBitmapDrawableTranscoder.com.bumptech.glide.load.resource.transcode";
    }
}
