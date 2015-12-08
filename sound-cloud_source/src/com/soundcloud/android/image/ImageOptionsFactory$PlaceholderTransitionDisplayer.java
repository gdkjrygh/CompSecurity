// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.image;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import com.b.a.b.e.a;

// Referenced classes of package com.soundcloud.android.image:
//            ImageOptionsFactory

static class  extends 
{

    protected Drawable createBitmapDrawable(Bitmap bitmap, Resources resources)
    {
        return new BitmapDrawable(resources, bitmap);
    }

    protected Drawable getTransitionFromDrawable(ImageView imageview)
    {
        return imageview.getDrawable();
    }

    protected void setBitmapImage(a a1, Bitmap bitmap)
    {
        a1.a(bitmap);
    }

    ()
    {
    }
}
