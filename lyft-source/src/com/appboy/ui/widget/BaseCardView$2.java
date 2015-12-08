// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.appboy.ui.widget;

import android.widget.ImageView;

// Referenced classes of package com.appboy.ui.widget:
//            BaseCardView

class val.aspectRatio
    implements android.view.r.OnGlobalLayoutListener
{

    final BaseCardView this$0;
    final float val$aspectRatio;
    final ImageView val$imageView;

    public void onGlobalLayout()
    {
        int i = val$imageView.getWidth();
        val$imageView.setLayoutParams(new android.widget.LayoutParams(i, (int)((float)i / val$aspectRatio)));
        BaseCardView.removeOnGlobalLayoutListenerSafe(val$imageView.getViewTreeObserver(), this);
    }

    Params()
    {
        this$0 = final_basecardview;
        val$imageView = imageview;
        val$aspectRatio = F.this;
        super();
    }
}
