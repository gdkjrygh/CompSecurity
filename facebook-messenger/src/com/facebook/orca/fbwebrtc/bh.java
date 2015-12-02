// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.fbwebrtc;


// Referenced classes of package com.facebook.orca.fbwebrtc:
//            bb

class bh
    implements Runnable
{

    final boolean a;
    final long b;
    final bb c;

    bh(bb bb1, boolean flag, long l)
    {
        c = bb1;
        a = flag;
        b = l;
        super();
    }

    public void run()
    {
        bb.a(c, a, b);
    }
}
