// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.phunware.nbc.sochi.fragments;

import android.view.View;
import java.util.List;

// Referenced classes of package com.phunware.nbc.sochi.fragments:
//            NationalAlertsWizardFragment2

class this._cls0
    implements android.view.tsWizardFragment2._cls3
{

    final NationalAlertsWizardFragment2 this$0;

    public void onClick(View view)
    {
        NationalAlertsWizardFragment2.access$000(NationalAlertsWizardFragment2.this).add(NationalAlertsWizardFragment2.access$200(NationalAlertsWizardFragment2.this).matchingRsns.get(0));
        NationalAlertsWizardFragment2.access$100(NationalAlertsWizardFragment2.this).onRsnDmasChosen(NationalAlertsWizardFragment2.access$000(NationalAlertsWizardFragment2.this));
    }

    WizardCallback2()
    {
        this$0 = NationalAlertsWizardFragment2.this;
        super();
    }
}
