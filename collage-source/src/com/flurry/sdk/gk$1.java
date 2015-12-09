// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.flurry.sdk;

import java.io.InputStream;
import java.io.OutputStream;

// Referenced classes of package com.flurry.sdk:
//            gk, gl, gx

class it>
    implements it>
{

    final gk a;

    public void a(gl gl1)
    {
        gk.d(a);
    }

    public void a(gl gl1, InputStream inputstream)
        throws Exception
    {
        while (!gl1.d() || gk.c(a) == null) 
        {
            return;
        }
        gk.a(a, gk.c(a).b(inputstream));
    }

    public void a(gl gl1, OutputStream outputstream)
        throws Exception
    {
        if (gk.a(a) != null && gk.b(a) != null)
        {
            gk.b(a).a(outputstream, gk.a(a));
        }
    }

    (gk gk1)
    {
        a = gk1;
        super();
    }
}
