// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.phunware.nbc.sochi.fragments;

import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import java.util.List;

// Referenced classes of package com.phunware.nbc.sochi.fragments:
//            NationalAlertsWizardFragment2

class this._cls0
    implements android.widget.WizardFragment2._cls5
{

    final NationalAlertsWizardFragment2 this$0;

    public void onItemClick(AdapterView adapterview, View view, int i, long l)
    {
        adapterview = ((AdapterView) (adapterview.getAdapter().getItem(i)));
        if (adapterview instanceof air.com.nbcuni.com.nbcsports.liveextra.DmaModel.RsnDma)
        {
            NationalAlertsWizardFragment2.access$000(NationalAlertsWizardFragment2.this).clear();
            NationalAlertsWizardFragment2.access$000(NationalAlertsWizardFragment2.this).add((air.com.nbcuni.com.nbcsports.liveextra.DmaModel.RsnDma)adapterview);
            NationalAlertsWizardFragment2.access$100(NationalAlertsWizardFragment2.this).onRsnDmasChosen(NationalAlertsWizardFragment2.access$000(NationalAlertsWizardFragment2.this));
            return;
        } else
        {
            NationalAlertsWizardFragment2.access$100(NationalAlertsWizardFragment2.this).onNoneOfTheseClicked();
            return;
        }
    }

    WizardCallback2()
    {
        this$0 = NationalAlertsWizardFragment2.this;
        super();
    }
}
