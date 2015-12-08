// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.onboarding;

import android.view.View;
import com.soundcloud.android.events.EventQueue;
import com.soundcloud.android.events.OnboardingEvent;
import com.soundcloud.android.events.ScreenEvent;
import com.soundcloud.android.main.Screen;
import com.soundcloud.rx.eventbus.EventBus;

// Referenced classes of package com.soundcloud.android.onboarding:
//            OnboardActivity

class this._cls0
    implements android.view.er
{

    final OnboardActivity this$0;

    public void onClick(View view)
    {
        OnboardActivity.access$600(OnboardActivity.this, boardingState.LOGIN);
        eventBus.publish(EventQueue.TRACKING, ScreenEvent.create(Screen.AUTH_LOG_IN));
        eventBus.publish(EventQueue.ONBOARDING, OnboardingEvent.logInPrompt());
    }

    boardingState()
    {
        this$0 = OnboardActivity.this;
        super();
    }
}
