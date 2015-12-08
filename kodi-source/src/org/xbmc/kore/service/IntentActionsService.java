// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.xbmc.kore.service;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import org.xbmc.kore.host.HostManager;
import org.xbmc.kore.jsonrpc.HostConnection;
import org.xbmc.kore.utils.LogUtils;

public class IntentActionsService extends Service
{

    public static final String TAG = LogUtils.makeLogTag(org/xbmc/kore/service/IntentActionsService);

    public IntentActionsService()
    {
    }

    public IBinder onBind(Intent intent)
    {
        return null;
    }

    public void onCreate()
    {
    }

    public int onStartCommand(Intent intent, int i, int j)
    {
        HostConnection hostconnection;
        String s;
        i = -1;
        hostconnection = HostManager.getInstance(this).getConnection();
        s = intent.getAction();
        j = intent.getIntExtra("extra_player_id", -1);
        if (hostconnection == null || j == -1) goto _L2; else goto _L1
_L1:
        s.hashCode();
        JVM INSTR lookupswitch 5: default 92
    //                   -1273775369: 175
    //                   -934318917: 145
    //                   -878512670: 160
    //                   3377907: 190
    //                   1922620715: 130;
           goto _L3 _L4 _L5 _L6 _L7 _L8
_L3:
        i;
        JVM INSTR tableswitch 0 4: default 128
    //                   0 205
    //                   1 222
    //                   2 241
    //                   3 260
    //                   4 279;
           goto _L2 _L9 _L10 _L11 _L12 _L13
_L2:
        return 2;
_L8:
        if (s.equals("play_pause"))
        {
            i = 0;
        }
          goto _L3
_L5:
        if (s.equals("rewind"))
        {
            i = 1;
        }
          goto _L3
_L6:
        if (s.equals("fast_forward"))
        {
            i = 2;
        }
          goto _L3
_L4:
        if (s.equals("previous"))
        {
            i = 3;
        }
          goto _L3
_L7:
        if (s.equals("next"))
        {
            i = 4;
        }
          goto _L3
_L9:
        hostconnection.execute(new org.xbmc.kore.jsonrpc.method.Player.PlayPause(j), null, null);
        return 2;
_L10:
        hostconnection.execute(new org.xbmc.kore.jsonrpc.method.Player.SetSpeed(j, "decrement"), null, null);
        return 2;
_L11:
        hostconnection.execute(new org.xbmc.kore.jsonrpc.method.Player.SetSpeed(j, "increment"), null, null);
        return 2;
_L12:
        hostconnection.execute(new org.xbmc.kore.jsonrpc.method.Player.GoTo(j, "previous"), null, null);
        return 2;
_L13:
        hostconnection.execute(new org.xbmc.kore.jsonrpc.method.Player.GoTo(j, "next"), null, null);
        return 2;
    }

}
