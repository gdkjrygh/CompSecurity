// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.xbmc.kore.ui;

import android.widget.SeekBar;
import android.widget.TextView;
import org.xbmc.kore.utils.UIUtils;

// Referenced classes of package org.xbmc.kore.ui:
//            NowPlayingFragment

class this._cls0
    implements Runnable
{

    final NowPlayingFragment this$0;

    public void run()
    {
        if (NowPlayingFragment.access$1200(NowPlayingFragment.this) == 0 || NowPlayingFragment.access$1300(NowPlayingFragment.this) >= NowPlayingFragment.access$1200(NowPlayingFragment.this))
        {
            mediaSeekbar.removeCallbacks(this);
            return;
        } else
        {
            NowPlayingFragment.access$1312(NowPlayingFragment.this, 1);
            mediaSeekbar.setProgress(NowPlayingFragment.access$1300(NowPlayingFragment.this));
            int i = NowPlayingFragment.access$1300(NowPlayingFragment.this) / 3600;
            int j = (NowPlayingFragment.access$1300(NowPlayingFragment.this) % 3600) / 60;
            int k = NowPlayingFragment.access$1300(NowPlayingFragment.this);
            mediaProgress.setText(UIUtils.formatTime(i, j, k % 3600 % 60));
            mediaSeekbar.postDelayed(this, 1000L);
            return;
        }
    }

    ()
    {
        this$0 = NowPlayingFragment.this;
        super();
    }
}
