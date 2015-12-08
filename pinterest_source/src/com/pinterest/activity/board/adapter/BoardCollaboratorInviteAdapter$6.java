// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.board.adapter;

import android.os.Bundle;
import com.facebook.Session;
import com.facebook.SessionState;

// Referenced classes of package com.pinterest.activity.board.adapter:
//            BoardCollaboratorInviteAdapter

class val.params
    implements com.facebook.aboratorInviteAdapter._cls6
{

    final BoardCollaboratorInviteAdapter this$0;
    final String val$inviteCode;
    final Bundle val$params;

    public void call(Session session, SessionState sessionstate, Exception exception)
    {
        if (session.isOpened())
        {
            BoardCollaboratorInviteAdapter.access$800(BoardCollaboratorInviteAdapter.this, val$inviteCode, val$params);
        }
    }

    ()
    {
        this$0 = final_boardcollaboratorinviteadapter;
        val$inviteCode = s;
        val$params = Bundle.this;
        super();
    }
}
