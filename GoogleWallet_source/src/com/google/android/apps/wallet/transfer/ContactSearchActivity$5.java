// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.transfer;

import android.view.KeyEvent;
import android.widget.TextView;
import com.google.android.apps.wallet.analytics.AnalyticsCustomDimension;
import com.google.android.apps.wallet.analytics.AnalyticsUtil;
import com.google.android.apps.wallet.p2p.api.Contact;

// Referenced classes of package com.google.android.apps.wallet.transfer:
//            ContactSearchActivity

final class this._cls0
    implements android.widget.istener
{

    final ContactSearchActivity this$0;

    public final boolean onEditorAction(TextView textview, int i, KeyEvent keyevent)
    {
        if (i == 5)
        {
            analyticsUtil.sendKeyboardReturn("ChooseContact", new AnalyticsCustomDimension[0]);
            keyevent = textview.getText().toString();
            ContactSearchActivity.access$100(ContactSearchActivity.this, textview, new Contact(keyevent), 201);
        }
        return false;
    }

    n()
    {
        this$0 = ContactSearchActivity.this;
        super();
    }
}
