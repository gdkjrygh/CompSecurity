// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.concurrent.Callable;

final class nhv
    implements Callable
{

    private nxx a;
    private nhu b;

    nhv(nhu nhu1, nxx nxx)
    {
        b = nhu1;
        a = nxx;
        super();
    }

    public final Object call()
    {
        nhr.b(b.l).a(a);
        java.io.IOException ioexception = nhr.a(b.l, a);
        if (ioexception != null)
        {
            b.a(ioexception);
        }
        return null;
    }
}
