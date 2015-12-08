// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.ui;

import android.graphics.Bitmap;
import android.widget.TextView;

// Referenced classes of package com.pinterest.ui:
//            PinPickHeroCell

class  extends com.pinterest.ui.imageview.Listener
{

    final PinPickHeroCell this$0;
    final String val$description;
    final String val$title;

    public void onBitmapLoaded(Bitmap bitmap, com.squareup.picasso. )
    {
        super.onBitmapLoaded(bitmap, );
        _titleTv.setText(val$title);
        _subTitleTv.setText(val$description);
    }

    From()
    {
        this$0 = final_pinpickherocell;
        val$title = s;
        val$description = String.this;
        super();
    }
}
