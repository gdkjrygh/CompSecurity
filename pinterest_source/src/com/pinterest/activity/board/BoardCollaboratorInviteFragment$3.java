// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.board;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import com.pinterest.activity.board.adapter.BoardCollaboratorInviteAdapter;
import com.pinterest.ui.ViewHelper;

// Referenced classes of package com.pinterest.activity.board:
//            BoardCollaboratorInviteFragment

class this._cls0
    implements TextWatcher
{

    final BoardCollaboratorInviteFragment this$0;

    public void afterTextChanged(Editable editable)
    {
    }

    public void beforeTextChanged(CharSequence charsequence, int i, int j, int k)
    {
    }

    public void onTextChanged(CharSequence charsequence, int i, int j, int k)
    {
        if (charsequence != null)
        {
            BoardCollaboratorInviteFragment.access$000(BoardCollaboratorInviteFragment.this).onSearchQueryChanged(charsequence.toString());
        }
        android.widget.TextView textview = _reminderTv;
        boolean flag;
        if (!TextUtils.isEmpty(charsequence))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        ViewHelper.setVisibility(textview, flag);
    }

    pter()
    {
        this$0 = BoardCollaboratorInviteFragment.this;
        super();
    }
}
