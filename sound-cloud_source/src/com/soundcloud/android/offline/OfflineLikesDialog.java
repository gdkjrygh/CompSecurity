// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.offline;

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v4.app.DialogFragment;
import android.support.v4.app.FragmentManager;
import com.soundcloud.android.SoundCloudApplication;
import com.soundcloud.android.analytics.ScreenProvider;
import com.soundcloud.android.events.EventQueue;
import com.soundcloud.android.events.UIEvent;
import com.soundcloud.android.rx.observers.DefaultSubscriber;
import com.soundcloud.rx.eventbus.EventBus;
import dagger.b;

// Referenced classes of package com.soundcloud.android.offline:
//            OfflineContentOperations

public class OfflineLikesDialog extends DialogFragment
    implements android.content.DialogInterface.OnClickListener
{

    private static final String TAG = "OfflineLikes";
    EventBus eventBus;
    OfflineContentOperations offlineOperations;
    ScreenProvider screenProvider;

    public OfflineLikesDialog()
    {
        SoundCloudApplication.getObjectGraph().a(this);
    }

    OfflineLikesDialog(OfflineContentOperations offlinecontentoperations, ScreenProvider screenprovider, EventBus eventbus)
    {
        offlineOperations = offlinecontentoperations;
        screenProvider = screenprovider;
        eventBus = eventbus;
    }

    public void onClick(DialogInterface dialoginterface, int i)
    {
        DefaultSubscriber.fireAndForget(offlineOperations.enableOfflineLikedTracks());
        eventBus.publish(EventQueue.TRACKING, UIEvent.fromAddOfflineLikes(screenProvider.getLastScreenTag()));
    }

    public Dialog onCreateDialog(Bundle bundle)
    {
        return (new android.support.v7.app.AlertDialog.Builder(getActivity())).setTitle(0x7f0702dc).setMessage(0x7f0702db).setNegativeButton(0x7f0700a6, null).setPositiveButton(0x7f0702ce, this).create();
    }

    public void show(FragmentManager fragmentmanager)
    {
        show(fragmentmanager, "OfflineLikes");
    }
}
