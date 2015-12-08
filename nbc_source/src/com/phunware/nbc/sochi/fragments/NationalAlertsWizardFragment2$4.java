// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.phunware.nbc.sochi.fragments;

import android.view.View;
import android.widget.Button;
import android.widget.Checkable;
import java.util.List;

// Referenced classes of package com.phunware.nbc.sochi.fragments:
//            NationalAlertsWizardFragment2

class this._cls0
    implements android.view.tsWizardFragment2._cls4
{

    final NationalAlertsWizardFragment2 this$0;

    public void onClick(View view)
    {
        ((Checkable)view).toggle();
        if (((Checkable)view).isChecked())
        {
            NationalAlertsWizardFragment2.access$000(NationalAlertsWizardFragment2.this).add((air.com.nbcuni.com.nbcsports.liveextra.DmaModel.RsnDma)view.getTag());
        } else
        {
            NationalAlertsWizardFragment2.access$000(NationalAlertsWizardFragment2.this).remove((air.com.nbcuni.com.nbcsports.liveextra.DmaModel.RsnDma)view.getTag());
        }
        if (NationalAlertsWizardFragment2.access$000(NationalAlertsWizardFragment2.this).size() > 0)
        {
            NationalAlertsWizardFragment2.access$300(NationalAlertsWizardFragment2.this).setVisibility(0);
            NationalAlertsWizardFragment2.access$300(NationalAlertsWizardFragment2.this).setEnabled(true);
            return;
        } else
        {
            NationalAlertsWizardFragment2.access$300(NationalAlertsWizardFragment2.this).setVisibility(8);
            NationalAlertsWizardFragment2.access$300(NationalAlertsWizardFragment2.this).setEnabled(false);
            return;
        }
    }

    ty.RsnDmaModel.RsnDma()
    {
        this$0 = NationalAlertsWizardFragment2.this;
        super();
    }
}
