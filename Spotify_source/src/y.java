// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.List;

public final class y
{

    final z a;

    y(z z1)
    {
        a = z1;
    }

    public final int a()
    {
        java.util.ArrayList arraylist = a.d.b;
        if (arraylist == null)
        {
            return 0;
        } else
        {
            return arraylist.size();
        }
    }

    public final List a(List list)
    {
        if (a.d.b == null)
        {
            return null;
        } else
        {
            list.addAll(a.d.b);
            return list;
        }
    }

    public final void b()
    {
        a.d.j = false;
    }

    public final boolean c()
    {
        return a.d.i();
    }
}
