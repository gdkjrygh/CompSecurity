// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.tapandpay.ui;

import com.google.android.apps.wallet.util.async.ThreadPreconditions;

// Referenced classes of package com.google.android.apps.wallet.tapandpay.ui:
//            TapCompletedActivity

final class <init>
    implements Runnable
{

    final TapCompletedActivity this$0;

    public final void run()
    {
        ThreadPreconditions.checkOnUiThread();
        switch (com.google.android.apps.wallet.tapandpay.ui.TapCompletedActivity.TransactionDetailState[TapCompletedActivity.access$400(TapCompletedActivity.this).ordinal()])
        {
        default:
            throw new IllegalStateException();

        case 2: // '\002'
            TapCompletedActivity.access$1000(TapCompletedActivity.this);
            // fall through

        case 1: // '\001'
        case 5: // '\005'
            return;

        case 3: // '\003'
            TapCompletedActivity.access$1100(TapCompletedActivity.this);
            return;

        case 4: // '\004'
            TapCompletedActivity.access$500(TapCompletedActivity.this);
            break;
        }
    }

    private tailState()
    {
        this$0 = TapCompletedActivity.this;
        super();
    }

    this._cls0(this._cls0 _pcls0)
    {
        this();
    }
}
