// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.location;

import java.util.concurrent.Callable;

// Referenced classes of package com.facebook.location:
//            d, f, g

class e
    implements Callable
{

    final f a;
    final d b;

    e(d d1, f f)
    {
        b = d1;
        a = f;
        super();
    }

    public g a()
    {
        return d.a(b, a);
    }

    public Object call()
    {
        return a();
    }
}
