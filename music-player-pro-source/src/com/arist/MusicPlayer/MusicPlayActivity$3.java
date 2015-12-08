// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.arist.MusicPlayer;

import android.os.Handler;
import com.arist.MyView.LyricView;

// Referenced classes of package com.arist.MusicPlayer:
//            MusicPlayActivity

class this._cls0
    implements Runnable
{

    final MusicPlayActivity this$0;

    public void run()
    {
        if (MusicPlayActivity.access$3(MusicPlayActivity.this) == null)
        {
            MusicPlayActivity.access$4(MusicPlayActivity.this).clearText();
        } else
        {
            MusicPlayActivity.access$4(MusicPlayActivity.this).setText("");
            MusicPlayActivity.access$4(MusicPlayActivity.this).setIndex(getIndex());
            MusicPlayActivity.access$4(MusicPlayActivity.this).invalidate();
            if (MusicPlayActivity.access$5(MusicPlayActivity.this))
            {
                MusicPlayActivity.access$6(MusicPlayActivity.this).postDelayed(lyricRunnable, 100L);
                return;
            }
        }
    }

    ()
    {
        this$0 = MusicPlayActivity.this;
        super();
    }
}
