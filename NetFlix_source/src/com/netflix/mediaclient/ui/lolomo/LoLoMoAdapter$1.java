// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.ui.lolomo;

import com.netflix.mediaclient.Log;
import com.netflix.mediaclient.servicemgr.LoggingManagerCallback;

// Referenced classes of package com.netflix.mediaclient.ui.lolomo:
//            LoLoMoAdapter

class allback extends LoggingManagerCallback
{

    final LoLoMoAdapter this$0;
    final long val$requestIdClone;

    public void onLoLoMoPrefetched(int i)
    {
        super.onLoLoMoPrefetched(i);
        if (val$requestIdClone != LoLoMoAdapter.access$000(LoLoMoAdapter.this))
        {
            Log.d("BasePaginatedLoLoMoAdapter", "Request IDs do not match - skipping prefetch callback");
            return;
        } else
        {
            LoLoMoAdapter.access$100(LoLoMoAdapter.this);
            return;
        }
    }

    allback(long l)
    {
        this$0 = final_lolomoadapter;
        val$requestIdClone = l;
        super(String.this);
    }
}
