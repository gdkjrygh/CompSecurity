// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.c.e.b;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package org.c.e.b:
//            s

final class t
    implements s
{

    private final Iterator a;

    public transient t(Object aobj[])
    {
        a = Arrays.asList(aobj).iterator();
    }

    public final Object a(String s1)
    {
        if (!a.hasNext())
        {
            throw new IllegalArgumentException((new StringBuilder("Not enough variable values available to expand '")).append(s1).append("'").toString());
        } else
        {
            return a.next();
        }
    }
}
