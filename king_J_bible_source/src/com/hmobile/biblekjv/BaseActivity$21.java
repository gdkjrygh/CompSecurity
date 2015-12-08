// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.hmobile.biblekjv;

import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdView;

// Referenced classes of package com.hmobile.biblekjv:
//            BaseActivity

class  extends AdListener
{

    final BaseActivity this$0;

    public void onAdFailedToLoad(int i)
    {
        super.onAdFailedToLoad(i);
        adView.setVisibility(8);
    }

    public void onAdLoaded()
    {
        super.onAdLoaded();
        adView.setVisibility(0);
    }

    ()
    {
        this$0 = BaseActivity.this;
        super();
    }
}
