// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.place.view;

import android.graphics.Bitmap;
import com.pinterest.kit.utils.ImageUtils;
import com.squareup.picasso.Transformation;

// Referenced classes of package com.pinterest.activity.place.view:
//            PlaceImageCell

class this._cls0
    implements Transformation
{

    final PlaceImageCell this$0;

    public String key()
    {
        return "180x180";
    }

    public Bitmap transform(Bitmap bitmap)
    {
        return ImageUtils.bitmapToExactFit(bitmap, 180, 180);
    }

    ()
    {
        this$0 = PlaceImageCell.this;
        super();
    }
}
