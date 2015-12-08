// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.phunware.nbc.sochi.fragments;

import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ExpandableListView;
import com.phunware.nbc.sochi.content.AlertOption;
import java.util.List;

// Referenced classes of package com.phunware.nbc.sochi.fragments:
//            NationalAlertsWizardFragment3

class this._cls0
    implements android.widget.WizardFragment3._cls6
{

    final NationalAlertsWizardFragment3 this$0;

    public void onItemClick(AdapterView adapterview, View view, int i, long l)
    {
label0:
        {
            adapterview = ((AdapterView) (adapterview.getAdapter().getItem(i)));
            if (adapterview instanceof AlertOption)
            {
                adapterview = (AlertOption)adapterview;
                if (adapterview.getSubsections() == null || adapterview.getSubsections().size() <= 0)
                {
                    break label0;
                }
            }
            return;
        }
        NationalAlertsWizardFragment3.access$300(NationalAlertsWizardFragment3.this).setItemChecked(i, true);
    }

    ()
    {
        this$0 = NationalAlertsWizardFragment3.this;
        super();
    }
}
