// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wearable;

import com.google.android.gms.wearable.internal.ak;

// Referenced classes of package com.google.android.gms.wearable:
//            WearableListenerService

class avj
    implements Runnable
{

    final avj avh;
    final ak avj;

    public void run()
    {
        avh.f.onPeerConnected(avj);
    }

    A(A a1, ak ak)
    {
        avh = a1;
        avj = ak;
        super();
    }
}
