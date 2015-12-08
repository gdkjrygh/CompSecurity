// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.plastic;

import android.view.View;
import com.google.android.apps.wallet.util.view.Views;

// Referenced classes of package com.google.android.apps.wallet.plastic:
//            CancelPlasticCardActivity

final class this._cls0
    implements android.view.ncelPlasticCardActivity._cls3
{

    final CancelPlasticCardActivity this$0;

    public final void onFocusChange(View view, boolean flag)
    {
        if (flag)
        {
            Views.showSoftKeyboard(CancelPlasticCardActivity.this, view);
            return;
        } else
        {
            Views.hideSoftKeyboard(CancelPlasticCardActivity.this, view);
            return;
        }
    }

    ()
    {
        this$0 = CancelPlasticCardActivity.this;
        super();
    }
}
