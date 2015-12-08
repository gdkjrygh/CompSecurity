// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.b.b.a;

import com.google.b.al;
import com.google.b.am;
import com.google.b.b.b;
import com.google.b.b.f;
import com.google.b.c.a;
import com.google.b.k;
import java.util.Collection;

// Referenced classes of package com.google.b.b.a:
//            d

public final class c
    implements am
{

    private final f a;

    public c(f f1)
    {
        a = f1;
    }

    public final al a(k k1, a a1)
    {
        java.lang.reflect.Type type = a1.getType();
        Class class1 = a1.getRawType();
        if (!java/util/Collection.isAssignableFrom(class1))
        {
            return null;
        } else
        {
            type = b.a(type, class1);
            return new d(k1, type, k1.a(com.google.b.c.a.get(type)), a.a(a1));
        }
    }
}
