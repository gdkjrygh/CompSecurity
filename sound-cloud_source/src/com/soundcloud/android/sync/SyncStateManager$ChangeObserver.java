// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.sync;

import android.database.ContentObserver;
import android.os.Handler;
import android.os.Looper;
import com.soundcloud.android.api.legacy.model.LocalCollection;
import com.soundcloud.android.storage.provider.Content;

// Referenced classes of package com.soundcloud.android.sync:
//            SyncStateManager

class listener extends ContentObserver
{

    private final com.soundcloud.android.api.legacy.model. listener;
    private final LocalCollection syncState;
    final SyncStateManager this$0;

    public boolean deliverSelfNotifications()
    {
        return true;
    }

    public com.soundcloud.android.api.legacy.model. getListener()
    {
        return listener;
    }

    public void onChange(boolean flag)
    {
        (new andler(SyncStateManager.this, syncState, listener)).startQuery(0, null, Content.COLLECTIONS.uri, null, "_id = ?", new String[] {
            String.valueOf(syncState.getId())
        }, null);
    }

    public angeListener(LocalCollection localcollection, com.soundcloud.android.api.legacy.model. )
    {
        this$0 = SyncStateManager.this;
        super(new Handler(Looper.getMainLooper()));
        syncState = localcollection;
        listener = ;
    }
}
