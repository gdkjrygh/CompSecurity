// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.share.a;

import android.content.BroadcastReceiver;
import android.content.IntentFilter;
import android.support.v4.content.k;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.facebook.internal.aw;
import com.facebook.share.internal.u;
import com.facebook.share.internal.w;
import com.facebook.share.internal.x;

// Referenced classes of package com.facebook.share.a:
//            d, i, c, b, 
//            f, e, g, h

public final class a extends FrameLayout
{

    private String a;
    private g b;
    private LinearLayout c;
    private x d;
    private u e;
    private TextView f;
    private com.facebook.share.internal.a g;
    private h h;
    private BroadcastReceiver i;
    private e j;
    private i k;
    private d l;
    private c m;
    private int n;
    private int o;
    private boolean p;
    private boolean q;

    static String a(a a1)
    {
        return a1.a;
    }

    private void a()
    {
        Object obj;
        boolean flag = false;
        Object obj1;
        int j1;
        boolean flag1;
        if (!q && !p)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        super.setEnabled(flag1);
        d.setEnabled(flag1);
        if (g == null)
        {
            d.setSelected(false);
            f.setText(null);
            e.a(null);
        } else
        {
            d.setSelected(g.c());
            f.setText(g.b());
            e.a(g.a());
        }
        obj = (android.widget.FrameLayout.LayoutParams)c.getLayoutParams();
        obj1 = (android.widget.LinearLayout.LayoutParams)d.getLayoutParams();
        if (l == d.b)
        {
            j1 = 3;
        } else
        if (l == d.a)
        {
            j1 = 1;
        } else
        {
            j1 = 5;
        }
        obj.gravity = j1 | 0x30;
        obj1.gravity = j1;
        f.setVisibility(8);
        e.setVisibility(8);
        if (k != i.a || g == null || aw.a(g.b())) goto _L2; else goto _L1
_L1:
        obj = f;
_L12:
        ((View) (obj)).setVisibility(0);
        ((android.widget.LinearLayout.LayoutParams)((View) (obj)).getLayoutParams()).gravity = j1;
        obj1 = c;
        int i1;
        if (m == c.b)
        {
            i1 = ((flag) ? 1 : 0);
        } else
        {
            i1 = 1;
        }
        ((LinearLayout) (obj1)).setOrientation(i1);
        if (m == c.c || m == c.b && l == d.c)
        {
            c.removeView(d);
            c.addView(d);
        } else
        {
            c.removeView(((View) (obj)));
            c.addView(((View) (obj)));
        }
        b.a[m.ordinal()];
        JVM INSTR tableswitch 1 3: default 300
    //                   1 530
    //                   2 551
    //                   3 572;
           goto _L3 _L4 _L5 _L6
_L3:
        return;
_L2:
        if (k != i.c || g == null || aw.a(g.a())) goto _L3; else goto _L7
_L7:
        b.a[m.ordinal()];
        JVM INSTR tableswitch 1 3: default 440
    //                   1 448
    //                   2 465
    //                   3 477;
           goto _L8 _L9 _L10 _L11
_L8:
        obj = e;
          goto _L12
_L9:
        obj = e;
        i1 = w.d;
_L13:
        ((u) (obj)).a(i1);
          goto _L8
_L10:
        obj = e;
        i1 = w.b;
          goto _L13
_L11:
        obj = e;
        if (l == d.c)
        {
            i1 = w.c;
        } else
        {
            i1 = w.a;
        }
          goto _L13
_L4:
        ((View) (obj)).setPadding(n, n, n, o);
        return;
_L5:
        ((View) (obj)).setPadding(n, o, n, n);
        return;
_L6:
        if (l == d.c)
        {
            ((View) (obj)).setPadding(n, n, o, n);
            return;
        } else
        {
            ((View) (obj)).setPadding(o, n, n, n);
            return;
        }
    }

    static void a(a a1, com.facebook.share.internal.a a2)
    {
        a1.g = a2;
        a1.q = a2.d();
        a1.i = new f(a1, (byte)0);
        a2 = android.support.v4.content.k.a(a1.getContext());
        IntentFilter intentfilter = new IntentFilter();
        intentfilter.addAction("com.facebook.sdk.LikeActionController.UPDATED");
        intentfilter.addAction("com.facebook.sdk.LikeActionController.DID_ERROR");
        intentfilter.addAction("com.facebook.sdk.LikeActionController.DID_RESET");
        a2.a(a1.i, intentfilter);
    }

    static void a(a a1, String s, g g1)
    {
        a1.a(s, g1);
    }

    private void a(String s, g g1)
    {
        if (i != null)
        {
            android.support.v4.content.k.a(getContext()).a(i);
            i = null;
        }
        if (j != null)
        {
            j.a();
            j = null;
        }
        g = null;
        a = s;
        b = g1;
        if (aw.a(s))
        {
            return;
        } else
        {
            j = new e(this, (byte)0);
            com.facebook.share.internal.a.a(s, g1, j);
            return;
        }
    }

    static void b(a a1)
    {
        a1.a();
    }

    static h c(a a1)
    {
        return a1.h;
    }

    static g d(a a1)
    {
        return a1.b;
    }

    static e e(a a1)
    {
        a1.j = null;
        return null;
    }

    protected final void onDetachedFromWindow()
    {
        g g1 = g.a;
        String s = aw.a(null, null);
        if (g1 == null)
        {
            g1 = g.d;
        }
        if (!aw.a(s, a) || g1 != b)
        {
            a(s, g1);
            a();
        }
        super.onDetachedFromWindow();
    }

    public final void setEnabled(boolean flag)
    {
        if (!flag)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        p = flag;
        a();
    }
}
