// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.tapandpay.ui;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.google.android.apps.wallet.logging.WLog;

// Referenced classes of package com.google.android.apps.wallet.tapandpay.ui:
//            TapActivity

final class this._cls0 extends BroadcastReceiver
{

    final TapActivity this$0;

    public final void onReceive(Context context, Intent intent)
    {
        context = TapActivity.access$000();
        String s = String.valueOf(intent);
        WLog.d(context, (new StringBuilder(String.valueOf(s).length() + 34)).append("BroadcastReceiver handling intent=").append(s).toString());
        TapActivity.access$100(TapActivity.this, intent);
    }

    ()
    {
        this$0 = TapActivity.this;
        super();
    }
}
