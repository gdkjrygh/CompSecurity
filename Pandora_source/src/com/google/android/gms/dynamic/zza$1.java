// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.dynamic;

import java.util.Iterator;
import java.util.LinkedList;

// Referenced classes of package com.google.android.gms.dynamic:
//            zzf, zza, LifecycleDelegate

class a
    implements zzf
{

    final zza a;

    public void zza(LifecycleDelegate lifecycledelegate)
    {
        com.google.android.gms.dynamic.zza.zza(a, lifecycledelegate);
        for (lifecycledelegate = com.google.android.gms.dynamic.zza.zza(a).iterator(); lifecycledelegate.hasNext(); ((a)lifecycledelegate.next()).a(com.google.android.gms.dynamic.zza.zzb(a))) { }
        com.google.android.gms.dynamic.zza.zza(a).clear();
        com.google.android.gms.dynamic.zza.zza(a, null);
    }

    cleDelegate(zza zza1)
    {
        a = zza1;
        super();
    }
}
