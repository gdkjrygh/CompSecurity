// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.service.player;

import com.netflix.mediaclient.Log;
import com.netflix.mediaclient.javabridge.ui.IMedia;
import com.netflix.mediaclient.util.ConnectivityUtils;
import com.netflix.mediaclient.util.DeviceCategory;
import java.util.Timer;

// Referenced classes of package com.netflix.mediaclient.service.player:
//            PlayerAgent

class this._cls0
    implements Runnable
{

    final PlayerAgent this$0;

    public void run()
    {
        PlayerAgent playeragent = PlayerAgent.this;
        playeragent;
        JVM INSTR monitorenter ;
        PlayerAgent.access$100(PlayerAgent.this).reset();
        PlayerAgent.access$202(PlayerAgent.this, -1);
        PlayerAgent.access$302(PlayerAgent.this, false);
        PlayerAgent.access$402(PlayerAgent.this, false);
        PlayerAgent.access$502(PlayerAgent.this, false);
        PlayerAgent.access$602(PlayerAgent.this, false);
        PlayerAgent.access$702(PlayerAgent.this, false);
        PlayerAgent.access$802(PlayerAgent.this, Long.valueOf(PlayerAgent.access$900(PlayerAgent.this)).intValue());
        PlayerAgent.access$1002(PlayerAgent.this, false);
        PlayerAgent.access$1102(PlayerAgent.this, null);
        if (PlayerAgent.access$1200(PlayerAgent.this) != null)
        {
            PlayerAgent.access$1302(PlayerAgent.this, new artPlayTimeoutTask(PlayerAgent.this));
            PlayerAgent.access$1200(PlayerAgent.this).schedule(PlayerAgent.access$1300(PlayerAgent.this), 30000L);
        }
        if (Log.isLoggable(PlayerAgent.access$1400(), 3))
        {
            Log.d(PlayerAgent.access$1400(), (new StringBuilder()).append("Player state is ").append(PlayerAgent.access$1500(PlayerAgent.this)).toString());
        }
        if (PlayerAgent.access$1500(PlayerAgent.this) != 4 && PlayerAgent.access$1500(PlayerAgent.this) != -1)
        {
            break MISSING_BLOCK_LABEL_581;
        }
        Log.d(PlayerAgent.access$1400(), "Player state was CLOSED or CREATED, cancel timeout task!");
        PlayerAgent.access$1502(PlayerAgent.this, 5);
        if (PlayerAgent.access$1300(PlayerAgent.this) == null) goto _L2; else goto _L1
_L1:
        boolean flag = PlayerAgent.access$1300(PlayerAgent.this).cancel();
        if (Log.isLoggable(PlayerAgent.access$1400(), 3))
        {
            Log.d(PlayerAgent.access$1400(), (new StringBuilder()).append("Task was canceled ").append(flag).toString());
        }
_L7:
        if (PlayerAgent.access$1200(PlayerAgent.this) == null) goto _L4; else goto _L3
_L3:
        int i = PlayerAgent.access$1200(PlayerAgent.this).purge();
        if (Log.isLoggable(PlayerAgent.access$1400(), 3))
        {
            Log.d(PlayerAgent.access$1400(), (new StringBuilder()).append("Canceled tasks: ").append(i).toString());
        }
_L8:
        Object obj;
        reloadPlayer();
        PlayerAgent.access$100(PlayerAgent.this).setStreamingQoe(getConfigurationAgent().getStreamingQoe());
        PlayerAgent.access$100(PlayerAgent.this).open(PlayerAgent.access$1600(PlayerAgent.this), PlayerAgent.access$1700(PlayerAgent.this), PlayerAgent.access$1800(PlayerAgent.this));
        PlayerAgent.access$1902(PlayerAgent.this, false);
        obj = getConfigurationAgent().getDeviceCategory().getValue();
        if (!com.netflix.mediaclient.javabridge.invoke.media.ifi.quals(PlayerAgent.access$1800(PlayerAgent.this))) goto _L6; else goto _L5
_L5:
        Log.i(PlayerAgent.access$1400(), "Setting WifiApInfo");
        PlayerAgent.access$100(PlayerAgent.this).setWifiApsInfo(PlayerAgent.access$2000(PlayerAgent.this), ((String) (obj)), true);
_L9:
        PlayerAgent.access$2202(PlayerAgent.this, ConnectivityUtils.getApplicationRx());
        PlayerAgent.access$2302(PlayerAgent.this, ConnectivityUtils.getApplicationTx());
        PlayerAgent.access$2402(PlayerAgent.this, -1);
_L10:
        return;
_L2:
        Log.w(PlayerAgent.access$1400(), "Timer task was null!!!");
          goto _L7
        obj;
        playeragent;
        JVM INSTR monitorexit ;
        throw obj;
_L4:
        Log.w(PlayerAgent.access$1400(), "Timer was null!!!");
          goto _L8
_L6:
        PlayerAgent.access$100(PlayerAgent.this).setWifiApsInfo(PlayerAgent.access$2100(PlayerAgent.this), ((String) (obj)), false);
          goto _L9
        PlayerAgent.access$1902(PlayerAgent.this, true);
        Log.d(PlayerAgent.access$1400(), "invokeMethod(open) has to wait...");
          goto _L10
    }

    NetType()
    {
        this$0 = PlayerAgent.this;
        super();
    }
}
