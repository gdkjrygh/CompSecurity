// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.android.paste.widget;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import dgn;

public class DialogLayout extends LinearLayout
{

    public Button a;
    private Button b;
    private Button c;
    private Button d;
    private Button e;
    private LinearLayout f;
    private TextView g;
    private TextView h;
    private ViewGroup i;
    private ImageView j;
    private View k;
    private View l;
    private CharSequence m;
    private CharSequence n;
    private android.view.View.OnClickListener o;
    private android.view.View.OnClickListener p;

    public DialogLayout(Context context)
    {
        this(context, false);
    }

    public DialogLayout(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, false);
    }

    private DialogLayout(Context context, AttributeSet attributeset, boolean flag)
    {
        super(context, attributeset);
        dgn.a(com/spotify/android/paste/widget/DialogLayout, this);
        int i1;
        if (flag)
        {
            i1 = 0x7f0300ff;
        } else
        {
            i1 = 0x7f030100;
        }
        inflate(context, i1, this);
        b = (Button)findViewById(0x7f110471);
        d = (Button)findViewById(0x7f11029b);
        e = (Button)findViewById(0x7f11029a);
        c = (Button)findViewById(0x7f110472);
        f = (LinearLayout)findViewById(0x7f110299);
        g = (TextView)findViewById(0x7f11026e);
        h = (TextView)findViewById(0x7f1102f9);
        i = (ViewGroup)findViewById(0x7f11032d);
        j = (ImageView)findViewById(0x7f11026a);
        l = findViewById(0x7f1102a0);
    }

    public DialogLayout(Context context, boolean flag)
    {
        this(context, null, flag);
    }

    private void b()
    {
        if (m == null && n == null)
        {
            f.setVisibility(8);
            a = null;
        } else
        {
            f.setVisibility(0);
            if (m != null && n != null)
            {
                c.setVisibility(0);
                b.setVisibility(0);
                d.setVisibility(8);
                e.setVisibility(8);
                b.setText(n);
                b.setOnClickListener(p);
                c.setText(m);
                c.setOnClickListener(o);
                a = c;
                return;
            }
            c.setVisibility(8);
            b.setVisibility(8);
            if (m != null)
            {
                d.setVisibility(0);
                e.setVisibility(8);
                d.setText(m);
                d.setOnClickListener(o);
                a = d;
            }
            if (n != null)
            {
                e.setVisibility(0);
                d.setVisibility(8);
                e.setText(n);
                e.setOnClickListener(p);
                a = null;
                return;
            }
        }
    }

    public final Button a()
    {
        return a;
    }

    public final void a(int i1)
    {
        a(getResources().getText(i1));
    }

    public final void a(int i1, android.view.View.OnClickListener onclicklistener)
    {
        a(getResources().getText(i1), onclicklistener);
    }

    public final void a(View view)
    {
        if (k != null)
        {
            i.removeView(k);
        }
        if (view == null)
        {
            i.setVisibility(8);
            return;
        } else
        {
            k = view;
            i.addView(view, -1, -2);
            i.setVisibility(0);
            return;
        }
    }

    public final void a(CharSequence charsequence)
    {
        g.setText(charsequence);
        l.setVisibility(0);
    }

    public final void a(CharSequence charsequence, android.view.View.OnClickListener onclicklistener)
    {
        m = charsequence;
        o = onclicklistener;
        b();
    }

    public final void b(int i1)
    {
        j.setVisibility(0);
        j.setImageResource(i1);
    }

    public final void b(int i1, android.view.View.OnClickListener onclicklistener)
    {
        b(getResources().getText(i1), onclicklistener);
    }

    public final void b(CharSequence charsequence)
    {
        h.setText(charsequence);
        h.setVisibility(0);
    }

    public final void b(CharSequence charsequence, android.view.View.OnClickListener onclicklistener)
    {
        n = charsequence;
        p = onclicklistener;
        b();
    }

    public final void c(int i1)
    {
        b(getResources().getText(i1));
    }
}
