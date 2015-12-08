// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package a.a;

import java.util.EnumMap;

// Referenced classes of package a.a:
//            fe, du, ex, ey, 
//            fm

final class ew extends fe
{

    private final transient EnumMap a;

    ew(EnumMap enummap)
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
        du.a(flag);
    }

    static EnumMap a(ew ew1)
    {
        return ew1.a;
    }

    final fm a()
    {
        return new ex(this);
    }

    final fm c()
    {
        return new ey(this);
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
