// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.photogrid.release;

import android.content.Context;
import android.content.res.Resources;
import android.view.InflateException;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ListView;
import android.widget.TextView;
import com.roidapp.photogrid.common.cc;

// Referenced classes of package com.roidapp.photogrid.release:
//            lb, GridImageView, kp

public final class la extends BaseAdapter
{

    public ListView a;
    private Context b;
    private String c[];
    private Integer d[];
    private String e[];
    private int f;
    private boolean g;
    private int h;
    private kp i;

    public la(Context context, ListView listview, String as[], Integer ainteger[], String as1[], kp kp1)
    {
        f = 2;
        g = false;
        b = context;
        a = listview;
        c = as;
        d = ainteger;
        e = as1;
        i = kp1;
        h = c.length + 3;
    }

    protected final void a(int j, boolean flag)
    {
        f = j;
        if (flag)
        {
            notifyDataSetChanged();
        }
    }

    public final int getCount()
    {
        return h;
    }

    public final Object getItem(int j)
    {
        f = j;
        return c[j - 2];
    }

    public final long getItemId(int j)
    {
        return 0L;
    }

    public final View getView(int j, View view, ViewGroup viewgroup)
    {
        if (g)
        {
            view = new TextView(b);
            view.setText(" ");
            return view;
        }
        if (view == null)
        {
            try
            {
                view = LayoutInflater.from(b).inflate(0x7f0300d5, viewgroup, false);
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
                lb lb1;
                int k;
                try
                {
                    view = LayoutInflater.from(b).inflate(0x7f0300d5, viewgroup, false);
                }
                // Misplaced declaration of an exception variable
                catch (View view)
                {
                    view.printStackTrace();
                    g = true;
                    (new cc(b)).a();
                    view = new TextView(b);
                    view.setText(" ");
                    return view;
                }
            }
            lb1 = new lb();
            lb1.a = (TextView)view.findViewById(0x7f0d0382);
            lb1.b = (TextView)view.findViewById(0x7f0d0381);
            lb1.c = (GridImageView)view.findViewById(0x7f0d0380);
            lb1.e = (TextView)view.findViewById(0x7f0d0383);
            k = b.getResources().getDimensionPixelSize(0x7f090156);
            lb1.c.a(k, k);
            lb1.c.a(0);
            lb1.d = view.findViewById(0x7f0d037f);
            view.setTag(lb1);
            viewgroup = view;
            view = lb1;
        } else
        {
            lb lb2 = (lb)view.getTag();
            viewgroup = view;
            view = lb2;
        }
        if (j == f)
        {
            ((lb) (view)).d.setVisibility(0);
        } else
        {
            ((lb) (view)).d.setVisibility(4);
        }
        if (j == getCount() - 1)
        {
            ((lb) (view)).e.setVisibility(0);
            return viewgroup;
        }
        ((lb) (view)).e.setVisibility(8);
        switch (j)
        {
        default:
            Object obj = ((lb) (view)).a;
            String s = c[j - 2];
            ((TextView) (obj)).setText(s.substring(s.lastIndexOf("/") + 1));
            obj = e[j - 2];
            ((lb) (view)).c.setTag(obj);
            if (obj != null)
            {
                i.a(((String) (obj)), ((lb) (view)).c, false, false);
            }
            ((lb) (view)).b.setVisibility(0);
            ((lb) (view)).b.setText((new StringBuilder(" ")).append(d[j - 2]).append(" ").toString());
            return viewgroup;

        case 0: // '\0'
            ((lb) (view)).a.setText(0x7f070105);
            ((lb) (view)).b.setVisibility(8);
            i.a("2130838565", ((lb) (view)).c, false, true);
            return viewgroup;

        case 1: // '\001'
            ((lb) (view)).a.setText(0x7f0702eb);
            ((lb) (view)).b.setVisibility(8);
            i.a("2130838566", ((lb) (view)).c, false, true);
            return viewgroup;
        }
    }
}
