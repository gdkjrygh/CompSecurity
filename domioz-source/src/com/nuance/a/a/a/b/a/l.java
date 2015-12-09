// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nuance.a.a.a.b.a;

import android.content.Context;
import com.nuance.a.a.a.a.d.a.d;
import com.nuance.a.a.a.a.d.a.e;

// Referenced classes of package com.nuance.a.a.a.b.a:
//            e, m, b, a, 
//            c

public abstract class l
{

    private static final e c = com.nuance.a.a.a.a.d.a.d.a(com/nuance/a/a/a/b/a/l);
    protected Context a;
    protected com.nuance.a.a.a.b.a.e b;
    private Object d;

    protected l(Context context)
    {
        d = new Object();
        a = context;
        b = new com.nuance.a.a.a.b.a.e(a);
    }

    public static l a(Context context)
    {
        int i = m.a;
        if (i < 8 || com.nuance.a.a.a.b.a.m.d)
        {
            return new b(context);
        }
        if (i < 9)
        {
            return new a(context);
        } else
        {
            return new c(context);
        }
    }

    public final boolean a()
    {
        return b.a() != null;
    }

    public final void b()
    {
        if (b != null)
        {
            try
            {
                b.b();
            }
            catch (Throwable throwable) { }
            b = null;
        }
    }

}
