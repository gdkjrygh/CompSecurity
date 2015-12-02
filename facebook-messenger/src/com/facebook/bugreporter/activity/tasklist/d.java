// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.bugreporter.activity.tasklist;

import com.facebook.bugreporter.l;
import com.google.common.a.es;
import java.util.concurrent.Callable;

// Referenced classes of package com.facebook.bugreporter.activity.tasklist:
//            c

class d
    implements Callable
{

    final String a;
    final l b;
    final c c;

    d(c c1, String s, l l)
    {
        c = c1;
        a = s;
        b = l;
        super();
    }

    public es a()
    {
        return com.facebook.bugreporter.activity.tasklist.c.a(c, a, b);
    }

    public Object call()
    {
        return a();
    }
}
