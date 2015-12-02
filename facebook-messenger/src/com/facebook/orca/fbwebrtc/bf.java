// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.fbwebrtc;


// Referenced classes of package com.facebook.orca.fbwebrtc:
//            bb

class bf
    implements Runnable
{

    final int a;
    final long b;
    final boolean c;
    final bb d;

    bf(bb bb1, int i, long l, boolean flag)
    {
        d = bb1;
        a = i;
        b = l;
        c = flag;
        super();
    }

    public void run()
    {
        bb.a(d, a, b, c);
    }
}
