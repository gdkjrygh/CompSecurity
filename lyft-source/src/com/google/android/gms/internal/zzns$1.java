// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.google.android.gms.internal:
//            zzns, zzno, zznr, zznt

class a
    implements Runnable
{

    final zzno a;
    final zzns b;

    public void run()
    {
        a.h().a(a);
        for (Iterator iterator = zzns.a(b).iterator(); iterator.hasNext(); ((zznt)iterator.next()).a(a)) { }
        zzns.a(b, a);
    }

    (zzns zzns1, zzno zzno1)
    {
        b = zzns1;
        a = zzno1;
        super();
    }
}
