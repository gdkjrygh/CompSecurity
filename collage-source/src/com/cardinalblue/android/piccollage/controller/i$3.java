// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cardinalblue.android.piccollage.controller;

import com.cardinalblue.android.piccollage.lib.a;
import com.cardinalblue.android.piccollage.lib.g;
import java.util.concurrent.Callable;

// Referenced classes of package com.cardinalblue.android.piccollage.controller:
//            i, f, CollageController

class a
    implements Callable
{

    final boolean a;
    final i b;

    public Void a()
        throws Exception
    {
        com.cardinalblue.android.piccollage.controller.i.a(b, new g((com.cardinalblue.android.piccollage.view.g)b.a));
        android.graphics.Bitmap bitmap = com.cardinalblue.android.piccollage.lib.a(((com.cardinalblue.android.piccollage.view.g)b.a).i()).a(f.b);
        if (bitmap != null)
        {
            ((com.cardinalblue.android.piccollage.view.g)b.a).a(bitmap, a);
            b.b.h();
        }
        ((com.cardinalblue.android.piccollage.view.g)b.a).b(false);
        return null;
    }

    public Object call()
        throws Exception
    {
        return a();
    }

    ageController(i j, boolean flag)
    {
        b = j;
        a = flag;
        super();
    }
}
