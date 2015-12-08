// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cm.kinfoc;


// Referenced classes of package com.cm.kinfoc:
//            j, i, d

final class k extends Thread
{

    final j a;
    private final String b;
    private final i c;
    private final d d;

    private k(j j1, i i, String s, d d1)
    {
        a = j1;
        super();
        b = s;
        c = i;
        d = d1;
    }

    k(j j1, i i, String s, d d1, byte byte0)
    {
        this(j1, i, s, d1);
    }

    public final void run()
    {
        j.b(c, b, d);
    }
}
