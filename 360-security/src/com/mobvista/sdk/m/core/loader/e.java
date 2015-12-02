// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mobvista.sdk.m.core.loader;

import com.mobvista.sdk.m.a.a.c.d;

// Referenced classes of package com.mobvista.sdk.m.core.loader:
//            c, g

final class e
    implements d
{

    final c a;

    e(c c1)
    {
        a = c1;
        super();
    }

    public final void OnLoadCanceled(int i)
    {
        c.b(a, false);
    }

    public final void OnLoadError(int i, String s)
    {
        c.b(a, false);
        if (c.a(a) != null)
        {
            c.a(a).a(s);
        }
    }

    public final void OnLoadFinish(int i, Object obj)
    {
        c.b(a, false);
        if (c.a(a) != null)
        {
            c.a(a).a(obj);
        }
    }

    public final void OnLoadStart(int i)
    {
    }
}
