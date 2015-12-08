// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.phunware.nbc.sochi.accessenable;

import android.view.View;
import com.adobe.adobepass.accessenabler.models.Mvpd;
import java.util.ArrayList;

// Referenced classes of package com.phunware.nbc.sochi.accessenable:
//            SelectProviderFragment

class val.position
    implements android.view.lectProviderFragment._cls2
{

    final SelectProviderFragment this$0;
    final ArrayList val$finalListOfPremium;
    final int val$position;

    public void onClick(View view)
    {
        SelectProviderFragment.access$000(SelectProviderFragment.this, (Mvpd)val$finalListOfPremium.get(val$position));
    }

    ()
    {
        this$0 = final_selectproviderfragment;
        val$finalListOfPremium = arraylist;
        val$position = I.this;
        super();
    }
}
