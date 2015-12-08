// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.dynamic;

import java.util.Iterator;
import java.util.LinkedList;

// Referenced classes of package com.google.android.gms.dynamic:
//            f, a, LifecycleDelegate

class LY
    implements f
{

    final a LY;

    public void a(LifecycleDelegate lifecycledelegate)
    {
        com.google.android.gms.dynamic.a.a(LY, lifecycledelegate);
        for (lifecycledelegate = com.google.android.gms.dynamic.a.a(LY).iterator(); lifecycledelegate.hasNext(); ((LY)lifecycledelegate.next()).b(com.google.android.gms.dynamic.a.b(LY))) { }
        com.google.android.gms.dynamic.a.a(LY).clear();
        com.google.android.gms.dynamic.a.a(LY, null);
    }

    cycleDelegate(a a1)
    {
        LY = a1;
        super();
    }
}
