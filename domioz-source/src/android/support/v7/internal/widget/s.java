// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.internal.widget;

import android.content.Context;
import android.content.pm.ResolveInfo;
import android.support.v4.view.bp;
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
//            m, ActivityChooserView

final class s extends BaseAdapter
{

    final ActivityChooserView a;
    private m b;
    private int c;
    private boolean d;
    private boolean e;
    private boolean f;

    public final int a()
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

    public final void a(int k)
    {
        if (c != k)
        {
            c = k;
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
        if (d != flag || e != flag1)
        {
            d = flag;
            e = flag1;
            notifyDataSetChanged();
        }
    }

    public final ResolveInfo b()
    {
        return b.b();
    }

    public final int c()
    {
        return b.a();
    }

    public final m d()
    {
        return b;
    }

    public final boolean e()
    {
        return d;
    }

    public final int getCount()
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
        view1 = LayoutInflater.from(a.getContext()).inflate(i.e, viewgroup, false);
        view1.setId(1);
        ((TextView)view1.findViewById(g.v)).setText(a.getContext().getString(j.b));
_L6:
        return view1;
_L2:
        if (view == null) goto _L8; else goto _L7
_L7:
        view1 = view;
        if (view.getId() == g.q) goto _L9; else goto _L8
_L8:
        view1 = LayoutInflater.from(a.getContext()).inflate(i.e, viewgroup, false);
_L9:
        view = a.getContext().getPackageManager();
        viewgroup = (ImageView)view1.findViewById(g.p);
        ResolveInfo resolveinfo = (ResolveInfo)getItem(k);
        viewgroup.setImageDrawable(resolveinfo.loadIcon(view));
        ((TextView)view1.findViewById(g.v)).setText(resolveinfo.loadLabel(view));
        if (d && k == 0 && e)
        {
            bp.a(view1, true);
            return view1;
        } else
        {
            bp.a(view1, false);
            return view1;
        }
    }

    public final int getViewTypeCount()
    {
        return 3;
    }
}
