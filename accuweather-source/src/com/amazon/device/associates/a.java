// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.amazon.device.associates;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.webkit.CookieManager;
import android.webkit.CookieSyncManager;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import java.util.concurrent.ExecutionException;

// Referenced classes of package com.amazon.device.associates:
//            h, ah, bt, n, 
//            br, bq, bo, o, 
//            p

class com.amazon.device.associates.a
{
    private static class a extends RelativeLayout
        implements android.view.View.OnTouchListener
    {

        private final Context a;
        private RelativeLayout b;
        private WebView c;
        private final float d;
        private int e;
        private int f;
        private int g;
        private int h;
        private final int i;
        private boolean j;
        private ViewGroup k;
        private final Drawable l;
        private final Drawable m;
        private final Drawable n;
        private final Drawable o;
        private a p;
        private android.view.View.OnTouchListener q;

        static ViewGroup a(a a1)
        {
            return a1.k;
        }

        private void a(Rect rect, Rect rect1)
        {
            rect = b(rect, rect1);
            com.amazon.device.associates.p.c("Location", p.toString());
            g = rect.width();
            h = rect.height();
            com.amazon.device.associates.p.c("Dimension:", (new StringBuilder()).append(g).append(", ").append(h).toString());
            c = new WebView(a);
            c.setLayoutParams(new android.widget.RelativeLayout.LayoutParams(g, h));
            c.getSettings().setJavaScriptEnabled(false);
            c.setVerticalScrollBarEnabled(false);
            c.setHorizontalScrollBarEnabled(false);
            c.loadDataWithBaseURL("blarg://ignored", "", "text/html", "UTF-8", "");
            if (q != null)
            {
                c.setOnTouchListener(q);
            }
        }

        static boolean a(a a1, boolean flag)
        {
            a1.j = flag;
            return flag;
        }

        static int b(a a1)
        {
            return a1.g;
        }

        private Rect b(Rect rect, Rect rect1)
        {
            Rect rect2 = c(rect, rect1);
            Rect rect3 = d(rect, rect1);
            Rect rect4 = e(rect, rect1);
            rect = f(rect, rect1);
            int i1 = rect2.width() * rect2.height();
            int j1 = rect3.width() * rect3.height();
            int k1 = rect4.width() * rect4.height();
            int l1 = rect.width() * rect.height();
            if (i1 >= j1 && i1 >= k1 && i1 >= l1)
            {
                p = a.a;
                return rect2;
            }
            if (j1 >= i1 && j1 >= k1 && j1 >= l1)
            {
                p = a.b;
                return rect3;
            }
            if (k1 >= i1 && k1 >= j1 && k1 >= l1)
            {
                p = a.c;
                return rect4;
            } else
            {
                p = a.d;
                return rect;
            }
        }

        private ViewGroup b(View view)
        {
            View view1 = view.getRootView().findViewById(0x1020002);
            if (view1 instanceof FrameLayout)
            {
                return (ViewGroup)view1;
            }
            for (view = view.getParent(); view.getParent() != null && view.getParent().getParent() != null && !view.getParent().getParent().getClass().getName().equals("com.android.internal.policy.impl.PhoneWindow$DecorView"); view = view.getParent()) { }
            return (ViewGroup)view;
        }

        private void b()
        {
            b = new RelativeLayout(a);
            b.setLayoutParams(new android.widget.RelativeLayout.LayoutParams(-2, -2));
            b.setBackgroundDrawable(a.getResources().getDrawable(bo.a("bg_custom", "drawable")));
            b.setPadding(i, i, i, i);
            if (c != null)
            {
                b.addView(c);
            }
        }

        static float c(a a1)
        {
            return a1.d;
        }

        private Rect c(Rect rect, Rect rect1)
        {
            int i1 = e;
            int l1 = f;
            int k1 = l1;
            if (l1 > rect1.top - rect.top - n.getIntrinsicHeight())
            {
                i1 = rect1.top - rect.top - n.getIntrinsicHeight() - i * 2;
                k1 = i1;
                if (i1 < 0)
                {
                    k1 = 0;
                }
                i1 = (int)((((double)k1 * 1.0D) / (double)f) * (double)e);
            }
            l1 = k1;
            k1 = i1;
            if (i1 > rect.right - rect.left)
            {
                k1 = rect.right - rect.left - i * 2;
                int j1 = k1;
                if (k1 < 0)
                {
                    j1 = 0;
                }
                l1 = (int)((((double)j1 * 1.0D) / (double)e) * (double)f);
                k1 = j1;
            }
            return new Rect(0, 0, k1, l1);
        }

        private Rect c(View view)
        {
            int ai[] = new int[2];
            view.getLocationOnScreen(ai);
            return new Rect(ai[0], ai[1], ai[0] + view.getWidth(), ai[1] + view.getHeight());
        }

        static int d(a a1)
        {
            return a1.h;
        }

        private Rect d(Rect rect, Rect rect1)
        {
            int l1 = e;
            int i1 = f;
            int k1 = l1;
            if (l1 > rect.right - rect1.right - o.getIntrinsicWidth())
            {
                k1 = rect.right - rect1.right - o.getIntrinsicWidth() - i * 2;
                i1 = k1;
                if (k1 < 0)
                {
                    i1 = 0;
                }
                l1 = (int)((((double)i1 * 1.0D) / (double)e) * (double)f);
                k1 = i1;
                i1 = l1;
            }
            l1 = i1;
            if (i1 > rect.bottom - rect.top)
            {
                k1 = rect.bottom - rect.top - i * 2;
                int j1 = k1;
                if (k1 < 0)
                {
                    j1 = 0;
                }
                k1 = (int)((((double)j1 * 1.0D) / (double)f) * (double)e);
                l1 = j1;
            }
            return new Rect(0, 0, k1, l1);
        }

        private Rect e(Rect rect, Rect rect1)
        {
            int i1 = e;
            int l1 = f;
            int k1 = l1;
            if (l1 > rect.bottom - rect1.bottom - l.getIntrinsicHeight())
            {
                i1 = rect.bottom - rect1.bottom - l.getIntrinsicHeight() - i * 2;
                k1 = i1;
                if (i1 < 0)
                {
                    k1 = 0;
                }
                i1 = (int)((((double)k1 * 1.0D) / (double)f) * (double)e);
            }
            l1 = k1;
            k1 = i1;
            if (i1 > rect.right - rect.left)
            {
                k1 = rect.right - rect.left - i * 2;
                int j1 = k1;
                if (k1 < 0)
                {
                    j1 = 0;
                }
                l1 = (int)((((double)j1 * 1.0D) / (double)e) * (double)f);
                k1 = j1;
            }
            return new Rect(0, 0, k1, l1);
        }

        static WebView e(a a1)
        {
            return a1.c;
        }

        private Rect f(Rect rect, Rect rect1)
        {
            int l1 = e;
            int i1 = f;
            int k1 = l1;
            if (l1 > rect1.left - rect.left - m.getIntrinsicWidth())
            {
                k1 = rect1.left - rect.left - m.getIntrinsicWidth() - i * 2;
                i1 = k1;
                if (k1 < 0)
                {
                    i1 = 0;
                }
                l1 = (int)((((double)i1 * 1.0D) / (double)e) * (double)f);
                k1 = i1;
                i1 = l1;
            }
            l1 = i1;
            if (i1 > rect.bottom - rect.top)
            {
                k1 = rect.bottom - rect.top - i * 2;
                int j1 = k1;
                if (k1 < 0)
                {
                    j1 = 0;
                }
                k1 = (int)((((double)j1 * 1.0D) / (double)f) * (double)e);
                l1 = j1;
            }
            return new Rect(0, 0, k1, l1);
        }

        static RelativeLayout f(a a1)
        {
            return a1.b;
        }

        private void g(Rect rect, Rect rect1)
        {
            int i1;
            int j1;
            int k1;
            int l1;
            int i2;
            j1 = 0;
            i1 = 0;
            b.measure(0, 0);
            l1 = b.getMeasuredWidth();
            i2 = b.getMeasuredHeight();
            k1 = (int)(5F * d);
            static class _cls2
            {

                static final int a[];

                static 
                {
                    a = new int[a.a.values().length];
                    try
                    {
                        a[a.a.a.ordinal()] = 1;
                    }
                    catch (NoSuchFieldError nosuchfielderror3) { }
                    try
                    {
                        a[a.a.b.ordinal()] = 2;
                    }
                    catch (NoSuchFieldError nosuchfielderror2) { }
                    try
                    {
                        a[a.a.c.ordinal()] = 3;
                    }
                    catch (NoSuchFieldError nosuchfielderror1) { }
                    try
                    {
                        a[a.a.d.ordinal()] = 4;
                    }
                    catch (NoSuchFieldError nosuchfielderror)
                    {
                        return;
                    }
                }
            }

            _cls2.a[p.ordinal()];
            JVM INSTR tableswitch 1 4: default 84
        //                       1 120
        //                       2 206
        //                       3 305
        //                       4 392;
               goto _L1 _L2 _L3 _L4 _L5
_L1:
            j1 = 0;
            i1 = 0;
_L10:
            android.widget.RelativeLayout.LayoutParams layoutparams = (android.widget.RelativeLayout.LayoutParams)b.getLayoutParams();
            layoutparams.leftMargin = j1;
            layoutparams.topMargin = i1;
            h(rect, rect1);
            return;
_L2:
            j1 = rect1.centerX() - rect.left - l1 / 2;
            if (j1 >= 0)
            {
                if (j1 + l1 > rect.right - rect.left)
                {
                    i1 = rect.right - l1;
                } else
                {
                    i1 = j1;
                }
            }
            k1 = (rect1.top - rect.top - i2 - n.getIntrinsicHeight()) + k1;
            j1 = i1;
            i1 = k1;
            continue; /* Loop/switch isn't completed */
_L3:
            k1 = ((rect1.right - rect.left) + o.getIntrinsicWidth()) - k1;
            l1 = rect1.centerY() - rect.top - i2 / 2;
            if (l1 < 0)
            {
                i1 = 0;
                j1 = k1;
            } else
            {
                j1 = k1;
                i1 = l1;
                if (l1 + i2 > rect.bottom - rect.top)
                {
                    i1 = rect.bottom - rect.top - i2;
                    j1 = k1;
                }
            }
            continue; /* Loop/switch isn't completed */
_L4:
            i1 = rect1.centerX() - rect.left - l1 / 2;
            if (i1 >= 0) goto _L7; else goto _L6
_L6:
            i1 = j1;
_L8:
            k1 = ((rect1.bottom - rect.top) + l.getIntrinsicHeight()) - k1;
            j1 = i1;
            i1 = k1;
            continue; /* Loop/switch isn't completed */
_L7:
            if (i1 + l1 > rect.right - rect.left)
            {
                i1 = rect.right - l1;
            }
            if (true) goto _L8; else goto _L5
_L5:
            k1 = (rect1.left - rect.left - l1 - m.getIntrinsicWidth()) + k1;
            l1 = rect1.centerY() - rect.top - i2 / 2;
            if (l1 < 0)
            {
                i1 = 0;
                j1 = k1;
            } else
            {
                j1 = k1;
                i1 = l1;
                if (l1 + i2 > rect.bottom - rect.top)
                {
                    i1 = rect.bottom - rect.top - i2;
                    j1 = k1;
                }
            }
            if (true) goto _L10; else goto _L9
_L9:
        }

        private void h(Rect rect, Rect rect1)
        {
            ImageView imageview;
            int i1;
            i1 = 0;
            imageview = new ImageView(getContext());
            _cls2.a[p.ordinal()];
            JVM INSTR tableswitch 1 4: default 56
        //                       1 105
        //                       2 157
        //                       3 206
        //                       4 255;
               goto _L1 _L2 _L3 _L4 _L5
_L1:
            int j1;
            int k1;
            int l1;
            k1 = 0;
            l1 = 0;
            rect = null;
            j1 = 0;
_L7:
            imageview.setImageDrawable(rect);
            rect = new android.widget.RelativeLayout.LayoutParams(j1, i1);
            rect.leftMargin = l1;
            rect.topMargin = k1;
            addView(imageview, rect);
            return;
_L2:
            Drawable drawable = n;
            j1 = drawable.getIntrinsicWidth();
            i1 = drawable.getIntrinsicHeight();
            l1 = rect1.centerX() - rect.left - j1 / 2;
            k1 = rect1.top - rect.top - i1;
            rect = drawable;
            continue; /* Loop/switch isn't completed */
_L3:
            Drawable drawable1 = o;
            j1 = drawable1.getIntrinsicWidth();
            i1 = drawable1.getIntrinsicHeight();
            l1 = rect1.right - rect.left;
            k1 = rect1.centerY() - rect.top - i1 / 2;
            rect = drawable1;
            continue; /* Loop/switch isn't completed */
_L4:
            Drawable drawable2 = l;
            j1 = drawable2.getIntrinsicWidth();
            i1 = drawable2.getIntrinsicHeight();
            l1 = rect1.centerX() - rect.left - j1 / 2;
            k1 = rect1.bottom - rect.top;
            rect = drawable2;
            continue; /* Loop/switch isn't completed */
_L5:
            Drawable drawable3 = m;
            j1 = drawable3.getIntrinsicWidth();
            i1 = drawable3.getIntrinsicHeight();
            l1 = rect1.left - rect.left - j1;
            k1 = rect1.centerY() - rect.top - i1 / 2;
            rect = drawable3;
            if (true) goto _L7; else goto _L6
_L6:
        }

        public void a()
        {
            if (!j)
            {
                c.setVisibility(4);
                AlphaAnimation alphaanimation = new AlphaAnimation(1.0F, 0.0F);
                alphaanimation.setDuration(300L);
                alphaanimation.setAnimationListener(new android.view.animation.Animation.AnimationListener(this) {

                    final a a;

                    public void onAnimationEnd(Animation animation)
                    {
                        a.f(a).removeAllViews();
                        a.removeAllViews();
                        a.a(a).removeView(a);
                        a.a(a, false);
                    }

                    public void onAnimationRepeat(Animation animation)
                    {
                    }

                    public void onAnimationStart(Animation animation)
                    {
                    }

            
            {
                a = a1;
                super();
            }
                });
                j = true;
                startAnimation(alphaanimation);
            }
        }

        public void a(View view)
        {
            ViewGroup viewgroup = b(view);
            k = viewgroup;
            Rect rect = c(viewgroup);
            view = c(view);
            a(rect, ((Rect) (view)));
            b();
            g(rect, view);
            addView(b);
            viewgroup.addView(this);
            setOnTouchListener(this);
            view = new AlphaAnimation(0.0F, 1.0F);
            view.setDuration(300L);
            view.setAnimationListener(new android.view.animation.Animation.AnimationListener(this) {

                final a a;

                public void onAnimationEnd(Animation animation)
                {
                    a.a(a, false);
                }

                public void onAnimationRepeat(Animation animation)
                {
                }

                public void onAnimationStart(Animation animation)
                {
                }

            
            {
                a = a1;
                super();
            }
            });
            j = true;
            startAnimation(view);
        }

        public boolean onTouch(View view, MotionEvent motionevent)
        {
            if (!j && view == this)
            {
                a();
            }
            return true;
        }

        public a(Context context)
        {
            this(context, null);
        }

        public a(Context context, android.view.View.OnTouchListener ontouchlistener)
        {
            super(context);
            e = 300;
            f = 160;
            j = false;
            l = getResources().getDrawable(bo.a("quickaction_arrow_up", "drawable"));
            m = getResources().getDrawable(bo.a("quickaction_arrow_right", "drawable"));
            n = getResources().getDrawable(bo.a("quickaction_arrow_down", "drawable"));
            o = getResources().getDrawable(bo.a("quickaction_arrow_left", "drawable"));
            p = null;
            setLayoutParams(new android.widget.RelativeLayout.LayoutParams(-1, -1));
            setGravity(51);
            setBackgroundColor(0x962c3539);
            a = context;
            d = a.getResources().getDisplayMetrics().density;
            f = Math.round((float)f * d);
            e = Math.round((float)e * d);
            i = Math.round(7F * d);
            q = ontouchlistener;
            com.amazon.device.associates.p.c("Default Config", String.format("Scale %f, Height %d, Width %d", new Object[] {
                Float.valueOf(d), Integer.valueOf(f), Integer.valueOf(e)
            }));
            CookieSyncManager.createInstance(context);
            context = CookieManager.getInstance();
            context.setAcceptCookie(false);
            context.removeAllCookie();
        }
    }

