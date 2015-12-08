// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.c;

import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.google.android.gms.c:
//            c, e, f

final class g
    implements Runnable
{

    final c a;
    final f b;

    g(f f1, c c1)
    {
        b = f1;
        a = c1;
        super();
    }

    public final void run()
    {
        a.h().a(a);
        for (Iterator iterator = f.a(b).iterator(); iterator.hasNext(); iterator.next()) { }
        f.b(a);
    }
}
