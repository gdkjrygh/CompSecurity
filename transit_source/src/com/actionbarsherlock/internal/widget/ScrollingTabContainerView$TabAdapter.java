// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.actionbarsherlock.internal.widget;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

// Referenced classes of package com.actionbarsherlock.internal.widget:
//            ScrollingTabContainerView, IcsLinearLayout

private class <init> extends BaseAdapter
{

    final ScrollingTabContainerView this$0;

    public int getCount()
    {
        return ScrollingTabContainerView.access$0(ScrollingTabContainerView.this).getChildCount();
    }

    public Object getItem(int i)
    {
        return ((this._cls0)ScrollingTabContainerView.access$0(ScrollingTabContainerView.this).getChildAt(i)).Tab();
    }

    public long getItemId(int i)
    {
        return (long)i;
    }

    public View getView(int i, View view, ViewGroup viewgroup)
    {
        if (view == null)
        {
            return ScrollingTabContainerView.access$1(ScrollingTabContainerView.this, (com.actionbarsherlock.app.)getItem(i), true);
        } else
        {
            ((getItem)view).dTab((com.actionbarsherlock.app..TabView.bindTab)getItem(i));
            return view;
        }
    }

    private ()
    {
        this$0 = ScrollingTabContainerView.this;
        super();
    }

    this._cls0(this._cls0 _pcls0)
    {
        this();
    }
}
