// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package okio;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

// Referenced classes of package okio:
//            s

public final class i extends s
{

    public s a;

    public i(s s1)
    {
        if (s1 == null)
        {
            throw new IllegalArgumentException("delegate == null");
        } else
        {
            a = s1;
            return;
        }
    }

    public final s a(long l)
    {
        return a.a(l);
    }

    public final s a(long l, TimeUnit timeunit)
    {
        return a.a(l, timeunit);
    }

    public final long c()
    {
        return a.c();
    }

    public final s d()
    {
        return a.d();
    }

    public final void f()
        throws IOException
    {
        a.f();
    }

    public final long t_()
    {
        return a.t_();
    }

    public final boolean u_()
    {
        return a.u_();
    }

    public final s v_()
    {
        return a.v_();
    }
}
