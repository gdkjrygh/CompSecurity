// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.a.d;

import com.google.a.b.a.h;
import com.google.a.b.u;

// Referenced classes of package com.google.a.d:
//            a

final class b extends u
{

    b()
    {
    }

    public void a(a a1)
    {
        if (a1 instanceof h)
        {
            ((h)a1).o();
            return;
        }
        int j = com.google.a.d.a.a(a1);
        int i = j;
        if (j == 0)
        {
            i = com.google.a.d.a.b(a1);
        }
        if (i == 13)
        {
            com.google.a.d.a.a(a1, 9);
            return;
        }
        if (i == 12)
        {
            com.google.a.d.a.a(a1, 8);
            return;
        }
        if (i == 14)
        {
            com.google.a.d.a.a(a1, 10);
            return;
        } else
        {
            throw new IllegalStateException((new StringBuilder()).append("Expected a name but was ").append(a1.f()).append(" ").append(" at line ").append(com.google.a.d.a.c(a1)).append(" column ").append(com.google.a.d.a.d(a1)).append(" path ").append(a1.q()).toString());
        }
    }
}
