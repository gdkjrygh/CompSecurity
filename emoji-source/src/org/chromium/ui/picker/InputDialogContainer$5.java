// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.chromium.ui.picker;

import android.content.DialogInterface;

// Referenced classes of package org.chromium.ui.picker:
//            InputDialogContainer

class this._cls0
    implements android.content.ssListener
{

    final InputDialogContainer this$0;

    public void onDismiss(DialogInterface dialoginterface)
    {
        if (!InputDialogContainer.access$100(InputDialogContainer.this))
        {
            InputDialogContainer.access$102(InputDialogContainer.this, true);
            InputDialogContainer.access$000(InputDialogContainer.this).cancelDateTimeDialog();
        }
    }

    putActionDelegate()
    {
        this$0 = InputDialogContainer.this;
        super();
    }
}
