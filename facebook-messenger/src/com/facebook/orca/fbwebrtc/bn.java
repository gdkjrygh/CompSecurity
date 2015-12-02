// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.fbwebrtc;


// Referenced classes of package com.facebook.orca.fbwebrtc:
//            bb

class bn
    implements Runnable
{

    final bb a;

    bn(bb bb1)
    {
        a = bb1;
        super();
    }

    public void run()
    {
        bb.a(a, false);
        if (bb.e(a) == 0)
        {
            bb.f(a);
        }
    }
}
