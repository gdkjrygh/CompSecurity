// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.nina.dialog.agent;

import com.dominos.activities.LabsCheckoutActivity;
import com.dominos.nina.speech.SpeechContext;
import com.dominos.nina.speech.SpeechManager;

// Referenced classes of package com.dominos.nina.dialog.agent:
//            OrderGuard

class val.sc
    implements Runnable
{

    final OrderGuard this$0;
    final SpeechContext val$sc;

    public void run()
    {
        if (mSpeechManager.getCurrentNinaActivity() instanceof LabsCheckoutActivity)
        {
            mSpeechManager.removeInvokeButton();
        }
        val$sc.stopConversation();
        val$sc.updateNinaNextState();
    }

    ()
    {
        this$0 = final_orderguard;
        val$sc = SpeechContext.this;
        super();
    }
}
