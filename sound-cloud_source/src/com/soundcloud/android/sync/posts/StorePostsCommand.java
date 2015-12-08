// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.sync.posts;

import android.content.ContentValues;
import com.soundcloud.android.commands.DefaultWriteStorageCommand;
import com.soundcloud.android.model.PostProperty;
import com.soundcloud.android.model.Urn;
import com.soundcloud.android.storage.Table;
import com.soundcloud.java.collections.PropertySet;
import com.soundcloud.propeller.PropellerDatabase;
import com.soundcloud.propeller.WriteResult;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class StorePostsCommand extends DefaultWriteStorageCommand
{

    StorePostsCommand(PropellerDatabase propellerdatabase)
    {
        super(propellerdatabase);
    }

    private ContentValues buildContentValuesForPost(PropertySet propertyset)
    {
        ContentValues contentvalues = new ContentValues();
        Object obj = (Urn)propertyset.get(PostProperty.TARGET_URN);
        contentvalues.put("target_id", Long.valueOf(((Urn) (obj)).getNumericId()));
        int i;
        if (((Urn) (obj)).isTrack())
        {
            i = 0;
        } else
        {
            i = 1;
        }
        contentvalues.put("target_type", Integer.valueOf(i));
        if (((Boolean)propertyset.get(PostProperty.IS_REPOST)).booleanValue())
        {
            obj = "repost";
        } else
        {
            obj = "post";
        }
        contentvalues.put("type", ((String) (obj)));
        contentvalues.put("created_at", Long.valueOf(((Date)propertyset.get(PostProperty.CREATED_AT)).getTime()));
        return contentvalues;
    }

    protected volatile WriteResult write(PropellerDatabase propellerdatabase, Object obj)
    {
        return write(propellerdatabase, (Collection)obj);
    }

    protected WriteResult write(PropellerDatabase propellerdatabase, Collection collection)
    {
        ArrayList arraylist = new ArrayList(collection.size());
        for (collection = collection.iterator(); collection.hasNext(); arraylist.add(buildContentValuesForPost((PropertySet)collection.next()))) { }
        return propellerdatabase.bulkInsert(Table.Posts, arraylist, 5);
    }
}
