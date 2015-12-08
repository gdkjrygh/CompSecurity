// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.discover.ui.media;

import Lz;
import Mf;
import PB;
import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.snapchat.android.Timber;
import com.snapchat.android.discover.analytics.DiscoverUsageAnalytics;
import com.squareup.otto.Bus;
import uL;
import uy;
import vA;
import wG;

public abstract class DiscoverEditionPageView extends FrameLayout
{
    public static interface a
    {

        public abstract void a(boolean flag);
    }


    public final vA p;
    public final uL q;
    public final DiscoverUsageAnalytics r;
    public final Bus s;
    public LinearLayout t;
    public final wG u;
    public a v;

    public DiscoverEditionPageView(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, uL.a(), uy.a(), new DiscoverUsageAnalytics(), vA.a(), Lz.a(), new PB(), Mf.a(), new wG());
    }

    public DiscoverEditionPageView(Context context, AttributeSet attributeset, uL ul, uy uy1, DiscoverUsageAnalytics discoverusageanalytics, vA va, Lz lz, 
            PB pb, Bus bus, wG wg)
    {
        super(context, attributeset);
        q = ul;
        r = discoverusageanalytics;
        p = va;
        s = bus;
        u = wg;
    }

    public void B_()
    {
        v = null;
    }

    public abstract void a();

    public abstract void a(int i);

    public abstract boolean c();

    public abstract boolean d();

    public abstract boolean e();

    public abstract boolean f();

    public abstract boolean g();

    public void l()
    {
    }

    public final boolean m()
    {
        boolean flag = false;
        if (t != null)
        {
            Timber.c("DiscoverEditionPageView", "Hiding the share overlay view.", new Object[0]);
            t.setVisibility(8);
            flag = true;
        }
        return flag;
    }

    public void setAutoAdvanceListener(a a1)
    {
        v = a1;
    }
}
