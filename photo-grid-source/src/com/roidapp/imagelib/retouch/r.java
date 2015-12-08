// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.imagelib.retouch;


// Referenced classes of package com.roidapp.imagelib.retouch:
//            m, t

final class r
    implements Runnable
{

    final Throwable a;
    final String b;
    final m c;

    r(m m1, Throwable throwable, String s)
    {
        c = m1;
        a = throwable;
        b = s;
        super();
    }

    public final void run()
    {
        if (m.a(c) != null)
        {
            m.a(c).a(a, b);
        }
    }
}
