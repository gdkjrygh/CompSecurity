// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tremorvideo.sdk.android.videoad;

import android.app.Dialog;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.graphics.Bitmap;
import android.graphics.Typeface;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import android.widget.LinearLayout;
import android.widget.TextView;

// Referenced classes of package com.tremorvideo.sdk.android.videoad:
//            cp, dh, gd, ct, 
//            cy, cq, cr

public class co extends Dialog
{
    public static final class a extends Enum
    {

        public static final a a;
        public static final a b;
        private static final a c[];

        public static a valueOf(String s)
        {
            return (a)Enum.valueOf(com/tremorvideo/sdk/android/videoad/co$a, s);
        }

        public static a[] values()
        {
            return (a[])c.clone();
        }

        static 
        {
            a = new a("Confirm", 0);
            b = new a("ConfirmCancel", 1);
            c = (new a[] {
                a, b
            });
        }

        private a(String s, int j)
        {
            super(s, j);
        }
    }

    public static interface b
    {

        public abstract void a(boolean flag);
    }


    BroadcastReceiver a;
    private Bitmap b[];
    private Bitmap c[];
    private gd d;
    private TextView e;
    private TextView f;
    private cy g;
    private cy h;
    private b i;

    public co(Context context, gd gd1, a a1, b b1)
    {
        super(context);
        b = null;
        c = null;
        a = new cp(this);
        getContext().registerReceiver(a, new IntentFilter("android.intent.action.SCREEN_OFF"));
        d = gd1;
        i = b1;
        a(gd1);
        requestWindowFeature(1);
        context = new dh(b, d.a(gd.a.f));
        getWindow().setBackgroundDrawable(context);
        setContentView(a(a1), new android.widget.LinearLayout.LayoutParams(-2, -2));
    }

    private View a(View view, View view1, Context context)
    {
        context = new LinearLayout(context);
        context.setGravity(5);
        if (view1 != null)
        {
            android.widget.LinearLayout.LayoutParams layoutparams = new android.widget.LinearLayout.LayoutParams(-2, -2);
            layoutparams.setMargins(10, 10, 10, 10);
            context.addView(view1, layoutparams);
        }
        if (view != null)
        {
            view1 = new android.widget.LinearLayout.LayoutParams(-2, -2);
            view1.setMargins(0, 10, 10, 10);
            context.addView(view, view1);
        }
        return context;
    }

    private View a(a a1)
    {
        LinearLayout linearlayout = new LinearLayout(getContext());
        linearlayout.setOrientation(1);
        e = new TextView(getContext());
        e.setText("");
        e.setPadding(10, 5, 10, 5);
        e.setTextColor(d.a(gd.a.i));
        e.setTextSize(ct.F());
        e.setMinimumWidth(300);
        g = new cy(getContext(), "", d, gd.b.N, gd.b.O);
        g.setId(45);
        g.setFocusable(true);
        g.setOnClickListener(new cq(this));
        if (a1 == a.b)
        {
            h = new cy(getContext(), "", d, gd.b.N, gd.b.O);
            h.setId(46);
            h.setFocusable(true);
            h.setOnClickListener(new cr(this));
        }
        f = a("", getContext());
        linearlayout.addView(f);
        linearlayout.addView(e);
        linearlayout.addView(a(((View) (g)), ((View) (h)), getContext()));
        return linearlayout;
    }

    private TextView a(String s, Context context)
    {
        context = new TextView(context);
        context.setText(s);
        context.setTextSize(ct.E());
        context.setTextColor(d.a(gd.a.g));
        context.setTypeface(Typeface.create("helvetica", 1));
        context.setShadowLayer(5F, 0.0F, 0.0F, d.a(gd.a.h));
        context.setPadding(10, 5, 10, 0);
        return context;
    }

    private void a()
    {
        if (g != null)
        {
            g.a(false);
        }
        if (h != null)
        {
            h.a(false);
        }
    }

    static void a(co co1)
    {
        co1.a();
    }

    private void a(gd gd1)
    {
        b = new Bitmap[dh.a.values().length];
        b[dh.a.a.ordinal()] = gd1.a(gd.b.y);
        b[dh.a.b.ordinal()] = gd1.a(gd.b.z);
        b[dh.a.c.ordinal()] = gd1.a(gd.b.A);
        b[dh.a.d.ordinal()] = gd1.a(gd.b.B);
        b[dh.a.e.ordinal()] = gd1.a(gd.b.C);
        b[dh.a.f.ordinal()] = gd1.a(gd.b.D);
        b[dh.a.g.ordinal()] = gd1.a(gd.b.E);
        b[dh.a.h.ordinal()] = gd1.a(gd.b.F);
        c = new Bitmap[3];
        c[0] = gd1.a(gd.b.K);
        c[1] = gd1.a(gd.b.L);
        c[2] = gd1.a(gd.b.M);
    }

    static b b(co co1)
    {
        return co1.i;
    }

    public void a(String s)
    {
        e.setText(s);
    }

    public void a(String s, String s1)
    {
        if (g != null)
        {
            g.a(s);
        }
        if (h != null)
        {
            h.a(s1);
        }
    }

    public boolean onKeyDown(int j, KeyEvent keyevent)
    {
        if (j == 84)
        {
            return true;
        }
        if (j == 4)
        {
            dismiss();
            keyevent = i;
            boolean flag;
            if (h != null)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            keyevent.a(flag);
            return true;
        } else
        {
            return super.onKeyDown(j, keyevent);
        }
    }

    protected void onStop()
    {
        super.onStop();
        getContext().unregisterReceiver(a);
    }

    public void setTitle(CharSequence charsequence)
    {
        f.setText(charsequence);
    }
}
