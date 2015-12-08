// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package a.a;

import java.util.EnumMap;
import java.util.Iterator;
import java.util.Set;

// Referenced classes of package a.a:
//            gs, ey, ew, fz

final class ez extends gs
{

    final ey a;
    private final Iterator b;

    ez(ey ey1)
    {
        a = ey1;
        super();
        b = ew.a(a.a).entrySet().iterator();
    }

    public final boolean hasNext()
    {
        return b.hasNext();
    }

    public final Object next()
    {
        java.util.Map.Entry entry = (java.util.Map.Entry)b.next();
        return fz.a(entry.getKey(), entry.getValue());
    }
}
