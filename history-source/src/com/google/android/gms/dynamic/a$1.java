// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.dynamic;

import java.util.Iterator;
import java.util.LinkedList;

// Referenced classes of package com.google.android.gms.dynamic:
//            f, a, LifecycleDelegate

class Ty
    implements f
{

    final a Ty;

    public void a(LifecycleDelegate lifecycledelegate)
    {
        com.google.android.gms.dynamic.a.a(Ty, lifecycledelegate);
        for (lifecycledelegate = com.google.android.gms.dynamic.a.a(Ty).iterator(); lifecycledelegate.hasNext(); ((Ty)lifecycledelegate.next()).b(com.google.android.gms.dynamic.a.b(Ty))) { }
        com.google.android.gms.dynamic.a.a(Ty).clear();
        com.google.android.gms.dynamic.a.a(Ty, null);
    }

    cycleDelegate(a a1)
    {
        Ty = a1;
        super();
    }
}
