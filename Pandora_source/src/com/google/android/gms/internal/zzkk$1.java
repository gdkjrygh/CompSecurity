// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.google.android.gms.internal:
//            zzkk, zzkg, zzkj, zzkl

class a
    implements Runnable
{

    final zzkg a;
    final zzkk b;

    public void run()
    {
        a.zzug().zza(a);
        for (Iterator iterator = zzkk.zza(b).iterator(); iterator.hasNext(); ((zzkl)iterator.next()).zza(a)) { }
        zzkk.zza(b, a);
    }

    (zzkk zzkk1, zzkg zzkg1)
    {
        b = zzkk1;
        a = zzkg1;
        super();
    }
}
