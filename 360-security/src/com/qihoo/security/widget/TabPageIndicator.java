// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.view.ViewPager;
import android.support.v4.view.o;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.qihoo.security.locale.widget.LocaleTextView;
import java.util.Locale;

// Referenced classes of package com.qihoo.security.widget:
//            b, MaterialRippleLayout, c

public class TabPageIndicator extends HorizontalScrollView
    implements com.qihoo.security.widget.b
{
    static class SavedState extends android.view.View.BaseSavedState
    {

        public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

            public SavedState a(Parcel parcel)
            {
                return new SavedState(parcel);
            }

            public SavedState[] a(int i1)
            {
                return new SavedState[i1];
            }

            public Object createFromParcel(Parcel parcel)
            {
                return a(parcel);
            }

            public Object[] newArray(int i1)
            {
                return a(i1);
            }

        };
        int a;

        public void writeToParcel(Parcel parcel, int i1)
        {
            super.writeToParcel(parcel, i1);
            parcel.writeInt(a);
        }


        private SavedState(Parcel parcel)
        {
            super(parcel);
            a = parcel.readInt();
        }


        public SavedState(Parcelable parcelable)
        {
            super(parcelable);
        }
    }

    public static interface a
    {

        public abstract int a(int i1);
    }

    public static interface b
    {

        public abstract boolean a(int i1, View view);
    }

    public static interface c
    {

        public abstract int a(int i1);
    }


    private static final int b[] = {
        0x1010095, 0x1010098
    };
    private Typeface A;
    private int B;
    private int C;
    private int D;
    private final boolean E;
    private boolean F;
    private b G;
    private boolean H;
    private boolean I;
    private Locale J;
    public android.support.v4.view.ViewPager.e a;
    private final android.widget.LinearLayout.LayoutParams c;
    private final android.widget.LinearLayout.LayoutParams d;
    private final LinearLayout e;
    private ViewPager f;
    private int g;
    private int h;
    private float i;
    private final Paint j;
    private final Paint k;
    private int l;
    private int m;
    private int n;
    private boolean o;
    private boolean p;
    private boolean q;
    private int r;
    private int s;
    private int t;
    private int u;
    private int v;
    private int w;
    private int x;
    private int y;
    private final int z;

    public TabPageIndicator(Context context)
    {
        this(context, null);
    }

    public TabPageIndicator(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0);
    }

    public TabPageIndicator(Context context, AttributeSet attributeset, int i1)
    {
        super(context, attributeset, i1);
        h = 0;
        i = 0.0F;
        l = -115;
        m = 0;
        n = 0x1a000000;
        o = true;
        p = true;
        q = true;
        r = 52;
        s = 2;
        t = 2;
        u = 12;
        v = 10;
        w = 1;
        x = 14;
        y = -1;
        z = 0x86ffffff;
        A = null;
        B = 1;
        C = 0;
        D = 0x7f020105;
        E = true;
        F = false;
        H = false;
        I = true;
        setFillViewport(true);
        setWillNotDraw(false);
        e = new LinearLayout(context);
        e.setOrientation(0);
        e.setLayoutParams(new android.widget.FrameLayout.LayoutParams(-1, -1));
        addView(e);
        Object obj = getResources().getDisplayMetrics();
        r = (int)TypedValue.applyDimension(1, r, ((android.util.DisplayMetrics) (obj)));
        s = (int)TypedValue.applyDimension(1, s, ((android.util.DisplayMetrics) (obj)));
        t = (int)TypedValue.applyDimension(1, t, ((android.util.DisplayMetrics) (obj)));
        u = (int)TypedValue.applyDimension(1, u, ((android.util.DisplayMetrics) (obj)));
        v = (int)TypedValue.applyDimension(1, v, ((android.util.DisplayMetrics) (obj)));
        w = (int)TypedValue.applyDimension(1, w, ((android.util.DisplayMetrics) (obj)));
        x = (int)TypedValue.applyDimension(2, x, ((android.util.DisplayMetrics) (obj)));
        obj = context.obtainStyledAttributes(attributeset, b);
        x = ((TypedArray) (obj)).getDimensionPixelSize(0, x);
        y = ((TypedArray) (obj)).getColor(1, y);
        ((TypedArray) (obj)).recycle();
        context = context.obtainStyledAttributes(attributeset, com.qihoo.security.lite.a.a.TabPageIndicator);
        l = context.getColor(0, l);
        m = context.getColor(1, m);
        n = context.getColor(2, n);
        s = context.getDimensionPixelSize(3, s);
        t = context.getDimensionPixelSize(4, t);
        u = context.getDimensionPixelSize(5, u);
        v = context.getDimensionPixelSize(6, v);
        D = context.getResourceId(8, D);
        p = context.getBoolean(9, p);
        r = context.getDimensionPixelSize(7, r);
        q = context.getBoolean(10, q);
        F = context.getBoolean(11, F);
        context.recycle();
        j = new Paint();
        j.setAntiAlias(true);
        j.setStyle(android.graphics.Paint.Style.FILL);
        k = new Paint();
        k.setAntiAlias(true);
        k.setStrokeWidth(w);
        c = new android.widget.LinearLayout.LayoutParams(-2, -1);
        d = new android.widget.LinearLayout.LayoutParams(0, -1, 1.0F);
        if (J == null)
        {
            J = getResources().getConfiguration().locale;
        }
    }

    static int a(TabPageIndicator tabpageindicator, int i1)
    {
        tabpageindicator.h = i1;
        return i1;
    }

    static ViewPager a(TabPageIndicator tabpageindicator)
    {
        return tabpageindicator.f;
    }

    private void a(int i1, int j1)
    {
        ImageButton imagebutton = new ImageButton(getContext());
        imagebutton.setImageResource(j1);
        a(i1, ((View) (imagebutton)));
    }

    private void a(int i1, View view)
    {
        view.setFocusable(true);
        view.setOnClickListener(new android.view.View.OnClickListener(i1) {

            final int a;
            final TabPageIndicator b;

            public void onClick(View view1)
            {
                if (TabPageIndicator.c(b))
                {
                    TabPageIndicator.a(b).a(a, true);
                } else
                {
                    TabPageIndicator.a(b).a(a, false);
                }
                if (TabPageIndicator.d(b) != null)
                {
                    TabPageIndicator.d(b).a(a, view1);
                }
            }

            
            {
                b = TabPageIndicator.this;
                a = i1;
                super();
            }
        });
        view.setPadding(v, 0, v, 0);
        LinearLayout linearlayout = e;
        android.widget.LinearLayout.LayoutParams layoutparams;
        if (p)
        {
            layoutparams = d;
        } else
        {
            layoutparams = c;
        }
        linearlayout.addView(view, i1, layoutparams);
    }

    private void a(int i1, String s1)
    {
        if (o)
        {
            MaterialRippleLayout materialripplelayout = new MaterialRippleLayout(getContext());
            materialripplelayout.setAvoidTwiceTouch(true);
            android.widget.FrameLayout.LayoutParams layoutparams = new android.widget.FrameLayout.LayoutParams(-1, -1);
            LocaleTextView localetextview1 = new LocaleTextView(getContext());
            localetextview1.setLocalText(s1);
            localetextview1.setGravity(17);
            localetextview1.setSingleLine();
            materialripplelayout.addView(localetextview1, layoutparams);
            a(i1, ((View) (materialripplelayout)));
            return;
        } else
        {
            LocaleTextView localetextview = new LocaleTextView(getContext());
            localetextview.setLocalText(s1);
            localetextview.setGravity(17);
            localetextview.setSingleLine();
            a(i1, ((View) (localetextview)));
            return;
        }
    }

    private void a(int i1, String s1, int j1)
    {
        if (j1 == -1)
        {
            a(i1, s1);
            return;
        } else
        {
            LocaleTextView localetextview = new LocaleTextView(getContext());
            localetextview.setLocalText(s1);
            localetextview.setGravity(17);
            localetextview.setSingleLine();
            s1 = new ImageView(getContext());
            s1.setImageResource(j1);
            LinearLayout linearlayout = new LinearLayout(getContext());
            linearlayout.setOrientation(0);
            linearlayout.addView(localetextview, c);
            linearlayout.addView(s1, c);
            a(i1, ((View) (linearlayout)));
            return;
        }
    }

    static void a(TabPageIndicator tabpageindicator, int i1, int j1)
    {
        tabpageindicator.b(i1, j1);
    }

    static int b(TabPageIndicator tabpageindicator)
    {
        return tabpageindicator.h;
    }

    private void b()
    {
        for (int i1 = 0; i1 < g; i1++)
        {
            Object obj = e.getChildAt(i1);
            ((View) (obj)).setBackgroundResource(D);
            if (obj instanceof LinearLayout)
            {
                obj = ((LinearLayout)obj).getChildAt(0);
            }
            if (obj instanceof LocaleTextView)
            {
                LocaleTextView localetextview = (LocaleTextView)obj;
                localetextview.setTextSize(0, x);
                localetextview.setTypeface(A, B);
                localetextview.setTextColor(y);
                if (q)
                {
                    localetextview.setLocalText(localetextview.getText().toString().toUpperCase(J));
                }
            }
            if (!(obj instanceof FrameLayout))
            {
                continue;
            }
            obj = (LocaleTextView)((FrameLayout)obj).getChildAt(0);
            ((LocaleTextView) (obj)).setTextSize(0, x);
            ((LocaleTextView) (obj)).setTypeface(A, B);
            ((LocaleTextView) (obj)).setTextColor(y);
            if (q)
            {
                ((LocaleTextView) (obj)).setLocalText(((LocaleTextView) (obj)).getText().toString().toUpperCase(J));
            }
        }

    }

    private void b(int i1, int j1)
    {
        if (g != 0) goto _L2; else goto _L1
_L1:
        return;
_L2:
        int k1 = e.getChildAt(i1).getLeft() + j1;
        if (i1 <= 0)
        {
            i1 = k1;
            if (j1 <= 0)
            {
                continue; /* Loop/switch isn't completed */
            }
        }
        i1 = k1 - r;
        if (i1 == C) goto _L1; else goto _L3
_L3:
        C = i1;
        scrollTo(i1, 0);
        return;
    }

    private void c(int i1)
    {
        int j1 = 0;
        while (j1 < g) 
        {
            Object obj = e.getChildAt(j1);
            if (obj instanceof LinearLayout)
            {
                obj = ((LinearLayout)obj).getChildAt(0);
            }
            if (obj instanceof LocaleTextView)
            {
                LocaleTextView localetextview = (LocaleTextView)obj;
                if (j1 == i1)
                {
                    localetextview.setTextColor(y);
                } else
                {
                    localetextview.setTextColor(0x86ffffff);
                }
            }
            if (!(obj instanceof FrameLayout))
            {
                continue;
            }
            obj = (LocaleTextView)((FrameLayout)obj).getChildAt(0);
            if (j1 == i1)
            {
                ((LocaleTextView) (obj)).setTextColor(y);
            } else
            {
                ((LocaleTextView) (obj)).setTextColor(0x86ffffff);
            }
            if (q)
            {
                ((LocaleTextView) (obj)).setLocalText(((LocaleTextView) (obj)).getText().toString().toUpperCase(J));
            }
            j1++;
        }
    }

    static boolean c(TabPageIndicator tabpageindicator)
    {
        return tabpageindicator.H;
    }

    static b d(TabPageIndicator tabpageindicator)
    {
        return tabpageindicator.G;
    }

    public void a()
    {
        e.removeAllViews();
        g = f.getAdapter().b();
        int i1 = 0;
        while (i1 < g) 
        {
            if (f.getAdapter() instanceof c)
            {
                a(i1, f.getAdapter().c(i1).toString(), ((c)f.getAdapter()).a(i1));
            } else
            if (f.getAdapter() instanceof a)
            {
                a(i1, ((a)f.getAdapter()).a(i1));
            } else
            {
                a(i1, f.getAdapter().c(i1).toString());
            }
            i1++;
        }
        b();
        getViewTreeObserver().addOnGlobalLayoutListener(new android.view.ViewTreeObserver.OnGlobalLayoutListener() {

            final TabPageIndicator a;

            public void onGlobalLayout()
            {
                a.getViewTreeObserver().removeGlobalOnLayoutListener(this);
                TabPageIndicator.a(a, TabPageIndicator.a(a).getCurrentItem());
                TabPageIndicator.a(a, TabPageIndicator.b(a), 0);
            }

            
            {
                a = TabPageIndicator.this;
                super();
            }
        });
    }

    public void a(int i1)
    {
        if (a != null)
        {
            a.a(i1);
        }
        c(i1);
    }

    public void a(int i1, float f1, int j1)
    {
        h = i1;
        i = f1;
        b(i1, (int)((float)e.getChildAt(i1).getWidth() * f1));
        invalidate();
        if (a != null)
        {
            a.a(i1, f1, j1);
        }
    }

    public void a(ViewPager viewpager, com.qihoo.security.widget.c c1, int i1)
    {
        if (viewpager == null || c1 == null)
        {
            return;
        }
        if (viewpager.getAdapter() == null)
        {
            throw new IllegalStateException("ViewPager does not have adapter instance.");
        } else
        {
            f = viewpager;
            viewpager.setOnPageChangeListener(c1);
            c1.a(this);
            viewpager.a(i1, false);
            setCurrentItem(i1);
            a();
            return;
        }
    }

    public void b(int i1)
    {
        if (i1 == 0)
        {
            b(f.getCurrentItem(), 0);
        }
        if (a != null)
        {
            a.b(i1);
        }
    }

    public boolean dispatchTouchEvent(MotionEvent motionevent)
    {
        if (I)
        {
            return super.dispatchTouchEvent(motionevent);
        } else
        {
            return false;
        }
    }

    public int getDividerColor()
    {
        return n;
    }

    public int getDividerPadding()
    {
        return u;
    }

    public int getIndicatorColor()
    {
        return l;
    }

    public int getIndicatorHeight()
    {
        return s;
    }

    public int getScrollOffset()
    {
        return r;
    }

    public boolean getShouldExpand()
    {
        return p;
    }

    public int getTabPaddingLeftRight()
    {
        return v;
    }

    public int getTextColor()
    {
        return y;
    }

    public int getTextSize()
    {
        return x;
    }

    public int getUnderlineColor()
    {
        return m;
    }

    public int getUnderlineHeight()
    {
        return t;
    }

    protected void onDraw(Canvas canvas)
    {
        super.onDraw(canvas);
        if (!isInEditMode() && g != 0) goto _L2; else goto _L1
_L1:
        return;
_L2:
        int j1 = getHeight();
        j.setColor(l);
        View view = e.getChildAt(h);
        float f4 = view.getLeft();
        float f3 = view.getRight();
        float f2 = f4;
        float f1 = f3;
        if (i > 0.0F)
        {
            f2 = f4;
            f1 = f3;
            if (h < g - 1)
            {
                View view1 = e.getChildAt(h + 1);
                f2 = view1.getLeft();
                f1 = view1.getRight();
                float f5 = i;
                f2 = f4 * (1.0F - i) + f2 * f5;
                f1 = f1 * i + (1.0F - i) * f3;
            }
        }
        canvas.drawRect(f2, j1 - s, f1, j1, j);
        j.setColor(m);
        canvas.drawRect(0.0F, j1 - t, e.getWidth(), j1, j);
        if (F)
        {
            k.setColor(n);
            int i1 = 0;
            while (i1 < g - 1) 
            {
                View view2 = e.getChildAt(i1);
                canvas.drawLine(view2.getRight(), u, view2.getRight(), j1 - u, k);
                i1++;
            }
        }
        if (true) goto _L1; else goto _L3
_L3:
    }

    public void onRestoreInstanceState(Parcelable parcelable)
    {
        parcelable = (SavedState)parcelable;
        super.onRestoreInstanceState(parcelable.getSuperState());
        h = ((SavedState) (parcelable)).a;
        requestLayout();
    }

    public Parcelable onSaveInstanceState()
    {
        SavedState savedstate = new SavedState(super.onSaveInstanceState());
        savedstate.a = h;
        return savedstate;
    }

    public void setAllCaps(boolean flag)
    {
        q = flag;
    }

    public void setCanClick(boolean flag)
    {
        I = flag;
    }

    public void setCurrentItem(int i1)
    {
        if (f == null)
        {
            throw new IllegalStateException("ViewPager has not been bound.");
        } else
        {
            return;
        }
    }

    public void setDividerColor(int i1)
    {
        n = i1;
        invalidate();
    }

    public void setDividerColorResource(int i1)
    {
        n = getResources().getColor(i1);
        invalidate();
    }

    public void setDividerPadding(int i1)
    {
        u = i1;
        invalidate();
    }

    public void setIndicatorColor(int i1)
    {
        l = i1;
        invalidate();
    }

    public void setIndicatorColorResource(int i1)
    {
        l = getResources().getColor(i1);
        invalidate();
    }

    public void setIndicatorHeight(int i1)
    {
        s = i1;
        invalidate();
    }

    public void setOnPageChangeListener(android.support.v4.view.ViewPager.e e1)
    {
        a = e1;
    }

    public void setOnTabItemClickListener(b b1)
    {
        G = b1;
    }

    public void setScrollOffset(int i1)
    {
        r = i1;
        invalidate();
    }

    public void setShouldExpand(boolean flag)
    {
        p = flag;
        requestLayout();
    }

    public void setTabDefualtBackground(int i1)
    {
        D = i1;
    }

    public void setTabPaddingLeftRight(int i1)
    {
        v = i1;
        b();
    }

    public void setTabSmoothScroll(boolean flag)
    {
        H = flag;
    }

    public void setTextColor(int i1)
    {
        y = i1;
        b();
    }

    public void setTextColorResource(int i1)
    {
        y = getResources().getColor(i1);
        b();
    }

    public void setTextSize(int i1)
    {
        x = i1;
        b();
    }

    public void setUnderlineColor(int i1)
    {
        m = i1;
        invalidate();
    }

    public void setUnderlineColorResource(int i1)
    {
        m = getResources().getColor(i1);
        invalidate();
    }

    public void setUnderlineHeight(int i1)
    {
        t = i1;
        invalidate();
    }

}
