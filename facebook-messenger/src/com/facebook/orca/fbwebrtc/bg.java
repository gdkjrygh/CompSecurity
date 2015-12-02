// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.fbwebrtc;


// Referenced classes of package com.facebook.orca.fbwebrtc:
//            bb

class bg
    implements Runnable
{

    final boolean a;
    final bb b;

    bg(bb bb1, boolean flag)
    {
        b = bb1;
        a = flag;
        super();
    }

    public void run()
    {
        bb.b(b, a);
    }
}
