// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.playback.widget;

import android.content.Context;
import android.graphics.Bitmap;
import com.soundcloud.android.rx.observers.DefaultSubscriber;

// Referenced classes of package com.soundcloud.android.playback.widget:
//            PlayerWidgetPresenter

class val.context extends DefaultSubscriber
{

    final PlayerWidgetPresenter this$0;
    final Context val$context;

    public void onNext(Bitmap bitmap)
    {
        PlayerWidgetPresenter.access$000(PlayerWidgetPresenter.this, val$context, bitmap);
    }

    public volatile void onNext(Object obj)
    {
        onNext((Bitmap)obj);
    }

    ()
    {
        this$0 = final_playerwidgetpresenter;
        val$context = Context.this;
        super();
    }
}
