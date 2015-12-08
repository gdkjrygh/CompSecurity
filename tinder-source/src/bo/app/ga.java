// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package bo.app;

import java.util.EnumMap;

// Referenced classes of package bo.app:
//            gi, ez, gb, gc, 
//            gq

final class ga extends gi
{

    private final transient EnumMap a;

    ga(EnumMap enummap)
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
        ez.a(flag);
    }

    static EnumMap a(ga ga1)
    {
        return ga1.a;
    }

    final gq a()
    {
        return new gb(this);
    }

    final gq c()
    {
        return new gc(this);
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
