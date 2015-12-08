// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wearable;

import com.google.android.gms.internal.kk;

// Referenced classes of package com.google.android.gms.wearable:
//            WearableListenerService

class adB
    implements Runnable
{

    final kk adB;
    final adB adz;

    public void run()
    {
        adz.x.onPeerConnected(adB);
    }

    A(A a1, kk kk)
    {
        adz = a1;
        adB = kk;
        super();
    }
}
