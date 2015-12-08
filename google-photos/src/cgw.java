// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import java.util.List;

final class cgw extends BaseAdapter
{

    private final LayoutInflater a;
    private List b;
    private cgp c;

    public cgw(cgp cgp1, Context context, List list)
    {
        c = cgp1;
        super();
        a = LayoutInflater.from(context);
        b = list;
    }

    public final int getCount()
    {
        return b.size();
    }

    public final Object getItem(int i)
    {
        return b.get(i);
    }

    public final long getItemId(int i)
    {
        return ((cqa)b.get(i)).e.b;
    }

    public final View getView(int i, View view, ViewGroup viewgroup)
    {
        View view1 = view;
        if (view == null)
        {
            view1 = a.inflate(c.F, viewgroup, false);
        }
        cgp.a(c, view1, (cqa)b.get(i));
        ((TextView)view1.findViewById(b.gK)).setText(((cqa)b.get(i)).b);
        b.a(view1, new ogx(pwp.w, ((cqa)b.get(i)).e.b));
        return view1;
    }
}
