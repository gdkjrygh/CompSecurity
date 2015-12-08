// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.b.a.c;

import java.util.concurrent.Callable;

// Referenced classes of package com.b.a.c:
//            aa

final class ac
    implements Callable
{

    final aa a;

    ac(aa aa1)
    {
        a = aa1;
        super();
    }

    public final Object call()
    {
        aa.b(a);
        return null;
    }
}
