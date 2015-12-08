// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.playback.ui;

import android.view.View;

// Referenced classes of package com.soundcloud.android.playback.ui:
//            TrackPagePresenter, TrackPageMenuController

class ackPageHolder
    implements android.view..TrackPagePresenter._cls4
{

    final TrackPagePresenter this$0;
    final ackPageHolder val$holder;

    public void onClick(View view)
    {
        TrackPagePresenter.access$300(TrackPagePresenter.this, val$holder);
        val$holder.menuController.show();
    }

    ackPageHolder()
    {
        this$0 = final_trackpagepresenter;
        val$holder = ackPageHolder.this;
        super();
    }
}
