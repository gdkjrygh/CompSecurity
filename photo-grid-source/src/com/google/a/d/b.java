// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.a.d;

import com.google.a.b.a.g;
import com.google.a.b.q;

// Referenced classes of package com.google.a.d:
//            a, e

final class b extends q
{

    b()
    {
    }

    public final void a(a a1)
    {
        if (a1 instanceof g)
        {
            ((g)a1).o();
            return;
        }
        a1.f();
        if (com.google.a.d.a.a(a1) != e.e)
        {
            throw new IllegalStateException((new StringBuilder("Expected a name but was ")).append(a1.f()).append("  at line ").append(com.google.a.d.a.b(a1)).append(" column ").append(com.google.a.d.a.c(a1)).toString());
        } else
        {
            com.google.a.d.a.a(a1, com.google.a.d.a.d(a1));
            com.google.a.d.a.e(a1);
            com.google.a.d.a.a(a1, e.f);
            return;
        }
    }
}
