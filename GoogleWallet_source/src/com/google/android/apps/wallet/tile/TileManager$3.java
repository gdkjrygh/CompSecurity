// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.tile;

import android.view.View;
import android.widget.ScrollView;
import com.google.android.apps.wallet.util.view.Views;

// Referenced classes of package com.google.android.apps.wallet.tile:
//            TileManager

final class val.scrollView
    implements Runnable
{

    final TileManager this$0;
    final String val$anchor;
    final int val$containerViewId;
    final ScrollView val$scrollView;

    public final void run()
    {
        int i = getTileTopPosition(val$anchor);
        if (i >= 0)
        {
            int j = Views.findViewById(TileManager.access$200(TileManager.this), val$containerViewId).getTop();
            val$scrollView.scrollTo(0, j + i);
        }
    }

    ()
    {
        this$0 = final_tilemanager;
        val$anchor = s;
        val$containerViewId = i;
        val$scrollView = ScrollView.this;
        super();
    }
}
