// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.unveil.env;

import android.graphics.Bitmap;

// Referenced classes of package com.google.android.apps.unveil.env:
//            j, m, Size

final class l extends j
{

    private final j c;
    private final m d = m.a();

    public l(j j1)
    {
        super(j1.a(), j1.a);
        c = j1;
        d.a(this, j1);
    }

    public final int a()
    {
        return c.a();
    }

    public final Size b()
    {
        return c.b();
    }

    public final Bitmap c()
    {
        return c.c();
    }

    public final int d()
    {
        return c.d();
    }

    public final void e()
    {
        c.e();
    }
}
