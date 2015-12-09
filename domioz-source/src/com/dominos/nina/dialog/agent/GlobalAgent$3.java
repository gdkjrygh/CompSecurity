// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.nina.dialog.agent;

import com.dominos.App;
import com.dominos.android.sdk.app.ApplicationEventBus;
import com.dominos.nina.speech.SpeechContext;

// Referenced classes of package com.dominos.nina.dialog.agent:
//            GlobalAgent

class val.sc
    implements Runnable
{

    final GlobalAgent this$0;
    final SpeechContext val$sc;

    public void run()
    {
        App.getInstance().bus.post(new com.dominos.bus.events.Speech.HomeClickRequested());
        val$sc.delayConversation();
        val$sc.updateNinaNextState();
    }

    Bus()
    {
        this$0 = final_globalagent;
        val$sc = SpeechContext.this;
        super();
    }
}
