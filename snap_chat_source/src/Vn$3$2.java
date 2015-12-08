// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Handler;
import com.addlive.service.Responder;

final class ng.Object
    implements Runnable
{

    private a a;

    public final void run()
    {
        a.a.b();
    }

    ct(ct ct)
    {
        a = ct;
        super();
    }

    // Unreferenced inner class Vn$3

/* anonymous class */
    final class Vn._cls3
        implements Responder
    {

        final Vs a;
        private Vn b;

        public final void errHandler(int i, String s)
        {
            b.a.post(new Vn._cls3._cls2(this));
        }

        public final void resultHandler(Object obj)
        {
            b.a.post(new Vn._cls3._cls1());
        }

            
            {
                b = vn;
                a = vs;
                super();
            }

        // Unreferenced inner class Vn$3$1

/* anonymous class */
        final class Vn._cls3._cls1
            implements Runnable
        {

            private Vn._cls3 a;

            public final void run()
            {
                a.a.a();
            }

                    
                    {
                        a = Vn._cls3.this;
                        super();
                    }
        }

    }

}
