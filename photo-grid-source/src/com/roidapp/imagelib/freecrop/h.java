// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.imagelib.freecrop;

import com.roidapp.imagelib.filter.av;

// Referenced classes of package com.roidapp.imagelib.freecrop:
//            e

final class h
    implements Runnable
{

    final Throwable a;
    final String b;
    final e c;

    h(e e1, Throwable throwable, String s)
    {
        c = e1;
        a = throwable;
        b = s;
        super();
    }

    public final void run()
    {
        if (e.a(c) != null)
        {
            e.a(c).a(a, b);
        }
    }
}
