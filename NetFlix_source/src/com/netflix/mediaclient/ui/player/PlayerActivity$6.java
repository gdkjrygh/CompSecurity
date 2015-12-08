// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.ui.player;

import android.widget.SeekBar;
import com.netflix.mediaclient.Log;
import com.netflix.mediaclient.android.widget.NetflixSeekBar;
import com.netflix.mediaclient.servicemgr.IPlayer;

// Referenced classes of package com.netflix.mediaclient.ui.player:
//            PlayerActivity, PlayerWorkflowState, PlayScreen

class this._cls0
    implements android.widget.ChangeListener
{

    final PlayerActivity this$0;

    private boolean skipSeek(NetflixSeekBar netflixseekbar)
    {
        boolean flag;
        if (netflixseekbar == null)
        {
            return false;
        }
        flag = false;
        if (!netflixseekbar.inSnapPosition()) goto _L2; else goto _L1
_L1:
        Log.d("PlayerActivity", "Back to start position after snap, do NOT seek!");
        flag = true;
        PlayerActivity.access$100(PlayerActivity.this).timelineExitOnSnap = true;
_L4:
        Log.d("PlayerActivity", (new StringBuilder()).append("tate.timelineExitOnSnap ").append(PlayerActivity.access$100(PlayerActivity.this).timelineExitOnSnap).toString());
        return flag;
_L2:
        if (PlayerActivity.access$100(PlayerActivity.this).timelineInSnapZone)
        {
            Log.d("PlayerActivity", "We are in snap zone, reset progress bar to it and update labels");
            flag = true;
            PlayerActivity.access$100(PlayerActivity.this).timelineExitOnSnap = true;
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public void onProgressChanged(SeekBar seekbar, int i, boolean flag)
    {
        boolean flag1;
        flag1 = false;
        Log.d("PlayerActivity", (new StringBuilder()).append("Progress: ").append(i).append(", fromUser ").append(flag).toString());
        if (!flag || !PlayerActivity.access$100(PlayerActivity.this).draggingInProgress || PlayerActivity.access$700(PlayerActivity.this) == null || PlayerActivity.access$200(PlayerActivity.this) == null) goto _L2; else goto _L1
_L1:
        boolean flag2 = PlayerActivity.access$800(PlayerActivity.this, i, seekbar, PlayerActivity.access$200(PlayerActivity.this).getDuration());
        if (!flag2) goto _L4; else goto _L3
_L3:
        if (!PlayerActivity.access$100(PlayerActivity.this).timelineInSnapZone) goto _L6; else goto _L5
_L5:
        if (!(seekbar instanceof NetflixSeekBar)) goto _L8; else goto _L7
_L7:
        NetflixSeekBar netflixseekbar;
        netflixseekbar = (NetflixSeekBar)seekbar;
        if (Log.isLoggable("PlayerActivity", 3))
        {
            Log.d("PlayerActivity", (new StringBuilder()).append("Snap to position was in progress ").append(netflixseekbar.isSnapInProgress()).toString());
        }
        if (!netflixseekbar.isSnapInProgress()) goto _L10; else goto _L9
_L9:
        Log.d("PlayerActivity", "We were already in snap zone. Do nothing! Just return!");
_L13:
        return;
_L10:
        Log.d("PlayerActivity", "We were already in snap zone. Update labels!");
        PlayerActivity.access$700(PlayerActivity.this).setProgress(i, -1, false);
        PlayerActivity.access$100(PlayerActivity.this).updatePosition(i);
_L11:
        seekbar = PlayerActivity.access$200(PlayerActivity.this).getBifFrame(seekbar.getProgress());
        PlayerActivity.access$700(PlayerActivity.this).showBif(seekbar);
        Log.d("PlayerActivity", "onProgressChange showing bif");
        seekbar = PlayerActivity.access$700(PlayerActivity.this);
        flag = flag1;
        if (!PlayerActivity.access$900(PlayerActivity.this))
        {
            flag = true;
        }
        seekbar.moveCurrentTimeWithTimeline(flag, true);
        PlayerActivity.access$100(PlayerActivity.this).timelineInSnapZone = flag2;
        return;
_L8:
        Log.e("PlayerActivity", "Not NETFLIX seekbar!");
        continue; /* Loop/switch isn't completed */
_L6:
        Log.d("PlayerActivity", "In snap zone. Snap!");
        PlayerActivity.access$700(PlayerActivity.this).snapToPosition(PlayerActivity.access$100(PlayerActivity.this).timelineStartSeekPosition, -1);
        PlayerActivity.access$100(PlayerActivity.this).updatePosition(PlayerActivity.access$100(PlayerActivity.this).timelineStartSeekPosition);
        continue; /* Loop/switch isn't completed */
_L4:
        Log.d("PlayerActivity", "Not in snap zone.");
        PlayerActivity.access$700(PlayerActivity.this).setProgress(i, -1, false);
        PlayerActivity.access$100(PlayerActivity.this).updatePosition(i);
        if (true) goto _L11; else goto _L2
_L2:
        if (!flag && PlayerActivity.access$100(PlayerActivity.this).draggingInProgress && PlayerActivity.access$700(PlayerActivity.this) != null)
        {
            Log.d("PlayerActivity", "Not from user and state.draggingInProgress is true ");
            PlayerActivity.access$700(PlayerActivity.this).setProgress(i, -1, false);
            PlayerActivity.access$100(PlayerActivity.this).updatePosition(i);
            return;
        }
        if (true) goto _L13; else goto _L12
_L12:
    }

    public void onStartTrackingTouch(SeekBar seekbar)
    {
        this;
        JVM INSTR monitorenter ;
        int i;
        PlayerActivity.access$100(PlayerActivity.this).draggingInProgress = true;
        if (!(seekbar instanceof NetflixSeekBar))
        {
            break MISSING_BLOCK_LABEL_180;
        }
        i = ((NetflixSeekBar)seekbar).setDentVisible(true);
_L1:
        PlayerActivity.access$100(PlayerActivity.this).resetTimeline();
        PlayerActivity.access$100(PlayerActivity.this).timelineStartSeekPosition = i;
        PlayerActivity.access$100(PlayerActivity.this).updatePosition(i);
        PlayerActivity.access$100(PlayerActivity.this).timelineInSnapZone = true;
        Log.d("PlayerActivity", "Pause playback");
        PlayerActivity.access$300(PlayerActivity.this, true);
        Log.d("PlayerActivity", "Start seek, get awake clock");
        PlayerActivity.access$1000(PlayerActivity.this);
        stopScreenUpdateTask();
        PlayerActivity.access$700(PlayerActivity.this).setLastTimeState(true);
        PlayerActivity.access$700(PlayerActivity.this).startCurrentTime(PlayerActivity.access$200(PlayerActivity.this).getBifFrame(i));
        if (PlayerActivity.access$700(PlayerActivity.this) != null)
        {
            PlayerActivity.access$700(PlayerActivity.this).changeActionState(false, true);
            PlayerActivity.access$700(PlayerActivity.this).setTopPanelVisibility(false);
        }
        this;
        JVM INSTR monitorexit ;
        return;
        Log.e("PlayerActivity", "Not a Netflix seekbar!");
        i = seekbar.getProgress();
          goto _L1
        seekbar;
        throw seekbar;
    }

    public void onStopTrackingTouch(SeekBar seekbar)
    {
        boolean flag = true;
        this;
        JVM INSTR monitorenter ;
        Log.d("PlayerActivity", "onStopTrackingTouch called");
        NetflixSeekBar netflixseekbar = null;
        if (!(seekbar instanceof NetflixSeekBar)) goto _L2; else goto _L1
_L1:
        netflixseekbar = (NetflixSeekBar)seekbar;
_L3:
        boolean flag1 = skipSeek(netflixseekbar);
        if (flag1)
        {
            break MISSING_BLOCK_LABEL_189;
        }
        int i = PlayerActivity.access$1100(PlayerActivity.this, seekbar);
        Log.d("PlayerActivity", "Seek!");
        doSeek(i);
_L4:
        PlayerActivity.access$700(PlayerActivity.this).setLastTimeState(false);
        if (PlayerActivity.access$700(PlayerActivity.this) != null)
        {
            PlayerActivity.access$700(PlayerActivity.this).setTopPanelVisibility(true);
        }
        if (netflixseekbar == null)
        {
            break MISSING_BLOCK_LABEL_106;
        }
        netflixseekbar.setDentVisible(false);
        if (Log.isLoggable("PlayerActivity", 3))
        {
            Log.d("PlayerActivity", (new StringBuilder()).append("Stop current time ").append(flag1).toString());
        }
        seekbar = PlayerActivity.access$700(PlayerActivity.this);
        if (flag1)
        {
            flag = false;
        }
        seekbar.stopCurrentTime(flag);
        PlayerActivity.access$100(PlayerActivity.this).resetTimeline();
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        Log.e("PlayerActivity", "Not a Netflix seekbar!");
          goto _L3
        seekbar;
        throw seekbar;
        Log.d("PlayerActivity", "Do not seek!");
        netflixseekbar.setProgress(PlayerActivity.access$100(PlayerActivity.this).timelineStartSeekPosition);
          goto _L4
    }

    ar()
    {
        this$0 = PlayerActivity.this;
        super();
    }
}
