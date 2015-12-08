// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package bo.app;

import java.util.EnumMap;

// Referenced classes of package bo.app:
//            go, ff, gh, gi, 
//            gw

final class gg extends go
{

    private final transient EnumMap a;

    gg(EnumMap enummap)
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
        ff.a(flag);
    }

    static EnumMap a(gg gg1)
    {
        return gg1.a;
    }

    final gw a()
    {
        return new gh(this);
    }

    final gw c()
    {
        return new gi(this);
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
