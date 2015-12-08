// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.bumptech.glide.load.b;

import java.lang.ref.ReferenceQueue;
import java.util.Map;

// Referenced classes of package com.bumptech.glide.load.b:
//            k

final class j
    implements android.os.MessageQueue.IdleHandler
{

    private final Map a;
    private final ReferenceQueue b;

    public j(Map map, ReferenceQueue referencequeue)
    {
        a = map;
        b = referencequeue;
    }

    public final boolean queueIdle()
    {
        k k1 = (k)b.poll();
        if (k1 != null)
        {
            a.remove(k.a(k1));
        }
        return true;
    }
}
