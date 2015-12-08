// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.offline;

import com.soundcloud.android.commands.Command;
import com.soundcloud.android.commands.PlaylistUrnMapper;
import com.soundcloud.android.commands.TrackUrnMapper;
import com.soundcloud.propeller.PropellerDatabase;
import com.soundcloud.propeller.QueryResult;
import com.soundcloud.propeller.TxnResult;
import com.soundcloud.propeller.query.Filter;
import com.soundcloud.propeller.query.Query;
import com.soundcloud.propeller.schema.Table;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// Referenced classes of package com.soundcloud.android.offline:
//            SecureFileStorage, OfflineSettingsStorage

public class ClearTrackDownloadsCommand extends Command
{

    private final OfflineSettingsStorage offlineSettingsStorage;
    private final PropellerDatabase propeller;
    private final SecureFileStorage secureFileStorage;

    ClearTrackDownloadsCommand(PropellerDatabase propellerdatabase, SecureFileStorage securefilestorage, OfflineSettingsStorage offlinesettingsstorage)
    {
        propeller = propellerdatabase;
        secureFileStorage = securefilestorage;
        offlineSettingsStorage = offlinesettingsstorage;
    }

    private List queryEntitiesToRemove(PropellerDatabase propellerdatabase)
    {
        ArrayList arraylist = new ArrayList();
        arraylist.addAll(queryOfflinePlaylistsUrns(propellerdatabase));
        arraylist.addAll(queryOfflineTracksUrns(propellerdatabase));
        return arraylist;
    }

    private List queryOfflinePlaylistsUrns(PropellerDatabase propellerdatabase)
    {
        com.soundcloud.propeller.query.Where where = Filter.filter().whereEq(com.soundcloud.android.storage.Tables.OfflineContent._TYPE, Integer.valueOf(1));
        return propellerdatabase.query(Query.from(new Table[] {
            com.soundcloud.android.storage.Tables.OfflineContent.TABLE
        }).where(where)).toList(new PlaylistUrnMapper());
    }

    private List queryOfflineTracksUrns(PropellerDatabase propellerdatabase)
    {
        return propellerdatabase.query(Query.from(new Table[] {
            com.soundcloud.android.storage.Tables.TrackDownloads.TABLE
        })).toList(new TrackUrnMapper());
    }

    public volatile Object call(Object obj)
    {
        return call((Void)obj);
    }

    public List call(Void void1)
    {
        void1 = queryEntitiesToRemove(propeller);
        if (propeller.runTransaction(new _cls1()).success())
        {
            secureFileStorage.deleteAllTracks();
            offlineSettingsStorage.setHasOfflineContent(false);
            return void1;
        } else
        {
            return Collections.emptyList();
        }
    }

    private class _cls1 extends com.soundcloud.propeller.PropellerDatabase.Transaction
    {

        final ClearTrackDownloadsCommand this$0;

        public void steps(PropellerDatabase propellerdatabase)
        {
            step(propellerdatabase.delete(com.soundcloud.android.storage.Tables.TrackDownloads.TABLE));
            step(propellerdatabase.delete(com.soundcloud.android.storage.Tables.OfflineContent.TABLE));
        }

        _cls1()
        {
            this$0 = ClearTrackDownloadsCommand.this;
            super();
        }
    }

}
