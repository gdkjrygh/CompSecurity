// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.android.ex.photo.loaders;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;

// Referenced classes of package com.android.ex.photo.loaders:
//            PhotoBitmapLoaderInterface

public static final class 
{

    public Bitmap bitmap;
    public Drawable drawable;
    public int status;

    public final Drawable getDrawable(Resources resources)
    {
        if (resources == null)
        {
            throw new IllegalArgumentException("resources can not be null!");
        }
        if (drawable != null)
        {
            return drawable;
        }
        if (bitmap == null)
        {
            return null;
        } else
        {
            return new BitmapDrawable(resources, bitmap);
        }
    }

    public ()
    {
    }
}
