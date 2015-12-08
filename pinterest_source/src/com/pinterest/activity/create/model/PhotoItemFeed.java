// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.create.model;

import com.pinterest.api.model.Feed;
import com.pinterest.api.model.Model;
import java.util.List;

// Referenced classes of package com.pinterest.activity.create.model:
//            PhotoItem

public class PhotoItemFeed extends Feed
{

    public PhotoItemFeed()
    {
    }

    public void addItem(int i, PhotoItem photoitem)
    {
        _items.add(i, photoitem);
        updateIds();
    }

    public volatile void addItem(int i, Model model)
    {
        addItem(i, (PhotoItem)model);
    }

    protected List getPersistedItems()
    {
        return null;
    }
}
