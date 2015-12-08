// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nbcsports.liveextra.ui.player;

import android.widget.SeekBar;
import android.widget.TextView;
import com.adobe.mediacore.MediaPlayer;
import com.adobe.mediacore.utils.TimeRange;
import org.joda.time.Duration;
import rx.Subscription;
import timber.log.Timber;

// Referenced classes of package com.nbcsports.liveextra.ui.player:
//            PlayerControlBar

class this._cls0
    implements android.widget.ngeListener
{

    final PlayerControlBar this$0;

    public void onProgressChanged(SeekBar seekbar, int i, boolean flag)
    {
        if (!flag)
        {
            return;
        }
        long l = PlayerControlBar.access$1200(PlayerControlBar.this, seekbar, i);
        seekbar = player.getSeekableRange();
        String s = PlayerControlBar.access$1300(PlayerControlBar.this, new Duration(l));
        if (!seekbar.contains(l))
        {
            Timber.d((new StringBuilder()).append("Seek time is out of seekable range. (").append(s).append(")").toString(), new Object[0]);
            return;
        } else
        {
            playClock.setText(s);
            return;
        }
    }

    public void onStartTrackingTouch(SeekBar seekbar)
    {
        if (PlayerControlBar.access$000(PlayerControlBar.this) != null)
        {
            PlayerControlBar.access$000(PlayerControlBar.this).unsubscribe();
        }
        if (!PlayerControlBar.access$1100(PlayerControlBar.this))
        {
            playing = PlayerControlBar.access$400(PlayerControlBar.this);
            if (playing)
            {
                player.pause();
                return;
            }
        }
    }

    public void onStopTrackingTouch(SeekBar seekbar)
    {
        int i = PlayerControlBar.this.seekbar.getProgress();
        if (player.getStatus() == com.adobe.mediacore.ate.PAUSED || player.getStatus() == com.adobe.mediacore.ate.PLAYING)
        {
            player.seek(PlayerControlBar.access$1200(PlayerControlBar.this, seekbar, i));
        }
    }

    ()
    {
        this$0 = PlayerControlBar.this;
        super();
    }
}
