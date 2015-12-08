// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.payments.error;

import android.content.DialogInterface;

// Referenced classes of package com.soundcloud.android.payments.error:
//            ConnectionErrorDialog

class this._cls0
    implements android.content.istener
{

    final ConnectionErrorDialog this$0;

    public void onClick(DialogInterface dialoginterface, int i)
    {
        dismiss();
    }

    ()
    {
        this$0 = ConnectionErrorDialog.this;
        super();
    }
}
