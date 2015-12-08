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
        a.a.a();
    }

    ct(ct ct)
    {
        a = ct;
        super();
    }

    // Unreferenced inner class Vo$3

/* anonymous class */
    final class Vo._cls3
        implements Responder
    {

        final Vs a;
        private Vo b;

        public final void errHandler(int i, String s)
        {
            b.a.post(new Vo._cls3._cls2());
        }

        public final void resultHandler(Object obj)
        {
            b.a.post(new Vo._cls3._cls1(this));
        }

            
            {
                b = vo;
                a = vs;
                super();
            }

        // Unreferenced inner class Vo$3$2

/* anonymous class */
        final class Vo._cls3._cls2
            implements Runnable
        {

            private Vo._cls3 a;

            public final void run()
            {
                a.a.b();
            }

                    
                    {
                        a = Vo._cls3.this;
                        super();
                    }
        }

    }

}
