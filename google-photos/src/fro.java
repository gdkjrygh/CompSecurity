// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.animation.TimeInterpolator;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.CheckBox;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.google.android.apps.photos.list.PhotoTileView;

public final class fro extends afn
{

    private static Drawable p;
    private CheckBox A;
    private TextView B;
    public final PhotoTileView o;
    private final nug q;
    private final nug r;
    private final nug s;
    private final nug t;
    private final FrameLayout u;
    private final ViewStub v;
    private final ViewStub w;
    private final ViewStub x;
    private final TimeInterpolator y;
    private final View z;

    public fro(ViewGroup viewgroup)
    {
        this(viewgroup, flj.b, true);
    }

    public fro(ViewGroup viewgroup, flj flj1, boolean flag)
    {
        super(LayoutInflater.from(viewgroup.getContext()).inflate(b.qc, viewgroup, false));
        viewgroup = a.getContext();
        if (p == null)
        {
            p = viewgroup.getResources().getDrawable(c.du);
        }
        u = (FrameLayout)a;
        y = b.e(u.getContext());
        o = (PhotoTileView)a.findViewById(au.g);
        o.g = flj1;
        o.f = flag;
        v = (ViewStub)a.findViewById(au.d);
        x = (ViewStub)a.findViewById(au.o);
        w = (ViewStub)a.findViewById(au.e);
        q = new frp(this);
        r = new frq(this);
        z = null;
        s = null;
        t = null;
        u.addOnAttachStateChangeListener(new frr(this));
    }

    static FrameLayout a(fro fro1)
    {
        return fro1.u;
    }

    static void a(fro fro1, String s1)
    {
        if (fro1.B == null)
        {
            fro1.B = (TextView)fro1.w.inflate();
        }
        fro1.B.setVisibility(0);
        fro1.B.setText(s1);
    }

    static void a(fro fro1, boolean flag)
    {
        if (fro1.A != null || flag)
        {
            CheckBox checkbox = fro1.t();
            int i;
            if (flag)
            {
                i = 0;
            } else
            {
                i = 8;
            }
            checkbox.setVisibility(i);
            olm.a(fro1.t().getContext(), dfo);
            dfo.a(fro1.t(), fro1.o.m);
            if (!flag)
            {
                fro1.t().setChecked(false);
            }
        }
    }

    static nug b(fro fro1)
    {
        return fro1.q;
    }

    static void b(fro fro1, boolean flag)
    {
        if (fro1.A != null || flag)
        {
            FrameLayout framelayout = fro1.u;
            Drawable drawable;
            if (flag)
            {
                drawable = p;
            } else
            {
                drawable = null;
            }
            framelayout.setBackgroundDrawable(drawable);
            fro1.t().setChecked(flag);
        }
    }

    static nug c(fro fro1)
    {
        return fro1.r;
    }

    static void d(fro fro1)
    {
        if (fro1.B != null)
        {
            fro1.B.setVisibility(8);
        }
    }

    private CheckBox t()
    {
        if (A == null)
        {
            A = (CheckBox)v.inflate();
            A.setOnClickListener(o.i);
        }
        return A;
    }
}
