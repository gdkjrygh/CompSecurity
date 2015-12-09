// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cardinalblue.android.piccollage.controller;

import bolts.i;
import bolts.j;
import com.cardinalblue.android.piccollage.view.g;

// Referenced classes of package com.cardinalblue.android.piccollage.controller:
//            CollageController

class a
    implements i
{

    final g a;
    final CollageController b;

    public Void a(j j1)
        throws Exception
    {
        if (j1.d() && a.m() == null)
        {
            if (CollageController.c(b) != null)
            {
                CollageController.c(b).(a, j1.f());
            }
            b.b(a, false);
        }
        return null;
    }

    public Object then(j j1)
        throws Exception
    {
        return a(j1);
    }

    I(CollageController collagecontroller, g g1)
    {
        b = collagecontroller;
        a = g1;
        super();
    }
}
