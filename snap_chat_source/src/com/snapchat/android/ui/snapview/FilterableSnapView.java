// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.ui.snapview;

import Cg;
import Ch;
import Dr;
import Ds;
import Ei;
import Ha;
import Jo;
import Mf;
import android.content.Context;
import android.preference.PreferenceManager;
import android.util.AttributeSet;
import com.snapchat.android.analytics.SnapViewEventAnalytics;
import lm;
import sS;
import sU;

// Referenced classes of package com.snapchat.android.ui.snapview:
//            MultiLeveledSnapView, SnapView

public class FilterableSnapView extends MultiLeveledSnapView
{

    public FilterableSnapView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
    }

    protected final SnapView a(Context context)
    {
        com.squareup.otto.Bus bus = Mf.a();
        Ha ha = new Ha(context);
        SnapViewEventAnalytics snapvieweventanalytics = SnapViewEventAnalytics.a();
        lm lm1 = lm.a();
        Ei ei = Ei.a();
        Ds ds = new Ds(new Dr(context));
        new SnapView.a();
        Ch ch = Ch.a();
        Jo jo = new Jo(context);
        java.util.Set set = SnapView.b();
        sS ss = new sS();
        sU su = new sU();
        Cg cg = Cg.a();
        PreferenceManager.getDefaultSharedPreferences(context);
        return new SnapView(context, this, bus, ha, snapvieweventanalytics, lm1, ei, ds, ch, jo, set, ss, su, cg);
    }
}
