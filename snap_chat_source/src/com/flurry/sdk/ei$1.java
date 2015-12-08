// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.flurry.sdk;

import java.io.InputStream;
import java.io.OutputStream;

// Referenced classes of package com.flurry.sdk:
//            ei, ek, eu

class it>
    implements it>
{

    final ei a;

    public void a(ek ek1)
    {
        ei.d(a);
    }

    public void a(ek ek1, InputStream inputstream)
    {
        while (!ek1.d() || ei.c(a) == null) 
        {
            return;
        }
        ei.a(a, ei.c(a).a(inputstream));
    }

    public void a(ek ek1, OutputStream outputstream)
    {
        if (ei.a(a) != null && ei.b(a) != null)
        {
            ei.b(a).a(outputstream, ei.a(a));
        }
    }

    (ei ei1)
    {
        a = ei1;
        super();
    }
}
