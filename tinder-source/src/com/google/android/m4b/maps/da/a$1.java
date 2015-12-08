// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.da;

import java.util.Iterator;
import java.util.LinkedList;

// Referenced classes of package com.google.android.m4b.maps.da:
//            e, a, c

final class a
    implements e
{

    private a a;

    public final void a(c c)
    {
        a.a = c;
        for (c = a.c.iterator(); c.hasNext(); ((a)c.next()).b()) { }
        a.c.clear();
        a.b = null;
    }

    (a a1)
    {
        a = a1;
        super();
    }
}
