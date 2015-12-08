// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.playback.widget;

import com.soundcloud.android.events.CurrentUserChangedEvent;
import com.soundcloud.android.rx.observers.DefaultSubscriber;

// Referenced classes of package com.soundcloud.android.playback.widget:
//            PlayerWidgetController, PlayerWidgetPresenter

private final class <init> extends DefaultSubscriber
{

    final PlayerWidgetController this$0;

    public final void onNext(CurrentUserChangedEvent currentuserchangedevent)
    {
        if (currentuserchangedevent.getKind() == 1)
        {
            PlayerWidgetController.access$800(PlayerWidgetController.this).reset(PlayerWidgetController.access$700(PlayerWidgetController.this));
        }
    }

    public final volatile void onNext(Object obj)
    {
        onNext((CurrentUserChangedEvent)obj);
    }

    private ()
    {
        this$0 = PlayerWidgetController.this;
        super();
    }

    this._cls0(this._cls0 _pcls0)
    {
        this();
    }
}
