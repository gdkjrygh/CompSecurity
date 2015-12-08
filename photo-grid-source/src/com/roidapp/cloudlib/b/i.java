// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.cloudlib.b;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import com.roidapp.baselib.c.u;
import com.roidapp.cloudlib.ar;
import com.roidapp.cloudlib.as;
import java.util.List;

// Referenced classes of package com.roidapp.cloudlib.b:
//            g

final class i extends BaseAdapter
{

    final g a;

    i(g g1)
    {
        a = g1;
        super();
    }

    public final int getCount()
    {
        if (g.b(a) != null)
        {
            return g.b(a).size();
        } else
        {
            return 0;
        }
    }

    public final Object getItem(int j)
    {
        if (g.b(a) != null)
        {
            return g.b(a).get(j);
        } else
        {
            return null;
        }
    }

    public final long getItemId(int j)
    {
        return (long)j;
    }

    public final View getView(int j, View view, ViewGroup viewgroup)
    {
        View view1 = view;
        if (view == null)
        {
            view1 = LayoutInflater.from(viewgroup.getContext()).inflate(as.F, null);
        }
        ((TextView)u.a(view1, ar.aZ)).setText((CharSequence)g.b(a).get(j));
        return view1;
    }
}
