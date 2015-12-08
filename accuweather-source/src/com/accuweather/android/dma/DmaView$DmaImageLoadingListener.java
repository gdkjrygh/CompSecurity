// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.accuweather.android.dma;

import android.graphics.Bitmap;
import android.view.View;
import android.widget.ImageView;
import com.nostra13.universalimageloader.core.assist.FailReason;
import com.nostra13.universalimageloader.core.assist.ImageLoadingListener;

// Referenced classes of package com.accuweather.android.dma:
//            DmaView

private class <init>
    implements ImageLoadingListener
{

    final DmaView this$0;

    public void onLoadingCancelled(String s, View view)
    {
        mLogo.setVisibility(8);
    }

    public void onLoadingComplete(String s, View view, Bitmap bitmap)
    {
        mLogo.setVisibility(0);
    }

    public void onLoadingFailed(String s, View view, FailReason failreason)
    {
        mLogo.setVisibility(8);
    }

    public void onLoadingStarted(String s, View view)
    {
    }

    private stener()
    {
        this$0 = DmaView.this;
        super();
    }

    this._cls0(this._cls0 _pcls0)
    {
        this();
    }
}
