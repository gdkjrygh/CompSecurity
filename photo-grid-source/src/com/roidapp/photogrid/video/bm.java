// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.photogrid.video;

import android.content.Context;
import android.graphics.Bitmap;
import com.bumptech.glide.h;
import com.bumptech.glide.load.b.x;
import com.bumptech.glide.load.e;
import com.bumptech.glide.load.resource.bitmap.c;

public final class bm
    implements e
{

    private final com.bumptech.glide.load.b.a.e a;

    public bm(Context context)
    {
        a = h.a(context).a();
    }

    public final volatile x a(Object obj, int i, int j)
    {
        return c.a((Bitmap)obj, a);
    }

    public final String a()
    {
        return "VideoPictureDecoder.com.roidapp.photogrid.video";
    }
}