    private static final class a.a extends Enum
    {

        public static final a.a a;
        public static final a.a b;
        public static final a.a c;
        public static final a.a d;
        private static final a.a e[];

        public static a.a valueOf(String s)
        {
            return (a.a)Enum.valueOf(com/amazon/device/associates/a$a$a, s);
        }

        public static a.a[] values()
        {
            return (a.a[])e.clone();
        }

        static 
        {
            a = new a.a("UP", 0);
            b = new a.a("RIGHT", 1);
            c = new a.a("DOWN", 2);
            d = new a.a("LEFT", 3);
            e = (new a.a[] {
                a, b, c, d
            });
        }

        private a.a(String s, int i)
        {
            super(s, i);
        }
    }


    private static a d;
    private final String a;
    private final android.view.View.OnTouchListener b = new android.view.View.OnTouchListener() {

        final com.amazon.device.associates.a a;

        public boolean onTouch(View view, MotionEvent motionevent)
        {
            if (com.amazon.device.associates.a.a(a) == null || com.amazon.device.associates.a.a(a).trim().equals(""))
            {
                return false;
            }
            if (motionevent.getAction() == 0)
            {
                bq.d(com.amazon.device.associates.a.a(a));
            }
            return true;
        }

            
            {
                a = com.amazon.device.associates.a.this;
                super();
            }
    };
    private String c;

