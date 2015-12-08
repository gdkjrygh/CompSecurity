// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.pin;

import android.content.DialogInterface;
import com.google.android.apps.wallet.userevents.UserEventLogger;

// Referenced classes of package com.google.android.apps.wallet.pin:
//            ResetPinDialog

final class this._cls0
    implements android.content.nCancelListener
{

    final ResetPinDialog this$0;

    public final void onCancel(DialogInterface dialoginterface)
    {
        ResetPinDialog.access$000(ResetPinDialog.this).log(30, 126);
    }

    ogger()
    {
        this$0 = ResetPinDialog.this;
        super();
    }
}
