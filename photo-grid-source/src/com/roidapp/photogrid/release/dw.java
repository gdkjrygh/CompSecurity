// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.photogrid.release;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

// Referenced classes of package com.roidapp.photogrid.release:
//            dk, ei, eh, ih, 
//            PhotoGridActivity

final class dw extends BaseAdapter
{

    final dk a;

    dw(dk dk1)
    {
        a = dk1;
        super();
    }

    public final int getCount()
    {
        if (dk.a(a) == null)
        {
            return 0;
        } else
        {
            return ei.k - 1;
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
        view = (eh)dk.a(a).get(i);
        if (view == null)
        {
            return null;
        }
        viewgroup = ih.C().M();
        View view1 = dk.b(a).getLayoutInflater().inflate(0x7f0300c2, null);
        view1.setId(((eh) (view)).a);
        TextView textview = (TextView)view1.findViewById(0x7f0d031b);
        ImageView imageview = (ImageView)view1.findViewById(0x7f0d031d);
        view1.findViewById(0x7f0d031c);
        textview.setText(((eh) (view)).b);
        Drawable drawable = a.getResources().getDrawable(((eh) (view)).c);
        if (view1.getId() == ei.d - 1)
        {
            if (viewgroup != null && viewgroup.length < 2)
            {
                drawable.setAlpha(50);
                textview.setTextColor(a.getResources().getColor(0x7f0c00c0));
            } else
            {
                drawable.setAlpha(255);
            }
        }
        textview.setCompoundDrawablesWithIntrinsicBounds(null, drawable, null, null);
        if (((eh) (view)).d)
        {
            i = 0;
        } else
        {
            i = 8;
        }
        imageview.setVisibility(i);
        view1.setBackgroundResource(0x7f0205ff);
        return view1;
    }
}
