// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.report;

import android.view.View;
import android.widget.AdapterView;
import com.pinterest.activity.task.model.Location;
import com.pinterest.activity.task.model.Navigation;
import com.pinterest.base.Events;
import com.pinterest.kit.application.Resources;

// Referenced classes of package com.pinterest.activity.report:
//            ReportUserDialog, ReportReasonAdapter

class this._cls0
    implements android.widget.lickListener
{

    final ReportUserDialog this$0;

    public void onItemClick(AdapterView adapterview, View view, int i, long l)
    {
        if (ReportUserDialog.access$000(ReportUserDialog.this) == null) goto _L2; else goto _L1
_L1:
        ReportUserDialog.access$000(ReportUserDialog.this).setCheckedIndex(i);
        i;
        JVM INSTR tableswitch 5 7: default 48
    //                   5 79
    //                   6 48
    //                   7 100;
           goto _L3 _L4 _L3 _L5
_L3:
        adapterview = (String)ReportUserDialog.access$000(ReportUserDialog.this).getItem(i);
        ReportUserDialog.access$200(ReportUserDialog.this, adapterview);
_L2:
        dismiss();
        return;
_L4:
        Events.post(new Navigation(Location.BROWSER, Resources.string(0x7f070742)));
        continue; /* Loop/switch isn't completed */
_L5:
        ReportUserDialog.access$100(ReportUserDialog.this);
        if (true) goto _L2; else goto _L6
_L6:
    }

    ()
    {
        this$0 = ReportUserDialog.this;
        super();
    }
}
