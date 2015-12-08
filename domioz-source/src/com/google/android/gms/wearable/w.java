// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wearable;

import com.google.android.gms.wearable.internal.zzal;

// Referenced classes of package com.google.android.gms.wearable:
//            u, WearableListenerService

final class w
    implements Runnable
{

    final zzal a;
    final u b;

    w(u u1, zzal zzal)
    {
        b = u1;
        a = zzal;
        super();
    }

    public final void run()
    {
        b.a.onMessageReceived(a);
    }
}
