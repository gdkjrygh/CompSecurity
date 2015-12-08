// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tinder.managers;

import android.util.Pair;
import com.tinder.b.e;
import com.tinder.e.l;
import com.tinder.e.u;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

// Referenced classes of package com.tinder.managers:
//            ab, d

final class a
    implements com.tinder.utils.._cls1
{

    final a a;

    public final void a()
    {
        e.a(a.a);
    }

    a(a a1)
    {
        a = a1;
        super();
    }

    // Unreferenced inner class com/tinder/managers/ab$1

/* anonymous class */
    final class ab._cls1
        implements com.tinder.utils.e.b
    {

        final ab a;

        public final void a()
        {
            HashMap hashmap = (HashMap)e.e();
            for (Iterator iterator = hashmap.keySet().iterator(); iterator.hasNext();)
            {
                String s = (String)iterator.next();
                Pair pair = (Pair)hashmap.get(s);
                if (((Boolean)pair.first).booleanValue())
                {
                    a.a(s, new ab._cls1._cls1(s));
                } else
                if (((Boolean)pair.second).booleanValue())
                {
                    a.a(s, new ab._cls1._cls2(s));
                } else
                {
                    a.a(s, new ab._cls1._cls3(this, s));
                }
            }

        }

            
            {
                a = ab1;
                super();
            }

        // Unreferenced inner class com/tinder/managers/ab$1$1

/* anonymous class */
        final class ab._cls1._cls1
            implements l
        {

            final String a;
            final ab._cls1 b;

            public final void a(int i)
            {
                b.a.g = i;
                com.tinder.utils.e.a(new ab._cls1._cls1._cls1(this)).a(false);
            }

            public final void c()
            {
                b.a.o.e();
            }

            public final void d()
            {
                b.a.o.a(1, null);
            }

                    
                    {
                        b = ab._cls1.this;
                        a = s;
                        super();
                    }
        }


        // Unreferenced inner class com/tinder/managers/ab$1$1$1

/* anonymous class */
        final class ab._cls1._cls1._cls1
            implements com.tinder.utils.e.b
        {

            final ab._cls1._cls1 a;

            public final void a()
            {
                e.a(a.a);
            }

                    
                    {
                        a = _pcls1;
                        super();
                    }
        }


        // Unreferenced inner class com/tinder/managers/ab$1$2

/* anonymous class */
        final class ab._cls1._cls2
            implements l
        {

            final String a;
            final ab._cls1 b;

            public final void a(int i)
            {
                com.tinder.utils.e.a(new ab._cls1._cls2._cls1(this)).a(false);
            }

            public final void c()
            {
                b.a.o.e();
            }

            public final void d()
            {
                b.a.o.a(1, null);
            }

                    
                    {
                        b = ab._cls1.this;
                        a = s;
                        super();
                    }
        }


        // Unreferenced inner class com/tinder/managers/ab$1$2$1

/* anonymous class */
        final class ab._cls1._cls2._cls1
            implements com.tinder.utils.e.b
        {

            final ab._cls1._cls2 a;

            public final void a()
            {
                e.a(a.a);
            }

                    
                    {
                        a = _pcls2;
                        super();
                    }
        }

    }


    // Unreferenced inner class com/tinder/managers/ab$1$3

/* anonymous class */
    final class ab._cls1._cls3
        implements u
    {

        final String a;
        final ab._cls1 b;

        public final void c()
        {
            b.a.o.e();
        }

        public final void d()
        {
            b.a.o.a(1, null);
        }

        public final void f()
        {
            com.tinder.utils.e.a(new ab._cls1._cls3._cls1(this)).a(false);
        }

            
            {
                b = _pcls1;
                a = s;
                super();
            }
    }

}
