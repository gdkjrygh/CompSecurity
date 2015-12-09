// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.comscore.streaming;

import com.comscore.utils.c;
import java.util.HashMap;

// Referenced classes of package com.comscore.streaming:
//            m, a, f

class k extends m
{

    final f a;
    final HashMap b;
    final a c;

    k(a a1, f f, HashMap hashmap)
    {
        c = a1;
        a = f;
        b = hashmap;
        super(a1, null);
    }

    public void run()
    {
        com.comscore.utils.c.a(c, "Performing delayed transition");
        com.comscore.streaming.a.a(c, a, b);
    }
}
