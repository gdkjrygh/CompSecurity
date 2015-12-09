// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nuance.b.b;

import com.nuance.dragon.toolkit.audio.g;
import java.util.List;

// Referenced classes of package com.nuance.b.b:
//            bc

final class bf
    implements Runnable
{

    final g a;
    final bc b;

    bf(bc bc1, g g)
    {
        b = bc1;
        a = g;
        super();
    }

    public final void run()
    {
        bc.d(b).add(a);
        bc.e(b);
    }
}
