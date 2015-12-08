// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.design.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.support.v4.view.af;
import android.support.v4.view.x;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import java.util.List;

// Referenced classes of package android.support.design.widget:
//            j, i, h, g, 
//            AppBarLayout, s, a, CoordinatorLayout, 
//            m

public class FloatingActionButton extends ImageView
{
    public static class Behavior extends CoordinatorLayout.b
    {

        private static final boolean a;
        private Rect b;

        private boolean a(CoordinatorLayout coordinatorlayout, AppBarLayout appbarlayout, FloatingActionButton floatingactionbutton)
        {
            if (((CoordinatorLayout.d)floatingactionbutton.getLayoutParams()).f != appbarlayout.getId())
            {
                return false;
            }
            if (b == null)
            {
                b = new Rect();
            }
            Rect rect = b;
            s.a(coordinatorlayout, appbarlayout, rect);
            if (rect.bottom <= appbarlayout.f())
            {
                floatingactionbutton.b();
            } else
            {
                floatingactionbutton.a();
            }
            return true;
        }

        public final void a(View view, View view1)
        {
            view = (FloatingActionButton)view;
            if ((view1 instanceof Snackbar.SnackbarLayout) && x.p(view) != 0.0F)
            {
                x.s(view).c(0.0F).b().c().a(1.0F).a(a.b).a(null);
            }
        }

        public final boolean a(CoordinatorLayout coordinatorlayout, View view, int k)
        {
            Object obj;
            boolean flag;
            flag = false;
            view = (FloatingActionButton)view;
            obj = coordinatorlayout.b(view);
            int j1 = ((List) (obj)).size();
            int l = 0;
            do
            {
                if (l >= j1)
                {
                    break;
                }
                View view1 = (View)((List) (obj)).get(l);
                if ((view1 instanceof AppBarLayout) && a(coordinatorlayout, (AppBarLayout)view1, ((FloatingActionButton) (view))))
                {
                    break;
                }
                l++;
            } while (true);
            coordinatorlayout.a(view, k);
            obj = FloatingActionButton.a(view);
            if (obj == null || ((Rect) (obj)).centerX() <= 0 || ((Rect) (obj)).centerY() <= 0) goto _L2; else goto _L1
_L1:
            CoordinatorLayout.d d1 = (CoordinatorLayout.d)view.getLayoutParams();
            int i1;
            if (view.getRight() >= coordinatorlayout.getWidth() - d1.rightMargin)
            {
                k = ((Rect) (obj)).right;
            } else
            if (view.getLeft() <= d1.leftMargin)
            {
                k = -((Rect) (obj)).left;
            } else
            {
                k = 0;
            }
            if (view.getBottom() < coordinatorlayout.getBottom() - d1.bottomMargin) goto _L4; else goto _L3
_L3:
            i1 = ((Rect) (obj)).bottom;
_L6:
            view.offsetTopAndBottom(i1);
            view.offsetLeftAndRight(k);
_L2:
            return true;
_L4:
            i1 = ((flag) ? 1 : 0);
            if (view.getTop() <= d1.topMargin)
            {
                i1 = -((Rect) (obj)).top;
            }
            if (true) goto _L6; else goto _L5
_L5:
        }

        public final volatile boolean a(View view)
        {
            return a && (view instanceof Snackbar.SnackbarLayout);
        }

        public final boolean b(CoordinatorLayout coordinatorlayout, View view, View view1)
        {
            view = (FloatingActionButton)view;
            if (view1 instanceof Snackbar.SnackbarLayout)
            {
                if (view.getVisibility() == 0)
                {
                    float f1 = 0.0F;
                    view1 = coordinatorlayout.b(view);
                    int l = view1.size();
                    for (int k = 0; k < l; k++)
                    {
                        View view2 = (View)view1.get(k);
                        if ((view2 instanceof Snackbar.SnackbarLayout) && coordinatorlayout.a(view, view2))
                        {
                            f1 = Math.min(f1, x.p(view2) - (float)view2.getHeight());
                        }
                    }

                    x.b(view, f1);
                }
            } else
            if (view1 instanceof AppBarLayout)
            {
                a(coordinatorlayout, (AppBarLayout)view1, view);
                return false;
            }
            return false;
        }

        static 
        {
            boolean flag;
            if (android.os.Build.VERSION.SDK_INT >= 11)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            a = flag;
        }

        public Behavior()
        {
        }
    }


    private ColorStateList a;
    private android.graphics.PorterDuff.Mode b;
    private int c;
    private int d;
    private int e;
    private int f;
    private final Rect g;
    private final i h;

    public FloatingActionButton(Context context)
    {
        this(context, null);
    }

