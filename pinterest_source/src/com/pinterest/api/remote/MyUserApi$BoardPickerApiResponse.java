// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.api.remote;

import com.pinterest.activity.create.fragment.BoardPickerFragment;
import com.pinterest.api.model.BoardFeed;
import com.pinterest.api.model.Feed;
import com.pinterest.kit.data.DiskCache;
import com.pinterest.network.json.PinterestJsonObject;

public class  extends 
{

    public void onSuccess(Feed feed)
    {
        super.uccess(feed);
        BoardPickerFragment.setBoardFeed((BoardFeed)feed);
    }

    public void onSuccess(PinterestJsonObject pinterestjsonobject)
    {
        super.uccess(pinterestjsonobject);
        if (pinterestjsonobject != null)
        {
            DiskCache.setJsonObject("MY_PICKER_BOARDS", pinterestjsonobject);
        }
    }

    public ()
    {
    }
}
