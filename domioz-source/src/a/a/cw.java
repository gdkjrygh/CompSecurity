// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package a.a;

import java.util.concurrent.Callable;

// Referenced classes of package a.a:
//            cr, dd

final class cw
    implements Callable
{

    final cr a;

    cw(cr cr1)
    {
        a = cr1;
        super();
    }

    public final Object call()
    {
        return cr.a(a).c();
    }
}
