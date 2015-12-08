// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.share.widget;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.content.LocalBroadcastManager;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.facebook.a.a;
import com.facebook.internal.N;
import com.facebook.internal.U;
import com.facebook.p;
import com.facebook.share.internal.LikeContent;
import com.facebook.share.internal.c;
import com.facebook.share.internal.r;
import com.facebook.share.internal.s;
import com.facebook.share.internal.t;

// Referenced classes of package com.facebook.share.widget:
//            c

public class LikeView extends FrameLayout
{
    public static final class a extends Enum
    {

        public static final a a;
        public static final a b;
        public static final a c;
        static a d;
        private static final a g[];
        private String e;
        private int f;

        static int a(a a1)
        {
            return a1.f;
        }

        static a a(int i1)
        {
            a aa[] = values();
            int k1 = aa.length;
            for (int j1 = 0; j1 < k1; j1++)
            {
                a a1 = aa[j1];
                if (a1.f == i1)
                {
                    return a1;
                }
            }

            return null;
        }

        public static a valueOf(String s1)
        {
            return (a)Enum.valueOf(com/facebook/share/widget/LikeView$a, s1);
        }

        public static a[] values()
        {
            return (a[])g.clone();
        }

        public final String toString()
        {
            return e;
        }

        static 
        {
            a = new a("BOTTOM", 0, "bottom", 0);
            b = new a("INLINE", 1, "inline", 1);
            c = new a("TOP", 2, "top", 2);
            g = (new a[] {
                a, b, c
            });
            d = a;
        }

        private a(String s1, int i1, String s2, int j1)
        {
            super(s1, i1);
            e = s2;
            f = j1;
        }
    }

    public static final class b extends Enum
    {

        public static final b a;
        public static final b b;
        public static final b c;
        static b d;
        private static final b g[];
        private String e;
        private int f;

        static int a(b b1)
        {
            return b1.f;
        }

        static b a(int i1)
        {
            b ab[] = values();
            int k1 = ab.length;
            for (int j1 = 0; j1 < k1; j1++)
            {
                b b1 = ab[j1];
                if (b1.f == i1)
                {
                    return b1;
                }
            }

            return null;
        }

        public static b valueOf(String s1)
        {
            return (b)Enum.valueOf(com/facebook/share/widget/LikeView$b, s1);
        }

        public static b[] values()
        {
            return (b[])g.clone();
        }

        public final String toString()
        {
            return e;
        }

        static 
        {
            a = new b("CENTER", 0, "center", 0);
            b = new b("LEFT", 1, "left", 1);
            c = new b("RIGHT", 2, "right", 2);
            g = (new b[] {
                a, b, c
            });
            d = a;
        }

        private b(String s1, int i1, String s2, int j1)
        {
            super(s1, i1);
            e = s2;
            f = j1;
        }
    }

    private final class c
        implements com.facebook.share.internal.c.c
    {

        boolean a;
        final LikeView b;

        public final void a(com.facebook.share.internal.c c1, p p1)
        {
            if (a)
            {
                return;
            }
            p p2 = p1;
            if (c1 != null)
            {
                if (!c1.c())
                {
                    p1 = new p("Cannot use LikeView. The device may not be supported.");
                }
                com.facebook.share.widget.LikeView.a(b, c1);
                com.facebook.share.widget.LikeView.c(b);
                p2 = p1;
            }
            if (p2 != null && LikeView.d(b) != null)
            {
                LikeView.d(b);
            }
            LikeView.f(b);
        }

        private c()
        {
            b = LikeView.this;
            super();
        }

        c(byte byte0)
        {
            this();
        }
    }

    private final class d extends BroadcastReceiver
    {

        final LikeView a;

