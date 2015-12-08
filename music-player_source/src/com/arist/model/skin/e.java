// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.arist.model.skin;

import com.arist.activity.MyApplication;
import com.arist.c.f;

// Referenced classes of package com.arist.model.skin:
//            i, b, g

final class e
    implements i
{

    final b a;
    private final g b;

    e(b b1, g g1)
    {
        a = b1;
        b = g1;
        super();
    }

    public final void a(int j)
    {
        b b1 = a;
        MyApplication.e.f(j);
        a.a(j);
        b.dismiss();
    }
}
