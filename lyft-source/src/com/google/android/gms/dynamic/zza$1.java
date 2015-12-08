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

    public void a(LifecycleDelegate lifecycledelegate)
    {
        zza.a(a, lifecycledelegate);
        for (lifecycledelegate = zza.a(a).iterator(); lifecycledelegate.hasNext(); ((a)lifecycledelegate.next()).a(zza.b(a))) { }
        zza.a(a).clear();
        zza.a(a, null);
    }

    cleDelegate(zza zza1)
    {
        a = zza1;
        super();
    }
}
