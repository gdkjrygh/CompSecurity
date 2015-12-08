// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.nina.dialog.agent;

import android.app.Activity;
import com.dominos.nina.speech.SpeechContext;

// Referenced classes of package com.dominos.nina.dialog.agent:
//            GlobalAgent

class val.sc
    implements Runnable
{

    final GlobalAgent this$0;
    final Activity val$currentActivity;
    final SpeechContext val$sc;

    public void run()
    {
        class _cls1
            implements Runnable
        {

            final GlobalAgent._cls1 this$1;

            public void run()
            {
                mSpeechManager.showHints();
            }

            _cls1()
            {
                this$1 = GlobalAgent._cls1.this;
                super();
            }
        }

        val$currentActivity.runOnUiThread(new _cls1());
        val$sc.pauseConversation();
        val$sc.updateNinaNextState();
    }

    _cls1()
    {
        this$0 = final_globalagent;
        val$currentActivity = activity;
        val$sc = SpeechContext.this;
        super();
    }
}
