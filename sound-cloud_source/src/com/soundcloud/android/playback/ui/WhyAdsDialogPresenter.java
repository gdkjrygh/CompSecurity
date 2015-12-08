// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.playback.ui;

import android.content.Context;
import android.support.v7.app.AlertDialog;
import com.soundcloud.android.Navigator;
import com.soundcloud.android.configuration.FeatureOperations;
import com.soundcloud.android.events.EventQueue;
import com.soundcloud.android.events.UpgradeTrackingEvent;
import com.soundcloud.rx.eventbus.EventBus;

class WhyAdsDialogPresenter
{

    private final EventBus eventBus;
    private final FeatureOperations featureOperations;
    private final Navigator navigator;

    public WhyAdsDialogPresenter(Navigator navigator1, FeatureOperations featureoperations, EventBus eventbus)
    {
        navigator = navigator1;
        featureOperations = featureoperations;
        eventBus = eventbus;
    }

    private void configureButtons(final Context context, android.support.v7.app.AlertDialog.Builder builder)
    {
        if (featureOperations.upsellRemoveAudioAds())
        {
            eventBus.publish(EventQueue.TRACKING, UpgradeTrackingEvent.forWhyAdsImpression());
            builder.setPositiveButton(0x7f07032d, new _cls1()).setNegativeButton(0x104000a, null);
            return;
        } else
        {
            builder.setPositiveButton(0x104000a, null);
            return;
        }
    }

    public void show(Context context)
    {
        android.support.v7.app.AlertDialog.Builder builder = (new android.support.v7.app.AlertDialog.Builder(context)).setTitle(0x7f070073).setMessage(0x7f070074);
        configureButtons(context, builder);
        builder.create().show();
    }



    private class _cls1
        implements android.content.DialogInterface.OnClickListener
    {

        final WhyAdsDialogPresenter this$0;
        final Context val$context;

        public void onClick(DialogInterface dialoginterface, int i)
        {
            navigator.openUpgrade(context);
            eventBus.publish(EventQueue.TRACKING, UpgradeTrackingEvent.forWhyAdsClick());
        }

        _cls1()
        {
            this$0 = WhyAdsDialogPresenter.this;
            context = context1;
            super();
        }
    }

}
