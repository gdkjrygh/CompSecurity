// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.aviary.android.feather.sdk.overlays;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import com.aviary.android.feather.library.filters.a;
import com.nineoldandroids.a.c;
import com.nineoldandroids.a.k;
import com.nineoldandroids.a.o;

// Referenced classes of package com.aviary.android.feather.sdk.overlays:
//            AviaryOverlay

public class BlemishOverlay extends AviaryOverlay
{
    static final class a extends Enum
    {

        public static final a a;
        public static final a b;
        public static final a c;
        public static final a d;
        private static final a e[];

        public static a valueOf(String s1)
        {
            return (a)Enum.valueOf(com/aviary/android/feather/sdk/overlays/BlemishOverlay$a, s1);
        }

        public static a[] values()
        {
            return (a[])e.clone();
        }

        static 
        {
            a = new a("NONE", 0);
            b = new a("FIRST", 1);
            c = new a("SECOND", 2);
            d = new a("THIRD", 3);
            e = (new a[] {
                a, b, c, d
            });
        }

        private a(String s1, int i1)
        {
            super(s1, i1);
        }
    }


    private CharSequence A;
    private android.text.Layout.Alignment B;
    private int C;
    private int D;
    public boolean h;
    private a i;
    private View j;
    private View k;
    private final Rect l = new Rect();
    private final Rect m = new Rect();
    private Drawable n;
    private Drawable o;
    private Drawable p;
    private Drawable q;
    private CharSequence r;
    private CharSequence s;
    private float t;
    private CharSequence u;
    private Drawable v;
    private Drawable w;
    private CharSequence x;
    private CharSequence y;
    private float z;

    public BlemishOverlay(Context context, int i1, View view, View view1)
    {
        super(context, com.aviary.android.feather.library.filters.a.a(com.aviary.android.feather.library.filters.a.a.l), i1, 2);
        i = com.aviary.android.feather.sdk.overlays.a.a;
        h = false;
        C = 0;
        D = 0;
        j = view;
        k = view1;
        n = b();
        o = a();
        context = context.getResources();
        r = context.getString(com.aviary.android.feather.sdk.R.string.feather_overlay_tap_title);
        s = context.getString(com.aviary.android.feather.sdk.R.string.feather_overlay_blemish_tap_text);
        t = context.getFraction(com.aviary.android.feather.sdk.R.fraction.aviary_overlay_blemish_text1_width, 100, 100);
        u = context.getString(com.aviary.android.feather.sdk.R.string.aviary_overlay_blemish_text1_position);
        x = context.getString(com.aviary.android.feather.sdk.R.string.feather_overlay_zoom_title);
        y = context.getString(com.aviary.android.feather.sdk.R.string.feather_overlay_zoom_text);
        z = context.getFraction(com.aviary.android.feather.sdk.R.fraction.aviary_overlay_blemish_text2_width, 100, 100);
        A = context.getString(com.aviary.android.feather.sdk.R.string.aviary_overlay_blemish_text2_position);
        context = context.getString(com.aviary.android.feather.sdk.R.string.aviary_overlay_default_text_align);
        if (android.text.Layout.Alignment.ALIGN_CENTER.name().equals(context))
        {
            B = android.text.Layout.Alignment.ALIGN_CENTER;
        } else
        if (android.text.Layout.Alignment.ALIGN_OPPOSITE.equals(context))
        {
            B = android.text.Layout.Alignment.ALIGN_OPPOSITE;
        } else
        {
            B = android.text.Layout.Alignment.ALIGN_NORMAL;
        }
        a(new int[] {
            9, 12
        });
    }

    private Rect a(Drawable drawable, Rect rect, int i1, CharSequence charsequence)
    {
        DisplayMetrics displaymetrics = getDisplayMetrics();
        int j1 = drawable.getIntrinsicWidth();
        drawable = new Rect(0, 0, j1, drawable.getIntrinsicHeight());
        int k1 = rect.top;
        int l1 = drawable.height();
        if (a.equals(charsequence))
        {
            j1 = rect.left - j1;
        } else
        if (b.equals(charsequence))
        {
            j1 = rect.centerX() - j1 / 2;
        } else
        {
            j1 = rect.right;
        }
        drawable.offsetTo(j1, k1 - l1 - i1);
        if (((Rect) (drawable)).right > displaymetrics.widthPixels)
        {
            drawable.offsetTo(displaymetrics.widthPixels - drawable.width() - i1, ((Rect) (drawable)).top);
        } else
        if (((Rect) (drawable)).left < 0)
        {
            drawable.offsetTo(i1, ((Rect) (drawable)).top);
            return drawable;
        }
        return drawable;
    }

    static void a(BlemishOverlay blemishoverlay)
    {
        blemishoverlay.p();
    }

