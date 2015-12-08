// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wearable;

import com.google.android.gms.wearable.internal.af;

// Referenced classes of package com.google.android.gms.wearable:
//            WearableListenerService

class alu
    implements Runnable
{

    final alu alt;
    final af alu;

    public void run()
    {
        alt.r.onMessageReceived(alu);
    }

    A(A a1, af af)
    {
        alt = a1;
        alu = af;
        super();
    }
}
