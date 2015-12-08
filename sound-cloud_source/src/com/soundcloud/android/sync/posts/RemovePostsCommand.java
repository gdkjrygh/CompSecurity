// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.sync.posts;

import com.soundcloud.android.commands.DefaultWriteStorageCommand;
import com.soundcloud.android.model.PostProperty;
import com.soundcloud.android.model.Urn;
import com.soundcloud.android.storage.Table;
import com.soundcloud.java.collections.PropertySet;
import com.soundcloud.propeller.PropellerDatabase;
import com.soundcloud.propeller.WriteResult;
import com.soundcloud.propeller.query.Filter;
import com.soundcloud.propeller.query.Where;
import java.util.Collection;
import java.util.Iterator;

class RemovePostsCommand extends DefaultWriteStorageCommand
{

    RemovePostsCommand(PropellerDatabase propellerdatabase)
    {
        super(propellerdatabase);
    }

    protected volatile WriteResult write(PropellerDatabase propellerdatabase, Object obj)
    {
        return write(propellerdatabase, (Collection)obj);
    }

    protected WriteResult write(PropellerDatabase propellerdatabase, Collection collection)
    {
        Object obj = null;
        Iterator iterator = collection.iterator();
        collection = obj;
        while (iterator.hasNext()) 
        {
            collection = (PropertySet)iterator.next();
            Object obj1 = (Urn)collection.get(PostProperty.TARGET_URN);
            Table table = Table.Posts;
            Where where = Filter.filter().whereEq("target_id", Long.valueOf(((Urn) (obj1)).getNumericId()));
            int i;
            if (((Urn) (obj1)).isTrack())
            {
                i = 0;
            } else
            {
                i = 1;
            }
            obj1 = where.whereEq("target_type", Integer.valueOf(i));
            if (((Boolean)collection.get(PostProperty.IS_REPOST)).booleanValue())
            {
                collection = "repost";
            } else
            {
                collection = "post";
            }
            collection = propellerdatabase.delete(table, ((Where) (obj1)).whereEq("type", collection));
        }
        return collection;
    }
}
