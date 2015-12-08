// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.board.view;

import android.widget.TextView;
import com.pinterest.api.model.Board;
import com.pinterest.api.model.Feed;
import com.pinterest.api.model.UserFeed;

// Referenced classes of package com.pinterest.activity.board.view:
//            BoardHeaderView

class  extends com.pinterest.api.remote.iResponse
{

    final BoardHeaderView this$0;

    public void onSuccess(Feed feed)
    {
        super.onSuccess(feed);
        if (BoardHeaderView.access$000(BoardHeaderView.this).getUser() != null)
        {
            feed.appendItem(BoardHeaderView.access$000(BoardHeaderView.this).getUser());
        }
        TextView textview = _infoTv;
        int i;
        if (BoardHeaderView.access$000(BoardHeaderView.this).allowToInviteOthers())
        {
            i = 0x7f070040;
        } else
        {
            i = 0x7f0700a3;
        }
        textview.setText(i);
        BoardHeaderView.access$100(BoardHeaderView.this, (UserFeed)feed);
    }

    ()
    {
        this$0 = BoardHeaderView.this;
        super();
    }
}
