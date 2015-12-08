// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.xbmc.kore.ui;

import android.widget.SeekBar;
import android.widget.TextView;
import org.xbmc.kore.host.HostManager;
import org.xbmc.kore.jsonrpc.ApiCallback;
import org.xbmc.kore.utils.LogUtils;
import org.xbmc.kore.utils.UIUtils;

// Referenced classes of package org.xbmc.kore.ui:
//            NowPlayingFragment

class this._cls1
    implements ApiCallback
{

    final kReturnType this$1;

    public void onError(int i, String s)
    {
        LogUtils.LOGD(NowPlayingFragment.access$1100(), (new StringBuilder()).append("Got an error calling Player.Seek. Error code: ").append(i).append(", description: ").append(s).toString());
    }

    public volatile void onSuccess(Object obj)
    {
        onSuccess((org.xbmc.kore.jsonrpc.type.e)obj);
    }

    public void onSuccess(org.xbmc.kore.jsonrpc.type.e e)
    {
    }

    is._cls0()
    {
        this$1 = this._cls1.this;
        super();
    }

    // Unreferenced inner class org/xbmc/kore/ui/NowPlayingFragment$14

/* anonymous class */
    class NowPlayingFragment._cls14
        implements android.widget.SeekBar.OnSeekBarChangeListener
    {

        final NowPlayingFragment this$0;

        public void onProgressChanged(SeekBar seekbar, int i, boolean flag)
        {
            if (flag)
            {
                NowPlayingFragment.access$1302(NowPlayingFragment.this, i);
                i = NowPlayingFragment.access$1300(NowPlayingFragment.this) / 3600;
                int j = (NowPlayingFragment.access$1300(NowPlayingFragment.this) % 3600) / 60;
                int k = NowPlayingFragment.access$1300(NowPlayingFragment.this);
                mediaProgress.setText(UIUtils.formatTime(i, j, k % 3600 % 60));
            }
        }

        public void onStartTrackingTouch(SeekBar seekbar)
        {
            seekbar.removeCallbacks(NowPlayingFragment.access$1400(NowPlayingFragment.this));
        }

        public void onStopTrackingTouch(SeekBar seekbar)
        {
            org.xbmc.kore.jsonrpc.type.PlayerType.PositionTime positiontime = new org.xbmc.kore.jsonrpc.type.PlayerType.PositionTime(NowPlayingFragment.access$1300(NowPlayingFragment.this) / 3600, (NowPlayingFragment.access$1300(NowPlayingFragment.this) % 3600) / 60, NowPlayingFragment.access$1300(NowPlayingFragment.this) % 3600 % 60, 0);
            (new org.xbmc.kore.jsonrpc.method.Player.Seek(NowPlayingFragment.access$1500(NowPlayingFragment.this), positiontime)).execute(NowPlayingFragment.access$000(NowPlayingFragment.this).getConnection(), new NowPlayingFragment._cls14._cls1(), NowPlayingFragment.access$200(NowPlayingFragment.this));
            seekbar.postDelayed(NowPlayingFragment.access$1400(NowPlayingFragment.this), 1000L);
        }

            
            {
                this$0 = NowPlayingFragment.this;
                super();
            }
    }

}
