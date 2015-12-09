// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pandora.android.activity;

import android.os.Handler;
import com.pandora.android.provider.b;
import com.pandora.radio.data.aa;
import com.pandora.radio.data.y;
import p.cp.d;
import p.cw.c;
import p.dd.bh;

// Referenced classes of package com.pandora.android.activity:
//            InterstitialBaseActivity

private class <init>
{

    final InterstitialBaseActivity a;
    private aa b;
    private y c;

    private void a(aa aa1)
    {
        aa aa2 = b;
        b = aa1;
        if (aa.a(b) && aa1 != null)
        {
            c = b.a.b().d().t();
            if (aa2 == null)
            {
                a(aa1, c);
            } else
            if (!aa.a(aa2, "0").equals(aa.a(b, "0")))
            {
                a(aa1, c);
                return;
            }
        }
    }

    private void a(aa aa1, y y)
    {
        if (InterstitialBaseActivity.a(a) == null)
        {
            return;
        } else
        {
            a.q.postDelayed(new Runnable(aa1, y) {

                final aa a;
                final y b;
                final InterstitialBaseActivity.b c;

                public void run()
                {
                    InterstitialBaseActivity.a(c.a).a(com.pandora.android.activity.InterstitialBaseActivity.b(c.a), a, b);
                }

            
            {
                c = InterstitialBaseActivity.b.this;
                a = aa1;
                b = y;
                super();
            }
            }, 1000L);
            return;
        }
    }

    public void a()
    {
        b.a.b().b(this);
        b.a.e().c(this);
    }

    public void b()
    {
        b.a.b().c(this);
        b.a.e().b(this);
    }

    public void onStationData(y y)
    {
        c = y;
    }

    public void onTrackState(bh bh1)
    {
label0:
        {
            if (bh1.b != null)
            {
                if (b.a.d() != null)
                {
                    break label0;
                }
                a.f("We've been signed out, exiting");
            }
            return;
        }
        a(bh1.b);
    }

    private _cls1.b(InterstitialBaseActivity interstitialbaseactivity)
    {
        a = interstitialbaseactivity;
        super();
    }

    a(InterstitialBaseActivity interstitialbaseactivity, a a1)
    {
        this(interstitialbaseactivity);
    }
}
