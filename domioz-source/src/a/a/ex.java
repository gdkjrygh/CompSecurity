// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package a.a;

import java.util.EnumMap;
import java.util.Iterator;
import java.util.Set;

// Referenced classes of package a.a:
//            fm, ew, ft, gs

final class ex extends fm
{

    final ew a;

    ex(ew ew1)
    {
        a = ew1;
        super();
    }

    public final gs a()
    {
        return ft.a(ew.a(a).keySet().iterator());
    }

    public final boolean contains(Object obj)
    {
        return ew.a(a).containsKey(obj);
    }

    final boolean e()
    {
        return true;
    }

    public final Iterator iterator()
    {
        return a();
    }

    public final int size()
    {
        return a.size();
    }
}
