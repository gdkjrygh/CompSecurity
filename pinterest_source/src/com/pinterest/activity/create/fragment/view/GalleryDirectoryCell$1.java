// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.create.fragment.view;

import android.graphics.Bitmap;
import com.pinterest.kit.application.Resources;
import com.pinterest.kit.utils.ImageUtils;
import com.squareup.picasso.Transformation;

// Referenced classes of package com.pinterest.activity.create.fragment.view:
//            GalleryDirectoryCell

class this._cls0
    implements Transformation
{

    final GalleryDirectoryCell this$0;

    public String key()
    {
        return "R.dimen.thumbnail_size";
    }

    public Bitmap transform(Bitmap bitmap)
    {
        return ImageUtils.bitmapToExactFit(bitmap, (int)Resources.dimension(0x7f0a01e7), (int)Resources.dimension(0x7f0a01e7));
    }

    ()
    {
        this$0 = GalleryDirectoryCell.this;
        super();
    }
}
