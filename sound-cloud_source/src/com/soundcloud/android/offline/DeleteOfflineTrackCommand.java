// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.offline;

import com.soundcloud.android.commands.Command;
import com.soundcloud.android.model.Urn;
import com.soundcloud.propeller.ChangeResult;
import com.soundcloud.propeller.PropellerDatabase;
import com.soundcloud.propeller.query.Filter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

// Referenced classes of package com.soundcloud.android.offline:
//            SecureFileStorage

class DeleteOfflineTrackCommand extends Command
{

    private final PropellerDatabase database;
    private final SecureFileStorage fileStorage;

    public DeleteOfflineTrackCommand(SecureFileStorage securefilestorage, PropellerDatabase propellerdatabase)
    {
        fileStorage = securefilestorage;
        database = propellerdatabase;
    }

    private ChangeResult deleteFromDatabase(Urn urn)
    {
        urn = Filter.filter().whereEq("_id", Long.valueOf(urn.getNumericId()));
        return database.delete(com.soundcloud.android.storage.Tables.TrackDownloads.TABLE, urn);
    }

    public volatile Object call(Object obj)
    {
        return call((Collection)obj);
    }

    public Collection call(Collection collection)
    {
        ArrayList arraylist = new ArrayList(collection.size());
        collection = collection.iterator();
        do
        {
            if (!collection.hasNext())
            {
                break;
            }
            Urn urn = (Urn)collection.next();
            if (fileStorage.deleteTrack(urn))
            {
                deleteFromDatabase(urn);
                arraylist.add(urn);
            }
        } while (true);
        return arraylist;
    }
}
