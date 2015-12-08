// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.pin;

import android.content.DialogInterface;

// Referenced classes of package com.google.android.apps.wallet.pin:
//            PinTimeoutFragment

final class this._cls0
    implements android.content.ckListener
{

    final PinTimeoutFragment this$0;

    public final void onClick(DialogInterface dialoginterface, int i)
    {
        if (i >= 0)
        {
            PinTimeoutFragment.access$200(PinTimeoutFragment.this, dialoginterface, PinTimeoutFragment.access$100(PinTimeoutFragment.this)[i]);
        }
    }

    ()
    {
        this$0 = PinTimeoutFragment.this;
        super();
    }
}
