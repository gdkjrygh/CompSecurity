// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import java.util.Arrays;
import java.util.List;

public abstract class ftv extends BaseAdapter
{

    public Context a;
    public boolean b;
    public final gji c;
    private List d;

    public ftv(Context context, boolean flag)
    {
        a = context;
        b = flag;
        dmz.a(gjj);
        c = gjj.a(context);
    }

    public abstract ddd a(Context context, ViewGroup viewgroup);

    public abstract void a(ddd ddd1, Object obj);

    public final void a(Object aobj[])
    {
        d = Arrays.asList(aobj);
        notifyDataSetChanged();
    }

    public int getCount()
    {
        int i = 0;
        if (d != null)
        {
            i = d.size();
        }
        int j = i;
        if (b)
        {
            j = i + 1;
        }
        return j;
    }

    public Object getItem(int i)
    {
        if (i < d.size())
        {
            return d.get(i);
        } else
        {
            return null;
        }
    }

    public long getItemId(int i)
    {
        return (long)i;
    }

    public int getItemViewType(int i)
    {
        return d == null || i >= d.size() ? 1 : 0;
    }

    public View getView(int i, View view, ViewGroup viewgroup)
    {
        if (getItemViewType(i) == 0)
        {
            ddd ddd1 = dds.a(view);
            view = ddd1;
            if (ddd1 == null)
            {
                view = a(a, viewgroup);
            }
            view.a(true);
            a(view, getItem(i));
        } else
        {
            ddh ddh1 = (ddh)dds.a(view);
            view = ddh1;
            if (ddh1 == null)
            {
                view = dds.b(a, viewgroup);
            }
            view.a(a.getString(0x7f080430));
            view.a(true);
        }
        return view.a();
    }

    public int getViewTypeCount()
    {
        return 2;
    }
}
