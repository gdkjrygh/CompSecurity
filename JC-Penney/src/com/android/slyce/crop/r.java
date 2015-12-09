// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.android.slyce.crop;


// Referenced classes of package com.android.slyce.crop:
//            q, x

class r
    implements Runnable
{

    final x a;
    final boolean b;
    final q c;

    r(q q1, x x, boolean flag)
    {
        c = q1;
        a = x;
        b = flag;
        super();
    }

    public void run()
    {
        c.a(a, b);
    }
}
