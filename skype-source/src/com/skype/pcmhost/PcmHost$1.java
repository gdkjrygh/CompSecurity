// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.pcmhost;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.media.AudioManager;

// Referenced classes of package com.skype.pcmhost:
//            PcmHost

class eiver extends BroadcastReceiver
{

    final PcmHost this$0;

    public void onReceive(Context context, Intent intent)
    {
        context = intent.getAction();
        (new StringBuilder("onReceive() action = '")).append(context).append("'");
        if ("android.intent.action.HEADSET_PLUG".equals(context))
        {
            if (PcmHost.access$000(PcmHost.this).isWiredHeadsetOn())
            {
                if (PcmHost.access$100(PcmHost.this) == dioRouteStates.SPEAKER)
                {
                    PcmHost.access$202(PcmHost.this, dioRoute.SPEAKER);
                }
                if (PcmHost.access$100(PcmHost.this) == dioRouteStates.SCO_CONNECTED || PcmHost.access$100(PcmHost.this) == dioRouteStates.SCO_CONNECTING)
                {
                    PcmHost.access$202(PcmHost.this, dioRoute.BLUETOOTH);
                }
                PcmHost.access$300(PcmHost.this, dioRoute.HEADSET_WITH_MIC);
                return;
            } else
            {
                PcmHost.access$300(PcmHost.this, PcmHost.access$200(PcmHost.this));
                return;
            }
        }
        int i = intent.getIntExtra("android.media.extra.SCO_AUDIO_STATE", -1);
        if (context.equals("android.media.SCO_AUDIO_STATE_CHANGED"))
        {
            (new StringBuilder("SCO - audio state CHANGED to '")).append(PcmHost.access$400(i)).append("'");
        } else
        if (context.equals("android.media.ACTION_SCO_AUDIO_STATE_UPDATED"))
        {
            (new StringBuilder("SCO - audio state UPDATED to '")).append(PcmHost.access$400(i)).append("'");
        } else
        {
            (new StringBuilder("Ignoring SCO audio state change '")).append(PcmHost.access$400(i)).append("'");
        }
        PcmHost.access$102(PcmHost.this, PcmHost.access$500(PcmHost.this, i));
    }

    dioRoute()
    {
        this$0 = PcmHost.this;
        super();
    }
}
