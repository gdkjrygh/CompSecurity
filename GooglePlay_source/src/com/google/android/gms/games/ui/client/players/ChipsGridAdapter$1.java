// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.ui.client.players;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.ArrayList;

// Referenced classes of package com.google.android.gms.games.ui.client.players:
//            ChipsGridAdapter

final class ewHolder
    implements Runnable
{

    final ChipsGridAdapter this$0;
    final ewHolder val$vh;

    public final void run()
    {
        FrameLayout framelayout = (FrameLayout)ChipsGridAdapter.access$000(ChipsGridAdapter.this).getParent();
        if (framelayout != val$vh.spanningSearchLayer)
        {
            if (framelayout != null)
            {
                framelayout.removeView(ChipsGridAdapter.access$000(ChipsGridAdapter.this));
            }
            val$vh.spanningSearchLayer.addView(ChipsGridAdapter.access$000(ChipsGridAdapter.this));
            if (ChipsGridAdapter.access$100(ChipsGridAdapter.this).size() == 0)
            {
                ChipsGridAdapter.access$300(ChipsGridAdapter.this).setHint(ChipsGridAdapter.access$200(ChipsGridAdapter.this));
            }
            if (android.os.NT != 16 && android.os.NT != 17)
            {
                ChipsGridAdapter.access$300(ChipsGridAdapter.this).requestFocus();
                return;
            }
        }
    }

    ewHolder()
    {
        this$0 = final_chipsgridadapter;
        val$vh = ewHolder.this;
        super();
    }
}
