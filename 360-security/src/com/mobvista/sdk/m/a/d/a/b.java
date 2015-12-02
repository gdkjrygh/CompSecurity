// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mobvista.sdk.m.a.d.a;

import android.graphics.drawable.Drawable;

// Referenced classes of package com.mobvista.sdk.m.a.d.a:
//            l, n, a

final class b extends l
{

    final a a;

    b(a a1, int i)
    {
        a = a1;
        super(i);
    }

    private static void a(Drawable drawable)
    {
        if (com/mobvista/sdk/m/a/d/a/n.isInstance(drawable))
        {
            ((n)drawable).a(false);
        }
    }

    private static int b(Drawable drawable)
    {
        int j = com.mobvista.sdk.m.a.d.a.a.a(drawable);
        int i = j;
        if (j == 0)
        {
            i = 1;
        }
        return i;
    }

    protected final int a(Object obj, Object obj1)
    {
        return b((Drawable)obj1);
    }

    protected final volatile void a(boolean flag, Object obj, Object obj1, Object obj2)
    {
        a((Drawable)obj1);
    }
}
