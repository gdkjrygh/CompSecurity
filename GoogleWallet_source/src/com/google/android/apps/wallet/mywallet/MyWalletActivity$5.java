// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.mywallet;

import android.support.v4.widget.SwipeRefreshLayout;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import com.google.android.apps.wallet.tile.HeaderTile;
import com.google.android.apps.wallet.tile.TileManager;
import com.google.android.apps.wallet.widgets.scrollview.ObservableScrollView;

// Referenced classes of package com.google.android.apps.wallet.mywallet:
//            MyWalletActivity

final class this._cls0
    implements com.google.android.apps.wallet.widgets.scrollview.w.ScrollListener
{

    final MyWalletActivity this$0;

    public final void onScrollChanged(int i, int j)
    {
        if (!tileManager.hasHeader())
        {
            return;
        } else
        {
            j = MyWalletActivity.access$200(MyWalletActivity.this).getHeight();
            i = Math.min(0, Math.max(-i, -j));
            MyWalletActivity.access$200(MyWalletActivity.this).animate().y(i).setDuration(0L);
            MyWalletActivity.access$500(MyWalletActivity.this).animate().y(i + j).setDuration(0L);
            MyWalletActivity.access$400(MyWalletActivity.this).animate().y(-(j + i)).setDuration(0L);
            float f = (float)i / (float)j;
            tileManager.getHeaderTile().animateOnScroll(1.0F + f);
            return;
        }
    }

    eScrollView()
    {
        this$0 = MyWalletActivity.this;
        super();
    }
}
