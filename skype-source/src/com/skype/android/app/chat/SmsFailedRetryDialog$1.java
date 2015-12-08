// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.chat;

import android.content.DialogInterface;
import com.skype.Sms;

// Referenced classes of package com.skype.android.app.chat:
//            SmsFailedRetryDialog

final class this._cls0
    implements android.content.Listener
{

    final SmsFailedRetryDialog this$0;

    public final void onClick(DialogInterface dialoginterface, int i)
    {
        SmsFailedRetryDialog.access$000(SmsFailedRetryDialog.this).send();
    }

    ()
    {
        this$0 = SmsFailedRetryDialog.this;
        super();
    }
}
