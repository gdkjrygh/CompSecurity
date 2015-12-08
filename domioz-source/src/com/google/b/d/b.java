// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.b.d;

import com.google.b.b.a.h;
import com.google.b.b.u;

// Referenced classes of package com.google.b.d:
//            a

final class b extends u
{

    b()
    {
    }

    public final void a(a a1)
    {
        if (a1 instanceof h)
        {
            ((h)a1).o();
            return;
        }
        int j = com.google.b.d.a.a(a1);
        int i = j;
        if (j == 0)
        {
            i = com.google.b.d.a.b(a1);
        }
        if (i == 13)
        {
            com.google.b.d.a.a(a1, 9);
            return;
        }
        if (i == 12)
        {
            com.google.b.d.a.a(a1, 8);
            return;
        }
        if (i == 14)
        {
            com.google.b.d.a.a(a1, 10);
            return;
        } else
        {
            throw new IllegalStateException((new StringBuilder("Expected a name but was ")).append(a1.f()).append("  at line ").append(com.google.b.d.a.c(a1)).append(" column ").append(com.google.b.d.a.d(a1)).append(" path ").append(a1.q()).toString());
        }
    }
}
