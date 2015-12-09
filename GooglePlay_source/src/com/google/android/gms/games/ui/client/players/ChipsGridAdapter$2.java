// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.ui.client.players;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;

// Referenced classes of package com.google.android.gms.games.ui.client.players:
//            ChipsGridAdapter

final class ipViewHolder
    implements Runnable
{

    final ChipsGridAdapter this$0;
    final ipViewHolder val$cvh;

    public final void run()
    {
        FrameLayout framelayout = (FrameLayout)ChipsGridAdapter.access$000(ChipsGridAdapter.this).getParent();
        if (framelayout != val$cvh.searchLayer)
        {
            if (framelayout != null)
            {
                framelayout.removeView(ChipsGridAdapter.access$000(ChipsGridAdapter.this));
            }
            val$cvh.searchLayer.addView(ChipsGridAdapter.access$000(ChipsGridAdapter.this));
            ChipsGridAdapter.access$300(ChipsGridAdapter.this).setHint("");
            if (android.os.NT != 16 && android.os.NT != 17)
            {
                ChipsGridAdapter.access$300(ChipsGridAdapter.this).requestFocus();
                return;
            }
        }
    }

    ipViewHolder()
    {
        this$0 = final_chipsgridadapter;
        val$cvh = ipViewHolder.this;
        super();
    }
}
