// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook;

import android.util.Pair;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.facebook:
//            Request, RequestBatch, Response

class 
    implements Runnable
{

    private final ArrayList val$callbacks;
    private final RequestBatch val$requests;

    public void run()
    {
        Iterator iterator = val$callbacks.iterator();
_L3:
        if (iterator.hasNext()) goto _L2; else goto _L1
_L1:
        iterator = val$requests.getCallbacks().iterator();
_L4:
        if (!iterator.hasNext())
        {
            return;
        }
        break MISSING_BLOCK_LABEL_72;
_L2:
        Pair pair = (Pair)iterator.next();
        ((llback)pair.first).onCompleted((Response)pair.second);
          goto _L3
        ((ch.Callback)iterator.next()).onBatchCompleted(val$requests);
          goto _L4
    }

    ch()
    {
        val$callbacks = arraylist;
        val$requests = requestbatch;
        super();
    }
}
