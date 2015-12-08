// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.board.adapter;

import com.pinterest.api.model.Feed;

// Referenced classes of package com.pinterest.activity.board.adapter:
//            BoardCollaboratorInviteAdapter

class val.collaboratorNextPage
    implements Runnable
{

    final is._cls0 this$1;
    final Feed val$collaboratorNextPage;

    public void run()
    {
        setSpinnerState(false);
        BoardCollaboratorInviteAdapter.access$500(_fld0).appendItems(val$collaboratorNextPage);
        notifyDataSetChanged();
        BoardCollaboratorInviteAdapter.access$602(_fld0, false);
    }

    ()
    {
        this$1 = final_;
        val$collaboratorNextPage = Feed.this;
        super();
    }
}
