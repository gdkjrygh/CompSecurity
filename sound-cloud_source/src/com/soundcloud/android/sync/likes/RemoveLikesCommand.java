// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.sync.likes;

import com.soundcloud.android.commands.DefaultWriteStorageCommand;
import com.soundcloud.android.likes.LikeProperty;
import com.soundcloud.android.model.Urn;
import com.soundcloud.android.storage.Table;
import com.soundcloud.java.collections.PropertySet;
import com.soundcloud.propeller.ChangeResult;
import com.soundcloud.propeller.PropellerDatabase;
import com.soundcloud.propeller.WriteResult;
import com.soundcloud.propeller.query.Filter;
import com.soundcloud.propeller.query.Where;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

class RemoveLikesCommand extends DefaultWriteStorageCommand
{

    private final int type;

    RemoveLikesCommand(PropellerDatabase propellerdatabase, int i)
    {
        super(propellerdatabase);
        type = i;
    }

    protected ChangeResult write(PropellerDatabase propellerdatabase, Collection collection)
    {
        ArrayList arraylist = new ArrayList(collection.size());
        for (collection = collection.iterator(); collection.hasNext(); arraylist.add(Long.valueOf(((Urn)((PropertySet)collection.next()).get(LikeProperty.TARGET_URN)).getNumericId()))) { }
        return propellerdatabase.delete(Table.Likes, Filter.filter().whereIn("_id", arraylist).whereEq("_type", Integer.valueOf(type)));
    }

    protected volatile WriteResult write(PropellerDatabase propellerdatabase, Object obj)
    {
        return write(propellerdatabase, (Collection)obj);
    }
}
