// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.sync;

import android.content.ContentResolver;
import android.content.Context;
import com.soundcloud.android.SoundCloudApplication;
import com.soundcloud.android.accounts.AccountOperations;
import com.soundcloud.android.api.legacy.PublicApi;
import com.soundcloud.android.api.legacy.model.CollectionHolder;
import com.soundcloud.android.storage.LocalCollectionDAO;

// Referenced classes of package com.soundcloud.android.sync:
//            SyncStrategy, ApiSyncService, SyncStateManager

public abstract class LegacySyncStrategy
    implements SyncStrategy
{
    public static class IdHolder extends CollectionHolder
    {

        public IdHolder()
        {
        }
    }


    public static final String TAG;
    public final AccountOperations accountOperations;
    public final PublicApi api;
    public final Context context;
    protected final ContentResolver resolver;
    protected final SyncStateManager syncStateManager;

    protected LegacySyncStrategy(Context context1, ContentResolver contentresolver)
    {
        this(context1, contentresolver, PublicApi.getInstance(context1), new SyncStateManager(contentresolver, new LocalCollectionDAO(contentresolver)), SoundCloudApplication.fromContext(context1).getAccountOperations());
    }

    public LegacySyncStrategy(Context context1, ContentResolver contentresolver, AccountOperations accountoperations)
    {
        this(context1, contentresolver, PublicApi.getInstance(context1), new SyncStateManager(contentresolver, new LocalCollectionDAO(contentresolver)), accountoperations);
    }

    protected LegacySyncStrategy(Context context1, ContentResolver contentresolver, PublicApi publicapi, SyncStateManager syncstatemanager, AccountOperations accountoperations)
    {
        context = context1;
        api = publicapi;
        resolver = contentresolver;
        syncStateManager = syncstatemanager;
        accountOperations = accountoperations;
    }

    public static void log(String s)
    {
    }

    public boolean isLoggedIn()
    {
        return accountOperations.isUserLoggedIn();
    }

    static 
    {
        TAG = ApiSyncService.LOG_TAG;
    }
}
