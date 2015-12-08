// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android;

import java.util.ArrayList;
import kC;

// Referenced classes of package com.snapchat.android:
//            Timber

static final class b
    implements Runnable
{

    private kC a;
    private long b;

    public final void run()
    {
        kC kc = a;
        long l2 = b;
        kC.a(kc.a, (new StringBuilder()).append(kc.b).append(": begin").toString(), l2);
        long l1 = ((Long)kc.c.get(0)).longValue();
        int i = 1;
        long l = l1;
        for (; i < kc.c.size(); i++)
        {
            l = ((Long)kc.c.get(i)).longValue();
            String s = (String)kc.d.get(i);
            long l3 = ((Long)kc.c.get(i - 1)).longValue();
            kC.a(kc.a, (new StringBuilder()).append(kc.b).append(":      ").append(l - l3).append(" ms, ").append(s).toString(), l2);
        }

        kC.a(kc.a, (new StringBuilder()).append(kc.b).append(": end, ").append(l - l1).append(" ms").toString(), l2);
    }

    (kC kc, long l)
    {
        a = kc;
        b = l;
        super();
    }
}
