// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.millennialmedia.android;

import android.media.MediaPlayer;

// Referenced classes of package com.millennialmedia.android:
//            InlineVideoView

class this._cls0
    implements android.media.letionListener
{

    final InlineVideoView this$0;

    public void onCompletion(MediaPlayer mediaplayer)
    {
        pause();
        seekTo(0);
        isCompleted = true;
    }

    ()
    {
        this$0 = InlineVideoView.this;
        super();
    }
}
