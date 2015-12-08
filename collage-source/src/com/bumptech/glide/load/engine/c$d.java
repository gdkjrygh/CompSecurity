// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.bumptech.glide.load.engine;

import java.lang.ref.ReferenceQueue;
import java.util.Map;

// Referenced classes of package com.bumptech.glide.load.engine:
//            c

private static class b
    implements android.os.ageQueue.IdleHandler
{

    private final Map a;
    private final ReferenceQueue b;

    public boolean queueIdle()
    {
          = ()b.poll();
        if ( != null)
        {
            a.remove(a());
        }
        return true;
    }

    public (Map map, ReferenceQueue referencequeue)
    {
        a = map;
        b = referencequeue;
    }
}
