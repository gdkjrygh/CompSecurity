// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.pin.view;

import android.graphics.Bitmap;
import com.pinterest.base.Events;
import com.pinterest.ui.imageview.WebImageView;

// Referenced classes of package com.pinterest.activity.pin.view:
//            PinCloseupImageView

class <init> extends com.pinterest.ui.imageview.ener
{

    final PinCloseupImageView this$0;

    public void onBitmapLoaded(Bitmap bitmap, com.squareup.picasso.mageView._cls4 _pcls4)
    {
        if (PinCloseupImageView.access$000(PinCloseupImageView.this) != null)
        {
            PinCloseupImageView.access$000(PinCloseupImageView.this).setBackgroundResource(0);
        }
        PinCloseupImageView.access$400(PinCloseupImageView.this);
        Events.post(new ageLoadEvent(_galleryItem.()));
    }

    ageLoadEvent()
    {
        this$0 = PinCloseupImageView.this;
        super();
    }
}
