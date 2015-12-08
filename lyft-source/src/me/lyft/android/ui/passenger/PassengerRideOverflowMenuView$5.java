// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.passenger;

import android.view.View;
import me.lyft.android.common.DialogFlow;

// Referenced classes of package me.lyft.android.ui.passenger:
//            PassengerRideOverflowMenuView

class this._cls0
    implements android.view.rflowMenuView._cls5
{

    final PassengerRideOverflowMenuView this$0;

    public void onClick(View view)
    {
        dialogFlow.dismiss(me/lyft/android/ui/passenger/PassengerDialogs$PassengerRideOverflowMenuScreen);
        dialogFlow.show(me.lyft.android.ui.splitfare.Dialog.create(getResources(), splitFareStateRepository));
    }

    Dialog()
    {
        this$0 = PassengerRideOverflowMenuView.this;
        super();
    }
}
