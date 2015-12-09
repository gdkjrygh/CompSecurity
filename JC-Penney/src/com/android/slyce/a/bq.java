// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.android.slyce.a;

import com.android.slyce.a.a.a;
import com.android.slyce.a.a.h;

// Referenced classes of package com.android.slyce.a:
//            ap, aj

final class bq
    implements h
{

    final ap a;
    final aj b;
    final a c;

    bq(ap ap1, aj aj1, a a1)
    {
        a = ap1;
        b = aj1;
        c = a1;
        super();
    }

    public void a()
    {
        a.a(b);
        if (b.d() == 0 && c != null)
        {
            a.a(null);
            c.a(null);
        }
    }
}
