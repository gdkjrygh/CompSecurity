// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.phunware.nbc.sochi.fragments;

import android.view.View;

// Referenced classes of package com.phunware.nbc.sochi.fragments:
//            NationalAlertsWizardFragment1

class this._cls0
    implements android.view.tsWizardFragment1._cls1
{

    final NationalAlertsWizardFragment1 this$0;

    public void onClick(View view)
    {
        if (NationalAlertsWizardFragment1.access$000(NationalAlertsWizardFragment1.this))
        {
            NationalAlertsWizardFragment1.access$100(NationalAlertsWizardFragment1.this).onCloseClicked();
            return;
        } else
        {
            NationalAlertsWizardFragment1.access$100(NationalAlertsWizardFragment1.this).onNextClicked();
            return;
        }
    }

    WizardCallback1()
    {
        this$0 = NationalAlertsWizardFragment1.this;
        super();
    }
}
