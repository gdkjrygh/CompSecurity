// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.imagelib.filter;

import android.content.Context;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import com.roidapp.imagelib.d;
import com.roidapp.imagelib.e;
import com.roidapp.imagelib.filter.filterinfo.IFilterInfo;
import com.roidapp.imagelib.filter.groupinfo.IGroupInfo;
import com.roidapp.imagelib.g;
import com.roidapp.imagelib.h;
import java.util.List;

// Referenced classes of package com.roidapp.imagelib.filter:
//            ay

public abstract class ax extends BaseAdapter
{

    private final Context a;
    public int b;
    private IGroupInfo c;
    private IFilterInfo d[];
    private final int e;

    public ax(IGroupInfo igroupinfo, Context context)
    {
        b = -1;
        d = new IFilterInfo[0];
        e = (int)context.getResources().getDimension(e.g);
        c = igroupinfo;
        List list = null;
        if (igroupinfo != null)
        {
            list = igroupinfo.d();
        }
        if (list != null)
        {
            d = (IFilterInfo[])list.toArray(d);
        }
        a = context;
    }

    public final IGroupInfo a()
    {
        return c;
    }

    public abstract void a(ImageView imageview, IFilterInfo ifilterinfo);

    public final void a(IGroupInfo igroupinfo)
    {
        List list = null;
        if (igroupinfo != null)
        {
            list = igroupinfo.d();
        }
        if (list != null)
        {
            d = (IFilterInfo[])list.toArray();
        }
        c = igroupinfo;
    }

    public int getCount()
    {
        if (d == null)
        {
            return 0;
        } else
        {
            return d.length;
        }
    }

    public Object getItem(int i)
    {
        return d[i];
    }

    public long getItemId(int i)
    {
        return 0L;
    }

    public View getView(int i, View view, ViewGroup viewgroup)
    {
        IFilterInfo ifilterinfo;
        if (view == null)
        {
            ay ay1 = new ay((byte)0);
            view = LayoutInflater.from(a).inflate(h.f, viewgroup, false);
            ay1.b = (ImageView)view.findViewById(g.l);
            ay1.a = (TextView)view.findViewById(g.B);
            view.setTag(ay1);
            viewgroup = ay1;
        } else
        {
            viewgroup = (ay)view.getTag();
        }
        ifilterinfo = (IFilterInfo)getItem(i);
        i = ifilterinfo.c();
        if (i == b)
        {
            ((ay) (viewgroup)).b.setBackgroundColor(a.getResources().getColor(d.b));
        } else
        {
            ((ay) (viewgroup)).b.setBackgroundColor(0);
        }
        a(((ay) (viewgroup)).b, ifilterinfo);
        ((ay) (viewgroup)).a.setTag(Integer.valueOf(i));
        ((ay) (viewgroup)).a.setText(ifilterinfo.b());
        return view;
    }
}
