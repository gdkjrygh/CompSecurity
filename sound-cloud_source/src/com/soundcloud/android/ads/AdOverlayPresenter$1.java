// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.ads;

import android.graphics.Bitmap;
import android.view.View;
import com.soundcloud.android.image.ImageListener;

// Referenced classes of package com.soundcloud.android.ads:
//            AdOverlayPresenter

class this._cls0
    implements ImageListener
{

    final AdOverlayPresenter this$0;

    public void onLoadingComplete(String s, View view, Bitmap bitmap)
    {
        AdOverlayPresenter.access$000(AdOverlayPresenter.this).onAdImageLoaded();
    }

    public void onLoadingFailed(String s, View view, String s1)
    {
    }

    public void onLoadingStarted(String s, View view)
    {
    }

    stener()
    {
        this$0 = AdOverlayPresenter.this;
        super();
    }
}
