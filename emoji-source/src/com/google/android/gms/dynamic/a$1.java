// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.dynamic;

import java.util.Iterator;
import java.util.LinkedList;

// Referenced classes of package com.google.android.gms.dynamic:
//            f, a, LifecycleDelegate

class Mb
    implements f
{

    final a Mb;

    public void a(LifecycleDelegate lifecycledelegate)
    {
        com.google.android.gms.dynamic.a.a(Mb, lifecycledelegate);
        for (lifecycledelegate = com.google.android.gms.dynamic.a.a(Mb).iterator(); lifecycledelegate.hasNext(); ((Mb)lifecycledelegate.next()).b(com.google.android.gms.dynamic.a.b(Mb))) { }
        com.google.android.gms.dynamic.a.a(Mb).clear();
        com.google.android.gms.dynamic.a.a(Mb, null);
    }

    cycleDelegate(a a1)
    {
        Mb = a1;
        super();
    }
}