    private void p()
    {
        f.c("onAnimationComplete. state: %s", new Object[] {
            i
        });
        static class _cls4
        {

            static final int a[];

            static 
            {
                a = new int[a.values().length];
                try
                {
                    a[com.aviary.android.feather.sdk.overlays.a.a.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror3) { }
                try
                {
                    a[a.b.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror2) { }
                try
                {
                    a[com.aviary.android.feather.sdk.overlays.a.c.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    a[a.d.ordinal()] = 4;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        switch (com.aviary.android.feather.sdk.overlays._cls4.a[i.ordinal()])
        {
        case 1: // '\001'
        default:
            return;

        case 2: // '\002'
            setState(com.aviary.android.feather.sdk.overlays.a.c);
            return;

        case 3: // '\003'
            setState(a.d);
            break;
        }
    }

    private void q()
    {
        if (j()) goto _L2; else goto _L1
_L1:
        return;
_L2:
        Object obj = getDisplayMetrics();
        if (i == a.b) goto _L1; else goto _L3
_L3:
        if (i != com.aviary.android.feather.sdk.overlays.a.c)
        {
            continue; /* Loop/switch isn't completed */
        }
        if (q != null && p != null) goto _L1; else goto _L4
_L4:
        j.getGlobalVisibleRect(l);
        n.setBounds(l.left + l.width() / 3, l.top + l.height() / 3, l.left + l.width() / 3 + n.getIntrinsicWidth(), l.top + l.height() / 3 + n.getIntrinsicHeight());
        n.setAlpha(0);
        int i1 = (int)((float)((DisplayMetrics) (obj)).widthPixels * (t / 100F));
        q = b(getContext(), s, i1, B);
        obj = a(q, n.getBounds(), getTextMargins(), u);
        q.setBounds(((Rect) (obj)));
        q.setAlpha(0);
        p = a(getContext(), r, i1, B);
        Rect rect = new Rect(0, 0, p.getIntrinsicWidth(), p.getIntrinsicHeight());
        rect.offsetTo(((Rect) (obj)).left, ((Rect) (obj)).top - rect.height() - getTitleMargins());
        p.setAlpha(0);
        p.setBounds(rect);
        return;
        if (i != a.d || w != null && v != null) goto _L1; else goto _L5
_L5:
        k.getGlobalVisibleRect(m);
        o.setBounds(m.centerX(), m.top - o.getIntrinsicHeight(), m.centerX() + o.getIntrinsicWidth(), m.top);
        o.setAlpha(0);
        int j1 = (int)((float)((DisplayMetrics) (obj)).widthPixels * (z / 100F));
        w = b(getContext(), y, j1, B);
        obj = a(w, o.getBounds(), getTextMargins(), A);
        w.setBounds(((Rect) (obj)));
        w.setAlpha(0);
        v = a(getContext(), x, j1, B);
        Rect rect1 = new Rect(0, 0, v.getIntrinsicWidth(), v.getIntrinsicHeight());
        rect1.offsetTo(((Rect) (obj)).left, ((Rect) (obj)).top - rect1.height() - getTitleMargins());
        v.setBounds(rect1);
        v.setAlpha(0);
        return;
    }

    private void setState(a a1)
    {
        f.c("setState: %s", new Object[] {
            a1
        });
        i = a1;
        d();
    }

    public boolean a(long l1)
    {
        setState(a.b);
        return super.a(l1);
    }

    public void d()
    {
        q();
    }

    protected void dispatchDraw(Canvas canvas)
    {
        if (getVisibility() != 0 || !j() || j == null)
        {
            return;
        }
        if (h)
        {
            o();
        } else
        {
            q();
        }
        canvas.drawColor(getBackgroundColor());
        if (i == com.aviary.android.feather.sdk.overlays.a.c || i == a.d)
        {
            n.draw(canvas);
            q.draw(canvas);
            p.draw(canvas);
        }
        if (i == a.d)
        {
            o.draw(canvas);
            w.draw(canvas);
            v.draw(canvas);
            canvas.save();
            canvas.translate(m.left, m.top);
            if (C < 255)
            {
                int i1 = canvas.saveLayerAlpha(0.0F, 0.0F, m.width(), m.height(), C, 4);
                k.draw(canvas);
                canvas.restoreToCount(i1);
            } else
            {
                k.draw(canvas);
            }
            canvas.restore();
        }
        super.dispatchDraw(canvas);
    }

    protected void e()
    {
        f.b("doShow");
        if (!j())
        {
            return;
        } else
        {
            m();
            return;
        }
    }

    protected void f()
    {
        f.b("inAnimationCompleted");
        if (getCloseButton() != null)
        {
            getCloseButton().setVisibility(0);
        }
    }

    public int getAlpha1()
    {
        return D;
    }

    public int getAlpha2()
    {
        return C;
    }

    protected com.nineoldandroids.a.a k()
    {
        c c1 = new c();
        k k1 = com.nineoldandroids.a.k.a(this, "alpha", new float[] {
            0.0F, 1.0F
        });
        k k2 = com.nineoldandroids.a.k.a(this, "alpha1", new int[] {
            0, 255
        });
        k k3 = com.nineoldandroids.a.k.a(this, "alpha2", new int[] {
            0, 255
        });
        o o1 = com.nineoldandroids.a.o.b(new int[] {
            0, 255
        });
        k2.a(200L);
        k3.a(400L);
        o1.a(400L);
        k1.b(getAnimationDuration());
        k2.b(getAnimationDuration());
        k3.b(getAnimationDuration());
        o1.b(getAnimationDuration());
        k1.a(new com.nineoldandroids.a.a.a() {

            final BlemishOverlay a;

            public void a(com.nineoldandroids.a.a a1)
            {
            }

            public void b(com.nineoldandroids.a.a a1)
            {
                com.aviary.android.feather.sdk.overlays.BlemishOverlay.a(a);
            }

            public void c(com.nineoldandroids.a.a a1)
            {
            }

            public void d(com.nineoldandroids.a.a a1)
            {
            }

            
            {
                a = BlemishOverlay.this;
                super();
            }
        });
        k2.a(new com.nineoldandroids.a.a.a() {

            final BlemishOverlay a;

            public void a(com.nineoldandroids.a.a a1)
            {
            }

            public void b(com.nineoldandroids.a.a a1)
            {
                com.aviary.android.feather.sdk.overlays.BlemishOverlay.a(a);
            }

            public void c(com.nineoldandroids.a.a a1)
            {
            }

            public void d(com.nineoldandroids.a.a a1)
            {
            }

            
            {
                a = BlemishOverlay.this;
                super();
            }
        });
        k3.a(new com.nineoldandroids.a.a.a() {

            final BlemishOverlay a;

            public void a(com.nineoldandroids.a.a a1)
            {
            }

            public void b(com.nineoldandroids.a.a a1)
            {
                com.aviary.android.feather.sdk.overlays.BlemishOverlay.a(a);
            }

            public void c(com.nineoldandroids.a.a a1)
            {
            }

            public void d(com.nineoldandroids.a.a a1)
            {
            }

            
            {
                a = BlemishOverlay.this;
                super();
            }
        });
        c1.b(new com.nineoldandroids.a.a[] {
            k1, k2, k3, o1
        });
        return c1;
    }

    public void o()
    {
        f.c("forceCalculatePositions");
        Object obj = getDisplayMetrics();
        j.getGlobalVisibleRect(l);
        n.setBounds(l.left + l.width() / 3, l.top + l.height() / 3, l.left + l.width() / 3 + n.getIntrinsicWidth(), l.top + l.height() / 3 + n.getIntrinsicHeight());
        int i1 = (int)((float)((DisplayMetrics) (obj)).widthPixels * (t / 100F));
        q = b(getContext(), s, i1, B);
        Rect rect = a(q, n.getBounds(), getTextMargins(), u);
        q.setBounds(rect);
        p = a(getContext(), r, i1, B);
        Rect rect1 = new Rect(0, 0, p.getIntrinsicWidth(), p.getIntrinsicHeight());
        rect1.offsetTo(rect.left, rect.top - rect1.height() - getTitleMargins());
        p.setBounds(rect1);
        k.getGlobalVisibleRect(m);
        o.setBounds(m.centerX(), m.top - o.getIntrinsicHeight(), m.centerX() + o.getIntrinsicWidth(), m.top);
        i1 = (int)((float)((DisplayMetrics) (obj)).widthPixels * (z / 100F));
        w = b(getContext(), y, i1, B);
        obj = a(w, o.getBounds(), getTextMargins(), A);
        w.setBounds(((Rect) (obj)));
        v = a(getContext(), x, i1, B);
        rect = new Rect(0, 0, v.getIntrinsicWidth(), v.getIntrinsicHeight());
        rect.offsetTo(((Rect) (obj)).left, ((Rect) (obj)).top - rect.height() - getTitleMargins());
        v.setBounds(rect);
    }

    public boolean onTouchEvent(MotionEvent motionevent)
    {
        if (motionevent.getAction() == 0)
        {
            b("background");
        }
        return true;
    }

    public void setAlpha1(int i1)
    {
        D = i1;
        n.setAlpha(i1);
        p.setAlpha(i1);
        q.setAlpha(i1);
        postInvalidate();
    }

    public void setAlpha2(int i1)
    {
        C = i1;
        o.setAlpha(i1);
        v.setAlpha(i1);
        w.setAlpha(i1);
        postInvalidate();
    }
}
