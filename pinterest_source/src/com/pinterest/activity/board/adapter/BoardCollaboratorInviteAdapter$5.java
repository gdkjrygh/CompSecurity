// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.board.adapter;

import android.os.Handler;
import com.pinterest.activity.board.model.CollaboratorInviteFeed;
import com.pinterest.api.ApiResponse;
import com.pinterest.api.BaseApiResponseHandler;
import com.pinterest.api.model.ModelHelper;
import com.pinterest.network.json.PinterestJsonObject;

// Referenced classes of package com.pinterest.activity.board.adapter:
//            BoardCollaboratorInviteAdapter

class this._cls0 extends BaseApiResponseHandler
{

    final BoardCollaboratorInviteAdapter this$0;

    public void onFailure(Throwable throwable, ApiResponse apiresponse)
    {
        super.onFailure(throwable, apiresponse);
        class _cls2
            implements Runnable
        {

            final BoardCollaboratorInviteAdapter._cls5 this$1;

            public void run()
            {
                setSpinnerState(false);
            }

            _cls2()
            {
                this$1 = BoardCollaboratorInviteAdapter._cls5.this;
                super();
            }
        }

        BoardCollaboratorInviteAdapter.access$700(BoardCollaboratorInviteAdapter.this).post(new _cls2());
    }

    public void onSuccess(final PinterestJsonObject boardCollaborators)
    {
        super.onSuccess(boardCollaborators);
        BoardCollaboratorInviteAdapter.access$202(BoardCollaboratorInviteAdapter.this, ModelHelper.getBoard(BoardCollaboratorInviteAdapter.access$300(BoardCollaboratorInviteAdapter.this)));
        boardCollaborators = new CollaboratorInviteFeed(boardCollaborators, getBaseUrl(), BoardCollaboratorInviteAdapter.access$200(BoardCollaboratorInviteAdapter.this), true);
        class _cls1
            implements Runnable
        {

            final BoardCollaboratorInviteAdapter._cls5 this$1;
            final Feed val$boardCollaborators;

            public void run()
            {
                setSpinnerState(false);
                BoardCollaboratorInviteAdapter.access$502(this$0, boardCollaborators);
                notifyDataSetChanged();
            }

            _cls1()
            {
                this$1 = BoardCollaboratorInviteAdapter._cls5.this;
                boardCollaborators = feed;
                super();
            }
        }

        BoardCollaboratorInviteAdapter.access$700(BoardCollaboratorInviteAdapter.this).post(new _cls1());
    }

    _cls1()
    {
        this$0 = BoardCollaboratorInviteAdapter.this;
        super();
    }
}
