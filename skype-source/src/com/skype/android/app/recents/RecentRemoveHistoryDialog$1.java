// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.recents;

import android.content.DialogInterface;
import android.widget.CheckBox;
import com.skype.Conversation;
import com.skype.android.analytics.Analytics;
import com.skype.android.analytics.LogAttributeName;
import com.skype.android.analytics.LogEvent;
import com.skype.android.analytics.SkypeTelemetryEvent;
import com.skype.android.util.TimeUtil;
import java.util.ArrayList;

// Referenced classes of package com.skype.android.app.recents:
//            RecentRemoveHistoryDialog

final class val.leaveConvCheckBox
    implements android.content.ner
{

    final RecentRemoveHistoryDialog this$0;
    final CheckBox val$leaveConvCheckBox;

    public final void onClick(DialogInterface dialoginterface, int i)
    {
        RecentRemoveHistoryDialog.access$002(RecentRemoveHistoryDialog.this, false);
        dialoginterface = new SkypeTelemetryEvent(LogEvent.c);
        int j = 0;
        while (j < RecentRemoveHistoryDialog.access$100(RecentRemoveHistoryDialog.this).size()) 
        {
            Conversation conversation = (Conversation)RecentRemoveHistoryDialog.access$100(RecentRemoveHistoryDialog.this).get(j);
            if (conversation.getTypeProp() != com.skype.moveHistoryDialog)
            {
                if (val$leaveConvCheckBox.isChecked())
                {
                    conversation.retireFrom();
                    conversation.unPin();
                    dialoginterface.put(LogAttributeName.ah, Boolean.valueOf(true));
                } else
                {
                    dialoginterface.put(LogAttributeName.ah, Boolean.valueOf(false));
                }
            }
            if (i == -1)
            {
                conversation.setConsumedHorizon((int)TimeUtil.a(), true);
                conversation.delete();
                dialoginterface.put(LogAttributeName.ag, "DELETE");
            } else
            if (i == -2)
            {
                conversation.setConsumedHorizon((int)TimeUtil.a(), true);
                conversation.removeFromInbox();
                dialoginterface.put(LogAttributeName.ag, "HIDE");
            }
            analytics.a(dialoginterface);
            j++;
        }
    }

    ()
    {
        this$0 = final_recentremovehistorydialog;
        val$leaveConvCheckBox = CheckBox.this;
        super();
    }
}
