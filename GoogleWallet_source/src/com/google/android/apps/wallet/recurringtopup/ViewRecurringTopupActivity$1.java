// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.recurringtopup;

import android.content.DialogInterface;

// Referenced classes of package com.google.android.apps.wallet.recurringtopup:
//            ViewRecurringTopupActivity

final class this._cls0
    implements android.content.er
{

    final ViewRecurringTopupActivity this$0;

    public final void onClick(DialogInterface dialoginterface, int i)
    {
        if (i == -1)
        {
            onCancelAll();
        }
    }

    ()
    {
        this$0 = ViewRecurringTopupActivity.this;
        super();
    }
}
