// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cardinalblue.android.piccollage.controller;

import java.util.List;
import java.util.concurrent.Callable;

// Referenced classes of package com.cardinalblue.android.piccollage.controller:
//            o

class b
    implements Callable
{

    final List a;
    final List b;
    final o c;

    public Void a()
        throws Exception
    {
        o.a(c, a, b);
        return null;
    }

    public Object call()
        throws Exception
    {
        return a();
    }

    (o o1, List list, List list1)
    {
        c = o1;
        a = list;
        b = list1;
        super();
    }
}
