// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.support.v7.internal.view.menu.ExpandedMenuView;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.AdapterView;
import android.widget.ListAdapter;

public final class vs
    implements android.widget.AdapterView.OnItemClickListener, wj
{

    LayoutInflater a;
    vu b;
    int c;
    public wk d;
    private Context e;
    private ExpandedMenuView f;
    private int g;
    private vt h;

    private vs(int i, int j)
    {
        c = i;
        g = 0;
    }

    public vs(Context context, int i)
    {
        this(i, 0);
        e = context;
        a = LayoutInflater.from(e);
    }

    static int a(vs vs1)
    {
        return 0;
    }

    public final wl a(ViewGroup viewgroup)
    {
        if (f == null)
        {
            f = (ExpandedMenuView)a.inflate(b.by, viewgroup, false);
            if (h == null)
            {
                h = new vt(this);
            }
            f.setAdapter(h);
            f.setOnItemClickListener(this);
        }
        return f;
    }

    public final void a(Context context, vu vu1)
    {
        if (g == 0) goto _L2; else goto _L1
_L1:
        e = new ContextThemeWrapper(context, g);
        a = LayoutInflater.from(e);
_L4:
        b = vu1;
        if (h != null)
        {
            h.notifyDataSetChanged();
        }
        return;
_L2:
        if (e != null)
        {
            e = context;
            if (a == null)
            {
                a = LayoutInflater.from(e);
            }
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public final void a(vu vu1, boolean flag)
    {
        if (d != null)
        {
            d.a(vu1, flag);
        }
    }

    public final boolean a()
    {
        return false;
    }

    public final boolean a(wo wo1)
    {
        if (!wo1.hasVisibleItems())
        {
            return false;
        }
        vx vx1 = new vx(wo1);
        Object obj = vx1.a;
        sr sr1 = new sr(((vu) (obj)).a);
        vx1.c = new vs(sr1.a.a, b.bB);
        vx1.c.d = vx1;
        vx1.a.a(vx1.c);
        sr1.a(vx1.c.b(), vx1);
        View view = ((vu) (obj)).h;
        if (view != null)
        {
            sr1.a(view);
        } else
        {
            android.graphics.drawable.Drawable drawable = ((vu) (obj)).g;
            sr1.a.c = drawable;
            sr1.a(((vu) (obj)).f);
        }
        sr1.a.n = vx1;
        vx1.b = sr1.a();
        vx1.b.setOnDismissListener(vx1);
        obj = vx1.b.getWindow().getAttributes();
        obj.type = 1003;
        obj.flags = ((android.view.WindowManager.LayoutParams) (obj)).flags | 0x20000;
        vx1.b.show();
        if (d != null)
        {
            d.a_(wo1);
        }
        return true;
    }

    public final ListAdapter b()
    {
        if (h == null)
        {
            h = new vt(this);
        }
        return h;
    }

    public final void b(boolean flag)
    {
        if (h != null)
        {
            h.notifyDataSetChanged();
        }
    }

    public final boolean b(vy vy)
    {
        return false;
    }

    public final boolean c(vy vy)
    {
        return false;
    }

    public final void onItemClick(AdapterView adapterview, View view, int i, long l)
    {
        b.a(h.a(i), this, 0);
    }
}
