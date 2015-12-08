// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.internal.widget;

import android.support.v7.app.c;
import android.support.v7.widget.LinearLayoutCompat;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

// Referenced classes of package android.support.v7.internal.widget:
//            ScrollingTabContainerView

final class ag extends BaseAdapter
{

    final ScrollingTabContainerView a;

    ag(ScrollingTabContainerView scrollingtabcontainerview)
    {
        a = scrollingtabcontainerview;
        super();
    }

    public final int getCount()
    {
        return ScrollingTabContainerView.a(a).getChildCount();
    }

    public final Object getItem(int i)
    {
        return ((ScrollingTabContainerView.TabView)ScrollingTabContainerView.a(a).getChildAt(i)).getTab();
    }

    public final long getItemId(int i)
    {
        return (long)i;
    }

    public final View getView(int i, View view, ViewGroup viewgroup)
    {
        if (view == null)
        {
            return ScrollingTabContainerView.a(a, (c)getItem(i));
        } else
        {
            viewgroup = (ScrollingTabContainerView.TabView)view;
            viewgroup.a = (c)getItem(i);
            viewgroup.a();
            return view;
        }
    }
}
