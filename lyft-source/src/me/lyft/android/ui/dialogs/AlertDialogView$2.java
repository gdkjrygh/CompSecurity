// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.dialogs;

import android.view.View;
import android.widget.Button;
import me.lyft.android.common.DialogFlow;

// Referenced classes of package me.lyft.android.ui.dialogs:
//            AlertDialogView

class val.button
    implements android.view.er
{

    final AlertDialogView this$0;
    final Button val$button;

    public void onClick(View view)
    {
        dialogFlow.dismiss();
        onResult(val$button.getId(), -1, false);
    }

    ()
    {
        this$0 = final_alertdialogview;
        val$button = Button.this;
        super();
    }
}
