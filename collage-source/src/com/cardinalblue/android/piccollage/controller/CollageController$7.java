// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cardinalblue.android.piccollage.controller;

import bolts.i;
import bolts.j;
import com.cardinalblue.android.piccollage.view.k;

// Referenced classes of package com.cardinalblue.android.piccollage.controller:
//            CollageController

class a
    implements i
{

    final CollageController a;

    public Void a(j j1)
        throws Exception
    {
        j1 = (k)j1.e();
        CollageController.a(a, j1);
        a.a(j1, false);
        return null;
    }

    public Object then(j j1)
        throws Exception
    {
        return a(j1);
    }

    (CollageController collagecontroller)
    {
        a = collagecontroller;
        super();
    }
}
