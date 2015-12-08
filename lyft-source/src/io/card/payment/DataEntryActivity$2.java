// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package io.card.payment;

import android.view.View;

// Referenced classes of package io.card.payment:
//            DataEntryActivity, CardIOActivity

class this._cls0
    implements android.view.
{

    final DataEntryActivity this$0;

    public void onClick(View view)
    {
        setResult(CardIOActivity.RESULT_ENTRY_CANCELED);
        finish();
    }

    ()
    {
        this$0 = DataEntryActivity.this;
        super();
    }
}
