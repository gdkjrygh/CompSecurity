// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.nux.view;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import com.pinterest.base.Device;
import com.pinterest.kit.application.Resources;
import com.pinterest.ui.imageview.NonRoundWebImageView;

public class NUXCoreConceptsFeedImageView extends NonRoundWebImageView
{

    public NUXCoreConceptsFeedImageView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
    }

    public void onBitmapLoaded(Bitmap bitmap, com.squareup.picasso.Picasso.LoadedFrom loadedfrom)
    {
        super.onBitmapLoaded(bitmap, loadedfrom);
        bitmap = getDrawable();
        if (bitmap != null)
        {
            int i = (int)Resources.dimension(0x7f0a00d6);
            i = (int)Device.getScreenWidth() - i * 2;
            setLayoutParams(new android.widget.LinearLayout.LayoutParams(i, (bitmap.getIntrinsicHeight() * i) / bitmap.getIntrinsicWidth()));
        }
    }
}
