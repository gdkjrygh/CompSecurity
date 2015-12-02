// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.fbwebrtc;


// Referenced classes of package com.facebook.orca.fbwebrtc:
//            bb

class bq
    implements Runnable
{

    final long a;
    final bb b;

    bq(bb bb1, long l)
    {
        b = bb1;
        a = l;
        super();
    }

    public void run()
    {
        bb.a(b, a);
    }
}
