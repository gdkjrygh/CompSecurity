// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.fbwebrtc;

import com.facebook.webrtc.IWebrtcUiInterface;

// Referenced classes of package com.facebook.orca.fbwebrtc:
//            bb

class bo
    implements Runnable
{

    final int a;
    final bb b;

    bo(bb bb1, int i)
    {
        b = bb1;
        a = i;
        super();
    }

    public void run()
    {
        if (bb.g(b) != null)
        {
            bb.g(b).handleError(a);
        }
    }
}
