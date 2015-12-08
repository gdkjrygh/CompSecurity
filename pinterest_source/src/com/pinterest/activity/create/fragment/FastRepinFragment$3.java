// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.create.fragment;

import com.pinterest.activity.create.adapter.BoardPickerAdapter;
import com.pinterest.api.ApiResponse;
import com.pinterest.api.model.BoardFeed;
import com.pinterest.api.model.Feed;
import com.pinterest.base.StopWatch;
import com.pinterest.kit.data.DiskCache;

// Referenced classes of package com.pinterest.activity.create.fragment:
//            FastRepinFragment, BoardPickerFragment

class init> extends com.pinterest.api.remote.rApiResponse
{

    final FastRepinFragment this$0;

    public void onFailure(Throwable throwable, ApiResponse apiresponse)
    {
        super.onFailure(throwable, apiresponse);
        StopWatch.get().invalidate("repin_dialog");
        try
        {
            if (DiskCache.getJsonObject("MY_PICKER_BOARDS") == null)
            {
                FastRepinFragment.access$200(FastRepinFragment.this);
            }
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Throwable throwable)
        {
            return;
        }
    }

    public void onSuccess(Feed feed)
    {
        BoardPickerFragment._boardFeed = (BoardFeed)feed;
        if (_adapter != null)
        {
            _adapter.setDataSource(BoardPickerFragment._boardFeed);
        }
        StopWatch.get().complete("repin_dialog");
    }

    ()
    {
        this$0 = FastRepinFragment.this;
        super();
    }
}
