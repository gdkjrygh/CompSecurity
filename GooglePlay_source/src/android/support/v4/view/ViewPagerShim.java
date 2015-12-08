// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.view;

import android.content.Context;
import android.util.AttributeSet;

// Referenced classes of package android.support.v4.view:
//            ViewPager

public class ViewPagerShim extends ViewPager
{

    public ViewPagerShim(Context context)
    {
        super(context);
    }

    public ViewPagerShim(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
    }

    public boolean pageLeft()
    {
        return super.pageLeft();
    }

    public boolean pageRight()
    {
        return super.pageRight();
    }
}
