// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.d.a;


// Referenced classes of package com.google.common.d.a:
//            p, s

class r
    implements Runnable
{

    final int a;
    final s b;
    final p c;

    r(p p1, int i, s s)
    {
        c = p1;
        a = i;
        b = s;
        super();
    }

    public void run()
    {
        p.a(c, a, b);
    }
}
