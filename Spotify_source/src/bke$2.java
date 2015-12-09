// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.RemoteException;
import android.view.MotionEvent;
import android.view.View;
import com.google.android.gms.ads.internal.request.AdResponseParcel;

final class ang.Object
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
        ckw1.setOnTouchListener(new android.view.View.OnTouchListener(((bkg) (obj1))) {

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
        });
        ckw1.setOnClickListener(new android.view.View.OnClickListener(((bkg) (obj1))) {

            private bkg a;

            public final void onClick(View view)
            {
                a.b = true;
            }

            
            {
                a = bkg1;
                super();
            }
        });
        c.c.C = 0;
        obj1 = c.c;
        bkv.d();
        obj1.h = chp.a(c.c.c, c, a, c.c.d, ckw1, c.g, c, b);
    }

    (bke bke1, ciu ciu1, cbk cbk)
    {
        c = bke1;
        a = ciu1;
        b = cbk;
        super();
    }
}
