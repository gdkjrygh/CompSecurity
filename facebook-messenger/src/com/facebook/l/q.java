// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.l;

import java.util.Map;

// Referenced classes of package com.facebook.l:
//            k

class q
    implements Runnable
{

    final Map a;
    final boolean b;
    final k c;

    q(k k1, Map map, boolean flag)
    {
        c = k1;
        a = map;
        b = flag;
        super();
    }

    public void run()
    {
        k.a(c, a, b);
    }
}
