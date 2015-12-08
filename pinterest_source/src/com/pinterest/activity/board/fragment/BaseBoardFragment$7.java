// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.board.fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import com.pinterest.activity.board.view.BoardHeaderInviteView;
import com.pinterest.api.model.Board;
import com.pinterest.api.model.BoardInvite;
import com.pinterest.api.model.BoardInviteFeed;
import com.pinterest.api.model.ModelHelper;
import com.pinterest.api.model.User;
import com.pinterest.common.async.BackgroundTask;

// Referenced classes of package com.pinterest.activity.board.fragment:
//            BaseBoardFragment

class val.feed extends BackgroundTask
{

    BoardInvite invite;
    User inviter;
    final BaseBoardFragment this$0;
    final BoardInviteFeed val$feed;

    public void onFinish()
    {
        super.onFinish();
        View view = getView();
        if (view != null)
        {
            if (invite != null && invite.getStatus().equals("new"))
            {
                if (_inviteHeader == null)
                {
                    _inviteHeader = (BoardHeaderInviteView)LayoutInflater.from(view.getContext()).inflate(0x7f0301c0, BaseBoardFragment.access$500(BaseBoardFragment.this), false);
                    _inviteHeader.setApiTag(getApiTag());
                    BaseBoardFragment.access$500(BaseBoardFragment.this).addView(_inviteHeader);
                }
                _inviteHeader.setBoard(_board);
                _inviteHeader.setInviter(inviter);
                _inviteHeader.setVisibility(0);
                return;
            }
            if (_inviteHeader != null)
            {
                _inviteHeader.setVisibility(8);
                return;
            }
        }
    }

    public void run()
    {
        if (_board != null)
        {
            if (val$feed != null && val$feed.getCount() > 0)
            {
                invite = (BoardInvite)val$feed.get(0);
            } else
            {
                invite = ModelHelper.getBoardInviteAcceptable(_board.getUid());
            }
            if (invite != null)
            {
                inviter = ModelHelper.getUser(invite.getInviterUid());
            }
        }
    }

    ()
    {
        this$0 = final_baseboardfragment;
        val$feed = BoardInviteFeed.this;
        super();
    }
}
