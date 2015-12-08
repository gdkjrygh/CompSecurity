// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.auditude.ads.view.linear;

import android.media.MediaPlayer;
import android.util.Log;
import android.widget.MediaController;

// Referenced classes of package com.auditude.ads.view.linear:
//            VideoView

class this._cls0
    implements android.media.OnErrorListener
{

    final VideoView this$0;

    public boolean onError(MediaPlayer mediaplayer, int i, int j)
    {
        Log.d(VideoView.access$14(VideoView.this), (new StringBuilder("Error: ")).append(i).append(",").append(j).toString());
        VideoView.access$4(VideoView.this, -1);
        VideoView.access$12(VideoView.this, -1);
        if (VideoView.access$7(VideoView.this) != null)
        {
            VideoView.access$7(VideoView.this).hide();
        }
        if (VideoView.access$15(VideoView.this) != null && VideoView.access$15(VideoView.this).onError(VideoView.access$6(VideoView.this), i, j))
        {
            return true;
        } else
        {
            getWindowToken();
            return true;
        }
    }

    ()
    {
        this$0 = VideoView.this;
        super();
    }
}
