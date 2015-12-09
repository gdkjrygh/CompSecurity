// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.android.slyce.a.b;

import com.android.slyce.a.a.a;

// Referenced classes of package com.android.slyce.a.b:
//            b

class c
    implements a
{

    static final boolean b;
    boolean a;
    final b c;

    c(b b1)
    {
        c = b1;
        super();
    }

    public void a(Exception exception)
    {
        if (a)
        {
            return;
        }
        a = true;
        if (!b && !com.android.slyce.a.b.b.a(c))
        {
            throw new AssertionError();
        }
        com.android.slyce.a.b.b.a(c, false);
        if (exception == null)
        {
            com.android.slyce.a.b.b.b(c);
            return;
        } else
        {
            c.a(exception);
            return;
        }
    }

    static 
    {
        boolean flag;
        if (!com/android/slyce/a/b/b.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        b = flag;
    }
}
