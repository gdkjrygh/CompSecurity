// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

final class aof
    implements anO
{

    private final Map a = new HashMap();

    aof()
    {
    }

    public final anO.a a(anO.b b1)
    {
        return (anO.a)a.get(b1);
    }

    public final void a(int i)
    {
        Iterator iterator = a.entrySet().iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            if (((anO.b)((java.util.Map.Entry)iterator.next()).getKey()).a == i)
            {
                iterator.remove();
            }
        } while (true);
    }

    public final void a(anO.b b1, anO.a a1)
    {
        a.put(b1, a1);
    }

    public final void b(anO.b b1)
    {
        a.remove(b1);
    }
}
