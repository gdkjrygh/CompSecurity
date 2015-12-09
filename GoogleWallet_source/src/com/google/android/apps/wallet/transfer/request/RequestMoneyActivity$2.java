// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.transfer.request;

import android.view.KeyEvent;
import android.widget.TextView;
import com.google.android.apps.wallet.analytics.AnalyticsCustomDimension;
import com.google.android.apps.wallet.analytics.AnalyticsUtil;

// Referenced classes of package com.google.android.apps.wallet.transfer.request:
//            RequestMoneyActivity

final class this._cls0
    implements android.widget.Listener
{

    final RequestMoneyActivity this$0;

    public final boolean onEditorAction(TextView textview, int i, KeyEvent keyevent)
    {
        boolean flag1 = false;
        boolean flag;
        if (i == 0 && keyevent.getAction() == 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (i == 6 || flag)
        {
            analyticsUtil.sendKeyboardReturn("RequestMoneySend", new AnalyticsCustomDimension[0]);
            RequestMoneyActivity.access$100(RequestMoneyActivity.this);
            flag1 = true;
        }
        return flag1;
    }

    ()
    {
        this$0 = RequestMoneyActivity.this;
        super();
    }
}
