// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.creators.upload;

import com.soundcloud.android.api.ApiClient;
import com.soundcloud.android.commands.StoreTracksCommand;
import com.soundcloud.android.sync.posts.StorePostsCommand;
import com.soundcloud.rx.eventbus.EventBus;
import dagger.a;
import dagger.a.b;
import dagger.a.l;
import java.util.Set;
import javax.inject.Provider;

// Referenced classes of package com.soundcloud.android.creators.upload:
//            UploadService, UploadNotificationController

public final class I extends b
    implements a, Provider
{

    private b apiClient;
    private b eventBus;
    private b notificationController;
    private b storePostsCommand;
    private b storeTracksCommand;

    public final void attach(l l1)
    {
        notificationController = l1.a("com.soundcloud.android.creators.upload.UploadNotificationController", com/soundcloud/android/creators/upload/UploadService, getClass().getClassLoader());
        storeTracksCommand = l1.a("com.soundcloud.android.commands.StoreTracksCommand", com/soundcloud/android/creators/upload/UploadService, getClass().getClassLoader());
        storePostsCommand = l1.a("com.soundcloud.android.sync.posts.StorePostsCommand", com/soundcloud/android/creators/upload/UploadService, getClass().getClassLoader());
        apiClient = l1.a("com.soundcloud.android.api.ApiClient", com/soundcloud/android/creators/upload/UploadService, getClass().getClassLoader());
        eventBus = l1.a("com.soundcloud.rx.eventbus.EventBus", com/soundcloud/android/creators/upload/UploadService, getClass().getClassLoader());
    }

    public final UploadService get()
    {
        UploadService uploadservice = new UploadService();
        injectMembers(uploadservice);
        return uploadservice;
    }

    public final volatile Object get()
    {
        return get();
    }

    public final void getDependencies(Set set, Set set1)
    {
        set1.add(notificationController);
        set1.add(storeTracksCommand);
        set1.add(storePostsCommand);
        set1.add(apiClient);
        set1.add(eventBus);
    }

    public final void injectMembers(UploadService uploadservice)
    {
        uploadservice.notificationController = (UploadNotificationController)notificationController.get();
        uploadservice.storeTracksCommand = (StoreTracksCommand)storeTracksCommand.get();
        uploadservice.storePostsCommand = (StorePostsCommand)storePostsCommand.get();
        uploadservice.apiClient = (ApiClient)apiClient.get();
        uploadservice.eventBus = (EventBus)eventBus.get();
    }

    public final volatile void injectMembers(Object obj)
    {
        injectMembers((UploadService)obj);
    }

    public I()
    {
        super("com.soundcloud.android.creators.upload.UploadService", "members/com.soundcloud.android.creators.upload.UploadService", false, com/soundcloud/android/creators/upload/UploadService);
    }
}
