// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.photogrid.release;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import com.roidapp.photogrid.video.bj;

// Referenced classes of package com.roidapp.photogrid.release:
//            ht

final class hu extends BaseAdapter
{

    final ht a;

    hu(ht ht1)
    {
        a = ht1;
        super();
    }

    public final int getCount()
    {
        if (a.e == null)
        {
            return 0;
        } else
        {
            return a.e.length;
        }
    }

    public final Object getItem(int i)
    {
        return Integer.valueOf(i);
    }

    public final long getItemId(int i)
    {
        return (long)i;
    }

    public final View getView(int i, View view, ViewGroup viewgroup)
    {
        if (view != null)
        {
            return view;
        }
        view = a.e[i];
        if (view == null)
        {
            return null;
        }
        view.g = a.h.inflate(a.c(), null);
        view.e = (TextView)((bj) (view)).g.findViewById(0x7f0d04e1);
        ((bj) (view)).e.setText(((bj) (view)).b);
        ((bj) (view)).e.setCompoundDrawablesWithIntrinsicBounds(0, ((bj) (view)).c, 0, 0);
        view.f = (ImageView)((bj) (view)).g.findViewById(0x7f0d04e2);
        viewgroup = ((bj) (view)).f;
        int j;
        if (((bj) (view)).d)
        {
            j = 0;
        } else
        {
            j = 8;
        }
        viewgroup.setVisibility(j);
        ((bj) (view)).g.setId(i);
        return ((bj) (view)).g;
    }
}
