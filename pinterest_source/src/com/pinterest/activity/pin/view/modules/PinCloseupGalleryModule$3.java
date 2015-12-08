// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.pin.view.modules;

import android.support.v4.view.ViewPager;
import android.view.View;
import com.pinterest.activity.pin.adapter.ImageGalleryAdapter;
import com.pinterest.activity.pin.view.PinCloseupImageView;
import com.pinterest.api.model.Pin;
import java.util.List;

// Referenced classes of package com.pinterest.activity.pin.view.modules:
//            PinCloseupGalleryModule

class this._cls0
    implements android.support.v4.view.GalleryModule._cls3
{

    final PinCloseupGalleryModule this$0;

    public void transformPage(View view, float f)
    {
        if (view == PinCloseupGalleryModule.access$000(PinCloseupGalleryModule.this) && _pin != null && _pin.getGalleryItems().size() >= 2 && PinCloseupGalleryModule.access$000(PinCloseupGalleryModule.this).getGalleryItem() != null && PinCloseupGalleryModule.access$000(PinCloseupGalleryModule.this).getGalleryItem().ight() != null)
        {
            int i = view.getWidth();
            f -= (float)PinCloseupGalleryModule.access$400(PinCloseupGalleryModule.this).getPaddingLeft() / (float)i;
            PinCloseupImageView pincloseupimageview = PinCloseupGalleryModule.access$200(PinCloseupGalleryModule.this).getViewAtPosition(PinCloseupGalleryModule.access$100(PinCloseupGalleryModule.this) - 1);
            PinCloseupImageView pincloseupimageview1 = PinCloseupGalleryModule.access$200(PinCloseupGalleryModule.this).getViewAtPosition(PinCloseupGalleryModule.access$100(PinCloseupGalleryModule.this) + 1);
            int j = PinCloseupGalleryModule.access$000(PinCloseupGalleryModule.this).getFullHeight();
            view = null;
            boolean flag;
            if (f > 0.0F)
            {
                view = pincloseupimageview;
            } else
            if (f < 0.0F)
            {
                view = pincloseupimageview1;
            }
            i = j;
            if (view != null)
            {
                i = view.getFullHeight();
                float f1 = Math.abs(f);
                i = j - (int)((float)(j - i) * f1);
            }
            view = PinCloseupGalleryModule.access$000(PinCloseupGalleryModule.this);
            if (f < 0.0F)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            view.setItemHeight(i, flag);
            if (pincloseupimageview != null)
            {
                pincloseupimageview.setItemHeight(i, true);
            }
            if (pincloseupimageview1 != null)
            {
                pincloseupimageview1.setItemHeight(i, false);
                return;
            }
        }
    }

    ()
    {
        this$0 = PinCloseupGalleryModule.this;
        super();
    }
}
