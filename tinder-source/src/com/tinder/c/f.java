// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tinder.c;

import android.app.Dialog;
import android.content.Context;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.Window;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import com.tinder.utils.a;
import com.tinder.utils.ad;

public class f extends Dialog
{

    private final Context a;
    TextView b;
    private LayoutInflater c;
    private LinearLayout d;
    private ImageView e;
    private TextView f;
    private TextView g;
    private TextView h;
    private View i;
    private ScrollView j;

    public f(Context context, int k, int l)
    {
        super(context, 0x7f0b010f);
        a = context;
        a();
        b();
        setTitle(k);
        g.setText(l);
    }

    public f(Context context, int k, String s)
    {
        super(context, 0x7f0b010f);
        a = context;
        a();
        b();
        setTitle(k);
        g.setText(s);
    }

    private void a()
    {
        c = LayoutInflater.from(a);
        setContentView(0x7f030091);
        ad.a(this);
        Window window = getWindow();
        window.setLayout(-2, -2);
        window.setGravity(17);
        d = (LinearLayout)findViewById(0x7f0e023f);
        e = (ImageView)findViewById(0x7f0e0240);
        f = (TextView)findViewById(0x7f0e0241);
        g = (TextView)findViewById(0x7f0e0243);
        b = (TextView)findViewById(0x7f0e013e);
        h = (TextView)findViewById(0x7f0e0245);
        i = findViewById(0x7f0e0244);
        j = (ScrollView)findViewById(0x7f0e0242);
        com.tinder.utils.a.a(b, 0.95F, 275L, 275L);
        com.tinder.utils.a.a(h, 0.95F, 275L, 275L);
        a(0x7f060074, new android.view.View.OnClickListener() {

            final f a;

            public final void onClick(View view)
            {
                a.dismiss();
            }

            
            {
                a = f.this;
                super();
            }
        });
        b(0x7f060074, new android.view.View.OnClickListener() {

            final f a;

            public final void onClick(View view)
            {
                a.dismiss();
            }

            
            {
                a = f.this;
                super();
            }
        });
        setCanceledOnTouchOutside(true);
    }

    private void b()
    {
        e.setVisibility(8);
    }

    public final void a(int k, android.view.View.OnClickListener onclicklistener)
    {
        b.setText(k);
        b.setOnClickListener(onclicklistener);
    }

    public final void a(boolean flag)
    {
        if (flag)
        {
            j.getLayoutParams().height = (int)a.getResources().getDimension(0x7f090024);
            return;
        } else
        {
            j.getLayoutParams().height = -2;
            return;
        }
    }

    public final void b(int k, android.view.View.OnClickListener onclicklistener)
    {
        h.setText(k);
        h.setOnClickListener(onclicklistener);
    }

    public final void c(int k, android.view.View.OnClickListener onclicklistener)
    {
        i.setVisibility(8);
        TextView textview = (TextView)findViewById(0x7f0e0246);
        textview.setOnClickListener(onclicklistener);
        textview.setText(k);
        com.tinder.utils.a.a(textview, 0.95F, 275L, 275L);
        textview.setVisibility(0);
    }

    public void setTitle(int k)
    {
        f.setText(k);
    }
}
