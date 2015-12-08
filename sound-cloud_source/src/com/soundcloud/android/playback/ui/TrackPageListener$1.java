// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.playback.ui;

import android.content.Context;
import com.soundcloud.android.Navigator;
import com.soundcloud.android.events.PlayerUIEvent;
import com.soundcloud.android.model.Urn;
import com.soundcloud.android.rx.observers.DefaultSubscriber;

// Referenced classes of package com.soundcloud.android.playback.ui:
//            TrackPageListener

class init> extends DefaultSubscriber
{

    final TrackPageListener this$0;
    final Context val$activityContext;
    final Urn val$userUrn;

    public void onNext(PlayerUIEvent playeruievent)
    {
        TrackPageListener.access$000(TrackPageListener.this).openProfile(val$activityContext, val$userUrn);
    }

    public volatile void onNext(Object obj)
    {
        onNext((PlayerUIEvent)obj);
    }

    ()
    {
        this$0 = final_trackpagelistener;
        val$activityContext = context;
        val$userUrn = Urn.this;
        super();
    }
}
