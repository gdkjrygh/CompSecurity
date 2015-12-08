// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.b;

import java.util.Iterator;
import java.util.LinkedList;

// Referenced classes of package com.google.android.gms.b:
//            n, b, i, a

final class c
    implements n
{

    final b a;

    c(b b1)
    {
        a = b1;
        super();
    }

    public final void a(a a1)
    {
        b.a(a, a1);
        for (a1 = b.a(a).iterator(); a1.hasNext(); ((i)a1.next()).b()) { }
        b.a(a).clear();
        b.c(a);
    }
}
