// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.imagelib.filter;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import com.bumptech.glide.c;
import com.bumptech.glide.p;
import com.roidapp.baselib.b.a;
import com.roidapp.imagelib.d;
import com.roidapp.imagelib.e;
import com.roidapp.imagelib.filter.groupinfo.IGroupInfo;
import com.roidapp.imagelib.g;
import com.roidapp.imagelib.h;
import java.util.List;

// Referenced classes of package com.roidapp.imagelib.filter:
//            ac

public final class ab extends BaseAdapter
{

    public IGroupInfo a;
    private List b;
    private LayoutInflater c;
    private final Context d;
    private boolean e;
    private final int f;

    public ab(List list, Context context, boolean flag)
    {
        e = flag;
        b = list;
        c = LayoutInflater.from(context);
        d = context;
        f = (int)context.getResources().getDimension(e.g);
    }

    public final int a(IGroupInfo igroupinfo)
    {
        int j;
        j = -1;
        break MISSING_BLOCK_LABEL_2;
        while (true) 
        {
            do
            {
                return j;
            } while (b == null || igroupinfo == null);
            int i = 0;
label0:
            do
            {
label1:
                {
                    if (i >= b.size())
                    {
                        break label1;
                    }
                    j = i;
                    if (igroupinfo.c() == ((IGroupInfo)b.get(i)).c())
                    {
                        break label0;
                    }
                    i++;
                }
            } while (true);
        }
        return 0;
    }

    public final IGroupInfo a(int i)
    {
        return (IGroupInfo)b.get(i);
    }

    public final IGroupInfo a(long l)
    {
        int j = b.size();
        for (int i = 0; i < j; i++)
        {
            IGroupInfo igroupinfo = (IGroupInfo)b.get(i);
            if (igroupinfo.c() == l)
            {
                return igroupinfo;
            }
        }

        return null;
    }

    public final List a()
    {
        return b;
    }

    public final void a(int i, IGroupInfo igroupinfo)
    {
        if (b != null)
        {
            b.add(i, igroupinfo);
        }
    }

    public final void b(int i, IGroupInfo igroupinfo)
    {
        b.add(i, igroupinfo);
        notifyDataSetChanged();
    }

    public final void b(IGroupInfo igroupinfo)
    {
        b.remove(igroupinfo);
    }

    public final int getCount()
    {
        return b.size();
    }

    public final Object getItem(int i)
    {
        return a(i);
    }

    public final long getItemId(int i)
    {
        return 0L;
    }

    public final View getView(int i, View view, ViewGroup viewgroup)
    {
        IGroupInfo igroupinfo;
        if (view == null)
        {
            ac ac1 = new ac((byte)0);
            view = c.inflate(h.h, viewgroup, false);
            ac1.a = (TextView)view.findViewById(g.B);
            ac1.b = (ImageView)view.findViewById(g.p);
            ac1.c = (ImageView)view.findViewById(g.aw);
            ac1.d = view.findViewById(g.q);
            view.setTag(ac1);
            viewgroup = ac1;
        } else
        {
            viewgroup = (ac)view.getTag();
        }
        igroupinfo = a(i);
        ((ac) (viewgroup)).d.setTag(Integer.valueOf(i));
        if (a != null && a.c() == igroupinfo.c())
        {
            ((ac) (viewgroup)).d.setBackgroundColor(d.getResources().getColor(d.b));
        } else
        {
            ((ac) (viewgroup)).d.setBackgroundColor(0);
        }
        ((ac) (viewgroup)).a.setText(igroupinfo.a(d));
        ((ac) (viewgroup)).a.setBackgroundColor(igroupinfo.b(d));
        if (igroupinfo.c() == 102L && e)
        {
            ((ac) (viewgroup)).c.setVisibility(0);
        } else
        {
            ((ac) (viewgroup)).c.setVisibility(8);
        }
        if (igroupinfo.g())
        {
            p p1;
            if (d instanceof Activity)
            {
                p1 = com.bumptech.glide.h.a((Activity)d);
            } else
            {
                p1 = com.bumptech.glide.h.b(d);
            }
            p1.a((String)igroupinfo.h()).a(com.bumptech.glide.load.b.e.c).b(com.roidapp.baselib.b.a.b()).g().a(((ac) (viewgroup)).b);
            return view;
        } else
        {
            ((ac) (viewgroup)).b.setImageResource(((Integer)igroupinfo.h()).intValue());
            return view;
        }
    }
}
