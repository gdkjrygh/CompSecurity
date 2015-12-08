// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.audio;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.media.AudioManager;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;

public class WiredHeadsetReceiver extends BroadcastReceiver
{
    public static interface Listener
    {

        public abstract void headsetStateChanged(WiredHeadsetStatus wiredheadsetstatus);
    }

    public static final class WiredHeadsetStatus extends Enum
    {

        public static final WiredHeadsetStatus a;
        public static final WiredHeadsetStatus b;
        public static final WiredHeadsetStatus c;
        private static final WiredHeadsetStatus d[];

        public static WiredHeadsetStatus valueOf(String s)
        {
            return (WiredHeadsetStatus)Enum.valueOf(com/skype/android/audio/WiredHeadsetReceiver$WiredHeadsetStatus, s);
        }

        public static WiredHeadsetStatus[] values()
        {
            return (WiredHeadsetStatus[])d.clone();
        }

        static 
        {
            a = new WiredHeadsetStatus("UNPLUGGED", 0);
            b = new WiredHeadsetStatus("PLUGGED_WITHOUT_MIC", 1);
            c = new WiredHeadsetStatus("PLUGGED_WITH_MIC", 2);
            d = (new WiredHeadsetStatus[] {
                a, b, c
            });
        }

        private WiredHeadsetStatus(String s, int i)
        {
            super(s, i);
        }
    }


    private static Set a = new CopyOnWriteArraySet();
    private static WiredHeadsetStatus b;

    public WiredHeadsetReceiver(AudioManager audiomanager)
    {
        if (audiomanager.isWiredHeadsetOn())
        {
            audiomanager = WiredHeadsetStatus.b;
        } else
        {
            audiomanager = WiredHeadsetStatus.a;
        }
        b = audiomanager;
    }

    public static void a(Listener listener)
    {
        a.add(listener);
    }

    public static boolean a()
    {
        return b != WiredHeadsetStatus.a;
    }

    public static WiredHeadsetStatus b()
    {
        return b;
    }

    public static void b(Listener listener)
    {
        a.remove(listener);
    }

    public void onReceive(Context context, Intent intent)
    {
        if (intent == null || !"android.intent.action.HEADSET_PLUG".equals(intent.getAction())) goto _L2; else goto _L1
_L1:
        int i;
        context = null;
        i = intent.getIntExtra("state", -1);
        if (i != 1) goto _L4; else goto _L3
_L3:
        if (intent.getIntExtra("microphone", 1) != 0)
        {
            context = WiredHeadsetStatus.c;
        } else
        {
            context = WiredHeadsetStatus.b;
        }
_L5:
        if (context != null && context != b)
        {
            b = context;
            for (context = a.iterator(); context.hasNext(); ((Listener)context.next()).headsetStateChanged(b)) { }
        }
        break; /* Loop/switch isn't completed */
_L4:
        if (i == 0)
        {
            context = WiredHeadsetStatus.a;
        }
        if (true) goto _L5; else goto _L2
_L2:
    }

}
