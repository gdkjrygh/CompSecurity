// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kohls.mcommerce.opal.wallet.fragment;

import android.support.v4.widget.SwipeRefreshLayout;

// Referenced classes of package com.kohls.mcommerce.opal.wallet.fragment:
//            MainActivity

class this._cls0
    implements android.support.v4.widget.out.OnRefreshListener
{

    final MainActivity this$0;

    public void onRefresh()
    {
        MainActivity.access$000(MainActivity.this).setRefreshing(true);
        MainActivity.access$100(MainActivity.this);
    }

    stener()
    {
        this$0 = MainActivity.this;
        super();
    }
}
