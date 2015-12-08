// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Handler;
import com.addlive.platform.ADL;
import com.addlive.service.AddLiveService;
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

    // Unreferenced inner class Vn$1

/* anonymous class */
    final class Vn._cls1
        implements Responder
    {

        final Vs a;
        private Vn b;

        public final void errHandler(int i, String s)
        {
            Vn.a(b, 1);
            b.a.post(new Vn._cls1._cls2());
        }

        public final void resultHandler(Object obj)
        {
            Vn.a(b);
            Vn.b(b);
            Vn.a(b, 3);
            b.a.post(new Vn._cls1._cls1(this));
            if (Vn.c(b) != null)
            {
                b.a(Vn.c(b));
            }
            ADL.getService().startMeasuringStats(ADL.r(), Vn.d(b).d, 5);
        }

            
            {
                b = vn;
                a = vs;
                super();
            }

        // Unreferenced inner class Vn$1$2

/* anonymous class */
        final class Vn._cls1._cls2
            implements Runnable
        {

            private Vn._cls1 a;

            public final void run()
            {
                a.a.b();
            }

                    
                    {
                        a = Vn._cls1.this;
                        super();
                    }
        }

    }

}
