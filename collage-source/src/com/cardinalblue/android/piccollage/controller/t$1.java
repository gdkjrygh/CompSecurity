// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cardinalblue.android.piccollage.controller;

import bolts.h;
import java.util.concurrent.Callable;

// Referenced classes of package com.cardinalblue.android.piccollage.controller:
//            t, g

class d
    implements Callable
{

    final float a;
    final int b;
    final int c;
    final h d;
    final t e;

    public Object call()
        throws Exception
    {
        e.a.h.a((long)a);
        android.graphics.Bitmap bitmap1 = e.a.h.a(b, c);
        android.graphics.Bitmap bitmap = bitmap1;
        if (e.a.i)
        {
            bitmap = e.a(bitmap1);
        }
        d.a(bitmap);
        return null;
    }

    (t t1, float f, int i, int j, h h1)
    {
        e = t1;
        a = f;
        b = i;
        c = j;
        d = h1;
        super();
    }
}
