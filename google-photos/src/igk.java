// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.Collections;
import java.util.List;

final class igk extends BaseAdapter
{

    private final Context a;
    private final List b;
    private final igp c;

    public igk(Context context, igs igs)
    {
        a = context;
        c = new igp(context, igs);
        b = Collections.unmodifiableList((new igq(context)).a(c.a()));
    }

    private static double a(double d, oqm oqm1)
    {
        return d / (double)(1L * oqm1.f);
    }

    public final igo a(int i)
    {
        return (igo)b.get(i);
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
        return (long)i;
    }

    public final View getView(int i, View view, ViewGroup viewgroup)
    {
        View view1 = view;
        if (view == null)
        {
            view1 = LayoutInflater.from(a).inflate(b.zk, viewgroup, false);
        }
        viewgroup = a(i);
        ((ImageView)view1.findViewById(aa.K)).setImageDrawable(((igo) (viewgroup)).c);
        ((TextView)view1.findViewById(aa.J)).setText(((igo) (viewgroup)).a);
        TextView textview = (TextView)view1.findViewById(aa.L);
        long l = c.a.a(((igo) (viewgroup)).b);
        if (l == 0L)
        {
            view = "";
        } else
        if (l < 1L * oqm.b.f)
        {
            double d = Math.ceil(a(l, oqm.c) * 10D) / 10D;
            view = a.getString(b.zm, new Object[] {
                Double.valueOf(d)
            });
        } else
        {
            double d1 = Math.ceil(a(l, oqm.b) * 10D) / 10D;
            view = a.getString(b.zl, new Object[] {
                Double.valueOf(d1)
            });
        }
        textview.setText(view);
        b.a(view1, new msm(((igo) (viewgroup)).d));
        return view1;
    }
}
