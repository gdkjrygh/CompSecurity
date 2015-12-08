// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.cloudlib.sns;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.support.v4.view.ViewCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.TextView;
import com.roidapp.baselib.c.u;
import com.roidapp.baselib.e.l;
import com.roidapp.cloudlib.ap;
import com.roidapp.cloudlib.ar;
import com.roidapp.cloudlib.as;
import com.roidapp.cloudlib.at;
import com.roidapp.cloudlib.common.d;
import com.roidapp.cloudlib.sns.a.a;
import com.roidapp.cloudlib.sns.a.c;

// Referenced classes of package com.roidapp.cloudlib.sns:
//            j, k

public final class i
    implements android.view.View.OnClickListener, c
{

    private boolean a;
    private Context b;
    private WindowManager c;
    private View d;
    private View e;
    private android.view.WindowManager.LayoutParams f;
    private final Runnable g = new j(this);

    public i(Context context, View view)
    {
        if (context == null || ((Activity)context).isFinishing())
        {
            return;
        } else
        {
            b = context;
            c = (WindowManager)context.getSystemService("window");
            d = ((LayoutInflater)b.getSystemService("layout_inflater")).inflate(as.U, null);
            d.setOnTouchListener(new k(this, view));
            e = d.findViewById(ar.L);
            int i1 = com.roidapp.cloudlib.common.d.a(context.getResources(), 35F);
            int j1 = context.getResources().getDimensionPixelOffset(ap.e);
            f = new android.view.WindowManager.LayoutParams();
            f.width = -1;
            f.height = i1 + j1;
            f.format = -3;
            f.gravity = 48;
            f.flags = 0x40008;
            return;
        }
    }

    public final void a()
    {
        ((ImageView)u.a(d, ar.bT)).setVisibility(8);
    }

    public final void a(int i1)
    {
        if (e == null)
        {
            return;
        } else
        {
            ViewCompat.setTranslationY(e, i1);
            return;
        }
    }

    public final void a(String s)
    {
        a(s, 0);
    }

    public final void a(String s, int i1)
    {
        if (d == null)
        {
            return;
        }
        if (e != null)
        {
            ViewCompat.setTranslationY(e, i1);
        }
        d.removeCallbacks(g);
        TextView textview;
        try
        {
            if (!a && c != null)
            {
                a = true;
                com.roidapp.cloudlib.sns.a.a.a(this);
                c.addView(d, f);
            }
        }
        catch (android.view.WindowManager.BadTokenException badtokenexception) { }
        textview = (TextView)u.a(d, ar.cN);
        textview.setText(s);
        s = (ImageView)u.a(d, ar.bT);
        if (!l.b(b))
        {
            s.setVisibility(0);
            s.setOnClickListener(this);
            textview.setText(b.getString(at.e));
        }
        d.postDelayed(g, 3000L);
    }

    public final void b()
    {
        if (a)
        {
            a = false;
            try
            {
                if (c != null && d != null)
                {
                    c.removeViewImmediate(d);
                }
            }
            catch (android.view.WindowManager.BadTokenException badtokenexception) { }
            com.roidapp.cloudlib.sns.a.a.b(this);
        }
    }

    public final void c()
    {
        b();
        d = null;
        e = null;
        c = null;
    }

    public final void onClick(View view)
    {
        if (view.getId() == ar.bT)
        {
            l.a(b, null);
        }
    }
}
