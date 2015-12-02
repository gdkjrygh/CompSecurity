// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.bugreporter;

import android.content.Context;
import com.google.common.d.a.h;

// Referenced classes of package com.facebook.bugreporter:
//            g, BugReport

class i
    implements h
{

    final Context a;
    final g b;

    i(g g1, Context context)
    {
        b = g1;
        a = context;
        super();
    }

    public void a(BugReport bugreport)
    {
        g.a(b, a, bugreport);
    }

    public volatile void a(Object obj)
    {
        a((BugReport)obj);
    }

    public void a(Throwable throwable)
    {
        g.a(b, throwable);
    }
}
