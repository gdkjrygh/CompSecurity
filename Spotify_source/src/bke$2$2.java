// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.RemoteException;
import android.view.MotionEvent;
import android.view.View;
import com.google.android.gms.ads.internal.request.AdResponseParcel;

final class g.Object
    implements android.view.lickListener
{

    private bkg a;

    public final void onClick(View view)
    {
        a.b = true;
    }

    (bkg bkg1)
    {
        a = bkg1;
        super();
    }

    // Unreferenced inner class bke$2

/* anonymous class */
    final class bke._cls2
        implements Runnable
    {

        private ciu a;
        private cbk b;
        private bke c;

        public final void run()
        {
            if (a.b.s && c.c.x != null)
            {
                Object obj = null;
                if (a.b.b != null)
                {
                    bkv.e();
                    obj = cjj.a(a.b.b);
                }
                obj = new cbl(c, ((String) (obj)), a.b.c);
                c.c.C = 1;
                try
                {
                    c.c.x.a(((cbm) (obj)));
                    return;
                }
                catch (RemoteException remoteexception)
                {
                    bka.c("Could not call the onCustomRenderedAdLoadedListener.", remoteexception);
                }
            }
            Object obj1 = new bkg();
            ckw ckw1 = c.a(a, ((bkg) (obj1)));
            obj1.a = new bki(a, ckw1);
            ckw1.setOnTouchListener(new bke._cls2._cls1(((bkg) (obj1))));
            ckw1.setOnClickListener(new bke._cls2._cls2(((bkg) (obj1))));
            c.c.C = 0;
            obj1 = c.c;
            bkv.d();
            obj1.h = chp.a(c.c.c, c, a, c.c.d, ckw1, c.g, c, b);
        }

            
            {
                c = bke1;
                a = ciu1;
                b = cbk;
                super();
            }

        // Unreferenced inner class bke$2$1

/* anonymous class */
        final class bke._cls2._cls1
            implements android.view.View.OnTouchListener
        {

            private bkg a;

            public final boolean onTouch(View view, MotionEvent motionevent)
            {
                a.b = true;
                return false;
            }

                    
                    {
                        a = bkg1;
                        super();
                    }
        }

    }

}
