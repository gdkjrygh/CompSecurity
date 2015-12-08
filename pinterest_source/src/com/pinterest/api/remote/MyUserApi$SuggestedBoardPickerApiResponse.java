// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.api.remote;

import com.pinterest.activity.create.fragment.BoardPickerFragment;
import com.pinterest.api.model.BoardFeed;
import com.pinterest.api.model.Feed;

public class  extends 
{

    public void onSuccess(Feed feed)
    {
        super.(feed);
        BoardPickerFragment.setSuggestedBoardFeed((BoardFeed)feed);
    }

    public ()
    {
    }
}
