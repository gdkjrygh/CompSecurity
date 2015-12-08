// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.board.adapter;

import com.pinterest.api.model.Feed;

// Referenced classes of package com.pinterest.activity.board.adapter:
//            BoardCollaboratorInviteAdapter

class val.boardCollaborators
    implements Runnable
{

    final fyDataSetChanged this$1;
    final Feed val$boardCollaborators;

    public void run()
    {
        setSpinnerState(false);
        BoardCollaboratorInviteAdapter.access$502(_fld0, val$boardCollaborators);
        notifyDataSetChanged();
    }

    ()
    {
        this$1 = final_;
        val$boardCollaborators = Feed.this;
        super();
    }
}
