// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.os.Handler;
import android.os.RemoteException;
import android.view.MotionEvent;
import android.view.View;
import com.google.android.gms.ads.internal.client.AdSizeParcel;
import com.google.android.gms.ads.internal.request.AdRequestInfoParcel;
import com.google.android.gms.ads.internal.request.AdResponseParcel;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;

public abstract class bke extends bkd
    implements bkk, cgh
{

    public bke(Context context, AdSizeParcel adsizeparcel, String s, cex cex, VersionInfoParcel versioninfoparcel, bkf bkf)
    {
        super(context, adsizeparcel, s, cex, versioninfoparcel, bkf);
    }

    public final void A()
    {
        n();
    }

    protected ckw a(ciu ciu1, bkg bkg)
    {
        Object obj = c.f.getNextView();
        if (!(obj instanceof ckw)) goto _L2; else goto _L1
_L1:
        bka.a("Reusing webview...");
        obj = (ckw)obj;
        ((ckw) (obj)).a(c.c, c.i, a);
_L4:
        ((ckw) (obj)).k().a(this, this, this, this, false, this, null, bkg, this);
        ((ckw) (obj)).b(ciu1.a.w);
        return ((ckw) (obj));
_L2:
        if (obj != null)
        {
            c.f.removeView(((View) (obj)));
        }
        bkv.f();
        ckw ckw1 = clc.a(c.c, c.i, false, false, c.d, c.e, a, f);
        obj = ckw1;
        if (c.i.h == null)
        {
            a(ckw1.b());
            obj = ckw1;
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public final void a(cbp cbp)
    {
        btl.b("setOnCustomRenderedAdLoadedListener must be called on the main UI thread.");
        c.x = cbp;
    }

    protected final void a(ciu ciu1, cbk cbk)
    {
        if (ciu1.e != -2)
        {
            cjj.a.post(new Runnable(ciu1) {

                private ciu a;
                private bke b;

                public final void run()
                {
                    b.b(new cit(a));
                }

            
            {
                b = bke.this;
                a = ciu1;
                super();
            }
            });
            return;
        }
        if (ciu1.d != null)
        {
            c.i = ciu1.d;
        }
        if (ciu1.b.h)
        {
            c.C = 0;
            bkw bkw1 = c;
            bkv.d();
            bkw1.h = chp.a(c.c, this, ciu1, c.d, null, g, this, cbk);
            return;
        } else
        {
            cjj.a.post(new Runnable(ciu1, cbk) {

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

            
            {
                c = bke.this;
                a = ciu1;
                b = cbk;
                super();
            }
            });
            return;
        }
    }

    protected boolean a(cit cit1, cit cit2)
    {
        if (c.c() && c.f != null)
        {
            c.f.a.b = cit2.t;
        }
        return super.a(cit1, cit2);
    }

    public final void b(View view)
    {
        c.B = view;
        b(new cit(c.k));
    }

    public final void r()
    {
        a(c.j, false);
    }

    public final void y()
    {
        e();
    }

    public final void z()
    {
        p();
    }
}
