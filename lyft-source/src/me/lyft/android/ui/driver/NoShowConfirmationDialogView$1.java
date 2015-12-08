// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.driver;

import android.view.View;
import me.lyft.android.common.DialogFlow;

// Referenced classes of package me.lyft.android.ui.driver:
//            NoShowConfirmationDialogView

class this._cls0
    implements android.view.DialogView._cls1
{

    final NoShowConfirmationDialogView this$0;

    public void onClick(View view)
    {
        dialogFlow.dismiss();
        NoShowConfirmationDialogView.access$000(NoShowConfirmationDialogView.this);
    }

    ()
    {
        this$0 = NoShowConfirmationDialogView.this;
        super();
    }
}
