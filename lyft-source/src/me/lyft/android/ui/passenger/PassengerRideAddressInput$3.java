// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.passenger;

import android.view.View;
import rx.subjects.PublishSubject;

// Referenced classes of package me.lyft.android.ui.passenger:
//            PassengerRideAddressInput

class this._cls0
    implements android.view.eAddressInput._cls3
{

    final PassengerRideAddressInput this$0;

    public void onFocusChange(View view, boolean flag)
    {
        if (flag)
        {
            PassengerRideAddressInput.access$100(PassengerRideAddressInput.this);
            PassengerRideAddressInput.access$200(PassengerRideAddressInput.this).onNext(view);
        }
    }

    ()
    {
        this$0 = PassengerRideAddressInput.this;
        super();
    }
}
