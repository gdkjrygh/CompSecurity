// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.dynamic;

import java.util.Iterator;
import java.util.LinkedList;

// Referenced classes of package com.google.android.gms.dynamic:
//            h, b, a

class a
    implements h
{

    final b a;

    public void a(a a1)
    {
        b.a(a, a1);
        for (a1 = b.a(a).iterator(); a1.hasNext(); ((a)a1.next()).a(b.b(a))) { }
        b.a(a).clear();
        b.a(a, null);
    }

    (b b1)
    {
        a = b1;
        super();
    }
}
