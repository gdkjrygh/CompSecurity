// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wearable;

import com.google.android.gms.wearable.internal.zzao;

// Referenced classes of package com.google.android.gms.wearable:
//            u, WearableListenerService

final class x
    implements Runnable
{

    final zzao a;
    final u b;

    x(u u1, zzao zzao)
    {
        b = u1;
        a = zzao;
        super();
    }

    public final void run()
    {
        b.a.onPeerConnected(a);
    }
}
