// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.main;

import android.support.design.widget.TabLayout;

// Referenced classes of package com.skype.android.app.main:
//            HubMaterialActivity

final class this._cls0
    implements android.support.v4.view.._cls4
{

    final HubMaterialActivity this$0;

    public final void onPageScrollStateChanged(int i)
    {
    }

    public final void onPageScrolled(int i, float f, int j)
    {
    }

    public final void onPageSelected(int i)
    {
        handlePageAnalytics(i);
        android.support.design.widget.s._cls0 _lcls0 = tabLayout.a(i);
        if (_lcls0 != null)
        {
            _lcls0.yout();
        }
    }

    ()
    {
        this$0 = HubMaterialActivity.this;
        super();
    }
}
