// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.board.dialog;

import com.pinterest.adapter.PeopleListAdapter;
import com.pinterest.api.ApiResponse;
import com.pinterest.api.model.Board;
import com.pinterest.api.model.Feed;
import com.pinterest.api.model.ModelHelper;
import com.pinterest.api.model.UserFeed;
import com.pinterest.ui.grid.AdapterFooterView;

// Referenced classes of package com.pinterest.activity.board.dialog:
//            BoardCollaboratorsDialog

class this._cls0 extends com.pinterest.api.remote.
{

    final BoardCollaboratorsDialog this$0;

    public void onFailure(Throwable throwable, ApiResponse apiresponse)
    {
label0:
        {
            super.onFailure(throwable, apiresponse);
            if (BoardCollaboratorsDialog.access$100(BoardCollaboratorsDialog.this) != null)
            {
                if (BoardCollaboratorsDialog.access$100(BoardCollaboratorsDialog.this).getCount() != 0)
                {
                    break label0;
                }
                dismiss();
            }
            return;
        }
        AdapterFooterView.setState(BoardCollaboratorsDialog.access$400(BoardCollaboratorsDialog.this), 2);
    }

    public void onStart()
    {
        AdapterFooterView.setState(BoardCollaboratorsDialog.access$200(BoardCollaboratorsDialog.this), 0);
    }

    public void onSuccess(Feed feed)
    {
        super.onSuccess(feed);
        if (BoardCollaboratorsDialog.access$100(BoardCollaboratorsDialog.this) != null)
        {
            if (BoardCollaboratorsDialog.access$100(BoardCollaboratorsDialog.this).getCount() == 0)
            {
                Board board = ModelHelper.getBoard(_boardUid);
                if (board != null)
                {
                    feed.appendItem(board.getUser());
                }
                BoardCollaboratorsDialog.access$100(BoardCollaboratorsDialog.this).setDataSource((UserFeed)feed);
            } else
            {
                BoardCollaboratorsDialog.access$100(BoardCollaboratorsDialog.this).appendItems((UserFeed)feed);
                BoardCollaboratorsDialog.access$100(BoardCollaboratorsDialog.this).finishedLoading();
            }
            BoardCollaboratorsDialog.access$100(BoardCollaboratorsDialog.this).notifyDataSetChanged();
            AdapterFooterView.setState(BoardCollaboratorsDialog.access$300(BoardCollaboratorsDialog.this), 2);
        }
    }

    ()
    {
        this$0 = BoardCollaboratorsDialog.this;
        super();
    }
}
