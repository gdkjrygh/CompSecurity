// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.dynamic;

import java.util.Iterator;
import java.util.LinkedList;

// Referenced classes of package com.google.android.gms.dynamic:
//            f, a, LifecycleDelegate

final class afB
    implements f
{

    final a afB;

    public final void a(LifecycleDelegate lifecycledelegate)
    {
        com.google.android.gms.dynamic.a.a(afB, lifecycledelegate);
        for (lifecycledelegate = com.google.android.gms.dynamic.a.a(afB).iterator(); lifecycledelegate.hasNext(); ((afB)lifecycledelegate.next()).b(com.google.android.gms.dynamic.a.b(afB))) { }
        com.google.android.gms.dynamic.a.a(afB).clear();
        com.google.android.gms.dynamic.a.a(afB, null);
    }

    cycleDelegate(a a1)
    {
        afB = a1;
        super();
    }
}
