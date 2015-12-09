// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cardinalblue.android.piccollage.controller;

import android.graphics.Canvas;
import bolts.j;
import com.cardinalblue.android.piccollage.model.AbstractCollage;
import com.cardinalblue.android.piccollage.model.d;
import com.cardinalblue.android.piccollage.model.g;
import com.cardinalblue.android.piccollage.view.PhotoProtoView;
import com.cardinalblue.android.piccollage.view.o;
import java.util.concurrent.Callable;

// Referenced classes of package com.cardinalblue.android.piccollage.controller:
//            CollageController, u

class c
    implements Callable
{

    final j a;
    final u b;
    final Canvas c;
    final CollageController d;

    public Void a()
        throws Exception
    {
        if (a != null)
        {
            a.g();
        }
        o o1 = (o)b.j();
        c.save();
        if (o1.t() != -1)
        {
            android.graphics.RectF rectf = CollageController.b(d).s().a(o1.t()).a(CollageController.a(d).getWidth(), CollageController.a(d).getHeight(), false);
            c.clipRect(rectf);
        }
        o1.h(true);
        o1.b(c);
        o1.h(false);
        c.restore();
        return null;
    }

    public Object call()
        throws Exception
    {
        return a();
    }

    I(CollageController collagecontroller, j j1, u u1, Canvas canvas)
    {
        d = collagecontroller;
        a = j1;
        b = u1;
        c = canvas;
        super();
    }
}
