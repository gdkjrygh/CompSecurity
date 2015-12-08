// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.millennialmedia.android;

import android.view.View;

// Referenced classes of package com.millennialmedia.android:
//            VideoPlayerActivity

class this._cls0
    implements android.view.ayerActivity._cls4
{

    final VideoPlayerActivity this$0;

    public void onClick(View view)
    {
        if (mVideoView != null)
        {
            VideoPlayerActivity.access$102(VideoPlayerActivity.this, true);
            dismiss();
        }
    }

    ()
    {
        this$0 = VideoPlayerActivity.this;
        super();
    }
}
