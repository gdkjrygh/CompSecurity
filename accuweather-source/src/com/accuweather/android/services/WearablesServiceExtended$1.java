// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.accuweather.android.services;

import android.content.Intent;
import android.util.Log;
import com.accuweather.android.TermsAndConditionsActivity;

// Referenced classes of package com.accuweather.android.services:
//            WearablesServiceExtended

class this._cls0
    implements Runnable
{

    final WearablesServiceExtended this$0;

    public void run()
    {
        Log.i("WearablesService", "Start activity run");
        Intent intent = new Intent(WearablesServiceExtended.this, com/accuweather/android/TermsAndConditionsActivity);
        intent.addFlags(0x10000000);
        startActivity(intent);
    }

    A()
    {
        this$0 = WearablesServiceExtended.this;
        super();
    }
}
