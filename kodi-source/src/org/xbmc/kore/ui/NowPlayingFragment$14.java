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

class this._cls0
    implements android.widget.eListener
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
        org.xbmc.kore.jsonrpc.type.e e = new org.xbmc.kore.jsonrpc.type.e(NowPlayingFragment.access$1300(NowPlayingFragment.this) / 3600, (NowPlayingFragment.access$1300(NowPlayingFragment.this) % 3600) / 60, NowPlayingFragment.access$1300(NowPlayingFragment.this) % 3600 % 60, 0);
        (new org.xbmc.kore.jsonrpc.method.<init>(NowPlayingFragment.access$1500(NowPlayingFragment.this), e)).<init>(NowPlayingFragment.access$000(NowPlayingFragment.this).getConnection(), new ApiCallback() {

            final NowPlayingFragment._cls14 this$1;

            public void onError(int i, String s)
            {
                LogUtils.LOGD(NowPlayingFragment.access$1100(), (new StringBuilder()).append("Got an error calling Player.Seek. Error code: ").append(i).append(", description: ").append(s).toString());
            }

            public volatile void onSuccess(Object obj)
            {
                onSuccess((org.xbmc.kore.jsonrpc.type.PlayerType.SeekReturnType)obj);
            }

            public void onSuccess(org.xbmc.kore.jsonrpc.type.PlayerType.SeekReturnType seekreturntype)
            {
            }

            
            {
                this$1 = NowPlayingFragment._cls14.this;
                super();
            }
        }, NowPlayingFragment.access$200(NowPlayingFragment.this));
        seekbar.postDelayed(NowPlayingFragment.access$1400(NowPlayingFragment.this), 1000L);
    }

    _cls1.this._cls1()
    {
        this$0 = NowPlayingFragment.this;
        super();
    }
}
