// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kohls.mcommerce.opal.wallet.fragment;

import android.database.DataSetObserver;

// Referenced classes of package com.kohls.mcommerce.opal.wallet.fragment:
//            BaseKohlsCashOffersFragment

class this._cls0 extends DataSetObserver
{

    final BaseKohlsCashOffersFragment this$0;

    public void onChanged()
    {
        isFromCache = false;
        setupView();
        super.onChanged();
    }

    ()
    {
        this$0 = BaseKohlsCashOffersFragment.this;
        super();
    }
}
