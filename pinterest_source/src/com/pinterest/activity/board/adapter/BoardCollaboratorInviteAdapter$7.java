// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.board.adapter;

import android.os.Bundle;
import com.facebook.FacebookException;
import com.facebook.FacebookOperationCanceledException;
import com.pinterest.api.remote.BoardApi;
import com.pinterest.base.Application;

// Referenced classes of package com.pinterest.activity.board.adapter:
//            BoardCollaboratorInviteAdapter

class val.inviteCode
    implements com.facebook.widget.rInviteAdapter._cls7
{

    final BoardCollaboratorInviteAdapter this$0;
    final String val$inviteCode;

    public void onComplete(Bundle bundle, FacebookException facebookexception)
    {
        if (facebookexception != null)
        {
            if (facebookexception instanceof FacebookOperationCanceledException)
            {
                Application.showToast(0x7f070095);
            } else
            {
                Application.showToast(facebookexception.getMessage());
            }
        } else
        {
            BoardApi.a(BoardCollaboratorInviteAdapter.access$300(BoardCollaboratorInviteAdapter.this), val$inviteCode, BoardCollaboratorInviteAdapter.access$400(BoardCollaboratorInviteAdapter.this));
        }
        resetSearchQuery();
    }

    ()
    {
        this$0 = final_boardcollaboratorinviteadapter;
        val$inviteCode = String.this;
        super();
    }
}
