// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mobvista.sdk.m.core.loader;

import com.mobvista.sdk.m.a.a.c.d;

// Referenced classes of package com.mobvista.sdk.m.core.loader:
//            c, g

final class f
    implements d
{

    final c a;

    f(c c1)
    {
        a = c1;
        super();
    }

    public final void OnLoadCanceled(int i)
    {
        c.c(a, false);
        if (c.a(a) != null)
        {
            c.a(a);
        }
    }

    public final void OnLoadError(int i, String s)
    {
        c.c(a, false);
        if (c.a(a) != null)
        {
            c.a(a).a(s);
        }
    }

    public final void OnLoadFinish(int i, Object obj)
    {
        c.c(a, false);
        if (c.a(a) != null)
        {
            c.a(a).a(obj);
        }
    }

    public final void OnLoadStart(int i)
    {
        if (c.a(a) != null)
        {
            c.a(a);
        }
    }
}
