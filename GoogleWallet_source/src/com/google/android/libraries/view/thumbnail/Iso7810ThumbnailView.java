// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.view.thumbnail;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.support.v4.graphics.drawable.RoundedBitmapDrawable;
import android.support.v4.graphics.drawable.RoundedBitmapDrawableFactory;
import android.util.AttributeSet;

// Referenced classes of package com.google.android.libraries.view.thumbnail:
//            SubSamplingThumbnailView

public class Iso7810ThumbnailView extends SubSamplingThumbnailView
{

    public Iso7810ThumbnailView(Context context)
    {
        super(context);
    }

    public Iso7810ThumbnailView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
    }

    protected final Drawable createDrawable(Bitmap bitmap)
    {
        RoundedBitmapDrawable roundedbitmapdrawable = RoundedBitmapDrawableFactory.create(getResources(), bitmap);
        roundedbitmapdrawable.setCornerRadius((float)bitmap.getWidth() * 0.0406F);
        roundedbitmapdrawable.setAntiAlias(true);
        return roundedbitmapdrawable;
    }
}
