// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.phunware.nbc.sochi.fragments;

import android.content.DialogInterface;
import com.phunware.nbc.sochi.MainNavigationContentActivity;

// Referenced classes of package com.phunware.nbc.sochi.fragments:
//            LocationDisabledDialogFragment

class this._cls0
    implements android.content.DialogFragment._cls1
{

    final LocationDisabledDialogFragment this$0;

    public void onClick(DialogInterface dialoginterface, int i)
    {
        ((MainNavigationContentActivity)getActivity()).showNationalAlertsWizard();
    }

    ()
    {
        this$0 = LocationDisabledDialogFragment.this;
        super();
    }
}
