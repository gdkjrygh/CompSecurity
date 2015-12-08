// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.cast.companionlibrary.remotecontrol;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import com.google.android.libraries.cast.companionlibrary.cast.VideoCastManager;
import com.google.android.libraries.cast.companionlibrary.utils.LogUtils;

public class VideoIntentReceiver extends BroadcastReceiver
{

    private static final String TAG = LogUtils.makeLogTag(com/google/android/libraries/cast/companionlibrary/remotecontrol/VideoIntentReceiver);

    public VideoIntentReceiver()
    {
    }

    private void startService(Context context, String s)
    {
        s = new Intent(s);
        s.setPackage(context.getPackageName());
        context.startService(s);
    }

    public void onReceive(Context context, Intent intent)
    {
        VideoCastManager videocastmanager;
        String s;
        videocastmanager = VideoCastManager.getInstance();
        s = intent.getAction();
        if (s != null) goto _L2; else goto _L1
_L1:
        return;
_L2:
        byte byte0 = -1;
        s.hashCode();
        JVM INSTR lookupswitch 3: default 60
    //                   -1659235314: 113
    //                   1153919611: 97
    //                   1997055314: 129;
           goto _L3 _L4 _L5 _L6
_L3:
        break; /* Loop/switch isn't completed */
_L6:
        break MISSING_BLOCK_LABEL_129;
_L7:
        switch (byte0)
        {
        default:
            return;

        case 0: // '\0'
            startService(context, "com.google.android.libraries.cast.companionlibrary.action.toggleplayback");
            return;

        case 1: // '\001'
            LogUtils.LOGD(TAG, "Calling stopApplication from intent");
            videocastmanager.disconnect();
            return;

        case 2: // '\002'
            break;
        }
        continue; /* Loop/switch isn't completed */
_L5:
        if (s.equals("com.google.android.libraries.cast.companionlibrary.action.toggleplayback"))
        {
            byte0 = 0;
        }
          goto _L7
_L4:
        if (s.equals("com.google.android.libraries.cast.companionlibrary.action.stop"))
        {
            byte0 = 1;
        }
          goto _L7
        if (s.equals("android.intent.action.MEDIA_BUTTON"))
        {
            byte0 = 2;
        }
          goto _L7
        if (!intent.hasExtra("android.intent.extra.KEY_EVENT")) goto _L1; else goto _L8
_L8:
        intent = (KeyEvent)intent.getExtras().get("android.intent.extra.KEY_EVENT");
        if (intent.getAction() == 0)
        {
            switch (intent.getKeyCode())
            {
            default:
                return;

            case 85: // 'U'
                startService(context, "com.google.android.libraries.cast.companionlibrary.action.toggleplayback");
                break;
            }
            return;
        }
        if (true) goto _L1; else goto _L9
_L9:
    }

}
