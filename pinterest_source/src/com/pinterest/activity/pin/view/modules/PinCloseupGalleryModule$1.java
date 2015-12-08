// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.pin.view.modules;

import android.content.Context;
import android.support.v4.view.ViewPager;
import com.pinterest.activity.pin.adapter.ImageGalleryAdapter;
import com.pinterest.activity.pin.view.PinCloseupImageView;

// Referenced classes of package com.pinterest.activity.pin.view.modules:
//            PinCloseupGalleryModule

class this._cls0 extends ViewPager
{

    final PinCloseupGalleryModule this$0;

    protected void onMeasure(int i, int j)
    {
        if (PinCloseupGalleryModule.access$000(PinCloseupGalleryModule.this) == null)
        {
            PinCloseupGalleryModule.access$002(PinCloseupGalleryModule.this, PinCloseupGalleryModule.access$200(PinCloseupGalleryModule.this).getViewAtPosition(PinCloseupGalleryModule.access$100(PinCloseupGalleryModule.this)));
        }
        if (PinCloseupGalleryModule.access$000(PinCloseupGalleryModule.this) != null)
        {
            PinCloseupGalleryModule.access$000(PinCloseupGalleryModule.this).measure(i, android.view.reSpec(0, 0));
            j = android.view.reSpec(PinCloseupGalleryModule.access$000(PinCloseupGalleryModule.this).getMeasuredHeight(), 0x40000000);
        }
        super.onMeasure(i, j);
    }

    (Context context)
    {
        this$0 = PinCloseupGalleryModule.this;
        super(context);
    }
}
