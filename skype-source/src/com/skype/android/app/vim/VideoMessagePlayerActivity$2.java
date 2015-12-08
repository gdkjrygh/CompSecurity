// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.vim;

import android.media.MediaPlayer;
import java.util.logging.Logger;

// Referenced classes of package com.skype.android.app.vim:
//            VideoMessagePlayerActivity

final class this._cls0
    implements android.media.rActivity._cls2
{

    final VideoMessagePlayerActivity this$0;

    public final boolean onError(MediaPlayer mediaplayer, int i, int j)
    {
        VideoMessagePlayerActivity.access$300().warning((new StringBuilder("Error on mediaplayer What: ")).append(i).append(" Extra: ").append(j).toString());
        VideoMessagePlayerActivity.access$400(VideoMessagePlayerActivity.this);
        return true;
    }

    ()
    {
        this$0 = VideoMessagePlayerActivity.this;
        super();
    }
}
