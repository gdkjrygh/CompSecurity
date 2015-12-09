// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cardinalblue.android.piccollage.controller;

import bolts.i;
import bolts.j;
import java.util.List;

// Referenced classes of package com.cardinalblue.android.piccollage.controller:
//            a

class a
    implements i
{

    final List a;
    final a b;

    public Void a(j j)
        throws Exception
    {
        com.cardinalblue.android.piccollage.controller.a.f(b).clear();
        com.cardinalblue.android.piccollage.controller.a.f(b).addAll(a);
        com.cardinalblue.android.piccollage.controller.a.a(b, a.f, null);
        return null;
    }

    public Object then(j j)
        throws Exception
    {
        return a(j);
    }

    a(a a1, List list)
    {
        b = a1;
        a = list;
        super();
    }
}
