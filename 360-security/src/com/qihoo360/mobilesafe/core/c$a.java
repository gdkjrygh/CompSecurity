// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo360.mobilesafe.core;

import com.qihoo360.mobilesafe.core.a.a;
import com.qihoo360.mobilesafe.core.b.d;
import java.util.List;

// Referenced classes of package com.qihoo360.mobilesafe.core:
//            c, a

class b
    implements a, d
{

    final c a;
    private final List b;

    public void a()
    {
        com.qihoo360.mobilesafe.core.c.l(a);
    }

    public void a(int i, int j)
    {
        com.qihoo360.mobilesafe.core.c.a(a, i, j);
    }

    public void a(List list)
    {
    }

    public void a(List list, List list1)
    {
        if (com.qihoo360.mobilesafe.core.c.e(a) != null)
        {
            com.qihoo360.mobilesafe.core.c.e(a).(list, b, this);
        }
    }

    public void b()
    {
    }

    public void b(List list)
    {
    }

    public void c()
    {
    }

    (c c1, List list)
    {
        a = c1;
        b = list;
        super();
    }
}
