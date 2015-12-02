// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.common.o;

import com.facebook.common.time.a;
import java.util.HashMap;

// Referenced classes of package com.facebook.common.o:
//            d, a

public class e
{

    private final HashMap a = new HashMap();
    private final a b;

    public e(a a1)
    {
        b = a1;
    }

    public d a(Class class1)
    {
        return new d(this, class1, b);
    }

    void a(Class class1, com.facebook.common.o.a a1)
    {
        a.put(class1, a1);
    }

    public com.facebook.common.o.a b(Class class1)
    {
        return (com.facebook.common.o.a)a.get(class1);
    }
}
