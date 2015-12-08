// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wearable;

import com.google.android.gms.wearable.internal.af;

// Referenced classes of package com.google.android.gms.wearable:
//            WearableListenerService

class alx
    implements Runnable
{

    final alx alw;
    final af alx;

    public void run()
    {
        alw.u.onMessageReceived(alx);
    }

    A(A a1, af af)
    {
        alw = a1;
        alx = af;
        super();
    }
}
