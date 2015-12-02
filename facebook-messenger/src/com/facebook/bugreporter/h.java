// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.bugreporter;

import android.graphics.Bitmap;
import com.google.common.a.ev;
import java.util.concurrent.Callable;

// Referenced classes of package com.facebook.bugreporter:
//            g, BugReport

class h
    implements Callable
{

    final Bitmap a;
    final ev b;
    final ev c;
    final g d;

    h(g g1, Bitmap bitmap, ev ev, ev ev1)
    {
        d = g1;
        a = bitmap;
        b = ev;
        c = ev1;
        super();
    }

    public BugReport a()
    {
        return g.a(d, a, b, c);
    }

    public Object call()
    {
        return a();
    }
}
