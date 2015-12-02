// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.a;

import java.util.Iterator;
import java.util.Set;

// Referenced classes of package com.google.common.a:
//            kp, gg

final class km extends kp
{

    final Set a;
    final Set b;
    final Set c;

    public boolean contains(Object obj)
    {
        return a.contains(obj) || c.contains(obj);
    }

    public boolean isEmpty()
    {
        return a.isEmpty() && c.isEmpty();
    }

    public Iterator iterator()
    {
        return gg.a(gg.b(a.iterator(), b.iterator()));
    }

    public int size()
    {
        return a.size() + b.size();
    }
}
