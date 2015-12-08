// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cleanmaster.sdk.cmloginsdkjar;

import android.util.Pair;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.cleanmaster.sdk.cmloginsdkjar:
//            Response, RequestBatch

final class o
    implements Runnable
{

    final ArrayList a;
    final RequestBatch b;

    o(ArrayList arraylist, RequestBatch requestbatch)
    {
        a = arraylist;
        b = requestbatch;
        super();
    }

    public final void run()
    {
        Pair pair;
        for (Iterator iterator = a.iterator(); iterator.hasNext(); ((Request.Callback)pair.first).onCompleted((Response)pair.second))
        {
            pair = (Pair)iterator.next();
        }

        for (Iterator iterator1 = b.getCallbacks().iterator(); iterator1.hasNext(); ((RequestBatch.Callback)iterator1.next()).onBatchCompleted(b)) { }
    }
}
