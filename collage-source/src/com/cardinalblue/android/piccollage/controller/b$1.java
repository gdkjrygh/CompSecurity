// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cardinalblue.android.piccollage.controller;

import bolts.i;
import bolts.j;

// Referenced classes of package com.cardinalblue.android.piccollage.controller:
//            b

class a
    implements i
{

    final b a;

    public Object then(j j1)
        throws Exception
    {
        if (b.a(a) == null)
        {
            return null;
        }
        if (j1.c())
        {
            b.a(a).c();
            return null;
        }
        if (j1.d())
        {
            b.a(a).b(j1.f());
            return null;
        } else
        {
            b.a(a).b(j1.e());
            return null;
        }
    }

    (b b1)
    {
        a = b1;
        super();
    }
}
