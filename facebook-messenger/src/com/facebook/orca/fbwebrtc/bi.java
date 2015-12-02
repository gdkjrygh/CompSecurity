// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.fbwebrtc;

import android.os.Handler;

// Referenced classes of package com.facebook.orca.fbwebrtc:
//            bb

class bi
    implements Runnable
{

    final bb a;

    bi(bb bb1)
    {
        a = bb1;
        super();
    }

    public void run()
    {
        bb.k(a).removeCallbacks(bb.j(a));
        bb.l(a);
        bb.k(a).postDelayed(bb.j(a), 500L);
    }
}
