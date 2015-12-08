// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.nina.speech;

import android.app.Activity;

// Referenced classes of package com.dominos.nina.speech:
//            SpeechManager

class val.enabled
    implements Runnable
{

    final SpeechManager this$0;
    final Activity val$currentActivity;
    final boolean val$enabled;

    public void run()
    {
        android.view.View view = val$currentActivity.findViewById(0x1020002);
        SpeechManager.access$200(SpeechManager.this, view, val$enabled);
    }

    ()
    {
        this$0 = final_speechmanager;
        val$currentActivity = activity;
        val$enabled = Z.this;
        super();
    }
}
