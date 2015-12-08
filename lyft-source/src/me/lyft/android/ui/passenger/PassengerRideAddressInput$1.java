// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.passenger;

import android.view.View;
import me.lyft.android.common.Unit;
import rx.subjects.PublishSubject;

// Referenced classes of package me.lyft.android.ui.passenger:
//            PassengerRideAddressInput

class this._cls0
    implements android.view.eAddressInput._cls1
{

    final PassengerRideAddressInput this$0;

    public void onClick(View view)
    {
        PassengerRideAddressInput.access$000(PassengerRideAddressInput.this).onNext(Unit.create());
    }

    ()
    {
        this$0 = PassengerRideAddressInput.this;
        super();
    }
}
