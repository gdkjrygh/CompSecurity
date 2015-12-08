// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.photos.localmedia.ui;

import aa;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.Switch;
import fuu;
import fux;
import fxr;
import fxs;
import fxt;
import fxu;
import hyy;
import java.util.List;
import nud;
import nug;
import olm;

public class LocalPhotosHeaderView extends FrameLayout
{

    public fux a;
    public fxr b;
    private final hyy c;
    private final nug d;
    private final fuu e;
    private final nug f;
    private Switch g;

    public LocalPhotosHeaderView(Context context)
    {
        super(context);
        c = (hyy)olm.a(getContext(), hyy);
        d = new fxs(this);
        e = (fuu)olm.a(getContext(), fuu);
        f = new fxt(this);
    }

    public LocalPhotosHeaderView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        c = (hyy)olm.a(getContext(), hyy);
        d = new fxs(this);
        e = (fuu)olm.a(getContext(), fuu);
        f = new fxt(this);
    }

    public LocalPhotosHeaderView(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        c = (hyy)olm.a(getContext(), hyy);
        d = new fxs(this);
        e = (fuu)olm.a(getContext(), fuu);
        f = new fxt(this);
    }

    public static fux a(LocalPhotosHeaderView localphotosheaderview)
    {
        return localphotosheaderview.a;
    }

    public static fuu b(LocalPhotosHeaderView localphotosheaderview)
    {
        return localphotosheaderview.e;
    }

    public static Switch c(LocalPhotosHeaderView localphotosheaderview)
    {
        return localphotosheaderview.g;
    }

    public static fxr d(LocalPhotosHeaderView localphotosheaderview)
    {
        return localphotosheaderview.b;
    }

    public final void a()
    {
        g = (Switch)findViewById(aa.n);
        g.setOnCheckedChangeListener(new fxu(this));
        View view;
        int i;
        if (a.b())
        {
            g.setChecked(e.b);
        } else
        {
            String s = String.valueOf(a.b.get(0));
            g.setChecked(e.b(s));
        }
        view = findViewById(aa.m);
        if (c.b())
        {
            i = 0;
        } else
        {
            i = 4;
        }
        view.setVisibility(i);
    }

    protected void onAttachedToWindow()
    {
        super.onAttachedToWindow();
        c.a.a(d, true);
        e.c.a(f, true);
    }

    protected void onDetachedFromWindow()
    {
        super.onDetachedFromWindow();
        c.a.a(d);
        e.c.a(f);
    }
}
