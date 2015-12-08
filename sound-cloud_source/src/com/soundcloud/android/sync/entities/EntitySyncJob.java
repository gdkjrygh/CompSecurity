// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.sync.entities;

import com.soundcloud.android.commands.BulkFetchCommand;
import com.soundcloud.android.commands.WriteStorageCommand;
import com.soundcloud.android.model.Urn;
import com.soundcloud.android.sync.SyncJob;
import com.soundcloud.android.utils.ErrorUtils;
import com.soundcloud.android.utils.PropertySets;
import com.soundcloud.java.collections.MoreCollections;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class EntitySyncJob
    implements SyncJob
{

    private Exception exception;
    private final BulkFetchCommand fetchResources;
    private final WriteStorageCommand storeResources;
    private Collection updatedPropertySets;
    private List urns;

    public EntitySyncJob(BulkFetchCommand bulkfetchcommand, WriteStorageCommand writestoragecommand)
    {
        urns = Collections.emptyList();
        updatedPropertySets = Collections.emptyList();
        fetchResources = bulkfetchcommand;
        storeResources = writestoragecommand;
    }

    private List validUrns(List list)
    {
        ArrayList arraylist = new ArrayList(list.size());
        list = list.iterator();
        do
        {
            if (!list.hasNext())
            {
                break;
            }
            Urn urn = (Urn)list.next();
            if (urn.getNumericId() > 0L)
            {
                arraylist.add(urn);
            }
        } while (true);
        return arraylist;
    }

    public Exception getException()
    {
        return exception;
    }

    public Collection getUpdatedEntities()
    {
        return updatedPropertySets;
    }

    public void onQueued()
    {
    }

    public boolean resultedInAChange()
    {
        return exception == null;
    }

    public void run()
    {
        try
        {
            if (!urns.isEmpty())
            {
                Collection collection = ((BulkFetchCommand)fetchResources.with(urns)).call();
                storeResources.call(collection);
                updatedPropertySets = MoreCollections.transform(collection, PropertySets.toPropertySet());
            }
            return;
        }
        catch (Exception exception1)
        {
            ErrorUtils.handleThrowable(exception1, getClass());
            exception = exception1;
            return;
        }
    }

    public void setUrns(List list)
    {
        urns = validUrns(list);
    }
}