        public final void onReceive(Context context, Intent intent)
        {
            boolean flag1 = true;
            context = intent.getAction();
            intent = intent.getExtras();
            boolean flag = flag1;
            if (intent != null)
            {
                String s1 = intent.getString("com.facebook.sdk.LikeActionController.OBJECT_ID");
                flag = flag1;
                if (!U.a(s1))
                {
                    if (U.a(LikeView.b(a), s1))
                    {
                        flag = flag1;
                    } else
                    {
                        flag = false;
                    }
                }
            }
            if (flag) goto _L2; else goto _L1
_L1:
            return;
_L2:
            if ("com.facebook.sdk.LikeActionController.UPDATED".equals(context))
            {
                com.facebook.share.widget.LikeView.c(a);
                return;
            }
            if (!"com.facebook.sdk.LikeActionController.DID_ERROR".equals(context))
            {
                continue; /* Loop/switch isn't completed */
            }
            if (LikeView.d(a) == null) goto _L1; else goto _L3
_L3:
            LikeView.d(a);
            N.a(intent);
            return;
            if (!"com.facebook.sdk.LikeActionController.DID_RESET".equals(context)) goto _L1; else goto _L4
_L4:
            com.facebook.share.widget.LikeView.a(a, LikeView.b(a), LikeView.e(a));
            com.facebook.share.widget.LikeView.c(a);
            return;
        }

        private d()
        {
            a = LikeView.this;
            super();
        }

        d(byte byte0)
        {
            this();
        }
    }

    public static final class e extends Enum
    {

        public static final e a;
        public static final e b;
        public static final e c;
        public static e d;
        private static final e g[];
        public int e;
        private String f;

        public static e a(int i1)
        {
            e ae[] = values();
            int k1 = ae.length;
            for (int j1 = 0; j1 < k1; j1++)
            {
                e e1 = ae[j1];
                if (e1.e == i1)
                {
                    return e1;
                }
            }

            return null;
        }

        public static e valueOf(String s1)
        {
            return (e)Enum.valueOf(com/facebook/share/widget/LikeView$e, s1);
        }

        public static e[] values()
        {
            return (e[])g.clone();
        }

        public final String toString()
        {
            return f;
        }

        static 
        {
            a = new e("UNKNOWN", 0, "unknown", 0);
            b = new e("OPEN_GRAPH", 1, "open_graph", 1);
            c = new e("PAGE", 2, "page", 2);
            g = (new e[] {
                a, b, c
            });
            d = a;
        }

        private e(String s1, int i1, String s2, int j1)
        {
            super(s1, i1);
            f = s2;
            e = j1;
        }
    }

    public static interface f
    {
    }

    public static final class g extends Enum
    {

        public static final g a;
        public static final g b;
        public static final g c;
        static g d;
        private static final g g[];
        private String e;
        private int f;

        static int a(g g1)
        {
            return g1.f;
        }

        static g a(int i1)
        {
            g ag[] = values();
            int k1 = ag.length;
            for (int j1 = 0; j1 < k1; j1++)
            {
                g g1 = ag[j1];
                if (g1.f == i1)
                {
                    return g1;
                }
            }

            return null;
        }

        public static g valueOf(String s1)
        {
            return (g)Enum.valueOf(com/facebook/share/widget/LikeView$g, s1);
        }

        public static g[] values()
        {
            return (g[])g.clone();
        }

        public final String toString()
        {
            return e;
        }

        static 
        {
            a = new g("STANDARD", 0, "standard", 0);
            b = new g("BUTTON", 1, "button", 1);
            c = new g("BOX_COUNT", 2, "box_count", 2);
            g = (new g[] {
                a, b, c
            });
            d = a;
        }

        private g(String s1, int i1, String s2, int j1)
        {
            super(s1, i1);
            e = s2;
            f = j1;
        }
    }


    private String a;
    private e b;
    private LinearLayout c;
    private s d;
    private r e;
    private TextView f;
    private com.facebook.share.internal.c g;
    private f h;
    private BroadcastReceiver i;
    private c j;
    private g k;
    private b l;
    private a m;
    private int n;
    private int o;
    private int p;
    private Fragment q;
    private boolean r;

