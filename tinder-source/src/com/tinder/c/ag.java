// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tinder.c;

import android.animation.LayoutTransition;
import android.app.Dialog;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import com.tinder.utils.ad;

public abstract class ag extends Dialog
{

    private static float F = 0.88F;
    protected View A;
    protected View B;
    protected TextView C;
    protected TextView D;
    protected TextView E;
    protected Context a;
    protected TextView b;
    protected TextView c;
    protected CheckBox d;
    protected EditText e;
    protected Button f;
    protected ScrollView g;
    protected RelativeLayout h;
    protected RelativeLayout i;
    protected ProgressBar j;
    protected ProgressBar k;
    protected ProgressBar l;
    protected ProgressBar m;
    protected ProgressBar n;
    protected CheckBox o;
    protected CheckBox p;
    protected CheckBox q;
    protected CheckBox r;
    protected CheckBox s;
    protected CheckBox t;
    protected ImageView u;
    protected ImageView v;
    protected ImageView w;
    protected ImageView x;
    protected ImageView y;
    protected ImageView z;

    public ag(Context context, int i1)
    {
        super(context, i1);
        getWindow().getAttributes().windowAnimations = 0x7f0b01df;
        a = context;
        requestWindowFeature(1);
        getWindow().setBackgroundDrawable(new ColorDrawable(0));
        setContentView(0x7f03004f);
        b = (TextView)findViewById(0x7f0e015b);
        c = (TextView)findViewById(0x7f0e015f);
        f = (Button)findViewById(0x7f0e0169);
        d = (CheckBox)findViewById(0x7f0e0167);
        e = (EditText)findViewById(0x7f0e0165);
        i = (RelativeLayout)findViewById(0x7f0e0164);
        h = (RelativeLayout)findViewById(0x7f0e0163);
        B = findViewById(0x7f0e0162);
        A = findViewById(0x7f0e0160);
        j = (ProgressBar)findViewById(0x7f0e01c8);
        k = (ProgressBar)findViewById(0x7f0e01cb);
        l = (ProgressBar)findViewById(0x7f0e01ce);
        m = (ProgressBar)findViewById(0x7f0e01d1);
        n = (ProgressBar)findViewById(0x7f0e0166);
        g = (ScrollView)findViewById(0x7f0e0161);
        o = (CheckBox)findViewById(0x7f0e01d6);
        q = (CheckBox)findViewById(0x7f0e01dc);
        p = (CheckBox)findViewById(0x7f0e01d9);
        r = (CheckBox)findViewById(0x7f0e01df);
        s = (CheckBox)findViewById(0x7f0e01e2);
        t = (CheckBox)findViewById(0x7f0e01e5);
        u = (ImageView)findViewById(0x7f0e01d7);
        v = (ImageView)findViewById(0x7f0e01da);
        w = (ImageView)findViewById(0x7f0e01dd);
        x = (ImageView)findViewById(0x7f0e01e0);
        y = (ImageView)findViewById(0x7f0e01e3);
        z = (ImageView)findViewById(0x7f0e01e6);
        C = (TextView)findViewById(0x7f0e015c);
        D = (TextView)findViewById(0x7f0e015d);
        E = (TextView)findViewById(0x7f0e015e);
        ((LinearLayout)findViewById(0x7f0e0159)).getLayoutTransition().setAnimateParentHierarchy(false);
        context = getWindow();
        context.getAttributes().width = (int)ad.a(F);
        context.setGravity(17);
        a();
        c();
        d();
        f();
        h();
        d();
        C.setVisibility(8);
        D.setVisibility(8);
        E.setVisibility(8);
        k();
    }

    protected final void a()
    {
        d.setVisibility(8);
    }

    protected final void a(boolean flag)
    {
        Button button = f;
        float f1;
        if (flag)
        {
            f1 = 1.0F;
        } else
        {
            f1 = 0.25F;
        }
        button.setAlpha(f1);
        f.setEnabled(flag);
    }

    protected final void b()
    {
        d.setVisibility(0);
    }

    protected final void c()
    {
        j.setVisibility(8);
        k.setVisibility(8);
        l.setVisibility(8);
        m.setVisibility(8);
        n.setVisibility(8);
    }

    protected final void d()
    {
        i.setVisibility(8);
        e.setVisibility(8);
        n.setVisibility(8);
    }

    protected final void e()
    {
        i.setVisibility(0);
        e.setVisibility(0);
        e.requestFocus();
        ad.a(a, e);
    }

    protected final void f()
    {
        h.setVisibility(8);
        B.setVisibility(8);
    }

    protected final void g()
    {
        h.setVisibility(0);
        B.setVisibility(0);
    }

    protected final void h()
    {
        g.setVisibility(8);
        A.setVisibility(8);
    }

    protected final void i()
    {
        g.setVisibility(0);
        A.setVisibility(0);
    }

    protected final void j()
    {
        C.setVisibility(0);
        D.setVisibility(0);
        E.setVisibility(0);
    }

    public abstract void k();

}
