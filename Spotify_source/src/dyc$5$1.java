// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.View;

final class g.Object
    implements dyy
{

    private l.Map a;

    public final void a()
    {
        (a);
    }

    public final void b()
    {
        dyc.a(a.a, false);
        dyc.s(a.a).a(-1, null);
    }

    ( )
    {
        a = ;
        super();
    }

    // Unreferenced inner class dyc$5

/* anonymous class */
    final class dyc._cls5
        implements android.view.View.OnClickListener
    {

        final dyc a;

        private void a()
        {
            dyk dyk = new dyc._cls5._cls2();
            dyc.a(a, dyc.z(a).b(), dyk);
        }

        static void a(dyc._cls5 _pcls5)
        {
            _pcls5.a();
        }

        public final void onClick(View view)
        {
            if (dyc.z(a).c)
            {
                a();
                return;
            } else
            {
                view = new dyc._cls5._cls1(this);
                dyc.a(a, true);
                dyc.z(a).a = view;
                dyc.z(a).a();
                return;
            }
        }

            
            {
                a = dyc1;
                super();
            }

        // Unreferenced inner class dyc$5$2

/* anonymous class */
        final class dyc._cls5._cls2
            implements dyk
        {

            private dyc._cls5 a;

            public final void a()
            {
                dyc.i(a.a).a();
            }

            public final void b()
            {
                dyc.a(a.a, false);
            }

            public final void c()
            {
                dyc.a(a.a, false);
            }

                    
                    {
                        a = dyc._cls5.this;
                        super();
                    }
        }

    }

}
