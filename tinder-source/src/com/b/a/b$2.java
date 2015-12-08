// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.b.a;

import com.b.a.a.a;
import com.b.a.a.c;
import java.util.HashSet;
import java.util.Set;

// Referenced classes of package com.b.a:
//            a, b

public static final class ject
    implements com.b.a.a
{

    public final c a()
    {
        return new c() {

            final b._cls2 a;

            public final Object a()
            {
                return new HashSet();
            }

            
            {
                a = b._cls2.this;
                super();
            }
        };
    }

    public final a b()
    {
        return new a() {

            final b._cls2 a;

            public final void a(Object obj, Object obj1)
            {
                ((Set)obj).add(obj1);
            }

            
            {
                a = b._cls2.this;
                super();
            }
        };
    }

    public ject()
    {
    }
}
