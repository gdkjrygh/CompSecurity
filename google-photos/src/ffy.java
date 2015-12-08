// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.Collections;
import java.util.List;

public final class ffy extends BaseAdapter
{

    public final fgc a;
    public List b;
    private final Context c;
    private final fba d;
    private final fgb e;
    private int f;
    private final nug g = new ffz(this);

    public ffy(Context context)
    {
        c = context;
        e = (fgb)olm.a(context, fgb);
        a = (fgc)olm.a(context, fgc);
        b = Collections.emptyList();
        d = (fba)olm.a(context, fba);
        d.a.a(g, true);
    }

    static void a(ffy ffy1, faz faz)
    {
        faz = ffw.a(faz);
        int i = ffy1.b.indexOf(faz);
        if (ffy1.f != i && i >= 0)
        {
            ffy1.f = i;
            ffy1.notifyDataSetChanged();
        }
    }

    private int b(int i)
    {
        if (a(i) == ffw.k)
        {
            return fga.c;
        }
        if (a(i).a())
        {
            return fga.b;
        } else
        {
            return fga.a;
        }
    }

    public final ffw a(int i)
    {
        return (ffw)b.get(i);
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

    public final int getItemViewType(int i)
    {
        return b(i) - 1;
    }

    public final View getView(int i, View view, ViewGroup viewgroup)
    {
        boolean flag = true;
        ffw ffw1 = a(i);
        int j = b(i);
        View view1 = view;
        if (view == null)
        {
            view = LayoutInflater.from(c);
            if (j == fga.c)
            {
                view1 = view.inflate(b.oj, viewgroup, false);
            } else
            if (j == fga.b)
            {
                view1 = view.inflate(b.ok, viewgroup, false);
            } else
            {
                view1 = view.inflate(b.oi, viewgroup, false);
            }
        }
        if (j == fga.c)
        {
            view1.setClickable(false);
            return view1;
        }
        if (j == fga.b)
        {
            ((ImageView)view1.findViewById(af.k)).setImageDrawable(ffw1.b(c));
            ((TextView)view1.findViewById(af.m)).setText(ffw1.a(c));
            view = c;
            if (ffw1.a())
            {
                view = view.getResources().getString(ffw1.m.intValue());
            } else
            {
                view = null;
            }
            ((TextView)view1.findViewById(af.l)).setText(view);
            b.a(view1, new msm(ffw1.l));
            if (f == i)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            view1.setActivated(flag);
            return view1;
        }
        ((ImageView)view1.findViewById(af.k)).setImageDrawable(ffw1.b(c));
        ((TextView)view1.findViewById(af.m)).setText(ffw1.a(c));
        view = (TextView)view1.findViewById(af.j);
        j = e.a(ffw1);
        viewgroup = e.b(ffw1);
        if (j > 0)
        {
            if (j < 10)
            {
                view.setText(Integer.toString(j));
            } else
            {
                view.setText(c.getString(b.op));
            }
            view.setContentDescription(viewgroup);
            view.setVisibility(0);
        } else
        {
            view.setVisibility(8);
        }
        b.a(view1, new msm(ffw1.l));
        if (f != i)
        {
            flag = false;
        }
        view1.setActivated(flag);
        return view1;
    }

    public final int getViewTypeCount()
    {
        return fga.a().length;
    }

    public final boolean isEnabled(int i)
    {
        return b(i) != fga.c;
    }
}
