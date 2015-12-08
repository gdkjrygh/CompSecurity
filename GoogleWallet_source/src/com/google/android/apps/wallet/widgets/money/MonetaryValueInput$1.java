// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.widgets.money;

import android.view.View;

// Referenced classes of package com.google.android.apps.wallet.widgets.money:
//            MonetaryValueInput

final class this._cls0
    implements android.view.tener
{

    final MonetaryValueInput this$0;

    public final void onFocusChange(View view, boolean flag)
    {
        if (!flag && getText().toString().length() > 0)
        {
            formatAmount();
        }
    }

    ()
    {
        this$0 = MonetaryValueInput.this;
        super();
    }
}
