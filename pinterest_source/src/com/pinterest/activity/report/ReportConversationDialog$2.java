// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.report;

import android.view.View;
import android.widget.AdapterView;

// Referenced classes of package com.pinterest.activity.report:
//            ReportConversationDialog, ReportReasonAdapter

class this._cls0
    implements android.widget.ener
{

    final ReportConversationDialog this$0;

    public void onItemClick(AdapterView adapterview, View view, int i, long l)
    {
        if (ReportConversationDialog.access$000(ReportConversationDialog.this) != null)
        {
            ReportConversationDialog.access$000(ReportConversationDialog.this).setCheckedIndex(i);
            adapterview = (String)ReportConversationDialog.access$000(ReportConversationDialog.this).getItem(i);
            ReportConversationDialog.access$100(ReportConversationDialog.this, adapterview);
        }
        dismiss();
    }

    ()
    {
        this$0 = ReportConversationDialog.this;
        super();
    }
}
