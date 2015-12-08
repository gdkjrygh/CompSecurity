// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.sync;

import android.content.SharedPreferences;
import android.net.Uri;
import com.soundcloud.android.storage.Table;
import com.soundcloud.android.storage.provider.Content;
import com.soundcloud.android.utils.CurrentDateProvider;
import com.soundcloud.propeller.query.ColumnFunctions;
import com.soundcloud.propeller.query.Query;
import com.soundcloud.propeller.rx.PropellerRx;
import com.soundcloud.propeller.rx.RxResultMapper;
import rx.b;

// Referenced classes of package com.soundcloud.android.sync:
//            SyncContent

public class SyncStateStorage
{

    private final CurrentDateProvider dateProvider;
    private final SharedPreferences preferences;
    private final PropellerRx propellerRx;

    public SyncStateStorage(PropellerRx propellerrx, SharedPreferences sharedpreferences, CurrentDateProvider currentdateprovider)
    {
        propellerRx = propellerrx;
        preferences = sharedpreferences;
        dateProvider = currentdateprovider;
    }

    public b hasSyncedBefore(Uri uri)
    {
        uri = (Query)((Query)Query.count(Table.Collections).whereNotNull("last_sync")).whereIn("uri", new Object[] {
            uri.toString()
        });
        return propellerRx.query(uri).map(RxResultMapper.scalar(java/lang/Boolean)).defaultIfEmpty(Boolean.valueOf(false));
    }

    public boolean hasSyncedBefore(String s)
    {
        return preferences.getLong(s, -1L) != -1L;
    }

    public b hasSyncedMyPostsBefore()
    {
        Query query = Query.apply(ColumnFunctions.exists((Query)((Query)Query.from(new com.soundcloud.propeller.schema.Table[] {
            Table.Collections
        }).whereEq("uri", SyncContent.MySounds.content.uri.toString())).whereNotNull("last_sync")));
        return propellerRx.query(query).map(RxResultMapper.scalar(java/lang/Boolean));
    }

    public void synced(String s)
    {
        preferences.edit().putLong(s, dateProvider.getCurrentTime()).apply();
    }
}
