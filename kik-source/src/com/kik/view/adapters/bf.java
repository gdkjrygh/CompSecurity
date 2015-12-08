// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kik.view.adapters;

import android.content.Context;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.kik.cache.ad;
import com.kik.g.p;
import com.kik.l.ab;
import java.io.File;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import kik.a.d.a.a;
import kik.a.d.a.g;
import kik.a.d.f;
import kik.a.d.s;
import kik.a.e.n;
import kik.a.f.k;
import kik.android.chat.KikApplication;
import kik.android.chat.b.d;
import kik.android.i.b;
import kik.android.i.i;
import kik.android.net.a.e;
import kik.android.util.DeviceUtils;
import kik.android.util.av;
import kik.android.util.cv;
import kik.android.widget.ClampedContentPreviewView;
import kik.android.widget.ProgressWheel;
import kik.android.widget.ProgressWidget;
import kik.android.widget.RobotoTextView;
import kik.android.widget.c;

// Referenced classes of package com.kik.view.adapters:
//            s, ag, af, ak, 
//            br, bs, bt, bu, 
//            bw, bh, bl, bm, 
//            bg, bn, bi, bo, 
//            bp, bj, bk

public abstract class bf extends com.kik.view.adapters.s
    implements ag
{
    protected static final class a extends Enum
    {

        public static final a a;
        public static final a b;
        public static final a c;
        private static final a d[];

        public static a valueOf(String s1)
        {
            return (a)Enum.valueOf(com/kik/view/adapters/bf$a, s1);
        }

        public static a[] values()
        {
            return (a[])d.clone();
        }

        static 
        {
            a = new a("PREVIEW", 0);
            b = new a("DOWNLOADING", 1);
            c = new a("PLAYING", 2);
            d = (new a[] {
                a, b, c
            });
        }

        private a(String s1, int j)
        {
            super(s1, j);
        }
    }

    protected static class b extends s.a
    {

        boolean A;
        View f;
        ImageView g;
        ImageView t;
        ImageView u;
        RobotoTextView v;
        ProgressWheel w;
        ak x;
        ViewGroup y;
        boolean z;

        protected b()
        {
            z = false;
        }
    }


    private static final int t = KikApplication.a(4);
    private static final int u = KikApplication.a(10);
    protected b a;
    protected s r;
    protected Handler s;
    private af v;
    private kik.android.i.b w;
    private HashMap x;
    private HashMap y;
    private boolean z;

    public bf(LayoutInflater layoutinflater, Context context, android.view.View.OnClickListener onclicklistener, android.view.View.OnClickListener onclicklistener1, ar.a a1, ad ad, com.kik.android.a a2, 
            n n, k k, d d1, com.kik.e.a a3, kik.android.i.b b1, af af1)
    {
        super(layoutinflater, context, onclicklistener, onclicklistener1, a1, ad, a2, n, k, d1, a3);
        a = null;
        r = null;
        s = new Handler();
        x = new HashMap();
        y = new HashMap();
        w = b1;
        v = af1;
    }

    static void a(bf bf1, s s1, kik.a.d.a.a a1, b b1)
    {
        bf1.v.a();
        b1.x.a(true);
        long l = System.currentTimeMillis();
        TextureView textureview = new TextureView(b1.y.getContext());
        b1.y.addView(textureview);
        bf1.a(b1, s1, ((View) (textureview)));
        textureview.setOnClickListener(new br(bf1, b1, s1));
        textureview.setOnCreateContextMenuListener(new bs(bf1));
        android.widget.FrameLayout.LayoutParams layoutparams = (android.widget.FrameLayout.LayoutParams)textureview.getLayoutParams();
        layoutparams.width = b1.d.getWidth() - p;
        layoutparams.height = b1.d.getHeight();
        boolean flag;
        if (s1.d())
        {
            layoutparams.rightMargin = p;
        } else
        {
            layoutparams.leftMargin = p;
        }
        textureview.setLayoutParams(layoutparams);
        cv.b(new View[] {
            b1.y, textureview
        });
        flag = bf1.h.c(a1.o());
        if (!flag)
        {
            bf1.b(b1, s1);
        }
        b1.x.b(a1.z());
        b1.x.a(b1.z, textureview, new bt(bf1, b1, s1, a1, l, flag, textureview), new bu(bf1, b1, s1), new bw(bf1, b1, s1, textureview), new bh(bf1, b1));
    }

    static void a(bf bf1, kik.android.net.a.b b1, f f1, ImageView imageview, ProgressWidget progresswidget, String s1)
    {
        bf1.a(b1, f1, imageview, progresswidget, s1);
    }

    private void a(kik.a.d.a.a a1, kik.android.net.a.b b1, f f1, ImageView imageview, ProgressWidget progresswidget, String s1)
    {
        if (a1 != null && a1.l() && a1.k() != null)
        {
            p p1 = i.a().a(a1.k().toString());
            a1 = a1.k();
            if (p1 != null)
            {
                p1.a(new bl(this, b1, f1, imageview, progresswidget, s1));
            } else
            if (a1 == null || !a1.exists() || !a1.canRead())
            {
                a(b1, f1, imageview, progresswidget, s1);
                return;
            }
        }
    }

    private void a(kik.android.net.a.b b1, f f1, ImageView imageview, ProgressWidget progresswidget, String s1)
    {
        if (b1 != null)
        {
            s.post(new bm(this, b1, imageview, progresswidget, f1, s1));
        }
    }

    private void b(b b1, s s1)
    {
        cv.e(new View[] {
            b1.g, b1.t, b1.u, b1.v
        });
        kik.a.d.a.a a1 = (kik.a.d.a.a)g.a(s1, kik/a/d/a/a);
        if (a1 != null && !h.c(a1.o()))
        {
            b1 = ((b)b1).w;
            if (b1 != null)
            {
                b1.setVisibility(0);
                b1.setBackgroundResource(0x7f020068);
                b1.a(0.1F);
            }
        }
        x.put(s1, com.kik.view.adapters.a.b);
    }

    private void d()
    {
        if (a != null)
        {
            a.x.c();
            a(a, r, true);
        }
    }

    protected View a(ViewGroup viewgroup)
    {
        return a(viewgroup, new b());
    }

    protected final View a(ViewGroup viewgroup, b b1)
    {
        viewgroup = super.a(viewgroup, b1);
        b1.f = viewgroup.findViewById(0x7f0e015f);
        b1.g = (ImageView)viewgroup.findViewById(0x7f0e008c);
        b1.t = (ImageView)viewgroup.findViewById(0x7f0e0160);
        b1.y = (ViewGroup)viewgroup.findViewById(0x7f0e015c);
        b1.u = (ImageView)viewgroup.findViewById(0x7f0e015d);
        b1.v = (RobotoTextView)viewgroup.findViewById(0x7f0e00e1);
        b1.w = (ProgressWheel)viewgroup.findViewById(0x7f0e0161);
        b1.w.c();
        viewgroup.setTag(b1);
        return viewgroup;
    }

    public final void a(int j)
    {
        w.b(j);
    }

    public final void a(ar.b b1, s s1, boolean flag, Context context, au.b b2)
    {
        super.a(b1, s1, flag, context, b2);
        b1 = (s.a)b1;
        ((s.a) (b1)).d.setOnClickListener(new bg(this, b2, b1));
        ((s.a) (b1)).d.setOnCreateContextMenuListener(new bn(this));
    }

    protected abstract void a(b b1);

    protected final void a(b b1, ak ak1)
    {
        if (ak1.a())
        {
            DeviceUtils.e();
            ak1.b();
            av.c(b1.u);
            a(b1);
        }
    }

    final void a(b b1, s s1)
    {
        if (!b1.z)
        {
            a(b1);
        }
        cv.e(new View[] {
            b1.g, ((b)b1).w, b1.t, b1.v
        });
        cv.b(new View[] {
            b1.y
        });
        x.put(s1, com.kik.view.adapters.a.c);
    }

    final void a(b b1, s s1, View view)
    {
        if (a != b1)
        {
            d();
        } else
        {
            for (int j = 0; j < b1.y.getChildCount(); j++)
            {
                View view1 = b1.y.getChildAt(j);
                if (view1 != view)
                {
                    b1.y.removeView(view1);
                }
            }

            x.put(r, com.kik.view.adapters.a.a);
        }
        a = b1;
        r = s1;
    }

    final void a(b b1, s s1, boolean flag)
    {
        x.put(s1, com.kik.view.adapters.a.a);
        cv.b(new View[] {
            b1.d, b1.g, b1.i
        });
        if (b1.r.findViewById(0x7f0e01c8) != null)
        {
            ((ProgressWidget)b1.r.findViewById(0x7f0e01c8)).a(null);
        }
        cv.e(new View[] {
            b1.y, ((b)b1).w, b1.t, b1.u
        });
        if (flag)
        {
            a = null;
            r = null;
            b1.y.removeAllViews();
        }
    }

    protected void a(s s1, ar.b b1)
    {
        kik.a.d.a.a a2;
        z = false;
        super.a(s1, b1);
        a2 = (kik.a.d.a.a)g.a(s1, kik/a/d/a/a);
        if (a2 != null) goto _L2; else goto _L1
_L1:
        return;
_L2:
        a a1;
        a1 = (a)x.get(s1);
        if (a1 == null)
        {
            a1 = com.kik.view.adapters.a.a;
        }
        b1 = (b)b1;
        cv.e(new View[] {
            ((b) (b1)).v
        });
        if (z) goto _L4; else goto _L3
_L3:
        static final class _cls1
        {

            static final int a[];

            static 
            {
                a = new int[a.values().length];
                try
                {
                    a[com.kik.view.adapters.a.c.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror2) { }
                try
                {
                    a[com.kik.view.adapters.a.b.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    a[com.kik.view.adapters.a.a.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        com.kik.view.adapters._cls1.a[a1.ordinal()];
        JVM INSTR tableswitch 1 2: default 104
    //                   1 408
    //                   2 434;
           goto _L5 _L6 _L7
_L5:
        a(((b) (b1)), s1, false);
_L4:
        boolean flag = a(s1);
        kik.a.d.a.a a3;
        if (flag)
        {
            ((b) (b1)).f.setVisibility(8);
        } else
        {
            ((b) (b1)).f.setVisibility(0);
        }
        a3 = (kik.a.d.a.a)g.a(s1, kik/a/d/a/a);
        if (a3 != null)
        {
            f f1 = i.a(s1.i());
            ProgressWidget progresswidget = (ProgressWidget)((b) (b1)).r.findViewById(0x7f0e01c8);
            Object obj = e.a().a(a3.o());
            if (obj != null)
            {
                obj = (kik.android.net.a.b)((WeakReference) (obj)).get();
                if (progresswidget != null)
                {
                    progresswidget.a(((b) (b1)).t);
                    ((b) (b1)).t.setOnClickListener(new bi(this, ((kik.android.net.a.b) (obj)), b1, progresswidget, f1, s1));
                }
                if (!((b) (b1)).A)
                {
                    a(a3, ((kik.android.net.a.b) (obj)), f1, ((b) (b1)).s, progresswidget, s1.b());
                    b1.A = true;
                }
            }
        }
        v.a(this);
        b1.x = (ak)y.get(s1);
        if (((b) (b1)).x == null)
        {
            b1.x = new ak(a2, s1.o(), h, e);
            y.put(s1, ((b) (b1)).x);
        }
        ((b) (b1)).g.setOnClickListener(new bo(this, b1, s1, a2));
        if (a2.y() && !flag && a1 == com.kik.view.adapters.a.a)
        {
            w.a(((b) (b1)).n, new bp(this, b1, a2, s1));
            return;
        }
        if (true) goto _L1; else goto _L6
_L6:
        if (((b) (b1)).y.getChildCount() > 0)
        {
            a(((b) (b1)), s1);
        } else
        {
            d();
        }
          goto _L4
_L7:
        b(b1, s1);
          goto _L4
    }

    protected final void a(s s1, n.a a1)
    {
        super.a(s1, a1);
        a1 = (b)a1;
        android.widget.RelativeLayout.LayoutParams layoutparams = (android.widget.RelativeLayout.LayoutParams)((b) (a1)).f.getLayoutParams();
        ((b) (a1)).d.a(kik.android.widget.c.a.c);
        if (s1.d())
        {
            layoutparams.rightMargin = kik.android.widget.c.a();
            ((b) (a1)).d.a(q, p);
            ((b) (a1)).v.setPadding(0, 0, p, 0);
        } else
        {
            layoutparams.leftMargin = kik.android.widget.c.a();
            ((b) (a1)).d.a(p, q);
            ((b) (a1)).u.setPadding(u + 5, ((b) (a1)).u.getPaddingTop(), ((b) (a1)).u.getPaddingRight(), ((b) (a1)).u.getPaddingBottom());
        }
        ((b) (a1)).f.setLayoutParams(layoutparams);
    }

    protected final void a(kik.android.net.a.b b1, ProgressWidget progresswidget, n.a a1, s s1)
    {
        super.a(b1, progresswidget, a1, s1);
        f f1 = i.a(s1.i());
        kik.a.d.a.a a2 = (kik.a.d.a.a)g.a(s1, kik/a/d/a/a);
        if (a2 != null)
        {
            a(a2, b1, f1, a1.s, progresswidget, s1.b());
            g(a2);
            e.a().a(b1);
            progresswidget.b(new bj(this, b1, a1, progresswidget, f1, s1));
            progresswidget.a();
            if (s1.c() == -100)
            {
                a1.s.setImageResource(0x7f02022e);
                f1.a(s1.b(), 101, g);
            }
            if (s1.c() == 101)
            {
                b1.l().a(new bk(this, s1));
                return;
            }
        }
    }

    protected boolean a(ar.b b1)
    {
        return b1 instanceof b;
    }

    public final void b(int j)
    {
        w.a(j);
    }

    protected final void b(n.a a1)
    {
        super.b(a1);
        a1 = (b)a1;
        cv.e(new View[] {
            ((b) (a1)).g, ((b)a1).w
        });
        z = true;
    }

    public final void c()
    {
        w.a();
    }

    public final void c(int j)
    {
        if (a != null && a.n == j)
        {
            d();
            a = null;
        }
        w.c(j);
    }

    protected final ProgressWheel d(n.a a1)
    {
        return ((b)a1).w;
    }

    protected final void d(kik.a.d.a.a a1)
    {
        super.d(a1);
        g(a1);
    }

    public final void g_()
    {
        d();
    }

}
