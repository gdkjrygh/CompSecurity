// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.creators.upload;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.soundcloud.android.api.ApiClient;
import com.soundcloud.android.api.legacy.model.Recording;
import com.soundcloud.android.commands.StoreTracksCommand;
import com.soundcloud.android.sync.posts.StorePostsCommand;
import com.soundcloud.rx.eventbus.EventBus;
import java.lang.ref.WeakReference;

// Referenced classes of package com.soundcloud.android.creators.upload:
//            UploadService, ImageResizer, Processor, Encoder, 
//            Uploader

private static final class <init> extends Handler
{

    private final ApiClient apiClient;
    private final EventBus eventBus;
    private final WeakReference serviceRef;
    private final StorePostsCommand storePostsCommand;
    private final StoreTracksCommand storeTracksCommand;

    public final void handleMessage(Message message)
    {
        UploadService uploadservice = (UploadService)serviceRef.get();
        if (uploadservice == null)
        {
            return;
        }
        message = (serviceRef)message.obj;
        String s = UploadService.TAG;
        (new StringBuilder("handleMessage(")).append(message).append(")");
        if (((serviceRef) (message)).ng.needsResizing())
        {
            UploadService.access$200(uploadservice).post(new ImageResizer(((ng) (message)).ng));
            return;
        }
        if (((ng) (message)).ng.needsProcessing())
        {
            UploadService.access$200(uploadservice).post(new Processor(((ng) (message)).ng));
            return;
        }
        if (((ng) (message)).ng.needsEncoding())
        {
            UploadService.access$200(uploadservice).post(new Encoder(((ng) (message)).ng, eventBus));
            return;
        } else
        {
            post(new Uploader(uploadservice, apiClient, ((apiClient) (message)).ng, storeTracksCommand, storePostsCommand, eventBus));
            return;
        }
    }

    private (UploadService uploadservice, Looper looper, ApiClient apiclient, StoreTracksCommand storetrackscommand, StorePostsCommand storepostscommand, EventBus eventbus)
    {
        super(looper);
        apiClient = apiclient;
        storeTracksCommand = storetrackscommand;
        storePostsCommand = storepostscommand;
        eventBus = eventbus;
        serviceRef = new WeakReference(uploadservice);
    }

    serviceRef(UploadService uploadservice, Looper looper, ApiClient apiclient, StoreTracksCommand storetrackscommand, StorePostsCommand storepostscommand, EventBus eventbus, serviceRef serviceref)
    {
        this(uploadservice, looper, apiclient, storetrackscommand, storepostscommand, eventbus);
    }
}
