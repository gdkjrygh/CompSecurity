// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Bundle;
import android.os.Handler;
import android.support.v4.app.Fragment;

final class g.Object
    implements Runnable
{

    private a a;

    public final void run()
    {
        a.a.b();
    }

    ( )
    {
        a = ;
        super();
    }

    // Unreferenced inner class epw$4

/* anonymous class */
    final class epw._cls4
        implements Runnable
    {

        final eps a;
        final Fragment b;
        private epw c;

        public final void run()
        {
            Runnable arunnable[] = new Runnable[1];
            try
            {
                arunnable[0] = new epw._cls4._cls1(c.a());
            }
            catch (Exception exception)
            {
                arunnable[0] = new epw._cls4._cls2(this);
            }
            c.b.post(new epw._cls4._cls3(arunnable));
        }

            
            {
                c = epw1;
                a = eps1;
                b = fragment;
                super();
            }

        // Unreferenced inner class epw$4$1

/* anonymous class */
        final class epw._cls4._cls1
            implements Runnable
        {

            private Bundle a;
            private epw._cls4 b;

            public final void run()
            {
                b.a.a_(a);
            }

                    
                    {
                        b = epw._cls4.this;
                        a = bundle;
                        super();
                    }
        }


        // Unreferenced inner class epw$4$3

/* anonymous class */
        final class epw._cls4._cls3
            implements Runnable
        {

            private Runnable a[];
            private epw._cls4 b;

            public final void run()
            {
                if (b.b == null || b.b.o())
                {
                    a[0].run();
                }
            }

                    
                    {
                        b = epw._cls4.this;
                        a = arunnable;
                        super();
                    }
        }

    }

}
