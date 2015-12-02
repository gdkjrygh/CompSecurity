// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.inject;

import android.content.Context;
import com.google.inject.a;
import java.util.Map;

// Referenced classes of package com.facebook.inject:
//            a, m, ab, n

public class l extends com.facebook.inject.a
{

    private final Context a;
    private final n b;
    private final ab c;

    public l(ab ab1, n n, Context context)
    {
        c = ab1;
        b = n;
        a = context;
    }

    static Context a(l l1)
    {
        return l1.a;
    }

    static n b(l l1)
    {
        return l1.b;
    }

    static ab c(l l1)
    {
        return l1.c;
    }

    public javax.inject.a b(a a1)
    {
        return new m(this, c.b(a1));
    }

    public javax.inject.a c(a a1)
    {
        return b(a1);
    }

    public Map d()
    {
        return c.d();
    }

    public boolean d(a a1)
    {
        return c.d(a1);
    }

    public ab e()
    {
        return c.e();
    }
}
