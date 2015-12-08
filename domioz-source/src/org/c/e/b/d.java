// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.c.e.b;

import java.util.Map;

// Referenced classes of package org.c.e.b:
//            s

final class d
    implements s
{

    private final Map a;

    public d(Map map)
    {
        a = map;
    }

    public final Object a(String s1)
    {
        if (!a.containsKey(s1))
        {
            throw new IllegalArgumentException((new StringBuilder("Map has no value for '")).append(s1).append("'").toString());
        } else
        {
            return a.get(s1);
        }
    }
}
