// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.flurry.sdk;

import java.io.InputStream;
import java.io.OutputStream;

// Referenced classes of package com.flurry.sdk:
//            kj, kl, kx

class it>
    implements it>
{

    final kj a;

    public void a(kl kl1)
    {
        kj.d(a);
    }

    public void a(kl kl1, InputStream inputstream)
    {
        while (!kl1.g() || kj.c(a) == null) 
        {
            return;
        }
        kj.a(a, kj.c(a).b(inputstream));
    }

    public void a(kl kl1, OutputStream outputstream)
    {
        if (kj.a(a) != null && kj.b(a) != null)
        {
            kj.b(a).a(outputstream, kj.a(a));
        }
    }

    (kj kj1)
    {
        a = kj1;
        super();
    }
}
