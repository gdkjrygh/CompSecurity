// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rx.internal.util;

import java.util.Queue;
import rx.functions.Action0;

// Referenced classes of package rx.internal.util:
//            ObjectPool

class val.max
    implements Action0
{

    final ObjectPool this$0;
    final int val$max;
    final int val$min;

    public void call()
    {
        int k = ObjectPool.access$000(ObjectPool.this).size();
        if (k < val$min)
        {
            int l = val$max;
            for (int i = 0; i < l - k; i++)
            {
                ObjectPool.access$000(ObjectPool.this).add(createObject());
            }

        } else
        if (k > val$max)
        {
            int i1 = val$max;
            for (int j = 0; j < k - i1; j++)
            {
                ObjectPool.access$000(ObjectPool.this).poll();
            }

        }
    }

    ()
    {
        this$0 = final_objectpool;
        val$min = i;
        val$max = I.this;
        super();
    }
}
