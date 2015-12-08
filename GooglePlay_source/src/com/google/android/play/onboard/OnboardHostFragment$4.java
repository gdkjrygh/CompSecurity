// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.play.onboard;

import com.google.android.libraries.bind.bidi.BidiPagingHelper;
import com.google.android.play.widget.UserAwareViewPager;

// Referenced classes of package com.google.android.play.onboard:
//            OnboardHostFragment

final class ner extends com.google.android.play.widget.rAwareOnPageChangeListener
{

    final OnboardHostFragment this$0;

    public final void onPageScrolled(int i, float f, int j)
    {
        super.onPageScrolled(i, f, j);
        OnboardHostFragment.onPageScrolled$486775f1();
    }

    public final void onPageSelected(int i, boolean flag)
    {
        super.onPageSelected(i, flag);
        i = BidiPagingHelper.getLogicalPosition(mAdapter, i);
        onPageSelected$2563266(i);
    }

    r(UserAwareViewPager userawareviewpager)
    {
        this$0 = OnboardHostFragment.this;
        super(userawareviewpager);
    }
}
