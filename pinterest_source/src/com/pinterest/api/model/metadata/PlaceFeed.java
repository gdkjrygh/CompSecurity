// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.api.model.metadata;

import com.pinterest.api.model.Feed;
import com.pinterest.api.model.Place;
import com.pinterest.network.json.PinterestJsonArray;
import java.util.ArrayList;
import java.util.List;

public class PlaceFeed extends Feed
{

    private List persistedItems;

    public PlaceFeed(PinterestJsonArray pinterestjsonarray)
    {
        if (pinterestjsonarray != null)
        {
            setItems(Place.makeAll(pinterestjsonarray));
            persistedItems = new ArrayList();
        }
    }

    protected List getPersistedItems()
    {
        return new ArrayList(persistedItems);
    }
}
