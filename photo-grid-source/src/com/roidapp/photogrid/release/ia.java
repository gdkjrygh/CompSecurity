// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.photogrid.release;

import android.content.Context;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import android.view.InflateException;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import com.roidapp.photogrid.common.cc;

// Referenced classes of package com.roidapp.photogrid.release:
//            ib, GridImageView, kp, ImageSelector

public final class ia extends BaseAdapter
    implements android.view.View.OnClickListener
{

    private Context a;
    private String b[];
    private int c;
    private int d[];
    private boolean e;
    private kp f;

    public ia(Context context, String as[], int ai[], kp kp1)
    {
        e = false;
        a = context;
        b = as;
        d = ai;
        float f1 = context.getResources().getDimension(0x7f0900e3);
        c = (int)(((float)context.getResources().getDisplayMetrics().widthPixels - f1 * 3F) / 4F);
        f = kp1;
    }

    public final void a(int ai[])
    {
        d = ai;
    }

    public final int getCount()
    {
        return b.length;
    }

    public final Object getItem(int i)
    {
        return b[i];
    }

    public final long getItemId(int i)
    {
        return (long)i;
    }

    public final View getView(int i, View view, ViewGroup viewgroup)
    {
        if (e)
        {
            view = new TextView(a);
            view.setText(" ");
            return view;
        }
        if (view == null)
        {
            try
            {
                view = LayoutInflater.from(a).inflate(0x7f0300ce, null);
            }
            // Misplaced declaration of an exception variable
            catch (View view)
            {
                view.printStackTrace();
                view = null;
            }
            if (view == null)
            {
                System.gc();
                System.gc();
                android.view.ViewGroup.LayoutParams layoutparams;
                try
                {
                    view = LayoutInflater.from(a).inflate(0x7f0300ce, null);
                }
                // Misplaced declaration of an exception variable
                catch (View view)
                {
                    view.printStackTrace();
                    e = true;
                    (new cc(a)).a();
                    view = new TextView(a);
                    view.setText(" ");
                    return view;
                }
            }
            viewgroup = new ib(this);
            viewgroup.a = (GridImageView)view.findViewById(0x7f0d0175);
            viewgroup.c = (ImageView)view.findViewById(0x7f0d0366);
            viewgroup.b = (TextView)view.findViewById(0x7f0d0367);
            layoutparams = ((ib) (viewgroup)).a.getLayoutParams();
            layoutparams.width = c;
            layoutparams.height = c;
            ((ib) (viewgroup)).a.setLayoutParams(layoutparams);
            ((ib) (viewgroup)).a.a(c, c);
            ((ib) (viewgroup)).a.a(0);
            view.setTag(viewgroup);
        } else
        {
            viewgroup = (ib)view.getTag();
        }
        viewgroup.d = d[i];
        if (((ib) (viewgroup)).d == 0)
        {
            ((ib) (viewgroup)).b.setVisibility(8);
        } else
        {
            ((ib) (viewgroup)).b.setVisibility(0);
            ((ib) (viewgroup)).b.setText(String.valueOf(((ib) (viewgroup)).d));
        }
        ((ib) (viewgroup)).c.setTag(Integer.valueOf(i));
        ((ib) (viewgroup)).c.setOnClickListener(this);
        ((ib) (viewgroup)).a.setTag(b[i]);
        f.b(b[i], ((ib) (viewgroup)).a, false, false);
        return view;
    }

    public final void onClick(View view)
    {
        int i = ((Integer)view.getTag()).intValue();
        ((ImageSelector)a).a(b[i], i, d[i]);
    }
}
