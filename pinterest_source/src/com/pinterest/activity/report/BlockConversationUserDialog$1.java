// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.report;

import android.view.View;
import com.pinterest.activity.conversation.HideConversationTask;
import com.pinterest.activity.conversation.view.BlockConversationUserAdapter;
import com.pinterest.api.ApiResponseHandler;
import com.pinterest.api.model.User;
import com.pinterest.api.remote.UserApi;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.pinterest.activity.report:
//            BlockConversationUserDialog

class this._cls0
    implements android.view.tionUserDialog._cls1
{

    final BlockConversationUserDialog this$0;

    public void onClick(View view)
    {
        view = BlockConversationUserDialog.access$000(BlockConversationUserDialog.this).getSelectedUsers();
        if (view != null && !view.isEmpty())
        {
            for (view = BlockConversationUserDialog.access$000(BlockConversationUserDialog.this).getSelectedUsers().iterator(); view.hasNext(); UserApi.i(((User)view.next()).getUid(), new ApiResponseHandler(), null)) { }
            (new HideConversationTask(BlockConversationUserDialog.access$100(BlockConversationUserDialog.this))).execute();
        }
        dismiss();
    }

    erAdapter()
    {
        this$0 = BlockConversationUserDialog.this;
        super();
    }
}
