// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.a;

import com.google.a.d.a;
import com.google.a.d.d;

// Referenced classes of package com.google.a:
//            af

class p extends af
{

    private af a;

    p()
    {
    }

    public void a(af af1)
    {
        if (a != null)
        {
            throw new AssertionError();
        } else
        {
            a = af1;
            return;
        }
    }

    public void a(d d, Object obj)
    {
        if (a == null)
        {
            throw new IllegalStateException();
        } else
        {
            a.a(d, obj);
            return;
        }
    }

    public Object b(a a1)
    {
        if (a == null)
        {
            throw new IllegalStateException();
        } else
        {
            return a.b(a1);
        }
    }
}
