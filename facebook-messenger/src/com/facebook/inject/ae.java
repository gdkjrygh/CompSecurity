// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.inject;

import com.facebook.debug.d.e;
import com.google.inject.a;
import java.util.Iterator;
import java.util.Set;

// Referenced classes of package com.facebook.inject:
//            ad, t

class ae
    implements android.os.MessageQueue.IdleHandler
{

    final Set a;
    final ad b;

    ae(ad ad1, Set set)
    {
        b = ad1;
        a = set;
        super();
    }

    public boolean queueIdle()
    {
        long l = System.currentTimeMillis();
        e e1 = e.a("LessEagerUiThreadSingletonInitializer");
        Iterator iterator = a.iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            a a1 = (a)iterator.next();
            com.facebook.inject.ad.a(b).a(a1);
            iterator.remove();
        } while (System.currentTimeMillis() - l <= 50L);
        e1.a();
        return iterator.hasNext();
    }
}
