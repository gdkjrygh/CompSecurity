// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.main;

import android.app.Dialog;
import android.app.DialogFragment;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import com.soundcloud.android.SoundCloudApplication;
import com.soundcloud.android.events.EventQueue;
import com.soundcloud.android.events.OnboardingEvent;
import com.soundcloud.android.onboarding.OnboardingOperations;
import com.soundcloud.rx.eventbus.EventBus;
import dagger.b;

public class EmailOptInDialogFragment extends DialogFragment
{

    private static final String TAG = "email_opt_in";
    EventBus eventBus;
    OnboardingOperations onboardingOperations;

    public EmailOptInDialogFragment()
    {
        SoundCloudApplication.getObjectGraph().a(this);
    }

    EmailOptInDialogFragment(OnboardingOperations onboardingoperations, EventBus eventbus)
    {
        onboardingOperations = onboardingoperations;
        eventBus = eventbus;
    }

    public static void show(FragmentActivity fragmentactivity)
    {
        (new EmailOptInDialogFragment()).show(fragmentactivity.getFragmentManager(), "email_opt_in");
    }

    public void onCancel(DialogInterface dialoginterface)
    {
        super.onCancel(dialoginterface);
        eventBus.publish(EventQueue.ONBOARDING, OnboardingEvent.dismissEmailOptIn());
    }

    public Dialog onCreateDialog(Bundle bundle)
    {
        return (new android.support.v7.app.AlertDialog.Builder(getActivity())).setTitle(0x7f070177).setView(0x7f030062).setPositiveButton(0x7f070178, new _cls2()).setNegativeButton(0x7f070175, new _cls1()).create();
    }

    private class _cls2
        implements android.content.DialogInterface.OnClickListener
    {

        final EmailOptInDialogFragment this$0;

        public void onClick(DialogInterface dialoginterface, int i)
        {
            eventBus.publish(EventQueue.ONBOARDING, OnboardingEvent.acceptEmailOptIn());
            onboardingOperations.sendEmailOptIn();
            dismiss();
        }

        _cls2()
        {
            this$0 = EmailOptInDialogFragment.this;
            super();
        }
    }


    private class _cls1
        implements android.content.DialogInterface.OnClickListener
    {

        final EmailOptInDialogFragment this$0;

        public void onClick(DialogInterface dialoginterface, int i)
        {
            eventBus.publish(EventQueue.ONBOARDING, OnboardingEvent.rejectEmailOptIn());
            dismiss();
        }

        _cls1()
        {
            this$0 = EmailOptInDialogFragment.this;
            super();
        }
    }

}
