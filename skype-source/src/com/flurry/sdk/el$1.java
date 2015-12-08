// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.flurry.sdk;

import java.io.InputStream;
import java.io.OutputStream;

// Referenced classes of package com.flurry.sdk:
//            el, en, ex

class it>
    implements it>
{

    final el a;

    public void a(en en1)
    {
        el.d(a);
    }

    public void a(en en1, InputStream inputstream)
        throws Exception
    {
        while (!en1.d() || el.c(a) == null) 
        {
            return;
        }
        el.a(a, el.c(a).a(inputstream));
    }

    public void a(en en1, OutputStream outputstream)
        throws Exception
    {
        if (el.a(a) != null && el.b(a) != null)
        {
            el.b(a).a(outputstream, el.a(a));
        }
    }

    (el el1)
    {
        a = el1;
        super();
    }
}
