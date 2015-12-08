// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.stream;

import android.content.ContentValues;
import com.soundcloud.android.commands.DefaultWriteStorageCommand;
import com.soundcloud.android.presentation.PromotedListItem;
import com.soundcloud.android.storage.Table;
import com.soundcloud.propeller.PropellerDatabase;
import com.soundcloud.propeller.WriteResult;
import com.soundcloud.propeller.query.Filter;

public class MarkPromotedItemAsStaleCommand extends DefaultWriteStorageCommand
{

    protected MarkPromotedItemAsStaleCommand(PropellerDatabase propellerdatabase)
    {
        super(propellerdatabase);
    }

    protected WriteResult write(PropellerDatabase propellerdatabase, PromotedListItem promotedlistitem)
    {
        ContentValues contentvalues = new ContentValues();
        contentvalues.put("created_at", Long.valueOf(0L));
        promotedlistitem = Filter.filter().whereEq("ad_urn", promotedlistitem.getAdUrn());
        return propellerdatabase.update(Table.PromotedTracks, contentvalues, promotedlistitem);
    }

    protected volatile WriteResult write(PropellerDatabase propellerdatabase, Object obj)
    {
        return write(propellerdatabase, (PromotedListItem)obj);
    }
}
