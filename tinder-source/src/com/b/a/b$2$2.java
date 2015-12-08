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

final class ct
    implements a
{

    final ct a;

    public final void a(Object obj, Object obj1)
    {
        ((Set)obj).add(obj1);
    }

    ct(ct ct)
    {
        a = ct;
        super();
    }

    // Unreferenced inner class com/b/a/b$2

/* anonymous class */
    public static final class b._cls2
        implements com.b.a.a
    {

        public final c a()
        {
            return new b._cls2._cls1();
        }

        public final a b()
        {
            return new b._cls2._cls2(this);
        }


        // Unreferenced inner class com/b/a/b$2$1

/* anonymous class */
        final class b._cls2._cls1
            implements c
        {

            final b._cls2 a;

            public final Object a()
            {
                return new HashSet();
            }

                    
                    {
                        a = b._cls2.this;
                        super();
                    }
        }

    }

}
