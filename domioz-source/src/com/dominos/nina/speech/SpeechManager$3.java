// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.nina.speech;

import android.app.Activity;
import android.view.View;
import com.dominos.App;
import com.dominos.android.sdk.app.ApplicationEventBus;

// Referenced classes of package com.dominos.nina.speech:
//            SpeechManager

class val.activity
    implements android.view.ener
{

    final SpeechManager this$0;
    final Activity val$activity;

    public void onClick(View view)
    {
        setNinaInvoked(true);
        App.getInstance().bus.post(new com.dominos.bus.events.wSpeechBarEvent(val$activity));
    }

    ventBus()
    {
        this$0 = final_speechmanager;
        val$activity = Activity.this;
        super();
    }
}
