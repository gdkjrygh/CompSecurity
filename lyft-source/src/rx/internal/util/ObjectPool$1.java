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
        int k = 0;
        int i = 0;
        int l = ObjectPool.access$000(ObjectPool.this).size();
        if (l < val$min)
        {
            for (k = val$max; i < k - l; i++)
            {
                ObjectPool.access$000(ObjectPool.this).add(createObject());
            }

        } else
        if (l > val$max)
        {
            int i1 = val$max;
            for (int j = k; j < l - i1; j++)
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
