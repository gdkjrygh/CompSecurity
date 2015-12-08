// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.widget;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import com.kik.android.c.e;
import com.kik.android.c.f;
import com.kik.cache.SmileyImageView;
import java.util.List;
import kik.android.chat.KikApplication;

public final class dk extends BaseAdapter
{

    private static final int h = KikApplication.a(8);
    private Context a;
    private final int b;
    private final int c;
    private final LayoutInflater d;
    private final f e;
    private e f;
    private List g;
    private int i;
    private long j;

    public dk(Context context, f f1)
    {
        a = context;
        d = LayoutInflater.from(context);
        b = a.getResources().getDrawable(0x7f02027f).getIntrinsicWidth();
        c = a.getResources().getDrawable(0x7f02027f).getIntrinsicHeight();
        e = f1;
        g = e.d();
        i = getCount() - 1;
        j = e.h();
    }

    public final int a()
    {
        return b + h;
    }

    public final void a(int k)
    {
        i = k;
        notifyDataSetChanged();
    }

    public final void a(e e1)
    {
        f = e1;
        if (e1 != null)
        {
            notifyDataSetChanged();
        }
    }

    public final int b()
    {
        return c + h;
    }

    public final void c()
    {
        g = e.d();
        notifyDataSetChanged();
    }

    public final int getCount()
    {
        return Math.min(g.size(), 20) + 1;
    }

    public final Object getItem(int k)
    {
        return null;
    }

    public final long getItemId(int k)
    {
        return 0L;
    }

    public final View getView(int k, View view, ViewGroup viewgroup)
    {
        boolean flag1 = true;
        View view1 = view;
        if (view == null)
        {
            view1 = d.inflate(0x7f030099, viewgroup, false);
            view = (SmileyImageView)view1.findViewById(0x7f0e01e0);
            view.e(0x7f0202a7);
            view.setScaleType(android.widget.ImageView.ScaleType.FIT_CENTER);
            view.setPadding(h / 2, h / 2, h / 2, h / 2);
            view1.setBackgroundResource(0x7f0202a0);
            view1.setLayoutParams(new android.widget.AbsListView.LayoutParams(a(), b()));
        }
        view1.setBackgroundResource(0x7f0202a0);
        view = (SmileyImageView)view1.findViewById(0x7f0e01e0);
        viewgroup = view1.findViewById(0x7f0e01e1);
        if (k >= 0 && k < g.size() && k != i)
        {
            int l = k;
            if (k > i)
            {
                l = k - 1;
            }
            com.kik.android.c.f.b b1 = (com.kik.android.c.f.b)g.get(l);
            e e1 = b1.b();
            view.a(e1, com.kik.android.c.f.e());
            if (f != null && e1 != null)
            {
                boolean flag;
                if (f.e() != null && f.e().equals(e1.e()))
                {
                    k = 1;
                } else
                {
                    k = 0;
                }
                if (f.e() == null && e1.e() == null && f.g() != null && f.g().equals(e1.g()))
                {
                    flag = flag1;
                } else
                {
                    flag = false;
                }
                if (k != 0 || flag)
                {
                    view1.setBackgroundResource(0x7f0200ad);
                }
            }
            view1.setTag(e1);
            if (e1 != null)
            {
                view.setContentDescription((new StringBuilder("AUTOMATION_SMILEY_TRAY_SMILEY_")).append(e1.g()).toString());
            }
            if (b1.c())
            {
                viewgroup.setVisibility(0);
                viewgroup.setBackgroundResource(0x7f0202b0);
                return view1;
            }
            if (b1.d())
            {
                viewgroup.setVisibility(0);
                if (b1.a(j))
                {
                    viewgroup.setBackgroundResource(0x7f0202b0);
                    return view1;
                } else
                {
                    viewgroup.setBackgroundResource(0x7f0202b1);
                    return view1;
                }
            } else
            {
                viewgroup.setVisibility(4);
                return view1;
            }
        } else
        {
            view.b(view.getResources().getDrawable(0x7f02020b));
            view.setContentDescription("AUTOMATION_SMILEY_TRAY_STORE");
            return view1;
        }
    }

    public final boolean hasStableIds()
    {
        return true;
    }

}
