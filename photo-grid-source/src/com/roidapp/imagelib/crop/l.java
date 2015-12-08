// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.imagelib.crop;

import com.roidapp.imagelib.filter.av;

// Referenced classes of package com.roidapp.imagelib.crop:
//            j

final class l
    implements Runnable
{

    final Throwable a;
    final String b;
    final j c;

    l(j j1, Throwable throwable, String s)
    {
        c = j1;
        a = throwable;
        b = s;
        super();
    }

    public final void run()
    {
        if (j.a(c) != null)
        {
            j.a(c).a(a, b);
        }
    }
}
