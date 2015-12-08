// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.board.adapter;

import android.os.Handler;
import com.pinterest.activity.search.model.TypeAheadItem;
import com.pinterest.api.ApiResponse;
import com.pinterest.api.BaseApiResponseHandler;
import com.pinterest.kit.log.PLog;
import java.util.List;

// Referenced classes of package com.pinterest.activity.board.adapter:
//            BoardCollaboratorInviteAdapter

class query extends BaseApiResponseHandler
{

    private String query;
    final BoardCollaboratorInviteAdapter this$0;

    private void postDataOnUIThread(final List apiItems)
    {
        class _cls1
            implements Runnable
        {

            final BoardCollaboratorInviteAdapter.BoardCollaboratorsSuggestionHandler this$1;
            final List val$apiItems;

            public void run()
            {
                if (query.equalsIgnoreCase(BoardCollaboratorInviteAdapter.access$900(this$0)))
                {
                    if (apiItems.isEmpty())
                    {
                        TypeAheadItem typeaheaditem = new TypeAheadItem();
                        typeaheaditem.setUid("0");
                        typeaheaditem.setItemType(com.pinterest.activity.search.model.TypeAheadItem.ItemType.EMPTY_PLACEHOLDER);
                        typeaheaditem.setTitle(Resources.string(0x7f0703a0));
                        apiItems.add(typeaheaditem);
                    }
                    BoardCollaboratorInviteAdapter.access$1102(this$0, apiItems);
                    BoardCollaboratorInviteAdapter.access$1200(this$0);
                    notifyDataSetChanged();
                    setSpinnerState(false);
                }
            }

            _cls1()
            {
                this$1 = BoardCollaboratorInviteAdapter.BoardCollaboratorsSuggestionHandler.this;
                apiItems = list;
                super();
            }
        }

        BoardCollaboratorInviteAdapter.access$700(BoardCollaboratorInviteAdapter.this).post(new _cls1());
    }

    public void onFailure(Throwable throwable, ApiResponse apiresponse)
    {
        PLog.error(throwable, "BoardCollaboratorsSuggestionHandler failed with response %s", new Object[] {
            apiresponse
        });
        class _cls2
            implements Runnable
        {

            final BoardCollaboratorInviteAdapter.BoardCollaboratorsSuggestionHandler this$1;

            public void run()
            {
                setSpinnerState(false);
            }

            _cls2()
            {
                this$1 = BoardCollaboratorInviteAdapter.BoardCollaboratorsSuggestionHandler.this;
                super();
            }
        }

        BoardCollaboratorInviteAdapter.access$700(BoardCollaboratorInviteAdapter.this).post(new _cls2());
    }

    public void onSuccess(ApiResponse apiresponse)
    {
        if (query.equalsIgnoreCase(BoardCollaboratorInviteAdapter.access$900(BoardCollaboratorInviteAdapter.this)))
        {
            postDataOnUIThread(TypeAheadItem.parseData(apiresponse.getData()));
        }
    }


    public _cls2(String s)
    {
        this$0 = BoardCollaboratorInviteAdapter.this;
        super();
        query = s;
    }
}
