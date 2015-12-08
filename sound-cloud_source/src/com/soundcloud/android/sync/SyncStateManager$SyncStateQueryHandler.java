// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.sync;

import android.content.AsyncQueryHandler;
import android.database.Cursor;
import com.soundcloud.android.api.legacy.model.LocalCollection;

// Referenced classes of package com.soundcloud.android.sync:
//            SyncStateManager

private class listener extends AsyncQueryHandler
{

    private final com.soundcloud.android.api.legacy.model.ion listener;
    private final LocalCollection localCollection;
    final SyncStateManager this$0;

    protected void onQueryComplete(int i, Object obj, Cursor cursor)
    {
        onCollectionAsyncQueryReturn(cursor, localCollection, listener);
    }

    public tener(LocalCollection localcollection, com.soundcloud.android.api.legacy.model. )
    {
        this$0 = SyncStateManager.this;
        super(SyncStateManager.access$000(SyncStateManager.this));
        localCollection = localcollection;
        listener = ;
    }
}
