// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package bo.app;

import java.util.concurrent.Callable;

// Referenced classes of package bo.app:
//            dt, ee

final class dy
    implements Callable
{

    final dt a;

    dy(dt dt1)
    {
        a = dt1;
        super();
    }

    public final Object call()
    {
        return a.a.c();
    }
}
