// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.chat;

import android.content.DialogInterface;
import com.skype.Transfer;

// Referenced classes of package com.skype.android.app.chat:
//            CancelTransferDialog

final class this._cls0
    implements android.content.Listener
{

    final CancelTransferDialog this$0;

    public final void onClick(DialogInterface dialoginterface, int i)
    {
        if (i == -1)
        {
            CancelTransferDialog.access$000(CancelTransferDialog.this).cancel();
        }
    }

    ()
    {
        this$0 = CancelTransferDialog.this;
        super();
    }
}
