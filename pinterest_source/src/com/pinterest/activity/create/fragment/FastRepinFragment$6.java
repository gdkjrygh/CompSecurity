// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.create.fragment;

import com.pinterest.activity.create.adapter.BoardPickerAdapter;
import com.pinterest.api.ApiResponse;
import com.pinterest.api.ApiResponseHandler;
import com.pinterest.api.model.Board;
import com.pinterest.api.model.BoardFeed;
import com.pinterest.network.json.PinterestJsonArray;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package com.pinterest.activity.create.fragment:
//            BoardPickerFragment, FastRepinFragment

class this._cls0 extends ApiResponseHandler
{

    final FastRepinFragment this$0;

    public void onSuccess(ApiResponse apiresponse)
    {
        super.onSuccess(apiresponse);
        Object obj = new ArrayList();
        if (apiresponse.getData() instanceof PinterestJsonArray)
        {
            obj = Board.makeAll((PinterestJsonArray)apiresponse.getData());
        }
        BoardPickerFragment._suggestionInterestBoardsFeed = new BoardFeed();
        if (((List) (obj)).size() > 5)
        {
            BoardPickerFragment._suggestionInterestBoardsFeed.setItems(((List) (obj)).subList(0, 5));
        } else
        {
            BoardPickerFragment._suggestionInterestBoardsFeed.setItems(((List) (obj)));
        }
        if (_adapter == null)
        {
            return;
        } else
        {
            _adapter.setSuggestedBoardSuggestions(BoardPickerFragment._suggestionInterestBoardsFeed);
            _adapter.notifyDataSetChanged();
            return;
        }
    }

    ()
    {
        this$0 = FastRepinFragment.this;
        super();
    }
}
