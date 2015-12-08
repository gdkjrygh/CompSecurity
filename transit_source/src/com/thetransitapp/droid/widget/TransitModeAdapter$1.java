// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.thetransitapp.droid.widget;

import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.View;
import com.thetransitapp.droid.LegalScreen;

// Referenced classes of package com.thetransitapp.droid.widget:
//            TransitModeAdapter

class this._cls0
    implements android.view.nsitModeAdapter._cls1
{

    final TransitModeAdapter this$0;

    public void onClick(View view)
    {
        if (TransitModeAdapter.access$2(TransitModeAdapter.this) != null)
        {
            view = new LegalScreen();
            FragmentTransaction fragmenttransaction = TransitModeAdapter.access$2(TransitModeAdapter.this).beginTransaction();
            fragmenttransaction.replace(0x7f05003a, view, com.thetransitapp.droid.itScreen.LEGAL_SCREEN.name());
            fragmenttransaction.addToBackStack(com.thetransitapp.droid.itScreen.LEGAL_SCREEN.name());
            fragmenttransaction.commit();
        }
    }

    n()
    {
        this$0 = TransitModeAdapter.this;
        super();
    }
}
