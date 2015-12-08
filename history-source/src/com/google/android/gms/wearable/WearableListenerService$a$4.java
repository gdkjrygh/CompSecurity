// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wearable;

import com.google.android.gms.wearable.internal.al;

// Referenced classes of package com.google.android.gms.wearable:
//            WearableListenerService

class axu
    implements Runnable
{

    final axu axs;
    final al axu;

    public void run()
    {
        axs.q.onPeerDisconnected(axu);
    }

    A(A a1, al al)
    {
        axs = a1;
        axu = al;
        super();
    }
}
