// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.android.slyce.a;

import com.android.slyce.a.a.a;

// Referenced classes of package com.android.slyce.a:
//            i, aj

class m
    implements a
{

    final i a;

    m(i j)
    {
        a = j;
        super();
    }

    public void a(Exception exception)
    {
        if (!a.n)
        {
            a.n = true;
            a.o = exception;
            if (!a.p.e() && a.s != null)
            {
                a.s.a(exception);
                return;
            }
        }
    }
}
