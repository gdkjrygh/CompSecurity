// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.photogrid;

import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import com.roidapp.photogrid.release.GridImageView;
import com.roidapp.photogrid.release.kp;
import java.util.List;

// Referenced classes of package com.roidapp.photogrid:
//            f, j

final class i extends BaseAdapter
{

    final f a;

    private i(f f1)
    {
        a = f1;
        super();
    }

    i(f f1, byte byte0)
    {
        this(f1);
    }

    public final int getCount()
    {
        if (f.b(a) != null)
        {
            return f.b(a).size();
        } else
        {
            return 0;
        }
    }

    public final Object getItem(int k)
    {
        if (f.b(a) != null)
        {
            return f.b(a).get(k);
        } else
        {
            return null;
        }
    }

    public final long getItemId(int k)
    {
        return (long)k;
    }

    public final View getView(int k, View view, ViewGroup viewgroup)
    {
        if (view == null)
        {
            viewgroup = new j(a, (byte)0);
            view = LayoutInflater.from(a.getActivity()).inflate(0x7f030109, null, false);
            viewgroup.a = (GridImageView)view.findViewById(0x7f0d041a);
            android.view.ViewGroup.LayoutParams layoutparams = ((j) (viewgroup)).a.getLayoutParams();
            int l = a.getResources().getDimensionPixelSize(0x7f09002a);
            layoutparams.width = l;
            layoutparams.height = l;
            ((j) (viewgroup)).a.setLayoutParams(layoutparams);
            ((j) (viewgroup)).a.a(l, l);
            ((j) (viewgroup)).a.a(0);
            view.setTag(viewgroup);
        } else
        {
            viewgroup = (j)view.getTag();
        }
        if (f.b(a) != null)
        {
            String s = (String)f.b(a).get(k);
            ((j) (viewgroup)).a.setTag(s);
            f.c(a).b(s, ((j) (viewgroup)).a, false, false);
        }
        return view;
    }
}
