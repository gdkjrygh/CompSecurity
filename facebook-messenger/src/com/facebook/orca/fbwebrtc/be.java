// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.fbwebrtc;


// Referenced classes of package com.facebook.orca.fbwebrtc:
//            bb

class be
    implements Runnable
{

    final boolean a;
    final String b;
    final bb c;

    be(bb bb1, boolean flag, String s)
    {
        c = bb1;
        a = flag;
        b = s;
        super();
    }

    public void run()
    {
        bb.a(c, a, b);
    }
}
