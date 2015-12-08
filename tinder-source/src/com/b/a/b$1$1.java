// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.b.a;

import com.b.a.a.a;
import com.b.a.a.c;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package com.b.a:
//            a, b

final class ct
    implements c
{

    final yList a;

    public final Object a()
    {
        return new ArrayList();
    }

    ct(ct ct)
    {
        a = ct;
        super();
    }

    // Unreferenced inner class com/b/a/b$1

/* anonymous class */
    public static final class b._cls1
        implements com.b.a.a
    {

        public final c a()
        {
            return new b._cls1._cls1(this);
        }

        public final a b()
        {
            return new b._cls1._cls2();
        }


        // Unreferenced inner class com/b/a/b$1$2

/* anonymous class */
        final class b._cls1._cls2
            implements a
        {

            final b._cls1 a;

            public final void a(Object obj, Object obj1)
            {
                ((List)obj).add(obj1);
            }

                    
                    {
                        a = b._cls1.this;
                        super();
                    }
        }

    }

}
