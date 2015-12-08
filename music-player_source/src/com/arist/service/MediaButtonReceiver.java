// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.arist.service;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.view.KeyEvent;
import com.arist.c.a;
import com.arist.c.f;

// Referenced classes of package com.arist.service:
//            d

public class MediaButtonReceiver extends BroadcastReceiver
{

    private static d a;

    public MediaButtonReceiver()
    {
    }

    public void onReceive(Context context, Intent intent)
    {
_L2:
        return;
        if (!(new f(context)).k() || intent == null || !"android.intent.action.MEDIA_BUTTON".equals(intent.getAction())) goto _L2; else goto _L1
_L1:
        KeyEvent keyevent = (KeyEvent)intent.getParcelableExtra("android.intent.extra.KEY_EVENT");
        if (keyevent == null) goto _L4; else goto _L3
_L3:
        Object obj;
        obj = null;
        intent = obj;
        if (keyevent.getAction() != 0) goto _L6; else goto _L5
_L5:
        keyevent.getKeyCode();
        JVM INSTR tableswitch 87 88: default 88
    //                   87 140
    //                   88 147;
           goto _L7 _L8 _L9
_L7:
        intent = obj;
_L6:
        Log.i("MediaButtonReceiver", (new StringBuilder("action : ")).append(intent).toString());
        if (intent != null)
        {
            context.sendBroadcast(new Intent(intent));
        } else
        {
            if (a == null)
            {
                a = new d(this, context);
            }
            if (keyevent.getAction() == 0)
            {
                if (a.hasMessages(1))
                {
                    Log.i("MediaButtonReceiver", "event : ACTION_DOWN1");
                    a.removeMessages(1);
                    a.sendEmptyMessage(2);
                } else
                if (a.hasMessages(0))
                {
                    Log.i("MediaButtonReceiver", "event : ACTION_DOWN2");
                    a.removeMessages(0);
                    a.sendEmptyMessageDelayed(1, 400L);
                } else
                {
                    Log.i("MediaButtonReceiver", "event : ACTION_DOWN3");
                    a.sendEmptyMessageDelayed(0, 400L);
                }
            }
        }
        if (isOrderedBroadcast())
        {
            abortBroadcast();
            return;
        }
_L4:
        if (true) goto _L2; else goto _L8
_L8:
        intent = a.g;
          goto _L6
_L9:
        intent = a.f;
          goto _L6
    }
}
