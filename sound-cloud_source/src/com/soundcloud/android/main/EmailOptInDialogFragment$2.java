// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.main;

import android.content.DialogInterface;
import com.soundcloud.android.events.EventQueue;
import com.soundcloud.android.events.OnboardingEvent;
import com.soundcloud.android.onboarding.OnboardingOperations;
import com.soundcloud.rx.eventbus.EventBus;

// Referenced classes of package com.soundcloud.android.main:
//            EmailOptInDialogFragment

class this._cls0
    implements android.content.ener
{

    final EmailOptInDialogFragment this$0;

    public void onClick(DialogInterface dialoginterface, int i)
    {
        eventBus.publish(EventQueue.ONBOARDING, OnboardingEvent.acceptEmailOptIn());
        onboardingOperations.sendEmailOptIn();
        dismiss();
    }

    ()
    {
        this$0 = EmailOptInDialogFragment.this;
        super();
    }
}
