// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.ads.internal.adapters;

import com.facebook.ads.internal.util.o;
import java.util.Map;

// Referenced classes of package com.facebook.ads.internal.adapters:
//            n

class b
    implements Runnable
{

    final Map a;
    final Map b;
    final n c;

    public void run()
    {
        (new o(a, b)).execute(new String[] {
            n.a(c)
        });
    }

    (n n1, Map map, Map map1)
    {
        c = n1;
        a = map;
        b = map1;
        super();
    }
}
