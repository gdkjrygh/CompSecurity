// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.ImageView;
import android.widget.ListView;
import com.spotify.android.paste.widget.prettylist.StickyListView;
import java.util.LinkedList;

public class diu extends ViewGroup
    implements dir
{

    private static final Property k = new Property(java/lang/Float, "filterModeLevel") {

        public final Object get(Object obj)
        {
            return Float.valueOf(diu.a((diu)obj));
        }

        public final void set(Object obj, Object obj1)
        {
            diu.a((diu)obj, ((Float)obj1).floatValue());
        }

    };
    private final StickyListView a;
    private final dip b;
    private int c;
    private int d;
    private View e;
    private View f;
    private float g;
    private boolean h;
    private boolean i;
    private Animator j;
    private final AnimatorListenerAdapter l = new AnimatorListenerAdapter() {

        private diu a;

        public final void onAnimationCancel(Animator animator)
        {
            diu.b(a);
        }

        public final void onAnimationEnd(Animator animator)
        {
            diu.b(a);
        }

            
            {
                a = diu.this;
                super();
            }
    };
    private final diy m = new diy() {

        private diu a;

        public final void a(int j1, float f1)
        {
            diu.a(a, j1);
            diu.c(a).a(j1, f1);
            if (!diu.d(a))
            {
                diu.e(a);
                diu.f(a);
                diu.g(a);
            }
        }

            
            {
                a = diu.this;
                super();
            }
    };

    public diu(Context context, View view, int i1)
    {
        super(context);
        c = i1;
        a = new StickyListView(context);
        StickyListView stickylistview = a;
        diy diy = m;
        stickylistview.d.add(diy);
        b = new dip(context, view);
        b.c(c);
        a.a(b);
        a.b(c);
        addView(a);
        a(true);
    }

    static float a(diu diu1)
    {
        return diu1.g;
    }

    static int a(diu diu1, int i1)
    {
        diu1.d = i1;
        return i1;
    }

    private void a(float f1)
    {
        if (j != null)
        {
            j.cancel();
            j = null;
        }
        i = true;
        float f2 = Math.abs(f1 - g);
        j = ObjectAnimator.ofFloat(this, k, new float[] {
            g, f1
        });
        j.setDuration((long)(f2 * 400F));
        j.addListener(l);
        j.start();
    }

    static void a(diu diu1, float f1)
    {
        diu1.g = f1;
        diu1.k();
        diu1.l();
        diu1.m();
    }

    static boolean b(diu diu1)
    {
        diu1.i = false;
        return false;
    }

    static dip c(diu diu1)
    {
        return diu1.b;
    }

    static boolean d(diu diu1)
    {
        return diu1.i;
    }

    static void e(diu diu1)
    {
        diu1.k();
    }

    static void f(diu diu1)
    {
        diu1.l();
    }

    static void g(diu diu1)
    {
        diu1.m();
    }

    private boolean h()
    {
        return i && h;
    }

    private boolean i()
    {
        return i && !h;
    }

    private int j()
    {
        int i1 = 0;
        if (e == null)
        {
            return 0;
        }
        int j1 = e.getMeasuredHeight();
        float f1 = (float)d / (float)j1;
        if (h())
        {
            f1 = 0.0F;
        }
        if (f1 <= 1.0F)
        {
            f1 = dis.a(dis.a(dis.a(f1, 0.0F, 1.0F), 0.0F, 1.0F, 1.0F, 0.4F), 0.0F, 1.0F, 0.0F, c);
        } else
        {
            if (f != null)
            {
                i1 = f.getMeasuredHeight();
            }
            f1 = b.getMeasuredHeight() - i1 / 2 - d - j1;
        }
        return (int)f1;
    }

    private void k()
    {
        if (e == null)
        {
            return;
        } else
        {
            e.offsetTopAndBottom(j() - e.getTop());
            return;
        }
    }

    private void l()
    {
        float f2;
        f2 = 0.0F;
        if (e == null)
        {
            return;
        }
        if (!h()) goto _L2; else goto _L1
_L1:
        float f1 = 1.0F;
_L3:
        int i1;
        if (f1 < 0.01F && !h)
        {
            e.setVisibility(4);
        } else
        {
            e.setVisibility(0);
        }
        e.setAlpha(f1);
        return;
        f1 = Math.max(f1, f2);
          goto _L3
_L2:
        if (e == null)
        {
            f1 = 0.0F;
        } else
        {
            i1 = e.getMeasuredHeight();
            f1 = dis.a(dis.a((float)d / (float)i1, 0.75F, 0.1F, 0.0F, 1.0F), 0.0F, 1.0F);
        }
        if (e != null && (h || i()))
        {
            i1 = e.getMeasuredHeight();
            f2 = dis.a(dis.a((float)Math.max(0, a.c - d) / (float)i1, 1.5F, 0.5F, 0.0F, 1.0F), 0.0F, 1.0F) * g;
        }
        break MISSING_BLOCK_LABEL_66;
    }

    private void m()
    {
        View view;
        if (f == null)
        {
            return;
        }
        view = f;
        if (e != null) goto _L2; else goto _L1
_L1:
        float f1 = 1.0F;
_L4:
        view.setAlpha(f1);
        return;
_L2:
        if (!h && !i())
        {
            f1 = 1.0F;
        } else
        {
            int i1 = e.getMeasuredHeight();
            float f2 = dis.a(dis.a((float)Math.max(0, a.c - d) / (float)i1, 2.0F, 1.0F, 1.0F, 0.0F), 0.0F, 1.0F);
            f1 = f2;
            if (i)
            {
                f1 = Math.max(f2, 1.0F - g);
            }
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public final StickyListView a()
    {
        return a;
    }

    public final void a(int i1)
    {
        a.a(i1);
    }

    public final void a(View view)
    {
        f = view;
        b.a(view);
        a.b(view);
        if (view != null)
        {
            m();
        }
    }

    public final void a(dii dii)
    {
        b.a(dii);
    }

    public final void a(String s)
    {
        b.a(s);
    }

    public final void a(boolean flag)
    {
        a.a(flag);
    }

    public final dip b()
    {
        return b;
    }

    public final void b(View view)
    {
        if (e != null)
        {
            removeView(e);
        }
        e = view;
        if (view != null)
        {
            addView(view);
            k();
            l();
        }
        requestLayout();
    }

    public final void b(boolean flag)
    {
        dix dix = a.a;
        int i1 = a.c;
        if (flag)
        {
            dix.smoothScrollToPositionFromTop(0, -i1);
            return;
        } else
        {
            dix.setSelectionFromTop(0, -i1);
            return;
        }
    }

    public final ListView c()
    {
        return a.a;
    }

    public final void c(boolean flag)
    {
        dix dix = a.a;
        int i1 = b.a.e();
        if (flag)
        {
            dix.smoothScrollToPositionFromTop(0, -i1);
            return;
        } else
        {
            dix.setSelectionFromTop(0, -i1);
            return;
        }
    }

    public final ImageView d()
    {
        return b.a();
    }

    public final void e()
    {
        if (e != null)
        {
            if (h)
            {
                if (!a.b)
                {
                    b(true);
                    return;
                }
            } else
            {
                h = true;
                int j1 = e.getMeasuredHeight();
                int i1 = 0;
                if (f != null)
                {
                    i1 = f.getMeasuredHeight();
                }
                a.b((j1 + c) - i1 / 2);
                a(1.0F);
                e.offsetTopAndBottom(j() - e.getTop());
                b(true);
                return;
            }
        }
    }

    public final void f()
    {
        if (e == null || !h)
        {
            return;
        } else
        {
            h = false;
            e.clearFocus();
            ((InputMethodManager)getContext().getSystemService("input_method")).hideSoftInputFromWindow(getWindowToken(), 0);
            a.b(c);
            a(0.0F);
            return;
        }
    }

    public final View g()
    {
        return this;
    }

    protected void onLayout(boolean flag, int i1, int j1, int k1, int l1)
    {
        i1 = k1 - i1;
        a.layout(0, 0, i1, l1 - j1);
        if (e != null)
        {
            j1 = j();
            e.layout(0, j1, i1, e.getMeasuredHeight() + j1);
        }
    }

    protected void onMeasure(int i1, int j1)
    {
        boolean flag = false;
        if (android.view.View.MeasureSpec.getMode(i1) == 0)
        {
            throw new RuntimeException((new StringBuilder()).append(diu.getSimpleName()).append(" doesn't support unspecified width.").toString());
        }
        int k1 = android.view.View.MeasureSpec.getSize(i1);
        i1 = ((flag) ? 1 : 0);
        if (e != null)
        {
            e.measure(android.view.View.MeasureSpec.makeMeasureSpec(getWidth(), 0x40000000), android.view.View.MeasureSpec.makeMeasureSpec(0, 0));
            i1 = e.getMeasuredHeight();
        }
        b.a.c(i1);
        a.measure(android.view.View.MeasureSpec.makeMeasureSpec(k1, 0x40000000), j1);
        setMeasuredDimension(k1, a.getMeasuredHeight());
    }

}
