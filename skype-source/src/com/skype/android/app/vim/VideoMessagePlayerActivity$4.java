// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.vim;

import android.media.MediaPlayer;

// Referenced classes of package com.skype.android.app.vim:
//            VideoMessagePlayerActivity

final class this._cls0
    implements android.media.rActivity._cls4
{

    final VideoMessagePlayerActivity this$0;

    public final boolean onInfo(MediaPlayer mediaplayer, int i, int j)
    {
        if (i == 3)
        {
            VideoMessagePlayerActivity.access$502(VideoMessagePlayerActivity.this, true);
            setPreplayVisibility(false);
        }
        return false;
    }

    ()
    {
        this$0 = VideoMessagePlayerActivity.this;
        super();
    }
}
