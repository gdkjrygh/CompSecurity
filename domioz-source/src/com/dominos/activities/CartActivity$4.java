// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.activities;

import android.support.v4.widget.SwipeRefreshLayout;

// Referenced classes of package com.dominos.activities:
//            CartActivity

class this._cls0
    implements Runnable
{

    final CartActivity this$0;

    public void run()
    {
        if (CartActivity.access$400(CartActivity.this) && !mCartSwipeRefreshLayout.c())
        {
            showLoading();
        }
    }

    Layout()
    {
        this$0 = CartActivity.this;
        super();
    }
}
