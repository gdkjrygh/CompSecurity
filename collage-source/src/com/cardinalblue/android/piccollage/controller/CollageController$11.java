// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cardinalblue.android.piccollage.controller;

import bolts.h;
import bolts.i;
import bolts.j;

// Referenced classes of package com.cardinalblue.android.piccollage.controller:
//            CollageController

class c
    implements i
{

    final h a;
    final int b;
    final a c;
    final CollageController d;

    public Void a(j j)
        throws Exception
    {
        j = a;
        int k = b;
        j.a(Integer.valueOf(((Integer)a.a()).intValue() + k));
        if (c != null)
        {
            c.(((Integer)a.a()).intValue());
        }
        return null;
    }

    public Object then(j j)
        throws Exception
    {
        return a(j);
    }

    I(CollageController collagecontroller, h h1, int j, I k)
    {
        d = collagecontroller;
        a = h1;
        b = j;
        c = k;
        super();
    }
}
