// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.internal.widget;

import android.support.v7.a.c;
import android.support.v7.widget.aa;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

// Referenced classes of package android.support.v7.internal.widget:
//            ab, af, ac

class ad extends BaseAdapter
{

    final ab a;

    private ad(ab ab1)
    {
        a = ab1;
        super();
    }

    ad(ab ab1, ac ac)
    {
        this(ab1);
    }

    public int getCount()
    {
        return ab.a(a).getChildCount();
    }

    public Object getItem(int i)
    {
        return ((af)ab.a(a).getChildAt(i)).b();
    }

    public long getItemId(int i)
    {
        return (long)i;
    }

    public View getView(int i, View view, ViewGroup viewgroup)
    {
        if (view == null)
        {
            return ab.a(a, (c)getItem(i), true);
        } else
        {
            ((af)view).a((c)getItem(i));
            return view;
        }
    }
}
