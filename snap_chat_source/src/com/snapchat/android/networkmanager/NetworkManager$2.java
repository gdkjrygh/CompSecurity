// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.networkmanager;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import oV;
import pi;

// Referenced classes of package com.snapchat.android.networkmanager:
//            NetworkManager

final class a
    implements a
{

    private a a;
    private NetworkManager b;

    public final void a(oV ov, pi pi)
    {
        NetworkManager.a(b).remove(ov.getRequestTag());
        ((AtomicInteger)NetworkManager.b(b).get(ov.getPriority())).decrementAndGet();
        ov.onResult(pi);
        if (a != null)
        {
            a.a(ov, pi);
        }
    }

    (NetworkManager networkmanager,  )
    {
        b = networkmanager;
        a = ;
        super();
    }
}
