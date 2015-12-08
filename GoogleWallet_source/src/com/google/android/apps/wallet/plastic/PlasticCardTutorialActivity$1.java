// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.plastic;

import com.google.android.apps.wallet.api.UriIntents;
import com.google.android.apps.wallet.help.api.HelpUrls;
import com.google.android.apps.wallet.ui.listener.OnActionListener;

// Referenced classes of package com.google.android.apps.wallet.plastic:
//            PlasticCardTutorialActivity

final class this._cls0
    implements OnActionListener
{

    final PlasticCardTutorialActivity this$0;

    private void onAction(Void void1)
    {
        void1 = UriIntents.create(PlasticCardTutorialActivity.this, HelpUrls.createWalletCardFaqUrl());
        startActivity(void1);
    }

    public final volatile void onAction(Object obj)
    {
        onAction((Void)obj);
    }

    ()
    {
        this$0 = PlasticCardTutorialActivity.this;
        super();
    }
}
