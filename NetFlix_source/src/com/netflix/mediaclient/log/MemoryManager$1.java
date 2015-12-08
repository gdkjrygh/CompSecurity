// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.log;

import com.netflix.mediaclient.Log;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;

// Referenced classes of package com.netflix.mediaclient.log:
//            MemoryManager

class this._cls0
    implements Runnable
{

    final MemoryManager this$0;

    public void run()
    {
        MemoryManager.access$000(MemoryManager.this).cancel(true);
        MemoryManager.access$002(MemoryManager.this, null);
        MemoryManager.access$100(MemoryManager.this).shutdown();
        MemoryManager.access$102(MemoryManager.this, null);
        Log.d("nf-memory", "Memory manager stoped");
    }

    e()
    {
        this$0 = MemoryManager.this;
        super();
    }
}
