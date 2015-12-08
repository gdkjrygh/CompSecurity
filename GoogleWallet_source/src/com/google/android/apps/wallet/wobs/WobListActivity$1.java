// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.wobs;

import android.support.v4.view.ViewPager;

// Referenced classes of package com.google.android.apps.wallet.wobs:
//            WobListActivity

final class this._cls0
    implements android.widget.eListener
{

    final WobListActivity this$0;

    public final void onTabChanged(String s)
    {
        int i = Integer.parseInt(s);
        WobListActivity.access$100(WobListActivity.this).setCurrentItem(i);
        WobListActivity.access$200(WobListActivity.this, i);
    }

    ()
    {
        this$0 = WobListActivity.this;
        super();
    }
}
