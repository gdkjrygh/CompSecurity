// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.playback.ui;

import android.content.Context;
import android.content.DialogInterface;
import com.soundcloud.android.Navigator;
import com.soundcloud.android.events.EventQueue;
import com.soundcloud.android.events.UpgradeTrackingEvent;
import com.soundcloud.rx.eventbus.EventBus;

// Referenced classes of package com.soundcloud.android.playback.ui:
//            WhyAdsDialogPresenter

class val.context
    implements android.content.istener
{

    final WhyAdsDialogPresenter this$0;
    final Context val$context;

    public void onClick(DialogInterface dialoginterface, int i)
    {
        WhyAdsDialogPresenter.access$000(WhyAdsDialogPresenter.this).openUpgrade(val$context);
        WhyAdsDialogPresenter.access$100(WhyAdsDialogPresenter.this).publish(EventQueue.TRACKING, UpgradeTrackingEvent.forWhyAdsClick());
    }

    ()
    {
        this$0 = final_whyadsdialogpresenter;
        val$context = Context.this;
        super();
    }
}
