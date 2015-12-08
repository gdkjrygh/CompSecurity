// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.playback.ui;

import android.view.View;

// Referenced classes of package com.soundcloud.android.playback.ui:
//            TrackPagePresenter

class ackPageHolder
    implements android.view..TrackPagePresenter._cls6
{

    final TrackPagePresenter this$0;
    final ackPageHolder val$holder;

    public void onClick(View view)
    {
        TrackPagePresenter.access$400(TrackPagePresenter.this, view);
        if (TrackPagePresenter.access$500(TrackPagePresenter.this, view))
        {
            TrackPagePresenter.access$600(TrackPagePresenter.this, val$holder.shareButton);
            return;
        } else
        {
            TrackPagePresenter.access$700(TrackPagePresenter.this, val$holder.shareButton, false);
            return;
        }
    }

    ackPageHolder()
    {
        this$0 = final_trackpagepresenter;
        val$holder = ackPageHolder.this;
        super();
    }
}
