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
import com.roidapp.baselib.view.RoundImageView;
import com.roidapp.cloudlib.ar;
import com.roidapp.cloudlib.as;
import com.roidapp.cloudlib.sns.b.x;
import java.util.List;

// Referenced classes of package com.roidapp.cloudlib.b:
//            j

final class m extends BaseAdapter
{

    final j a;

    m(j j1)
    {
        a = j1;
        super();
    }

    public final int getCount()
    {
        if (j.b(a) != null)
        {
            return j.b(a).size();
        } else
        {
            return 0;
        }
    }

    public final Object getItem(int i)
    {
        if (j.b(a) != null)
        {
            return j.b(a).get(i);
        } else
        {
            return null;
        }
    }

    public final long getItemId(int i)
    {
        return (long)i;
    }

    public final View getView(int i, View view, ViewGroup viewgroup)
    {
        View view1 = view;
        if (view == null)
        {
            view1 = LayoutInflater.from(viewgroup.getContext()).inflate(as.am, null);
        }
        view = (RoundImageView)u.a(view1, ar.ds);
        viewgroup = (TextView)u.a(view1, ar.dr);
        x x1 = (x)j.b(a).get(i);
        if (x1 != null)
        {
            j.a(a, x1.h, view);
            viewgroup.setText(x1.b);
        }
        return view1;
    }
}
