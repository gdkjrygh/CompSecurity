// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.chatheads.b;

import android.content.Context;
import android.content.res.Resources;
import android.os.Handler;
import android.util.DisplayMetrics;
import android.view.View;
import android.widget.TextView;
import com.facebook.h;
import com.facebook.i;
import com.facebook.inject.t;
import com.facebook.k;
import com.facebook.n.c;
import com.facebook.n.g;
import com.facebook.n.j;
import com.facebook.widget.d;
import com.google.common.d.a.ab;
import com.google.common.d.a.s;

// Referenced classes of package com.facebook.orca.chatheads.b:
//            e, c, d, b

public class a extends d
{

    private static final g a = com.facebook.n.g.a(150D, 12D);
    private static final int b;
    private static final int c;
    private static final int d;
    private static final int e;
    private final TextView f;
    private final View g;
    private final Handler h = (Handler)getInjector().a(android/os/Handler);
    private final j i = (j)getInjector().a(com/facebook/n/j);
    private e j;
    private boolean k;
    private c l;
    private ab m;
    private com.facebook.orca.chatheads.b.d n;

    public a(Context context, int i1)
    {
        super(context);
        k = true;
        setContentView(k.chat_head_nux_bubble);
        g = c(i.chat_head_text_bubble_container);
        f = (TextView)c(i.chat_head_text_bubble_text);
        setOrigin(e.LEFT);
        f.setText(getContext().getString(i1));
        com.a.c.a.e(g, 0.0F);
        com.a.c.a.f(g, 0.0F);
        com.a.c.a.a(g, 0.0F);
        l = i.b().a(a).d(0.004999999888241291D).e(0.004999999888241291D).a(new com.facebook.orca.chatheads.b.c(this, null)).a(true);
    }

    static View a(a a1)
    {
        return a1.g;
    }

    static ab a(a a1, ab ab1)
    {
        a1.m = ab1;
        return ab1;
    }

    private s a(float f1)
    {
        if (l.c() == (double)f1)
        {
            return com.google.common.d.a.i.a(null);
        } else
        {
            m = ab.a();
            l.b(f1);
            return m;
        }
    }

    static void a(View view, boolean flag)
    {
        b(view, flag);
    }

    static ab b(a a1)
    {
        return a1.m;
    }

    private static void b(View view, boolean flag)
    {
        if (Integer.valueOf(android.os.Build.VERSION.SDK).intValue() < 11)
        {
            view.setDrawingCacheEnabled(flag);
        }
    }

    private s getAtRestFuture()
    {
        if (m != null)
        {
            return m;
        } else
        {
            return com.google.common.d.a.i.a(null);
        }
    }

    public s a()
    {
        return a(1.0F);
    }

    public void a(boolean flag)
    {
        k = flag;
    }

    public s b()
    {
        return a(0.0F);
    }

    public e getOrigin()
    {
        return j;
    }

    protected void onSizeChanged(int i1, int j1, int k1, int l1)
    {
        super.onSizeChanged(i1, j1, k1, l1);
        if (j != e.RIGHT) goto _L2; else goto _L1
_L1:
        com.a.c.a.b(g, i1);
        com.a.c.a.c(g, j1 / 2);
_L4:
        if (n != null)
        {
            n.a(i1, j1, k1, l1);
        }
        return;
_L2:
        if (j == e.LEFT)
        {
            com.a.c.a.b(g, 0.0F);
            com.a.c.a.c(g, j1 / 2);
        } else
        if (j == e.BOTTOM)
        {
            com.a.c.a.b(g, i1 / 2);
            com.a.c.a.c(g, j1);
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public void setContentGravitiy(int i1)
    {
        f.setGravity(i1);
    }

    public void setOnSizeChangedListener(com.facebook.orca.chatheads.b.d d1)
    {
        n = d1;
    }

    public void setOrigin(e e1)
    {
        int i1;
        int j1;
        int k1;
        j1 = 1;
        k1 = 0;
        i1 = k1;
        if (j == e1) goto _L2; else goto _L1
_L1:
        j = e1;
        if (!k)
        {
            break MISSING_BLOCK_LABEL_176;
        }
        b.a[j.ordinal()];
        JVM INSTR tableswitch 1 3: default 64
    //                   1 133
    //                   2 148
    //                   3 163;
           goto _L3 _L4 _L5 _L6
_L3:
        i1 = 0;
_L2:
        e1 = getResources();
        k1 = (int)((float)e1.getDisplayMetrics().widthPixels * 0.85F);
        j1 = k1;
        if (i1 != 0)
        {
            j1 = (k1 - e1.getDimensionPixelSize(com.facebook.g.chat_head_width)) + e1.getDimensionPixelOffset(com.facebook.g.chat_head_dock_overshoot_x);
        }
        i1 = Math.min(j1, e1.getDimensionPixelSize(com.facebook.g.chat_head_nux_bubble_max_width));
        f.setMaxWidth(i1);
        return;
_L4:
        g.setBackgroundResource(b);
        i1 = j1;
          goto _L2
_L5:
        g.setBackgroundResource(c);
        i1 = j1;
          goto _L2
_L6:
        g.setBackgroundResource(d);
          goto _L3
        g.setBackgroundResource(e);
        i1 = k1;
          goto _L2
    }

    static 
    {
        b = h.orca_chat_head_nux_bubble_left;
        c = h.orca_chat_head_nux_bubble_right;
        d = h.orca_chat_head_nux_bubble_bottom;
        e = h.orca_chat_head_nux_bubble;
    }
}
