// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.sync.likes;

import android.content.ContentValues;
import com.soundcloud.android.commands.StoreCommand;
import com.soundcloud.android.likes.LikeProperty;
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

class UpdateSuccessfulLikesCommand extends StoreCommand
{

    UpdateSuccessfulLikesCommand(PropellerDatabase propellerdatabase)
    {
        super(propellerdatabase);
    }

    private ContentValues buildContentValuesForLike(PropertySet propertyset)
    {
        ContentValues contentvalues = new ContentValues();
        Urn urn = (Urn)propertyset.get(LikeProperty.TARGET_URN);
        contentvalues.put("_id", Long.valueOf(urn.getNumericId()));
        int i;
        if (urn.isTrack())
        {
            i = 0;
        } else
        {
            i = 1;
        }
        contentvalues.put("_type", Integer.valueOf(i));
        contentvalues.put("created_at", Long.valueOf(((Date)propertyset.get(LikeProperty.CREATED_AT)).getTime()));
        return contentvalues;
    }

    protected WriteResult store()
    {
        ArrayList arraylist = new ArrayList(((Collection)input).size());
        for (Iterator iterator = ((Collection)input).iterator(); iterator.hasNext(); arraylist.add(buildContentValuesForLike((PropertySet)iterator.next()))) { }
        return database.bulkInsert(Table.Likes, arraylist);
    }
}
