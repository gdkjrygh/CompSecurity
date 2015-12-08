// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.dialogs;

import android.view.View;
import android.widget.AdapterView;
import me.lyft.android.common.DialogFlow;

// Referenced classes of package me.lyft.android.ui.dialogs:
//            AlertDialogView

class this._cls0
    implements android.widget.ClickListener
{

    final AlertDialogView this$0;

    public void onItemClick(AdapterView adapterview, View view, int i, long l)
    {
        dialogFlow.dismiss();
        onResult(-1, i, false);
    }

    r()
    {
        this$0 = AlertDialogView.this;
        super();
    }
}
