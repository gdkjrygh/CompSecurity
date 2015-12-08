// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.a.b.a;

import com.google.a.am;
import com.google.a.an;
import com.google.a.b.b;
import com.google.a.b.f;
import com.google.a.c.a;
import com.google.a.k;
import java.util.Collection;

// Referenced classes of package com.google.a.b.a:
//            d

public final class c
    implements an
{

    private final f a;

    public c(f f1)
    {
        a = f1;
    }

    public final am a(k k1, a a1)
    {
        java.lang.reflect.Type type = a1.b();
        Class class1 = a1.a();
        if (!java/util/Collection.isAssignableFrom(class1))
        {
            return null;
        } else
        {
            type = b.a(type, class1);
            return new d(this, k1, type, k1.a(com.google.a.c.a.a(type)), a.a(a1));
        }
    }
}
