// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.phunware.nbc.sochi.fragments;

import android.view.View;
import android.widget.ExpandableListAdapter;
import android.widget.ExpandableListView;
import com.phunware.nbc.sochi.content.AlertOption;
import com.phunware.nbc.sochi.data.AlertOptionAdapter;

// Referenced classes of package com.phunware.nbc.sochi.fragments:
//            NationalAlertsWizardFragment3

class this._cls0
    implements android.widget.istener
{

    final NationalAlertsWizardFragment3 this$0;

    public boolean onChildClick(ExpandableListView expandablelistview, View view, int i, int j, long l)
    {
        expandablelistview = ((ExpandableListView) (expandablelistview.getExpandableListAdapter().getChild(i, j)));
        if (expandablelistview instanceof AlertOption)
        {
            ((AlertOption)expandablelistview).toggleSelected();
        }
        NationalAlertsWizardFragment3.access$000(NationalAlertsWizardFragment3.this).notifyDataSetChanged();
        return false;
    }

    ()
    {
        this$0 = NationalAlertsWizardFragment3.this;
        super();
    }
}
