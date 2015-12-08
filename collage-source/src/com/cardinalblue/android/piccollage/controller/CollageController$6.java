// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cardinalblue.android.piccollage.controller;

import bolts.i;
import bolts.j;
import com.cardinalblue.android.piccollage.model.AbstractCollage;
import com.cardinalblue.android.piccollage.view.PhotoProtoView;
import com.cardinalblue.android.piccollage.view.g;

// Referenced classes of package com.cardinalblue.android.piccollage.controller:
//            CollageController

class a
    implements i
{

    final g a;
    final CollageController b;

    public Object then(j j1)
        throws Exception
    {
        if (j1.e() != null)
        {
            CollageController.a(b).a(a);
            CollageController.b(b).c();
        }
        return null;
    }

    (CollageController collagecontroller, g g)
    {
        b = collagecontroller;
        a = g;
        super();
    }
}
