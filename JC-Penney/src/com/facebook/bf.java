// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook;


// Referenced classes of package com.facebook:
//            ag, be

class bf
    implements Runnable
{

    final ag a;
    final long b;
    final long c;
    final be d;

    bf(be be, ag ag1, long l, long l1)
    {
        d = be;
        a = ag1;
        b = l;
        c = l1;
        super();
    }

    public void run()
    {
        a.a(b, c);
    }
}
