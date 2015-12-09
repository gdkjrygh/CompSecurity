// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cardinalblue.android.piccollage.controller;

import android.graphics.Canvas;
import bolts.j;
import com.cardinalblue.android.piccollage.view.n;
import java.util.concurrent.Callable;

// Referenced classes of package com.cardinalblue.android.piccollage.controller:
//            CollageController, q

class c
    implements Callable
{

    final j a;
    final Canvas b;
    final q c;
    final CollageController d;

    public Void a()
        throws Exception
    {
        if (a != null)
        {
            a.g();
        }
        b.save();
        ((n)c.j()).b(b);
        b.restore();
        return null;
    }

    public Object call()
        throws Exception
    {
        return a();
    }

    I(CollageController collagecontroller, j j1, Canvas canvas, q q1)
    {
        d = collagecontroller;
        a = j1;
        b = canvas;
        c = q1;
        super();
    }
}
