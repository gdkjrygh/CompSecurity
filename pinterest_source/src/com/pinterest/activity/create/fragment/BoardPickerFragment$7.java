// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.create.fragment;

import android.support.v4.app.FragmentActivity;
import com.pinterest.activity.create.adapter.BoardPickerAdapter;
import com.pinterest.analytics.Pinalytics;
import com.pinterest.api.ApiResponse;
import com.pinterest.api.ApiResponseHandler;
import com.pinterest.api.model.BoardFeed;
import com.pinterest.api.model.ModelHelper;
import com.pinterest.api.model.MyUser;
import com.pinterest.kit.data.DiskCache;
import com.pinterest.schemas.event.EventType;

// Referenced classes of package com.pinterest.activity.create.fragment:
//            BoardPickerFragment

class this._cls0 extends ApiResponseHandler
{

    final BoardPickerFragment this$0;

    public void onFinish()
    {
        BoardPickerFragment.access$700(BoardPickerFragment.this);
        super.onFinish();
    }

    public void onStart()
    {
        BoardPickerFragment.access$600(BoardPickerFragment.this, 0x7f0701a4);
        super.onStart();
    }

    public void onSuccess(ApiResponse apiresponse)
    {
        super.onSuccess(apiresponse);
        apiresponse = MyUser.getLastSelectedBoardId();
        Pinalytics.a(EventType.BOARD_CREATE, apiresponse);
        apiresponse = ModelHelper.getBoard(apiresponse);
        com.pinterest.network.json.PinterestJsonObject pinterestjsonobject = DiskCache.getJsonObject("MY_PICKER_BOARDS");
        if (_adapter != null)
        {
            _adapter.setDataSource(new BoardFeed(pinterestjsonobject, null));
        }
        if (getActivity() == null)
        {
            return;
        } else
        {
            onBoardSelected(apiresponse);
            getActivity().onBackPressed();
            return;
        }
    }

    ()
    {
        this$0 = BoardPickerFragment.this;
        super();
    }
}
