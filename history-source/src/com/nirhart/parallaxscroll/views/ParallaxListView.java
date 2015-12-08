// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nirhart.parallaxscroll.views;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ListView;

// Referenced classes of package com.nirhart.parallaxscroll.views:
//            ParallaxListViewHelper

public class ParallaxListView extends ListView
{

    private ParallaxListViewHelper helper;

    public ParallaxListView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        init(context, attributeset);
    }

    public ParallaxListView(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        init(context, attributeset);
    }

    public void addParallaxedHeaderView(View view)
    {
        super.addHeaderView(view);
        helper.addParallaxedHeaderView(view);
    }

    public void addParallaxedHeaderView(View view, Object obj, boolean flag)
    {
        super.addHeaderView(view, obj, flag);
        helper.addParallaxedHeaderView(view, obj, flag);
    }

    protected void init(Context context, AttributeSet attributeset)
    {
        helper = new ParallaxListViewHelper(context, attributeset, this);
        super.setOnScrollListener(helper);
    }

    public void setOnScrollListener(android.widget.AbsListView.OnScrollListener onscrolllistener)
    {
        helper.setOnScrollListener(onscrolllistener);
    }
}
