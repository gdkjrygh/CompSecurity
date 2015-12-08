// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wearable;

import com.google.android.gms.wearable.internal.ai;

// Referenced classes of package com.google.android.gms.wearable:
//            WearableListenerService

class axt
    implements Runnable
{

    final axt axs;
    final ai axt;

    public void run()
    {
        axs.q.onMessageReceived(axt);
    }

    A(A a1, ai ai)
    {
        axs = a1;
        axt = ai;
        super();
    }
}
