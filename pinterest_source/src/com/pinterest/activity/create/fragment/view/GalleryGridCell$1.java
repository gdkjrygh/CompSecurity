// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.create.fragment.view;

import android.graphics.drawable.Drawable;
import com.pinterest.ui.imageview.SquareImageView;

// Referenced classes of package com.pinterest.activity.create.fragment.view:
//            GalleryGridCell

class this._cls0 extends com.pinterest.ui.imageview.Listener
{

    final GalleryGridCell this$0;

    public void onBitmapSet()
    {
        _imageView.setClickable(false);
    }

    public void onPrepareLoad(Drawable drawable)
    {
        _imageView.setClickable(true);
    }

    ()
    {
        this$0 = GalleryGridCell.this;
        super();
    }
}
