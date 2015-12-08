// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.widget;

import com.facebook.Request;
import com.facebook.RequestBatch;

// Referenced classes of package com.facebook.widget:
//            GraphObjectPagingLoader

class val.batch
    implements Runnable
{

    final GraphObjectPagingLoader this$0;
    private final RequestBatch val$batch;

    public void run()
    {
        Request.executeBatchAsync(val$batch);
    }

    ()
    {
        this$0 = final_graphobjectpagingloader;
        val$batch = RequestBatch.this;
        super();
    }
}
