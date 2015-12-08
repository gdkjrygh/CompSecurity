// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.ads;

import android.content.Context;
import android.view.View;
import com.soundcloud.android.accounts.AccountOperations;
import com.soundcloud.android.image.ImageOperations;
import com.soundcloud.android.playback.PlayQueueManager;
import com.soundcloud.android.utils.DeviceHelper;
import com.soundcloud.rx.eventbus.EventBus;

// Referenced classes of package com.soundcloud.android.ads:
//            AdOverlayController

public static class accountOperations
{

    private final AccountOperations accountOperations;
    private final Context context;
    private final DeviceHelper deviceHelper;
    private final EventBus eventBus;
    private final ImageOperations imageOperations;
    private final PlayQueueManager playQueueManager;

    public AdOverlayController create(View view, yListener ylistener)
    {
        return new AdOverlayController(view, ylistener, imageOperations, context, deviceHelper, eventBus, playQueueManager, accountOperations);
    }

    yListener(ImageOperations imageoperations, Context context1, DeviceHelper devicehelper, EventBus eventbus, PlayQueueManager playqueuemanager, AccountOperations accountoperations)
    {
        imageOperations = imageoperations;
        context = context1;
        deviceHelper = devicehelper;
        eventBus = eventbus;
        playQueueManager = playqueuemanager;
        accountOperations = accountoperations;
    }
}
