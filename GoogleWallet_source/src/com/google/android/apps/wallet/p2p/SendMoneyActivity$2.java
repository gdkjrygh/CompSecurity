// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.p2p;

import android.view.KeyEvent;
import android.widget.TextView;
import com.google.android.apps.wallet.analytics.AnalyticsCustomDimension;
import com.google.android.apps.wallet.analytics.AnalyticsUtil;

// Referenced classes of package com.google.android.apps.wallet.p2p:
//            SendMoneyActivity

final class this._cls0
    implements android.widget.ionListener
{

    final SendMoneyActivity this$0;

    public final boolean onEditorAction(TextView textview, int i, KeyEvent keyevent)
    {
        analyticsUtil.sendKeyboardReturn("SendMoneyPreview", new AnalyticsCustomDimension[0]);
        SendMoneyActivity.access$100(SendMoneyActivity.this);
        return true;
    }

    mDimension()
    {
        this$0 = SendMoneyActivity.this;
        super();
    }
}
