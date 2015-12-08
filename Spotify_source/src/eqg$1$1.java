// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.LinkedList;

final class g.Object
    implements Runnable
{

    private int a;
    private a b;

    public final void run()
    {
        b.b.d(a);
    }

    ( , int i)
    {
        b = ;
        a = i;
        super();
    }

    // Unreferenced inner class eqg$1

/* anonymous class */
    final class eqg._cls1
        implements gec
    {

        final eqg a;
        private LinkedList b;

        public final void a(int i)
        {
            b.add(new eqg._cls1._cls1(this, i));
        }

        public final void a(int i, int j)
        {
            b.add(new eqg._cls1._cls2(i, j));
        }

        public final void b(int i)
        {
            b.add(new eqg._cls1._cls3(i));
        }

        public final void b(int i, int j)
        {
            b.add(new eqg._cls1._cls4(i, j));
        }

            
            {
                a = eqg1;
                b = linkedlist;
                super();
            }

        // Unreferenced inner class eqg$1$2

/* anonymous class */
        final class eqg._cls1._cls2
            implements Runnable
        {

            private int a;
            private int b;
            private eqg._cls1 c;

            public final void run()
            {
                c.a.b(a, b);
            }

                    
                    {
                        c = eqg._cls1.this;
                        a = i;
                        b = j;
                        super();
                    }
        }


        // Unreferenced inner class eqg$1$3

/* anonymous class */
        final class eqg._cls1._cls3
            implements Runnable
        {

            private int a;
            private eqg._cls1 b;

            public final void run()
            {
                b.a.e(a);
            }

                    
                    {
                        b = eqg._cls1.this;
                        a = i;
                        super();
                    }
        }


        // Unreferenced inner class eqg$1$4

/* anonymous class */
        final class eqg._cls1._cls4
            implements Runnable
        {

            private int a;
            private int b;
            private eqg._cls1 c;

            public final void run()
            {
                c.a.c(a, b);
            }

                    
                    {
                        c = eqg._cls1.this;
                        a = i;
                        b = j;
                        super();
                    }
        }

    }

}
