// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nuance.dragon.toolkit.a;

import com.nuance.dragon.toolkit.audio.g;
import java.util.List;

// Referenced classes of package com.nuance.dragon.toolkit.a:
//            l

final class m
    implements Runnable
{

    final g a;
    final l b;

    m(l l1, g g)
    {
        b = l1;
        a = g;
        super();
    }

    public final void run()
    {
        l.a(b).add(a);
        l.b(b);
    }
}
