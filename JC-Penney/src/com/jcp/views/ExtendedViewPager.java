// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jcp.views;

import android.content.Context;
import android.support.v4.view.ViewPager;
import android.util.AttributeSet;
import android.view.View;

// Referenced classes of package com.jcp.views:
//            TouchImageView

public class ExtendedViewPager extends ViewPager
{

    public ExtendedViewPager(Context context)
    {
        super(context);
    }

    public ExtendedViewPager(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
    }

    protected boolean a(View view, boolean flag, int i, int j, int k)
    {
        if (view instanceof TouchImageView)
        {
            return ((TouchImageView)view).canScrollHorizontally(-i);
        } else
        {
            return super.a(view, flag, i, j, k);
        }
    }
}
