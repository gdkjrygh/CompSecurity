// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.threadlist;

import com.google.common.base.Supplier;

// Referenced classes of package com.facebook.orca.threadlist:
//            q, af, ag

class aj
    implements Supplier
{

    final af a;

    private aj(af af1)
    {
        a = af1;
        super();
    }

    aj(af af1, ag ag)
    {
        this(af1);
    }

    public q a()
    {
        return new q(af.c(a));
    }

    public Object get()
    {
        return a();
    }
}
