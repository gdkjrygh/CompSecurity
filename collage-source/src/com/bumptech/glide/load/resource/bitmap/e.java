// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap;
import com.bumptech.glide.load.engine.a.c;

// Referenced classes of package com.bumptech.glide.load.resource.bitmap:
//            d, q

public class e extends d
{

    public e(c c1)
    {
        super(c1);
    }

    protected Bitmap a(c c1, Bitmap bitmap, int i, int j)
    {
        Object obj;
        if (bitmap.getConfig() != null)
        {
            obj = bitmap.getConfig();
        } else
        {
            obj = android.graphics.Bitmap.Config.ARGB_8888;
        }
        obj = c1.a(i, j, ((android.graphics.Bitmap.Config) (obj)));
        bitmap = q.a(((Bitmap) (obj)), bitmap, i, j);
        if (obj != null && obj != bitmap && !c1.a(((Bitmap) (obj))))
        {
            ((Bitmap) (obj)).recycle();
        }
        return bitmap;
    }

    public String a()
    {
        return "CenterCrop.com.bumptech.glide.load.resource.bitmap";
    }
}
