// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap;

// Referenced classes of package com.bumptech.glide.load.resource.bitmap:
//            d, x

public final class e extends d
{

    public e(com.bumptech.glide.load.b.a.e e1)
    {
        super(e1);
    }

    protected final Bitmap a(com.bumptech.glide.load.b.a.e e1, Bitmap bitmap, int i, int j)
    {
        Object obj;
        if (bitmap.getConfig() != null)
        {
            obj = bitmap.getConfig();
        } else
        {
            obj = android.graphics.Bitmap.Config.ARGB_8888;
        }
        obj = e1.a(i, j, ((android.graphics.Bitmap.Config) (obj)));
        bitmap = x.a(((Bitmap) (obj)), bitmap, i, j);
        if (obj != null && obj != bitmap && !e1.a(((Bitmap) (obj))))
        {
            ((Bitmap) (obj)).recycle();
        }
        return bitmap;
    }

    public final String a()
    {
        return "CenterCrop.com.bumptech.glide.load.resource.bitmap";
    }
}
