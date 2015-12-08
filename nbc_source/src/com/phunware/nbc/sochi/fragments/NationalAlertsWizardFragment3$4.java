// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.phunware.nbc.sochi.fragments;

import android.view.View;
import android.widget.ExpandableListAdapter;
import android.widget.ExpandableListView;
import com.phunware.nbc.sochi.content.AlertOption;
import java.util.List;

// Referenced classes of package com.phunware.nbc.sochi.fragments:
//            NationalAlertsWizardFragment3

class this._cls0
    implements android.widget.istener
{

    final NationalAlertsWizardFragment3 this$0;

    public boolean onGroupClick(ExpandableListView expandablelistview, View view, int i, long l)
    {
        expandablelistview = ((ExpandableListView) (expandablelistview.getExpandableListAdapter().getGroup(i)));
        if (expandablelistview instanceof AlertOption)
        {
            expandablelistview = (AlertOption)expandablelistview;
            if (expandablelistview.getSubsections() == null || expandablelistview.getSubsections().size() <= 0)
            {
                expandablelistview.toggleSelected();
            }
        }
        return false;
    }

    ()
    {
        this$0 = NationalAlertsWizardFragment3.this;
        super();
    }
}
