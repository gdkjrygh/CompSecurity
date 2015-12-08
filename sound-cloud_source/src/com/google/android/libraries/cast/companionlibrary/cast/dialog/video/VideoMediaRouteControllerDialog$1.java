// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.cast.companionlibrary.cast.dialog.video;

import com.google.android.libraries.cast.companionlibrary.cast.VideoCastManager;
import com.google.android.libraries.cast.companionlibrary.cast.callbacks.VideoCastConsumerImpl;

// Referenced classes of package com.google.android.libraries.cast.companionlibrary.cast.dialog.video:
//            VideoMediaRouteControllerDialog

class this._cls0 extends VideoCastConsumerImpl
{

    final VideoMediaRouteControllerDialog this$0;

    public void onRemoteMediaPlayerMetadataUpdated()
    {
        VideoMediaRouteControllerDialog.access$200(VideoMediaRouteControllerDialog.this);
    }

    public void onRemoteMediaPlayerStatusUpdated()
    {
        mState = VideoMediaRouteControllerDialog.access$000(VideoMediaRouteControllerDialog.this).getPlaybackStatus();
        VideoMediaRouteControllerDialog.access$100(VideoMediaRouteControllerDialog.this, mState);
    }

    ()
    {
        this$0 = VideoMediaRouteControllerDialog.this;
        super();
    }
}
