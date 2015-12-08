// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.view;

import android.database.DataSetObserver;

// Referenced classes of package android.support.v4.view:
//            PagerTitleStrip, ViewPager, PagerAdapter

private class <init> extends DataSetObserver
    implements r, ener
{

    private int mScrollState;
    final PagerTitleStrip this$0;

    public void onAdapterChanged(PagerAdapter pageradapter, PagerAdapter pageradapter1)
    {
        updateAdapter(pageradapter, pageradapter1);
    }

    public void onChanged()
    {
        float f = 0.0F;
        updateText(mPager.getCurrentItem(), mPager.getAdapter());
        if (PagerTitleStrip.access$100(PagerTitleStrip.this) >= 0.0F)
        {
            f = PagerTitleStrip.access$100(PagerTitleStrip.this);
        }
        updateTextPositions(mPager.getCurrentItem(), f, true);
    }

    public void onPageScrollStateChanged(int i)
    {
        mScrollState = i;
    }

    public void onPageScrolled(int i, float f, int j)
    {
        j = i;
        if (f > 0.5F)
        {
            j = i + 1;
        }
        updateTextPositions(j, f, false);
    }

    public void onPageSelected(int i)
    {
        float f = 0.0F;
        if (mScrollState == 0)
        {
            updateText(mPager.getCurrentItem(), mPager.getAdapter());
            if (PagerTitleStrip.access$100(PagerTitleStrip.this) >= 0.0F)
            {
                f = PagerTitleStrip.access$100(PagerTitleStrip.this);
            }
            updateTextPositions(mPager.getCurrentItem(), f, true);
        }
    }

    private ener()
    {
        this$0 = PagerTitleStrip.this;
        super();
    }

    this._cls0(this._cls0 _pcls0)
    {
        this();
    }
}
