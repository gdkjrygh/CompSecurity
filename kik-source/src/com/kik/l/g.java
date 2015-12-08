// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kik.l;

import com.kik.g.p;

// Referenced classes of package com.kik.l:
//            f

final class g
    implements Runnable
{

    final p a;
    final f b;

    g(f f1, p p1)
    {
        b = f1;
        a = p1;
        super();
    }

    public final void run()
    {
        f.a(b).run();
        a.a(null);
    }
}
