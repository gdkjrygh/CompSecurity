// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.inject.a;

import com.google.common.a.hy;
import com.google.common.base.Function;
import java.util.Collection;
import java.util.Map;

// Referenced classes of package com.google.inject.a:
//            c

class b
{

    final Map a;
    private final Collection b;
    private Function c;

    b(Collection collection)
    {
        c = new c(this);
        a = (new hy()).f().a(c);
        b = collection;
    }

    static Collection a(b b1)
    {
        return b1.b;
    }

    boolean a(Class class1)
    {
        return ((Boolean)a.get(class1)).booleanValue();
    }
}
