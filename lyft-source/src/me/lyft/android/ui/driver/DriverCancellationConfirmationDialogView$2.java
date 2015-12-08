// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.driver;

import android.view.View;
import me.lyft.android.infrastructure.lyft.constants.CancellationOption;

// Referenced classes of package me.lyft.android.ui.driver:
//            DriverCancellationConfirmationDialogView

class val.cancellationOption
    implements android.view.DialogView._cls2
{

    final DriverCancellationConfirmationDialogView this$0;
    final CancellationOption val$cancellationOption;

    public void onClick(View view)
    {
        DriverCancellationConfirmationDialogView.access$000(DriverCancellationConfirmationDialogView.this, val$cancellationOption);
    }

    ()
    {
        this$0 = final_drivercancellationconfirmationdialogview;
        val$cancellationOption = CancellationOption.this;
        super();
    }
}
