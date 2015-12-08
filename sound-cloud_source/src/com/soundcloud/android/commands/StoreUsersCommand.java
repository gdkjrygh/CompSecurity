// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.commands;

import android.content.ContentValues;
import com.soundcloud.android.model.Urn;
import com.soundcloud.android.storage.Table;
import com.soundcloud.android.users.UserRecord;
import com.soundcloud.java.collections.Iterables;
import com.soundcloud.java.optional.Optional;
import com.soundcloud.propeller.ContentValuesBuilder;
import com.soundcloud.propeller.PropellerDatabase;
import com.soundcloud.propeller.WriteResult;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.soundcloud.android.commands:
//            DefaultWriteStorageCommand

public class StoreUsersCommand extends DefaultWriteStorageCommand
{

    public StoreUsersCommand(PropellerDatabase propellerdatabase)
    {
        super(propellerdatabase);
    }

    public static ContentValues buildUserContentValues(UserRecord userrecord)
    {
        ContentValuesBuilder contentvaluesbuilder = getBaseBuilder(userrecord);
        putOptionalString(contentvaluesbuilder, userrecord.getDescription(), "description");
        putOptionalString(contentvaluesbuilder, userrecord.getWebsiteUrl(), "website");
        putOptionalString(contentvaluesbuilder, userrecord.getWebsiteName(), "website_title");
        putOptionalString(contentvaluesbuilder, userrecord.getDiscogsName(), "discogs_name");
        putOptionalString(contentvaluesbuilder, userrecord.getMyspaceName(), "myspace_name");
        return contentvaluesbuilder.get();
    }

    private static ContentValuesBuilder getBaseBuilder(UserRecord userrecord)
    {
        return ContentValuesBuilder.values().put("_id", userrecord.getUrn().getNumericId()).put("username", userrecord.getUsername()).put("country", userrecord.getCountry()).put("followers_count", userrecord.getFollowersCount());
    }

    private static void putOptionalString(ContentValuesBuilder contentvaluesbuilder, Optional optional, String s)
    {
        if (optional.isPresent())
        {
            contentvaluesbuilder.put(s, (String)optional.get());
        }
    }

    protected WriteResult write(PropellerDatabase propellerdatabase, Iterable iterable)
    {
        ArrayList arraylist = new ArrayList(Iterables.size(iterable));
        for (iterable = iterable.iterator(); iterable.hasNext(); arraylist.add(buildUserContentValues((UserRecord)iterable.next()))) { }
        return propellerdatabase.bulkInsert(Table.Users, arraylist);
    }

    protected volatile WriteResult write(PropellerDatabase propellerdatabase, Object obj)
    {
        return write(propellerdatabase, (Iterable)obj);
    }
}
