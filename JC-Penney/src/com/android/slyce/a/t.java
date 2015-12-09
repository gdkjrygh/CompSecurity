// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.android.slyce.a;

import java.util.PriorityQueue;

// Referenced classes of package com.android.slyce.a:
//            r, bm

class t extends Thread
{

    final bm a;
    final PriorityQueue b;
    final r c;

    t(r r1, String s, bm bm, PriorityQueue priorityqueue)
    {
        c = r1;
        a = bm;
        b = priorityqueue;
        super(s);
    }

    public void run()
    {
        r.a(c, a, b);
    }
}
