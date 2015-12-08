// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.driver;

import android.view.View;
import me.lyft.android.common.DialogFlow;

// Referenced classes of package me.lyft.android.ui.driver:
//            DriverCourierPickupView

class this._cls0
    implements android.view.PickupView._cls4
{

    final DriverCourierPickupView this$0;

    public void onClick(View view)
    {
        dialogFlow.show(new nfirmationDialog(DriverCourierPickupView.access$000(DriverCourierPickupView.this)));
    }

    nfirmationDialog()
    {
        this$0 = DriverCourierPickupView.this;
        super();
    }
}