    public FloatingActionButton(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0);
    }

    public FloatingActionButton(Context context, AttributeSet attributeset, int k)
    {
        TypedArray typedarray;
        super(context, attributeset, k);
        g = new Rect();
        typedarray = context.obtainStyledAttributes(attributeset, android.support.design.a.i.FloatingActionButton, k, android.support.design.a.h.Widget_Design_FloatingActionButton);
        attributeset = typedarray.getDrawable(android.support.design.a.i.FloatingActionButton_android_background);
        a = typedarray.getColorStateList(android.support.design.a.i.FloatingActionButton_backgroundTint);
        typedarray.getInt(android.support.design.a.i.FloatingActionButton_backgroundTintMode, -1);
        JVM INSTR lookupswitch 5: default 112
    //                   3: 289
    //                   5: 296
    //                   9: 303
    //                   14: 310
    //                   15: 317;
           goto _L1 _L2 _L3 _L4 _L5 _L6
_L6:
        break MISSING_BLOCK_LABEL_317;
_L1:
        context = null;
_L7:
        b = context;
        d = typedarray.getColor(android.support.design.a.i.FloatingActionButton_rippleColor, 0);
        e = typedarray.getInt(android.support.design.a.i.FloatingActionButton_fabSize, 0);
        c = typedarray.getDimensionPixelSize(android.support.design.a.i.FloatingActionButton_borderWidth, 0);
        float f1 = typedarray.getDimension(android.support.design.a.i.FloatingActionButton_elevation, 0.0F);
        float f2 = typedarray.getDimension(android.support.design.a.i.FloatingActionButton_pressedTranslationZ, 0.0F);
        typedarray.recycle();
        context = new m() {

            final FloatingActionButton a;

            public final float a()
            {
                return (float)a.c() / 2.0F;
            }

            public final void a(int l, int i1, int j1, int k1)
            {
                FloatingActionButton.a(a).set(l, i1, j1, k1);
                a.setPadding(FloatingActionButton.b(a) + l, FloatingActionButton.b(a) + i1, FloatingActionButton.b(a) + j1, FloatingActionButton.b(a) + k1);
            }

            public final void a(Drawable drawable)
            {
                FloatingActionButton.a(a, drawable);
            }

            
            {
                a = FloatingActionButton.this;
                super();
            }
        };
        k = android.os.Build.VERSION.SDK_INT;
        if (k >= 21)
        {
            h = new j(this, context);
        } else
        if (k >= 12)
        {
            h = new h(this, context);
        } else
        {
            h = new g(this, context);
        }
        k = (int)getResources().getDimension(android.support.design.a.d.design_fab_content_size);
        f = (c() - k) / 2;
        h.a(attributeset, a, b, d, c);
        h.a(f1);
        h.b(f2);
        setClickable(true);
        return;
_L2:
        context = android.graphics.PorterDuff.Mode.SRC_OVER;
          goto _L7
_L3:
        context = android.graphics.PorterDuff.Mode.SRC_IN;
          goto _L7
_L4:
        context = android.graphics.PorterDuff.Mode.SRC_ATOP;
          goto _L7
_L5:
        context = android.graphics.PorterDuff.Mode.MULTIPLY;
          goto _L7
        context = android.graphics.PorterDuff.Mode.SCREEN;
          goto _L7
    }

    private static int a(int k, int l)
    {
        int i1 = android.view.View.MeasureSpec.getMode(l);
        l = android.view.View.MeasureSpec.getSize(l);
        switch (i1)
        {
        default:
            return k;

        case 0: // '\0'
            return k;

        case -2147483648: 
            return Math.min(k, l);

        case 1073741824: 
            return l;
        }
    }

    static Rect a(FloatingActionButton floatingactionbutton)
    {
        return floatingactionbutton.g;
    }

    static void a(FloatingActionButton floatingactionbutton, Drawable drawable)
    {
        floatingactionbutton.View.setBackgroundDrawable(drawable);
    }

    static int b(FloatingActionButton floatingactionbutton)
    {
        return floatingactionbutton.f;
    }

    public final void a()
    {
        h.c();
    }

    public final void b()
    {
        h.b();
    }

    final int c()
    {
        switch (e)
        {
        default:
            return getResources().getDimensionPixelSize(android.support.design.a.d.design_fab_size_normal);

        case 1: // '\001'
            return getResources().getDimensionPixelSize(android.support.design.a.d.design_fab_size_mini);
        }
    }

    protected void drawableStateChanged()
    {
        super.drawableStateChanged();
        h.a(getDrawableState());
    }

    public ColorStateList getBackgroundTintList()
    {
        return a;
    }

    public android.graphics.PorterDuff.Mode getBackgroundTintMode()
    {
        return b;
    }

    public void jumpDrawablesToCurrentState()
    {
        super.jumpDrawablesToCurrentState();
        h.a();
    }

    protected void onMeasure(int k, int l)
    {
        int i1 = c();
        k = Math.min(a(i1, k), a(i1, l));
        setMeasuredDimension(g.left + k + g.right, g.top + k + g.bottom);
    }

    public void setBackgroundDrawable(Drawable drawable)
    {
        if (h != null)
        {
            h.a(drawable, a, b, d, c);
        }
    }

    public void setBackgroundTintList(ColorStateList colorstatelist)
    {
        if (a != colorstatelist)
        {
            a = colorstatelist;
            h.a(colorstatelist);
        }
    }

    public void setBackgroundTintMode(android.graphics.PorterDuff.Mode mode)
    {
        if (b != mode)
        {
            b = mode;
            h.a(mode);
        }
    }

    public void setRippleColor(int k)
    {
        if (d != k)
        {
            d = k;
            h.a(k);
        }
    }
}
