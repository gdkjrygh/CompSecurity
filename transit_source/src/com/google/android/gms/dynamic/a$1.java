// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.dynamic;

import java.util.Iterator;
import java.util.LinkedList;

// Referenced classes of package com.google.android.gms.dynamic:
//            d, a, LifecycleDelegate

class lZ
    implements d
{

    final a lZ;

    public void a(LifecycleDelegate lifecycledelegate)
    {
        com.google.android.gms.dynamic.a.a(lZ, lifecycledelegate);
        for (lifecycledelegate = com.google.android.gms.dynamic.a.a(lZ).iterator(); lifecycledelegate.hasNext(); ((lZ)lifecycledelegate.next()).b(com.google.android.gms.dynamic.a.b(lZ))) { }
        com.google.android.gms.dynamic.a.a(lZ).clear();
        com.google.android.gms.dynamic.a.a(lZ, null);
    }

    cycleDelegate(a a1)
    {
        lZ = a1;
        super();
    }
}
