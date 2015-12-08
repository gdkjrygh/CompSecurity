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
//            ReportPinDialog, ReportReasonAdapter

class this._cls0
    implements android.widget.ClickListener
{

    final ReportPinDialog this$0;

    public void onItemClick(AdapterView adapterview, View view, int i, long l)
    {
        if (ReportPinDialog.access$000(ReportPinDialog.this) == null) goto _L2; else goto _L1
_L1:
        ReportPinDialog.access$000(ReportPinDialog.this).setCheckedIndex(i);
        i;
        JVM INSTR tableswitch 5 7: default 48
    //                   5 96
    //                   6 48
    //                   7 117;
           goto _L3 _L4 _L3 _L5
_L3:
        adapterview = (String)ReportPinDialog.access$000(ReportPinDialog.this).getItem(i);
        ReportPinDialog.access$200(ReportPinDialog.this, adapterview);
        if (ReportPinDialog.access$300(ReportPinDialog.this))
        {
            ReportPinDialog.access$400(ReportPinDialog.this);
        }
_L2:
        dismiss();
        return;
_L4:
        Events.post(new Navigation(Location.BROWSER, Resources.string(0x7f070742)));
        continue; /* Loop/switch isn't completed */
_L5:
        ReportPinDialog.access$100(ReportPinDialog.this);
        if (true) goto _L2; else goto _L6
_L6:
    }

    r()
    {
        this$0 = ReportPinDialog.this;
        super();
    }
}
