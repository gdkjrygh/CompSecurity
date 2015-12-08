// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.android.slyce.a.c;

import com.android.slyce.a.a.a;

// Referenced classes of package com.android.slyce.a.c:
//            x, a

class g
    implements a
{

    final x a;
    final com.android.slyce.a.c.a b;

    g(com.android.slyce.a.c.a a1, x x1)
    {
        b = a1;
        a = x1;
        super();
    }

    public void a(Exception exception)
    {
        if (exception != null)
        {
            a.a(exception);
            return;
        } else
        {
            a.n();
            return;
        }
    }
}
