// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.ads.internal;

import android.content.Context;
import android.os.Handler;
import android.os.RemoteException;
import android.view.MotionEvent;
import android.view.View;
import com.google.android.gms.ads.internal.client.AdSizeParcel;
import com.google.android.gms.ads.internal.request.AdRequestInfoParcel;
import com.google.android.gms.ads.internal.request.AdResponseParcel;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.util.client.b;
import com.google.android.gms.common.internal.y;
import com.google.android.gms.internal.be;
import com.google.android.gms.internal.bf;
import com.google.android.gms.internal.bi;
import com.google.android.gms.internal.dh;
import com.google.android.gms.internal.ed;
import com.google.android.gms.internal.fc;
import com.google.android.gms.internal.gb;
import com.google.android.gms.internal.gm;
import com.google.android.gms.internal.go;
import com.google.android.gms.internal.hi;
import com.google.android.gms.internal.hj;
import com.google.android.gms.internal.hk;

// Referenced classes of package com.google.android.gms.ads.internal:
//            b, g, zzq, p, 
//            d, e

public abstract class c extends com.google.android.gms.ads.internal.b
    implements g, ed
{

    public c(Context context, AdSizeParcel adsizeparcel, String s, dh dh, VersionInfoParcel versioninfoparcel, d d)
    {
        super(context, adsizeparcel, s, dh, versioninfoparcel, d);
    }

    protected hi a(com.google.android.gms.internal.gb.a a1, e e)
    {
        Object obj = c.f.getNextView();
        if (!(obj instanceof hi)) goto _L2; else goto _L1
_L1:
        com.google.android.gms.ads.internal.util.client.b.a(3);
        obj = (hi)obj;
        ((hi) (obj)).a(c.c, c.i);
_L4:
        ((hi) (obj)).j().a(this, this, this, this, false, this, null, e, this);
        ((hi) (obj)).b(a1.a.z);
        ((hi) (obj)).c(a1.a.x);
        return ((hi) (obj));
_L2:
        if (obj != null)
        {
            c.f.removeView(((View) (obj)));
        }
        p.f();
        obj = hk.a(c.c, c.i, c.d, c.e, f);
        if (c.i.h == null)
        {
            a(((View) (((hi) (obj)).a())));
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public final void a(bi bi)
    {
        com.google.android.gms.common.internal.y.b("setOnCustomRenderedAdLoadedListener must be called on the main UI thread.");
        c.x = bi;
    }

    protected final void a(com.google.android.gms.internal.gb.a a1, be be)
    {
        if (a1.e != -2)
        {
            gm.a.post(new Runnable(a1) {

                final com.google.android.gms.internal.gb.a a;
                final c b;

                public final void run()
                {
                    b.b(new gb(a));
                }

            
            {
                b = c.this;
                a = a1;
                super();
            }
            });
            return;
        }
        if (a1.d != null)
        {
            c.i = a1.d;
        }
        if (a1.b.h)
        {
            c.C = 0;
            zzq zzq1 = c;
            p.d();
            zzq1.h = fc.a(c.c, this, a1, c.d, null, g, this, be);
            return;
        } else
        {
            gm.a.post(new Runnable(a1, be) {

                final com.google.android.gms.internal.gb.a a;
                final be b;
                final c c;

                public final void run()
                {
                    if (a.b.s && c.c.x != null)
                    {
                        Object obj = null;
                        if (a.b.b != null)
                        {
                            p.e();
                            obj = gm.a(a.b.b);
                        }
                        obj = new bf(c, ((String) (obj)), a.b.c);
                        c.c.C = 1;
                        try
                        {
                            c.c.x.a(((com.google.android.gms.internal.bh) (obj)));
                            return;
                        }
                        catch (RemoteException remoteexception)
                        {
                            com.google.android.gms.ads.internal.util.client.b.b("Could not call the onCustomRenderedAdLoadedListener.", remoteexception);
                        }
                    }
                    Object obj1 = new e();
                    hi hi1 = c.a(a, ((e) (obj1)));
                    ((e) (obj1)).a(new e.b(a, hi1));
                    hi1.setOnTouchListener(new android.view.View.OnTouchListener(this, ((e) (obj1))) {

                        final e a;
                        final _cls2 b;

                        public final boolean onTouch(View view, MotionEvent motionevent)
                        {
                            a.a();
                            return false;
                        }

            
            {
                b = _pcls2;
                a = e1;
                super();
            }
                    });
                    hi1.setOnClickListener(new android.view.View.OnClickListener(this, ((e) (obj1))) {

                        final e a;
                        final _cls2 b;

                        public final void onClick(View view)
                        {
                            a.a();
                        }

            
            {
                b = _pcls2;
                a = e1;
                super();
            }
                    });
                    c.c.C = 0;
                    obj1 = c.c;
                    p.d();
                    obj1.h = fc.a(c.c.c, c, a, c.c.d, hi1, c.g, c, b);
                }

            
            {
                c = c.this;
                a = a1;
                b = be;
                super();
            }
            });
            return;
        }
    }

    protected boolean a(gb gb1, gb gb2)
    {
        if (c.d() && c.f != null)
        {
            c.f.a().a(gb2.v);
        }
        return super.a(gb1, gb2);
    }

    public final void b(View view)
    {
        c.B = view;
        b(new gb(c.k));
    }

    public final void q()
    {
        a(c.j, false);
    }

    public final void x()
    {
        e();
    }

    public final void y()
    {
        o();
    }

    public final void z()
    {
        n();
    }
}
