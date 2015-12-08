// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.app;

import java.util.List;

// Referenced classes of package android.support.v4.app:
//            l, n

public final class k
{

    final l a;

    k(l l1)
    {
        a = l1;
    }

    public final int a()
    {
        java.util.ArrayList arraylist = a.f.f;
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
        if (a.f.f == null)
        {
            return null;
        } else
        {
            list.addAll(a.f.f);
            return list;
        }
    }

    public final void b()
    {
        a.f.s = false;
    }

    public final boolean c()
    {
        return a.f.i();
    }
}