    public com.amazon.device.associates.a(String s)
    {
        c = null;
        a = s;
    }

    private String a(double d1)
    {
        int i = (int)d1;
        if (d1 == (double)i)
        {
            i = 65 - i * 13;
        } else
        {
            i = 193 - i * 13;
        }
        return String.valueOf(i);
    }

    private String a(int i, int j)
        throws InterruptedException, ExecutionException
    {
        Object obj = ((bt)((h)ah.a(com/amazon/device/associates/h)).j()).a();
        br br1 = n.a(a);
        if (br1 == null || !br1.g())
        {
            obj = new StringBuilder("<!DOCTYPE html>\n<html lang=\"en\">");
            ((StringBuilder) (obj)).append((new StringBuilder()).append("<body style='height: ").append(j).append("px; width: ").append(i).append("px;'>\n").toString()).append("<div style='float:left; display:block; margin:auto 0;'>\n").append("<img src='file:///android_res/drawable/logo.png' alt='amazon' style='display: block; height:90%;' />\n").append("</div>\n").append("<div style='float:left; margin:auto 0; width: 55%;'>\n").append((new StringBuilder()).append("<div style='height:").append((int)(0.8666666666666667D * (double)j)).append("px; display:table-cell; vertical-align:middle;'>\n").toString()).append("<h4>Go to <span style='color:#2c77ef'>amazon.com<span></h4>\n").append("</div>\n").append("</div>\n").append("</body>\n").append("</html>\n");
            obj = ((StringBuilder) (obj)).toString();
            c = bq.a();
            return ((String) (obj));
        }
        obj = ((String) (obj)).replace("$WIDTH", String.valueOf(i)).replace("$HEIGHT", String.valueOf(j)).replace("$TITLE", br1.b());
        String s = br1.a();
        s = ((String) (obj)).replace("$ICON_SRC", (new StringBuilder()).append(s.substring(0, s.lastIndexOf("."))).append("._SL").append((int)((double)i * 0.29999999999999999D)).append("_").append(s.substring(s.lastIndexOf("."))).toString()).replace("$PRICE", br1.c()).replace("$REVIEW_COUNT", br1.e());
        if (c == null)
        {
            obj = br1.f();
        } else
        {
            obj = c;
        }
        obj = s.replace("$RETAIL_URL", ((CharSequence) (obj))).replace("$RATING_DISPLACEMENT", a(br1.d()));
        c = bq.c(a);
        return ((String) (obj));
    }

    static String a(com.amazon.device.associates.a a1)
    {
        return a1.c;
    }

    public void a(View view)
    {
        try
        {
            if (d != null && d.isShown())
            {
                a.a(d).removeView(d);
            }
            d = new a(bo.a(), b);
            d.a(view);
            view = a((int)((float)a.b(d) / a.c(d)) - 10, (int)((float)a.d(d) / a.c(d)) - 10);
            a.e(d).loadDataWithBaseURL("blarg://ignored", view, "text/html", "UTF-8", "");
            (new o()).execute(new String[] {
                bq.a(c, "tag"), bq.a(c, "linkCode"), a
            });
            return;
        }
        // Misplaced declaration of an exception variable
        catch (View view)
        {
            view.printStackTrace();
        }
        p.c("PopoverWindow", "Error displaying popover", new Object[] {
            view
        });
    }
}
