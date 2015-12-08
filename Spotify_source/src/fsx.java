// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public abstract class fsx extends BaseAdapter
{

    private boolean a;
    public Context c;
    public List d;

    public fsx(Context context)
    {
        a = true;
        a(context, new ArrayList());
    }

    public fsx(Context context, List list)
    {
        a = true;
        a(context, list);
    }

    public transient fsx(Context context, Object aobj[])
    {
        a = true;
        a(context, Arrays.asList(aobj));
    }

    private void a(Context context, List list)
    {
        c = (Context)ctz.a(context);
        d = (List)ctz.a(list);
    }

    public abstract View a(Context context, int i, ViewGroup viewgroup);

    public abstract void a(View view, Context context, int i);

    public final void a(Collection collection)
    {
        d.addAll((Collection)ctz.a(collection));
        if (a)
        {
            notifyDataSetChanged();
        }
    }

    public final void b()
    {
        d.clear();
        if (a)
        {
            notifyDataSetChanged();
        }
    }

    public int getCount()
    {
        return d.size();
    }

    public Object getItem(int i)
    {
        return d.get(i);
    }

    public long getItemId(int i)
    {
        return (long)i;
    }

    public View getView(int i, View view, ViewGroup viewgroup)
    {
        Object obj = getItem(i);
        View view1 = view;
        if (view == null)
        {
            view1 = a(c, i, viewgroup);
        }
        view1.setTag(obj);
        a(view1, c, i);
        return view1;
    }
}
