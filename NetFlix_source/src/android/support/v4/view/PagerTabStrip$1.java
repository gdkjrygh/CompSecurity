// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.view;

import android.view.View;

// Referenced classes of package android.support.v4.view:
//            PagerTabStrip, ViewPager

class this._cls0
    implements android.view.ener
{

    final PagerTabStrip this$0;

    public void onClick(View view)
    {
        mPager.setCurrentItem(mPager.getCurrentItem() - 1);
    }

    ()
    {
        this$0 = PagerTabStrip.this;
        super();
    }
}
