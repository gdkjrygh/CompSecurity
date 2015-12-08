// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.phunware.nbc.sochi.fragments;

import android.util.Pair;
import android.view.View;
import com.phunware.nbc.sochi.data.AlertOptionAdapter;
import java.util.List;

// Referenced classes of package com.phunware.nbc.sochi.fragments:
//            NationalAlertsWizardFragment3

class this._cls0
    implements android.view.tsWizardFragment3._cls3
{

    final NationalAlertsWizardFragment3 this$0;

    public void onClick(View view)
    {
        view = NationalAlertsWizardFragment3.access$000(NationalAlertsWizardFragment3.this).getSelectedAlertOptions();
        if (NationalAlertsWizardFragment3.access$100(NationalAlertsWizardFragment3.this))
        {
            NationalAlertsWizardFragment3.access$200(NationalAlertsWizardFragment3.this).onNationalAlertOptionsChosen((List)((Pair) (view)).first, (List)((Pair) (view)).second);
            return;
        } else
        {
            NationalAlertsWizardFragment3.access$200(NationalAlertsWizardFragment3.this).onRegionalAlertOptionsChosen((List)((Pair) (view)).first, (List)((Pair) (view)).second);
            return;
        }
    }

    WizardCallback3()
    {
        this$0 = NationalAlertsWizardFragment3.this;
        super();
    }
}
