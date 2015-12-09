// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.internal.widget;

import android.content.Context;
import android.content.pm.ResolveInfo;
import android.support.v4.view.bq;
import android.support.v7.b.f;
import android.support.v7.b.h;
import android.support.v7.b.i;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

// Referenced classes of package android.support.v7.internal.widget:
//            ActivityChooserView, j

class q extends BaseAdapter
{

    final ActivityChooserView a;
    private j b;
    private int c;
    private boolean d;
    private boolean e;
    private boolean f;

    public int a()
    {
        int k = 0;
        int i1 = c;
        c = 0x7fffffff;
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

        c = i1;
        return l;
    }

    public void a(int k)
    {
        if (c != k)
        {
            c = k;
            notifyDataSetChanged();
        }
    }

    public void a(j j1)
    {
        j j2 = ActivityChooserView.a(a).d();
        if (j2 != null && a.isShown())
        {
            j2.unregisterObserver(ActivityChooserView.g(a));
        }
        b = j1;
        if (j1 != null && a.isShown())
        {
            j1.registerObserver(ActivityChooserView.g(a));
        }
        notifyDataSetChanged();
    }

    public void a(boolean flag)
    {
        if (f != flag)
        {
            f = flag;
            notifyDataSetChanged();
        }
    }

    public void a(boolean flag, boolean flag1)
    {
        if (d != flag || e != flag1)
        {
            d = flag;
            e = flag1;
            notifyDataSetChanged();
        }
    }

    public ResolveInfo b()
    {
        return b.b();
    }

    public int c()
    {
        return b.a();
    }

    public j d()
    {
        return b;
    }

    public boolean e()
    {
        return d;
    }

    public int getCount()
    {
        int l = b.a();
        int k = l;
        if (!d)
        {
            k = l;
            if (b.b() != null)
            {
                k = l - 1;
            }
        }
        l = Math.min(k, c);
        k = l;
        if (f)
        {
            k = l + 1;
        }
        return k;
    }

    public Object getItem(int k)
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
        if (!d)
        {
            l = k;
            if (b.b() != null)
            {
                l = k + 1;
            }
        }
        return b.a(l);
    }

    public long getItemId(int k)
    {
        return (long)k;
    }

    public int getItemViewType(int k)
    {
        return !f || k != getCount() - 1 ? 0 : 1;
    }

    public View getView(int k, View view, ViewGroup viewgroup)
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
        view1 = LayoutInflater.from(a.getContext()).inflate(h.abc_activity_chooser_view_list_item, viewgroup, false);
        view1.setId(1);
        ((TextView)view1.findViewById(f.title)).setText(a.getContext().getString(i.abc_activity_chooser_view_see_all));
_L6:
        return view1;
_L2:
        if (view == null) goto _L8; else goto _L7
_L7:
        view1 = view;
        if (view.getId() == f.list_item) goto _L9; else goto _L8
_L8:
        view1 = LayoutInflater.from(a.getContext()).inflate(h.abc_activity_chooser_view_list_item, viewgroup, false);
_L9:
        view = a.getContext().getPackageManager();
        viewgroup = (ImageView)view1.findViewById(f.icon);
        ResolveInfo resolveinfo = (ResolveInfo)getItem(k);
        viewgroup.setImageDrawable(resolveinfo.loadIcon(view));
        ((TextView)view1.findViewById(f.title)).setText(resolveinfo.loadLabel(view));
        if (d && k == 0 && e)
        {
            bq.b(view1, true);
            return view1;
        } else
        {
            bq.b(view1, false);
            return view1;
        }
    }

    public int getViewTypeCount()
    {
        return 3;
    }
}
