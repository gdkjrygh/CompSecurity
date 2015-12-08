// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import java.util.Map;

// Referenced classes of package com.google.android.gms.internal:
//            vv, vr, wb

final class vs extends vv
{

    final vr a;

    vs(vr vr1)
    {
        a = vr1;
        super();
    }

    protected final int a()
    {
        return a.h;
    }

    protected final int a(Object obj)
    {
        if (obj == null)
        {
            return a.a();
        } else
        {
            return a.a(obj, obj.hashCode());
        }
    }

    protected final Object a(int i, int j)
    {
        return a.g[(i << 1) + j];
    }

    protected final Object a(int i, Object obj)
    {
        vr vr1 = a;
        i = (i << 1) + 1;
        Object obj1 = ((wb) (vr1)).g[i];
        ((wb) (vr1)).g[i] = obj;
        return obj1;
    }

    protected final void a(int i)
    {
        a.d(i);
    }

    protected final void a(Object obj, Object obj1)
    {
        a.put(obj, obj1);
    }

    protected final int b(Object obj)
    {
        return a.a(obj);
    }

    protected final Map b()
    {
        return a;
    }

    protected final void c()
    {
        a.clear();
    }
}
