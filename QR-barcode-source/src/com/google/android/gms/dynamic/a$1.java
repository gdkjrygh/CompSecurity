// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.dynamic;

import java.util.Iterator;
import java.util.LinkedList;

// Referenced classes of package com.google.android.gms.dynamic:
//            f, a, LifecycleDelegate

class Sb
    implements f
{

    final a Sb;

    public void a(LifecycleDelegate lifecycledelegate)
    {
        com.google.android.gms.dynamic.a.a(Sb, lifecycledelegate);
        for (lifecycledelegate = com.google.android.gms.dynamic.a.a(Sb).iterator(); lifecycledelegate.hasNext(); ((Sb)lifecycledelegate.next()).b(com.google.android.gms.dynamic.a.b(Sb))) { }
        com.google.android.gms.dynamic.a.a(Sb).clear();
        com.google.android.gms.dynamic.a.a(Sb, null);
    }

    cycleDelegate(a a1)
    {
        Sb = a1;
        super();
    }
}
