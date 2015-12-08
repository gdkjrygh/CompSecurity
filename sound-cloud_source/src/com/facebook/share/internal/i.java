// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.share.internal;

import com.facebook.p;

// Referenced classes of package com.facebook.share.internal:
//            c

final class i
    implements Runnable
{

    final c.c a;
    final c b;
    final p c;

    i(c.c c1, c c2, p p)
    {
        a = c1;
        b = c2;
        c = p;
        super();
    }

    public final void run()
    {
        a.a(b, c);
    }
}
