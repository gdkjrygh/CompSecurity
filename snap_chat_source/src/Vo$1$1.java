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

    // Unreferenced inner class Vo$1

/* anonymous class */
    final class Vo._cls1
        implements Responder
    {

        final Vs a;
        private Vo b;

        public final void errHandler(int i, String s)
        {
            Vo.a(b, 1);
            b.a.post(new Vo._cls1._cls2());
        }

        public final void resultHandler(Object obj)
        {
            Vo.a(b);
            Vo.b(b);
            Vo.a(b, 3);
            b.a.post(new Vo._cls1._cls1(this));
            if (Vo.c(b) != null)
            {
                b.a(Vo.c(b));
            }
        }

            
            {
                b = vo;
                a = vs;
                super();
            }

        // Unreferenced inner class Vo$1$2

/* anonymous class */
        final class Vo._cls1._cls2
            implements Runnable
        {

            private Vo._cls1 a;

            public final void run()
            {
                a.a.b();
            }

                    
                    {
                        a = Vo._cls1.this;
                        super();
                    }
        }

    }

}
