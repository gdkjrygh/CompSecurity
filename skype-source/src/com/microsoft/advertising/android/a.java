// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.microsoft.advertising.android;

import java.util.Collections;
import java.util.List;

// Referenced classes of package com.microsoft.advertising.android:
//            d, l, ab, bx

abstract class a
    implements d
{

    private final long a = System.currentTimeMillis();
    private l b;

    protected a(l l1)
    {
        if (l1 == null)
        {
            l1 = new l();
        }
        b = l1;
        b.b(com.microsoft.advertising.android.a.a.f);
    }

    public final long a()
    {
        return a;
    }

    public List b()
    {
        return Collections.emptyList();
    }

    public final l c()
    {
        return b;
    }

    public float d()
    {
        return (float)ab.a().a("AD_VISIBILITY_SCREEN_AREA_PP") / 100F;
    }
}
