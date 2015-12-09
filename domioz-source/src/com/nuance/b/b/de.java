// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nuance.b.b;

import com.nuance.b.b.a.w;
import com.nuance.b.b.a.z;

// Referenced classes of package com.nuance.b.b:
//            dd

final class de
    implements Runnable
{

    final z a;
    final w b;
    final dd c;

    de(dd dd, z z1, w w)
    {
        c = dd;
        a = z1;
        b = w;
        super();
    }

    public final void run()
    {
        a.a(b);
    }
}
