// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.photogrid.video;

import android.content.Context;
import android.view.InflateException;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import com.roidapp.photogrid.common.cc;
import com.roidapp.photogrid.video.onlinemusic.Genre;

// Referenced classes of package com.roidapp.photogrid.video:
//            f, h

public final class g extends BaseAdapter
{

    private Context a;
    private boolean b;
    private int c;
    private f d;

    public g(Context context, f f1)
    {
        b = false;
        c = 0;
        a = context;
        d = f1;
    }

    protected final void a(int i)
    {
        c = i;
        notifyDataSetChanged();
    }

    public final int getCount()
    {
        return d.a();
    }

    public final Object getItem(int i)
    {
        c = i;
        return d.a(i);
    }

    public final long getItemId(int i)
    {
        return 0L;
    }

    public final View getView(int i, View view, ViewGroup viewgroup)
    {
        if (b)
        {
            view = new TextView(a);
            view.setText(" ");
            return view;
        }
        if (view == null)
        {
            try
            {
                view = LayoutInflater.from(a).inflate(0x7f0300ec, null);
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
                try
                {
                    view = LayoutInflater.from(a).inflate(0x7f0300ec, null);
                }
                // Misplaced declaration of an exception variable
                catch (View view)
                {
                    view.printStackTrace();
                    b = true;
                    (new cc(a)).a();
                    view = new TextView(a);
                    view.setText(" ");
                    return view;
                }
            }
            viewgroup = new h(this);
            viewgroup.a = (TextView)view.findViewById(0x7f0d03bc);
            viewgroup.c = (TextView)view.findViewById(0x7f0d022c);
            viewgroup.b = view.findViewById(0x7f0d03be);
            view.setTag(viewgroup);
        } else
        {
            viewgroup = (h)view.getTag();
        }
        if (i == c)
        {
            ((h) (viewgroup)).b.setVisibility(0);
        } else
        {
            ((h) (viewgroup)).b.setVisibility(4);
        }
        if (i == getCount() - 1)
        {
            ((h) (viewgroup)).c.setVisibility(0);
            return view;
        }
        ((h) (viewgroup)).c.setVisibility(8);
        if (d != null && d.a(i) != null)
        {
            ((h) (viewgroup)).a.setText(d.a(i).genre_title);
            return view;
        } else
        {
            ((h) (viewgroup)).a.setText("");
            return view;
        }
    }
}
