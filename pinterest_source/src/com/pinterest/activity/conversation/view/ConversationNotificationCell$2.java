// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.conversation.view;

import android.view.View;
import android.widget.AdapterView;
import com.pinterest.activity.conversation.HideConversationTask;
import com.pinterest.activity.report.BlockConversationUserDialog;
import com.pinterest.activity.report.ReportConversationDialog;
import com.pinterest.activity.task.dialog.BaseDialog;
import com.pinterest.activity.task.event.DialogEvent;
import com.pinterest.api.model.Conversation;
import com.pinterest.base.Events;

// Referenced classes of package com.pinterest.activity.conversation.view:
//            ConversationNotificationCell

class val.dialog
    implements android.widget.
{

    final ConversationNotificationCell this$0;
    final Conversation val$conversation;
    final BaseDialog val$dialog;

    public void onItemClick(AdapterView adapterview, View view, int i, long l)
    {
        i;
        JVM INSTR tableswitch 0 2: default 28
    //                   0 36
    //                   1 53
    //                   2 80;
           goto _L1 _L2 _L3 _L4
_L1:
        val$dialog.dismiss();
        return;
_L2:
        (new HideConversationTask(val$conversation)).execute();
        continue; /* Loop/switch isn't completed */
_L3:
        Events.post(new DialogEvent(new ReportConversationDialog(val$conversation.getUid())));
        continue; /* Loop/switch isn't completed */
_L4:
        adapterview = new BlockConversationUserDialog();
        adapterview.setConversation(val$conversation);
        Events.post(new DialogEvent(adapterview));
        if (true) goto _L1; else goto _L5
_L5:
    }

    ()
    {
        this$0 = final_conversationnotificationcell;
        val$conversation = conversation1;
        val$dialog = BaseDialog.this;
        super();
    }
}
