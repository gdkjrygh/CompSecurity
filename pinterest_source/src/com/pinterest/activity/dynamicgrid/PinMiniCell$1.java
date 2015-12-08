// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.dynamicgrid;

import android.graphics.Bitmap;
import com.pinterest.ui.imageview.GrayWebImageView;

// Referenced classes of package com.pinterest.activity.dynamicgrid:
//            PinMiniCell

class ener extends com.pinterest.ui.imageview.mageListener
{

    final PinMiniCell this$0;

    public void onBitmapLoaded(Bitmap bitmap, com.squareup.picasso.From from)
    {
        _image.setBackgroundColor(0);
        super.onBitmapLoaded(bitmap, from);
    }

    ener()
    {
        this$0 = PinMiniCell.this;
        super();
    }
}
