// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.b.a;

import com.b.a.a.a;
import com.b.a.b.e;
import com.b.a.c.h;
import com.b.a.c.s;

// Referenced classes of package com.b.a:
//            a

public final class b
{

    private a a;
    private e b;
    private h c;
    private s d;

    public b()
    {
    }

    public final com.b.a.a a()
    {
        if (d != null)
        {
            if (c != null)
            {
                throw new IllegalStateException("Must not use Deprecated methods delay(), disabled(), listener(), pinningInfoProvider() with core()");
            }
            c = d.a();
        }
        if (a == null)
        {
            a = new a();
        }
        if (b == null)
        {
            b = new e();
        }
        if (c == null)
        {
            c = new h();
        }
        return new com.b.a.a(a, b, c);
    }

    public final b a(h h1)
    {
        if (h1 == null)
        {
            throw new NullPointerException("CrashlyticsCore Kit must not be null.");
        }
        if (c != null)
        {
            throw new IllegalStateException("CrashlyticsCore Kit already set.");
        } else
        {
            c = h1;
            return this;
        }
    }
}
