// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.internal.widget;

import android.content.Context;
import android.content.pm.ResolveInfo;
import android.support.v4.view.bt;
import android.support.v7.a.g;
import android.support.v7.a.i;
import android.support.v7.a.j;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

// Referenced classes of package android.support.v7.internal.widget:
//            j, ActivityChooserView

final class t extends BaseAdapter
{

    android.support.v7.internal.widget.j a;
    boolean b;
    final ActivityChooserView c;
    private int d;
    private boolean e;
    private boolean f;

    t(ActivityChooserView activitychooserview)
    {
        c = activitychooserview;
        super();
        d = 4;
    }

    public final int a()
    {
        int k = 0;
        int i1 = d;
        d = 0x7fffffff;
        int j1 = android.view.View.MeasureSpec.makeMeasureSpec(0, 0);
        int k1 = android.view.View.MeasureSpec.makeMeasureSpec(0, 0);
        int l1 = getCount();
        View view = null;
        int l = 0;
        for (; k < l1; k++)
        {
            view = getView(k, view, null);
            view.measure(j1, k1);
            l = Math.max(l, view.getMeasuredWidth());
        }

        d = i1;
        return l;
    }

    public final void a(int k)
    {
        if (d != k)
        {
            d = k;
            notifyDataSetChanged();
        }
    }

    public final void a(boolean flag)
    {
        if (f != flag)
        {
            f = flag;
            notifyDataSetChanged();
        }
    }

    public final void a(boolean flag, boolean flag1)
    {
        if (b != flag || e != flag1)
        {
            b = flag;
            e = flag1;
            notifyDataSetChanged();
        }
    }

    public final int getCount()
    {
        int l = a.a();
        int k = l;
        if (!b)
        {
            k = l;
            if (a.b() != null)
            {
                k = l - 1;
            }
        }
        l = Math.min(k, d);
        k = l;
        if (f)
        {
            k = l + 1;
        }
        return k;
    }

    public final Object getItem(int k)
    {
        int l;
        switch (getItemViewType(k))
        {
        default:
            throw new IllegalArgumentException();

        case 1: // '\001'
            return null;

        case 0: // '\0'
            l = k;
            break;
        }
        if (!b)
        {
            l = k;
            if (a.b() != null)
            {
                l = k + 1;
            }
        }
        return a.a(l);
    }

    public final long getItemId(int k)
    {
        return (long)k;
    }

    public final int getItemViewType(int k)
    {
        return !f || k != getCount() - 1 ? 0 : 1;
    }

    public final View getView(int k, View view, ViewGroup viewgroup)
    {
        getItemViewType(k);
        JVM INSTR tableswitch 0 1: default 28
    //                   0 107
    //                   1 36;
           goto _L1 _L2 _L3
_L1:
        throw new IllegalArgumentException();
_L3:
        if (view == null) goto _L5; else goto _L4
_L4:
        View view1 = view;
        if (view.getId() == 1) goto _L6; else goto _L5
_L5:
        view1 = LayoutInflater.from(c.getContext()).inflate(i.abc_activity_chooser_view_list_item, viewgroup, false);
        view1.setId(1);
        ((TextView)view1.findViewById(g.title)).setText(c.getContext().getString(j.abc_activity_chooser_view_see_all));
_L6:
        return view1;
_L2:
        if (view == null) goto _L8; else goto _L7
_L7:
        view1 = view;
        if (view.getId() == g.list_item) goto _L9; else goto _L8
_L8:
        view1 = LayoutInflater.from(c.getContext()).inflate(i.abc_activity_chooser_view_list_item, viewgroup, false);
_L9:
        view = c.getContext().getPackageManager();
        viewgroup = (ImageView)view1.findViewById(g.icon);
        ResolveInfo resolveinfo = (ResolveInfo)getItem(k);
        viewgroup.setImageDrawable(resolveinfo.loadIcon(view));
        ((TextView)view1.findViewById(g.title)).setText(resolveinfo.loadLabel(view));
        if (b && k == 0 && e)
        {
            bt.a(view1, true);
            return view1;
        } else
        {
            bt.a(view1, false);
            return view1;
        }
    }

    public final int getViewTypeCount()
    {
        return 3;
    }
}
