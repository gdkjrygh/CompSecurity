// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.d;

import java.util.concurrent.Callable;

// Referenced classes of package com.facebook.orca.d:
//            e

class i
    implements Callable
{

    final e a;

    i(e e1)
    {
        a = e1;
        super();
    }

    public Void a()
    {
        e.c(a);
        return null;
    }

    public Object call()
    {
        return a();
    }
}
