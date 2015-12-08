// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.pin;

import android.content.DialogInterface;

// Referenced classes of package com.google.android.apps.wallet.pin:
//            ChangeOrSetPinActivity

final class this._cls0
    implements android.content.stener
{

    final ChangeOrSetPinActivity this$0;

    public final void onClick(DialogInterface dialoginterface, int i)
    {
        if (i == -1)
        {
            setResult(0);
            finish();
        }
    }

    A()
    {
        this$0 = ChangeOrSetPinActivity.this;
        super();
    }
}
