// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package bo.app;

import java.util.EnumMap;

// Referenced classes of package bo.app:
//            gj, fa, gc, gd, 
//            gr

final class gb extends gj
{

    private final transient EnumMap a;

    gb(EnumMap enummap)
    {
        a = enummap;
        boolean flag;
        if (!enummap.isEmpty())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        fa.a(flag);
    }

    static EnumMap a(gb gb1)
    {
        return gb1.a;
    }

    final gr a()
    {
        return new gc(this);
    }

    final gr c()
    {
        return new gd(this);
    }

    public final boolean containsKey(Object obj)
    {
        return a.containsKey(obj);
    }

    final boolean e()
    {
        return false;
    }

    public final Object get(Object obj)
    {
        return a.get(obj);
    }

    public final int size()
    {
        return a.size();
    }
}