    public LikeView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        k = g.d;
        l = b.d;
        m = a.d;
        n = -1;
        boolean flag;
        if (attributeset != null && getContext() != null)
        {
            attributeset = getContext().obtainStyledAttributes(attributeset, com.facebook.O.h.com_facebook_like_view);
            if (attributeset != null)
            {
                a = U.a(attributeset.getString(com.facebook.O.h.com_facebook_like_view_com_facebook_object_id), null);
                b = com.facebook.share.widget.e.a(attributeset.getInt(com.facebook.O.h.com_facebook_like_view_com_facebook_object_type, e.d.e));
                k = com.facebook.share.widget.g.a(attributeset.getInt(com.facebook.O.h.com_facebook_like_view_com_facebook_style, com.facebook.share.widget.g.a(g.d)));
                if (k == null)
                {
                    throw new IllegalArgumentException("Unsupported value for LikeView 'style'");
                }
                m = com.facebook.share.widget.a.a(attributeset.getInt(com.facebook.O.h.com_facebook_like_view_com_facebook_auxiliary_view_position, com.facebook.share.widget.a.a(a.d)));
                if (m == null)
                {
                    throw new IllegalArgumentException("Unsupported value for LikeView 'auxiliary_view_position'");
                }
                l = com.facebook.share.widget.b.a(attributeset.getInt(com.facebook.O.h.com_facebook_like_view_com_facebook_horizontal_alignment, com.facebook.share.widget.b.a(b.d)));
                if (l == null)
                {
                    throw new IllegalArgumentException("Unsupported value for LikeView 'horizontal_alignment'");
                }
                n = attributeset.getColor(com.facebook.O.h.com_facebook_like_view_com_facebook_foreground_color, -1);
                attributeset.recycle();
            }
        }
        o = getResources().getDimensionPixelSize(com.facebook.O.b.com_facebook_likeview_edge_padding);
        p = getResources().getDimensionPixelSize(com.facebook.O.b.com_facebook_likeview_internal_padding);
        if (n == -1)
        {
            n = getResources().getColor(com.facebook.O.a.com_facebook_likeview_text_color);
        }
        setBackgroundColor(0);
        c = new LinearLayout(context);
        attributeset = new android.widget.FrameLayout.LayoutParams(-2, -2);
        c.setLayoutParams(attributeset);
        if (g != null && g.c)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        d = new s(context, flag);
        d.setOnClickListener(new com.facebook.share.widget.c(this));
        attributeset = new android.widget.LinearLayout.LayoutParams(-2, -2);
        d.setLayoutParams(attributeset);
        f = new TextView(context);
        f.setTextSize(0, getResources().getDimension(com.facebook.O.b.com_facebook_likeview_text_size));
        f.setMaxLines(2);
        f.setTextColor(n);
        f.setGravity(17);
        attributeset = new android.widget.LinearLayout.LayoutParams(-2, -1);
        f.setLayoutParams(attributeset);
        e = new r(context);
        context = new android.widget.LinearLayout.LayoutParams(-1, -1);
        e.setLayoutParams(context);
        c.addView(d);
        c.addView(f);
        c.addView(e);
        addView(c);
        a(a, b);
        a();
    }

    private void a()
    {
        Object obj;
        boolean flag = false;
        Object obj1;
        int j1;
        boolean flag1;
        if (!r)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        if (g == null)
        {
            d.setSelected(false);
            f.setText(null);
            e.a(null);
        } else
        {
            d.setSelected(g.c);
            f.setText(g.b());
            e.a(g.a());
            flag1 &= g.c();
        }
        super.setEnabled(flag1);
        d.setEnabled(flag1);
        obj = (android.widget.FrameLayout.LayoutParams)c.getLayoutParams();
        obj1 = (android.widget.LinearLayout.LayoutParams)d.getLayoutParams();
        if (l == b.b)
        {
            j1 = 3;
        } else
        if (l == com.facebook.share.widget.b.a)
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
        if (k != com.facebook.share.widget.g.a || g == null || U.a(g.b())) goto _L2; else goto _L1
_L1:
        obj = f;
_L12:
        ((View) (obj)).setVisibility(0);
        ((android.widget.LinearLayout.LayoutParams)((View) (obj)).getLayoutParams()).gravity = j1;
        obj1 = c;
        static final class _cls1
        {

            static final int a[];

            static 
            {
                a = new int[a.values().length];
                try
                {
                    a[com.facebook.share.widget.a.c.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror2) { }
                try
                {
                    a[com.facebook.share.widget.a.a.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    a[a.b.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        int i1;
        if (m == a.b)
        {
            i1 = ((flag) ? 1 : 0);
        } else
        {
            i1 = 1;
        }
        ((LinearLayout) (obj1)).setOrientation(i1);
        if (m == com.facebook.share.widget.a.c || m == a.b && l == com.facebook.share.widget.b.c)
        {
            c.removeView(d);
            c.addView(d);
        } else
        {
            c.removeView(((View) (obj)));
            c.addView(((View) (obj)));
        }
        com.facebook.share.widget._cls1.a[m.ordinal()];
        JVM INSTR tableswitch 1 3: default 292
    //                   1 534
    //                   2 555
    //                   3 576;
           goto _L3 _L4 _L5 _L6
_L3:
        return;
_L2:
        if (k != com.facebook.share.widget.g.c || g == null || U.a(g.a())) goto _L3; else goto _L7
_L7:
        com.facebook.share.widget._cls1.a[m.ordinal()];
        JVM INSTR tableswitch 1 3: default 444
    //                   1 452
    //                   2 469
    //                   3 481;
           goto _L8 _L9 _L10 _L11
_L8:
        obj = e;
          goto _L12
_L9:
        obj = e;
        i1 = com.facebook.share.internal.r.a.d;
_L13:
        ((r) (obj)).a(i1);
          goto _L8
_L10:
        obj = e;
        i1 = com.facebook.share.internal.r.a.b;
          goto _L13
_L11:
        obj = e;
        if (l == com.facebook.share.widget.b.c)
        {
            i1 = com.facebook.share.internal.r.a.c;
        } else
        {
            i1 = com.facebook.share.internal.r.a.a;
        }
          goto _L13
_L4:
        ((View) (obj)).setPadding(o, o, o, p);
        return;
_L5:
        ((View) (obj)).setPadding(o, p, o, o);
        return;
_L6:
        if (l == com.facebook.share.widget.b.c)
        {
            ((View) (obj)).setPadding(o, o, p, o);
            return;
        } else
        {
            ((View) (obj)).setPadding(p, o, o, o);
            return;
        }
    }

    static void a(LikeView likeview)
    {
        com.facebook.share.internal.LikeContent.a a1 = null;
        if (likeview.g == null) goto _L2; else goto _L1
_L1:
        if (likeview.q != null) goto _L4; else goto _L3
_L3:
        Object obj;
        for (obj = likeview.getContext(); !(obj instanceof Activity) && (obj instanceof ContextWrapper); obj = ((ContextWrapper)obj).getBaseContext()) { }
        if (!(obj instanceof Activity)) goto _L6; else goto _L5
_L5:
        obj = (Activity)obj;
_L14:
        com.facebook.share.internal.c c1;
        Fragment fragment;
        Bundle bundle;
        boolean flag;
        c1 = likeview.g;
        fragment = likeview.q;
        bundle = new Bundle();
        bundle.putString("style", likeview.k.toString());
        bundle.putString("auxiliary_position", likeview.m.toString());
        bundle.putString("horizontal_alignment", likeview.l.toString());
        bundle.putString("object_id", U.a(likeview.a, ""));
        bundle.putString("object_type", likeview.b.toString());
        c1.d().a("fb_like_control_did_tap", bundle, true);
        if (!c1.c)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (!c1.e()) goto _L8; else goto _L7
_L7:
        c1.a(flag);
        if (!c1.d) goto _L10; else goto _L9
_L9:
        c1.d().a("fb_like_control_did_undo_quickly", bundle, true);
_L2:
        return;
_L6:
        throw new p("Unable to get Activity.");
_L10:
        if (c1.a(flag, bundle)) goto _L2; else goto _L11
_L11:
        if (!flag)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        c1.a(flag);
_L8:
        if (t.d())
        {
            likeview = "fb_like_control_did_present_dialog";
        } else
        if (t.e())
        {
            likeview = "fb_like_control_did_present_fallback_dialog";
        } else
        {
            c1.a("present_dialog", bundle);
            U.a();
            com.facebook.share.internal.c.a(null, "com.facebook.sdk.LikeActionController.UPDATED", null);
            likeview = a1;
        }
        if (likeview == null) goto _L2; else goto _L12
_L12:
        if (c1.b != null)
        {
            likeview = c1.b.toString();
        } else
        {
            likeview = com.facebook.share.widget.e.a.toString();
        }
        a1 = new com.facebook.share.internal.LikeContent.a();
        a1.a = c1.a;
        a1.b = likeview;
        likeview = new LikeContent(a1, (byte)0);
        if (fragment != null)
        {
            (new t(fragment)).a(likeview);
        } else
        {
            (new t(((Activity) (obj)))).a(likeview);
        }
        com.facebook.share.internal.c.a(c1.a);
        c1.e = bundle;
        com.facebook.share.internal.c.a(c1);
        c1.d().a("fb_like_control_did_present_dialog", bundle, true);
        return;
_L4:
        obj = null;
        if (true) goto _L14; else goto _L13
_L13:
    }

    static void a(LikeView likeview, com.facebook.share.internal.c c1)
    {
        likeview.g = c1;
        likeview.i = likeview. new d((byte)0);
        c1 = LocalBroadcastManager.getInstance(likeview.getContext());
        IntentFilter intentfilter = new IntentFilter();
        intentfilter.addAction("com.facebook.sdk.LikeActionController.UPDATED");
        intentfilter.addAction("com.facebook.sdk.LikeActionController.DID_ERROR");
        intentfilter.addAction("com.facebook.sdk.LikeActionController.DID_RESET");
        c1.registerReceiver(likeview.i, intentfilter);
    }

    static void a(LikeView likeview, String s1, e e1)
    {
        likeview.a(s1, e1);
    }

    private void a(String s1, e e1)
    {
        if (i != null)
        {
            LocalBroadcastManager.getInstance(getContext()).unregisterReceiver(i);
            i = null;
        }
        if (j != null)
        {
            j.a = true;
            j = null;
        }
        g = null;
        a = s1;
        b = e1;
        if (!U.a(s1))
        {
            j = new c((byte)0);
            if (!isInEditMode())
            {
                com.facebook.share.internal.c.a(s1, e1, j);
                return;
            }
        }
    }

    static String b(LikeView likeview)
    {
        return likeview.a;
    }

    static void c(LikeView likeview)
    {
        likeview.a();
    }

    static f d(LikeView likeview)
    {
        return likeview.h;
    }

    static e e(LikeView likeview)
    {
        return likeview.b;
    }

    static c f(LikeView likeview)
    {
        likeview.j = null;
        return null;
    }

    protected void onDetachedFromWindow()
    {
        e e1 = com.facebook.share.widget.e.a;
        String s1 = U.a(null, null);
        if (e1 == null)
        {
            e1 = e.d;
        }
        if (!U.a(s1, a) || e1 != b)
        {
            a(s1, e1);
            a();
        }
        super.onDetachedFromWindow();
    }

    public void setEnabled(boolean flag)
    {
        if (!flag)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        r = flag;
        a();
    }
}
