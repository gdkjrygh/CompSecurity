// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Bundle;
import android.os.Handler;
import com.spotify.mobile.android.spotlets.common.persistence.json.JsonBundleHelper;
import java.io.IOException;

final class g.Object
    implements Runnable
{

    private Runnable a[];

    public final void run()
    {
        a[0].run();
    }

    g.Runnable(Runnable arunnable[])
    {
        a = arunnable;
        super();
    }

    // Unreferenced inner class epw$3

/* anonymous class */
    final class epw._cls3
        implements Runnable
    {

        final ept a;
        private Bundle b;
        private epw c;

        public final void run()
        {
            Runnable arunnable[] = new Runnable[1];
            epw epw1;
            Bundle bundle;
            epw1 = c;
            bundle = b;
            synchronized (epw1.c)
            {
                JsonBundleHelper.a(epw1.b(), bundle);
            }
            if (a != null)
            {
                arunnable[0] = new epw._cls3._cls1();
            }
_L2:
            if (a != null)
            {
                c.b.post(new epw._cls3._cls3(arunnable));
            }
            return;
            exception;
            s;
            JVM INSTR monitorexit ;
            try
            {
                throw exception;
            }
            catch (IOException ioexception) { }
            if (a != null)
            {
                arunnable[0] = new epw._cls3._cls2();
            }
            if (true) goto _L2; else goto _L1
_L1:
        }

            
            {
                c = epw1;
                b = bundle;
                a = ept;
                super();
            }

        // Unreferenced inner class epw$3$1

/* anonymous class */
        final class epw._cls3._cls1
            implements Runnable
        {

            public final void run()
            {
            }

        }


        // Unreferenced inner class epw$3$2

/* anonymous class */
        final class epw._cls3._cls2
            implements Runnable
        {

            private epw._cls3 a;

            public final void run()
            {
                a.a.a();
            }

                    
                    {
                        a = epw._cls3.this;
                        super();
                    }
        }

    }

}
