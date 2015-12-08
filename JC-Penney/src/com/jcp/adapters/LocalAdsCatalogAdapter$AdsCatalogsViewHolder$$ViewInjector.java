// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jcp.adapters;

import android.view.View;
import android.widget.HorizontalScrollView;
import android.widget.TextView;

public class Q
    implements butterknife.ctor
{

    public void inject(butterknife.ctor ctor, Q q, Object obj)
    {
        q.mTitleText = (TextView)ctor.gsItemTitleText((View)ctor.gsItemTitleText(obj, 0x7f0e01ce, "field 'adsCatalogsItemTitleText'"), 0x7f0e01ce, "field 'adsCatalogsItemTitleText'");
        q.mHorizontalView = (HorizontalScrollView)ctor.gsItemHorizontalView((View)ctor.gsItemHorizontalView(obj, 0x7f0e01cf, "field 'adsCatalogsItemHorizontalView'"), 0x7f0e01cf, "field 'adsCatalogsItemHorizontalView'");
    }

    public volatile void inject(butterknife.ctor ctor, Object obj, Object obj1)
    {
        inject(ctor, (inject)obj, obj1);
    }

    public void reset(inject inject1)
    {
        inject1.mTitleText = null;
        inject1.mHorizontalView = null;
    }

    public volatile void reset(Object obj)
    {
        reset((reset)obj);
    }

    public Q()
    {
    }
}
