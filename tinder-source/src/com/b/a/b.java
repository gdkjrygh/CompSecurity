// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.b.a;

import com.b.a.a.a;
import com.b.a.a.c;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

// Referenced classes of package com.b.a:
//            a

public final class b
{

    // Unreferenced inner class com/b/a/b$1

/* anonymous class */
    public static final class _cls1
        implements com.b.a.a
    {

        public final c a()
        {
            return new c(this) {

                final _cls1 a;

                public final Object a()
                {
                    return new ArrayList();
                }

            
            {
                a = _pcls1;
                super();
            }
            };
        }

        public final a b()
        {
            return new a(this) {

                final _cls1 a;

                public final void a(Object obj, Object obj1)
                {
                    ((List)obj).add(obj1);
                }

            
            {
                a = _pcls1;
                super();
            }
            };
        }

    }


    // Unreferenced inner class com/b/a/b$2

/* anonymous class */
    public static final class _cls2
        implements com.b.a.a
    {

        public final c a()
        {
            return new c(this) {

                final _cls2 a;

                public final Object a()
                {
                    return new HashSet();
                }

            
            {
                a = _pcls2;
                super();
            }
            };
        }

        public final a b()
        {
            return new a(this) {

                final _cls2 a;

                public final void a(Object obj, Object obj1)
                {
                    ((Set)obj).add(obj1);
                }

            
            {
                a = _pcls2;
                super();
            }
            };
        }

    }

}
