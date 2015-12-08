// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.internal;

import com.facebook.aa;
import com.facebook.aj;
import com.facebook.n;

// Referenced classes of package com.facebook.internal:
//            bb, au

final class ay
    implements aa
{

    final bb a;
    final String b;

    ay(bb bb1, String s)
    {
        a = bb1;
        b = s;
        super();
    }

    public final void a(aj aj1)
    {
        if (aj1.a() != null)
        {
            a.a(aj1.a().f());
            return;
        } else
        {
            au.a(b, aj1.b());
            a.a(aj1.b());
            return;
        }
    }
}
