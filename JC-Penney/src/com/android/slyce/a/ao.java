// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.android.slyce.a;

import com.android.slyce.a.a.e;

// Referenced classes of package com.android.slyce.a:
//            aj, am

public class ao
    implements e
{

    static final boolean d;
    e a;
    int b;
    aj c;

    public ao()
    {
        c = new aj();
    }

    private boolean a(am am)
    {
        if (b > c.d())
        {
            return false;
        }
        e e1 = a;
        a = null;
        e1.a(am, c);
        if (!d && c.e())
        {
            throw new AssertionError();
        } else
        {
            return true;
        }
    }

    public void a(int i, e e1)
    {
        if (!d && a != null)
        {
            throw new AssertionError();
        }
        b = i;
        a = e1;
        if (!d && c.e())
        {
            throw new AssertionError();
        } else
        {
            c.m();
            return;
        }
    }

    public void a(am am, aj aj1)
    {
        if (!d && a == null)
        {
            throw new AssertionError();
        }
        do
        {
            int i = Math.min(aj1.d(), b - c.d());
            aj1.a(c, i);
            aj1.d();
        } while (a(am) && a != null);
        aj1.d();
    }

    static 
    {
        boolean flag;
        if (!com/android/slyce/a/ao.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        d = flag;
    }
}
