// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.image;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.b.a.b.e.a;
import com.soundcloud.android.utils.images.ImageUtils;

// Referenced classes of package com.soundcloud.android.image:
//            ImageOptionsFactory

static class er extends er
{

    protected Drawable createBitmapDrawable(Bitmap bitmap, Resources resources)
    {
        return ImageUtils.createCircularDrawable(bitmap, resources);
    }

    protected void setBitmapImage(a a1, Bitmap bitmap)
    {
        a1.a(createBitmapDrawable(bitmap, a1.d().getResources()));
    }

    er()
    {
    }
}
