// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.a;

import com.google.common.base.Objects;
import java.util.Map;

// Referenced classes of package com.google.common.a:
//            hw

class is
    implements hw
{

    final boolean a;
    final Map b;
    final Map c;
    final Map d;
    final Map e;

    is(boolean flag, Map map, Map map1, Map map2, Map map3)
    {
        a = flag;
        b = map;
        c = map1;
        d = map2;
        e = map3;
    }

    public Map a()
    {
        return b;
    }

    public Map b()
    {
        return c;
    }

    public Map c()
    {
        return d;
    }

    public Map d()
    {
        return e;
    }

    public boolean equals(Object obj)
    {
        if (obj != this)
        {
            if (obj instanceof hw)
            {
                if (!a().equals(((hw) (obj = (hw)obj)).a()) || !b().equals(((hw) (obj)).b()) || !c().equals(((hw) (obj)).c()) || !d().equals(((hw) (obj)).d()))
                {
                    return false;
                }
            } else
            {
                return false;
            }
        }
        return true;
    }

    public int hashCode()
    {
        return Objects.hashCode(new Object[] {
            a(), b(), c(), d()
        });
    }

    public String toString()
    {
        if (a)
        {
            return "equal";
        }
        StringBuilder stringbuilder = new StringBuilder("not equal");
        if (!b.isEmpty())
        {
            stringbuilder.append(": only on left=").append(b);
        }
        if (!c.isEmpty())
        {
            stringbuilder.append(": only on right=").append(c);
        }
        if (!e.isEmpty())
        {
            stringbuilder.append(": value differences=").append(e);
        }
        return stringbuilder.toString();
    }
}
