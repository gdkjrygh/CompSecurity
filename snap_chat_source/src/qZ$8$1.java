// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.graphics.Bitmap;
import com.snapchat.android.Timber;

final class ng.Object
    implements Runnable
{

    private a a;

    public final void run()
    {
        a.a.a(a.a);
    }

    ct(ct ct)
    {
        a = ct;
        super();
    }

    // Unreferenced inner class qZ$8

/* anonymous class */
    final class qZ._cls8
        implements fS
    {

        final Bitmap a;
        final qx b;
        private qZ c;

        public final void a(fR fr)
        {
            Timber.i("LensesProcessingCore", "onPhotoCaptured", new Object[0]);
            a.setPixels(fr.a, 0, fr.d, 0, 0, fr.b, fr.c);
            PG.a(new qZ._cls8._cls1(this));
            qZ.e(c);
        }

            
            {
                c = qz;
                a = bitmap;
                b = qx1;
                super();
            }
    }

}
