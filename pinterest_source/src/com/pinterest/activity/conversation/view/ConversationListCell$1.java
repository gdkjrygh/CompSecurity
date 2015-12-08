// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.conversation.view;

import android.view.View;
import com.pinterest.base.Application;
import com.pinterest.base.Device;

// Referenced classes of package com.pinterest.activity.conversation.view:
//            ConversationListCell

class val.text
    implements android.view.r
{

    final ConversationListCell this$0;
    final String val$text;

    public boolean onLongClick(View view)
    {
        Device.copyToClipboard(view.getContext(), val$text);
        Application.showToast(0x7f070588);
        return true;
    }

    ()
    {
        this$0 = final_conversationlistcell;
        val$text = String.this;
        super();
    }
}
