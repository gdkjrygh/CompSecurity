// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.taplytics;

import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.Map;

// Referenced classes of package com.taplytics:
//            id

public final class hy
    implements Iterable
{

    final List a = new LinkedList();
    final Map b = new HashMap();

    public hy()
    {
    }

    public final id a(String s)
    {
        s = s.toLowerCase(Locale.ROOT);
        s = (List)b.get(s);
        if (s != null && !s.isEmpty())
        {
            return (id)s.get(0);
        } else
        {
            return null;
        }
    }

    public final Iterator iterator()
    {
        return Collections.unmodifiableList(a).iterator();
    }

    public final String toString()
    {
        return a.toString();
    }
}
