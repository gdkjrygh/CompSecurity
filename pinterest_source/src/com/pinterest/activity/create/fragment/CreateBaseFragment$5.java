// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.create.fragment;

import android.app.Activity;
import com.pinterest.api.ApiResponse;
import com.pinterest.api.model.Feed;
import com.pinterest.kit.data.DiskCache;
import org.apache.commons.lang3.StringUtils;

// Referenced classes of package com.pinterest.activity.create.fragment:
//            CreateBaseFragment

class nit> extends com.pinterest.api.remote.ApiResponse
{

    final CreateBaseFragment this$0;

    public void onFailure(Throwable throwable, ApiResponse apiresponse)
    {
        super.onFailure(throwable, apiresponse);
        try
        {
            if (DiskCache.getJsonObject("MY_PICKER_BOARDS") != null)
            {
                break MISSING_BLOCK_LABEL_30;
            }
            throwable = getActivity();
        }
        // Misplaced declaration of an exception variable
        catch (Throwable throwable)
        {
            return;
        }
        if (throwable == null)
        {
            break MISSING_BLOCK_LABEL_30;
        }
        throwable.onBackPressed();
    }

    public void onFinish()
    {
        CreateBaseFragment.access$300(CreateBaseFragment.this);
    }

    public void onSuccess(Feed feed)
    {
        super.onSuccess(feed);
        if (StringUtils.isEmpty(boardUid))
        {
            autoPickBoard();
        }
    }

    A()
    {
        this$0 = CreateBaseFragment.this;
        super();
    }
}
