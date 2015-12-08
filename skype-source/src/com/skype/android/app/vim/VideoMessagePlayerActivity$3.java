// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.vim;

import android.media.MediaPlayer;
import com.skype.android.widget.SymbolView;

// Referenced classes of package com.skype.android.app.vim:
//            VideoMessagePlayerActivity

final class this._cls0
    implements android.media.ner
{

    final VideoMessagePlayerActivity this$0;

    public final void onCompletion(MediaPlayer mediaplayer)
    {
        onVideoPlaybackCompleted();
        playButton.setSymbolCode(com.skype.android.widget.layButton);
    }

    ()
    {
        this$0 = VideoMessagePlayerActivity.this;
        super();
    }
}
