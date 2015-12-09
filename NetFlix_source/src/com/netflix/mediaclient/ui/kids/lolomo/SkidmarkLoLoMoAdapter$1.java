// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.ui.kids.lolomo;

import com.netflix.mediaclient.Log;
import com.netflix.mediaclient.servicemgr.LoggingManagerCallback;

// Referenced classes of package com.netflix.mediaclient.ui.kids.lolomo:
//            SkidmarkLoLoMoAdapter

class > extends LoggingManagerCallback
{

    final SkidmarkLoLoMoAdapter this$0;
    final long val$requestIdClone;

    public void onLoLoMoPrefetched(int i)
    {
        super.onLoLoMoPrefetched(i);
        if (i == 0)
        {
            if (val$requestIdClone != SkidmarkLoLoMoAdapter.access$000(SkidmarkLoLoMoAdapter.this))
            {
                Log.d("SkidmarkLoLoMoAdapter", "Ignoring stale prefetch request id");
                return;
            } else
            {
                SkidmarkLoLoMoAdapter.access$100(SkidmarkLoLoMoAdapter.this);
                return;
            }
        } else
        {
            Log.w("SkidmarkLoLoMoAdapter", "Prefetch failed");
            SkidmarkLoLoMoAdapter.access$200(SkidmarkLoLoMoAdapter.this);
            return;
        }
    }

    (long l)
    {
        this$0 = final_skidmarklolomoadapter;
        val$requestIdClone = l;
        super(String.this);
    }
}
