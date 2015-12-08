// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.playback.ui;

import android.graphics.Bitmap;
import com.soundcloud.android.rx.observers.DefaultSubscriber;

// Referenced classes of package com.soundcloud.android.playback.ui:
//            AdPagePresenter

class  extends DefaultSubscriber
{

    final AdPagePresenter this$0;
    final lder val$holder;

    public void onNext(Bitmap bitmap)
    {
        if (bitmap != null)
        {
            AdPagePresenter.access$1300(AdPagePresenter.this, val$holder, bitmap);
        }
    }

    public volatile void onNext(Object obj)
    {
        onNext((Bitmap)obj);
    }

    lder()
    {
        this$0 = final_adpagepresenter;
        val$holder = lder.this;
        super();
    }
}
