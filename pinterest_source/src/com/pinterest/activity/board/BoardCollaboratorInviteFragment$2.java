// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.board;

import com.pinterest.activity.board.event.ResetSearchQueryEvent;
import com.pinterest.ui.text.SearchEditText;

// Referenced classes of package com.pinterest.activity.board:
//            BoardCollaboratorInviteFragment

class this._cls0
    implements com.pinterest.base.ragment._cls2
{

    final BoardCollaboratorInviteFragment this$0;

    public void onEventMainThread(ResetSearchQueryEvent resetsearchqueryevent)
    {
        _searchEt.setText("");
    }

    ()
    {
        this$0 = BoardCollaboratorInviteFragment.this;
        super();
    }
}
