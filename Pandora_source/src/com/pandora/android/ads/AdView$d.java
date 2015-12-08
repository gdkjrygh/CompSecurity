// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pandora.android.ads;

import android.view.ViewGroup;
import com.pandora.android.provider.b;
import com.pandora.radio.data.a;
import p.bz.g;
import p.cw.c;
import p.dd.at;
import p.dd.bh;

// Referenced classes of package com.pandora.android.ads:
//            AdView

class a
{

    final AdView a;

    public void a()
    {
        b.a.e().c(this);
        b.a.b().b(this);
    }

    public void b()
    {
        b.a.e().b(this);
        b.a.b().c(this);
    }

    public void onCoachmarkVisibility(g g1)
    {
        AdView adview = a;
        boolean flag;
        if (g1.a == p.bz.droid.ads.AdView.d.a)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        adview.h = flag;
        if (!a.h && a.getVisibility() == 4 && a.b != null && a.b.getVisibility() == 0 && a.d != null && !a.d.K())
        {
            a.setVisibility(0);
            a.a(true);
        }
    }

    public void onStationData(at at1)
    {
        a.f = at1.a;
    }

    public void onTrackState(bh bh1)
    {
        a.g = bh1.b;
    }

    (AdView adview)
    {
        a = adview;
        super();
    }
}
