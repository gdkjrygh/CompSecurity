// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nuance.b.b;

import com.nuance.b.b.a.e;
import com.nuance.b.b.a.f;

// Referenced classes of package com.nuance.b.b:
//            ci

final class cj
    implements Runnable
{

    final e a;
    final f b;
    final ci c;

    cj(ci ci, e e1, f f)
    {
        c = ci;
        a = e1;
        b = f;
        super();
    }

    public final void run()
    {
        a.onConnectionLost(b);
    }
}
