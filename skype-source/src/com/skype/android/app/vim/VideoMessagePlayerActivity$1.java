// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.vim;

import android.media.MediaPlayer;

// Referenced classes of package com.skype.android.app.vim:
//            VideoMessagePlayerActivity

final class this._cls0
    implements android.media.r
{

    final VideoMessagePlayerActivity this$0;

    public final void onPrepared(MediaPlayer mediaplayer)
    {
        VideoMessagePlayerActivity.access$002(VideoMessagePlayerActivity.this, true);
        setProgressIndeterminate(false);
        if (VideoMessagePlayerActivity.access$100(VideoMessagePlayerActivity.this))
        {
            VideoMessagePlayerActivity.access$200(VideoMessagePlayerActivity.this);
            showMediaController();
        }
    }

    ()
    {
        this$0 = VideoMessagePlayerActivity.this;
        super();
    }
}
