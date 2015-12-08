// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cardinalblue.android.piccollage.controller;

import bolts.i;
import bolts.j;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

// Referenced classes of package com.cardinalblue.android.piccollage.controller:
//            o

class b
    implements i
{

    final List a;
    final List b;
    final o c;

    public Void a(j j)
        throws Exception
    {
        if (o.c(c).get())
        {
            return null;
        } else
        {
            o.d(c).clear();
            o.d(c).addAll(a);
            o.e(c).clear();
            o.e(c).addAll(b);
            o.a(c, a.f, null);
            return null;
        }
    }

    public Object then(j j)
        throws Exception
    {
        return a(j);
    }

    a(o o1, List list, List list1)
    {
        c = o1;
        a = list;
        b = list1;
        super();
    }
}
