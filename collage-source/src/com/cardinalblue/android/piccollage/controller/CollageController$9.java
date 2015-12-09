// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cardinalblue.android.piccollage.controller;

import bolts.i;
import bolts.j;
import com.cardinalblue.android.piccollage.model.a.a;

// Referenced classes of package com.cardinalblue.android.piccollage.controller:
//            CollageController

class a
    implements i
{

    final a a;
    final CollageController b;

    public Void a(j j1)
        throws Exception
    {
        a.close();
        if (j1.d())
        {
            throw j1.f();
        } else
        {
            return null;
        }
    }

    public Object then(j j1)
        throws Exception
    {
        return a(j1);
    }

    (CollageController collagecontroller, a a1)
    {
        b = collagecontroller;
        a = a1;
        super();
    }
}
