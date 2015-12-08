// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.b;

import com.google.b.d.a;
import com.google.b.d.d;

// Referenced classes of package com.google.b:
//            al

final class q extends al
{

    private al a;

    q()
    {
    }

    public final Object a(a a1)
    {
        if (a == null)
        {
            throw new IllegalStateException();
        } else
        {
            return a.a(a1);
        }
    }

    public final void a(al al1)
    {
        if (a != null)
        {
            throw new AssertionError();
        } else
        {
            a = al1;
            return;
        }
    }

    public final void a(d d, Object obj)
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
}
