// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.l;

import java.util.concurrent.Callable;

// Referenced classes of package com.facebook.l:
//            k

class n
    implements Callable
{

    final k a;

    n(k k1)
    {
        a = k1;
        super();
    }

    public Void a()
    {
        k.c(a);
        return null;
    }

    public Object call()
    {
        return a();
    }
}
