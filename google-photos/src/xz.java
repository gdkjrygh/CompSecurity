// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

final class xz extends BaseAdapter
{

    private xx a;

    xz(xx xx1)
    {
        a = xx1;
        super();
    }

    public final int getCount()
    {
        return xx.a(a).getChildCount();
    }

    public final Object getItem(int i)
    {
        return ((yb)xx.a(a).getChildAt(i)).a;
    }

    public final long getItemId(int i)
    {
        return (long)i;
    }

    public final View getView(int i, View view, ViewGroup viewgroup)
    {
        if (view == null)
        {
            return xx.a(a, (ry)getItem(i), true);
        } else
        {
            viewgroup = (yb)view;
            viewgroup.a = (ry)getItem(i);
            viewgroup.a();
            return view;
        }
    }
}
