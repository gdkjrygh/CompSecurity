// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.board.adapter;

import android.view.View;
import com.pinterest.activity.board.dialog.RemoveCollaboratorDialog;
import com.pinterest.analytics.Pinalytics;
import com.pinterest.api.model.User;
import com.pinterest.schemas.event.ComponentType;
import com.pinterest.schemas.event.ElementType;

// Referenced classes of package com.pinterest.activity.board.adapter:
//            BoardCollaboratorInviteAdapter

class val.dialog
    implements android.view.aboratorInviteAdapter._cls8
{

    final BoardCollaboratorInviteAdapter this$0;
    final RemoveCollaboratorDialog val$dialog;
    final User val$invitedUser;

    public void onClick(View view)
    {
        Pinalytics.a(ElementType.REMOVE_BUTTON, ComponentType.MODAL_DIALOG);
        removeCollaborator(val$invitedUser, val$dialog.isBlockedCbChecked());
        val$dialog.dismiss();
    }

    ()
    {
        this$0 = final_boardcollaboratorinviteadapter;
        val$invitedUser = user;
        val$dialog = RemoveCollaboratorDialog.this;
        super();
    }
}
