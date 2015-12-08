// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.android.slyce.a.c;

import com.android.slyce.a.a.a;

// Referenced classes of package com.android.slyce.a.c:
//            x, at

class z
    implements a
{

    final x a;

    z(x x1)
    {
        a = x1;
        super();
    }

    public void a(Exception exception)
    {
        if (exception != null && !a.k)
        {
            a.a(new at("connection closed before response completed.", exception));
            return;
        } else
        {
            a.a(exception);
            return;
        }
    }
}
