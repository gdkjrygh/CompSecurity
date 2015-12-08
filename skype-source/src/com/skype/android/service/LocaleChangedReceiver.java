// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.service;

import android.content.Context;
import android.content.Intent;
import com.skype.android.SkypeBroadcastReceiver;
import com.skype.android.SkypeBroadcastReceiverComponent;
import com.skype.android.skylib.SkyLibInitializer;
import com.skype.android.util.ServerClock;
import com.skype.android.util.cache.SpannedStringCache;

public class LocaleChangedReceiver extends SkypeBroadcastReceiver
{

    ServerClock serverClock;
    SpannedStringCache spannedStringCache;

    public LocaleChangedReceiver()
    {
    }

    public void onReceive(Context context, Intent intent)
    {
        getComponent(context).inject(this);
        context = intent.getAction();
        if (context == null) goto _L2; else goto _L1
_L1:
        byte byte0 = -1;
        context.hashCode();
        JVM INSTR lookupswitch 4: default 68
    //                   -19011148: 101
    //                   502473491: 129
    //                   505380757: 115
    //                   1041332296: 143;
           goto _L3 _L4 _L5 _L6 _L7
_L3:
        byte0;
        JVM INSTR tableswitch 0 3: default 100
    //                   0 157
    //                   1 171
    //                   2 171
    //                   3 171;
           goto _L2 _L8 _L9 _L9 _L9
_L2:
        return;
_L4:
        if (context.equals("android.intent.action.LOCALE_CHANGED"))
        {
            byte0 = 0;
        }
          goto _L3
_L6:
        if (context.equals("android.intent.action.TIME_SET"))
        {
            byte0 = 1;
        }
          goto _L3
_L5:
        if (context.equals("android.intent.action.TIMEZONE_CHANGED"))
        {
            byte0 = 2;
        }
          goto _L3
_L7:
        if (context.equals("android.intent.action.DATE_CHANGED"))
        {
            byte0 = 3;
        }
          goto _L3
_L8:
        spannedStringCache.a();
        SkyLibInitializer.a().b();
        return;
_L9:
        serverClock.b();
        return;
    }
}
