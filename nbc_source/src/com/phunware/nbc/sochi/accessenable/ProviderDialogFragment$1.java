// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.phunware.nbc.sochi.accessenable;

import android.view.View;
import android.widget.AdapterView;
import com.adobe.adobepass.accessenabler.models.Mvpd;

// Referenced classes of package com.phunware.nbc.sochi.accessenable:
//            ProviderDialogFragment, SelectProviderActivity

class this._cls0
    implements android.widget.stener
{

    final ProviderDialogFragment this$0;

    public void onItemClick(AdapterView adapterview, View view, int i, long l)
    {
        ((SelectProviderActivity)getActivity()).setSelectedMvpd((Mvpd)adapterview.getItemAtPosition(i));
        dismiss();
    }

    ()
    {
        this$0 = ProviderDialogFragment.this;
        super();
    }
}
