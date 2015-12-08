// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.tagmanager;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

// Referenced classes of package com.google.android.gms.tagmanager:
//            zzcl

class zzazS
    implements b
{

    final zzcl zzazS;

    public ScheduledExecutorService zztE()
    {
        return Executors.newSingleThreadScheduledExecutor();
    }

    vice(zzcl zzcl1)
    {
        zzazS = zzcl1;
        super();
    }
}
