// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.playback.ui;

import android.view.View;

// Referenced classes of package com.soundcloud.android.playback.ui:
//            SkipListener, TrackPagePresenter

class val.skipListener
    implements android.view..TrackPagePresenter._cls1
{

    final TrackPagePresenter this$0;
    final SkipListener val$skipListener;

    public void onClick(View view)
    {
        val$skipListener.onPrevious();
    }

    ()
    {
        this$0 = final_trackpagepresenter;
        val$skipListener = SkipListener.this;
        super();
    }
}
