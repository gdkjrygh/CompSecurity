// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.millennialmedia.android;

import android.view.View;
import android.widget.VideoView;

// Referenced classes of package com.millennialmedia.android:
//            VideoPlayerActivity

class this._cls0
    implements android.view.ayerActivity._cls2
{

    final VideoPlayerActivity this$0;

    public void onClick(View view)
    {
        if (mVideoView != null)
        {
            mVideoView.seekTo(0);
        }
    }

    ()
    {
        this$0 = VideoPlayerActivity.this;
        super();
    }
}
