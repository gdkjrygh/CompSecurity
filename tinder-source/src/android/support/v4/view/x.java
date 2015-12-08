// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.view;

import android.animation.ValueAnimator;
import android.content.res.ColorStateList;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.v4.view.a.c;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.WeakHashMap;

// Referenced classes of package android.support.v4.view:
//            am, a, s, af, 
//            o, v, u, y, 
//            z, an

public final class x
{
    static class a
        implements k
    {

        WeakHashMap a;

        public void A(View view)
        {
        }

        public void B(View view)
        {
        }

        public boolean C(View view)
        {
            return false;
        }

        public boolean D(View view)
        {
            if (view instanceof o)
            {
                return ((o)view).isNestedScrollingEnabled();
            } else
            {
                return false;
            }
        }

        public void E(View view)
        {
            if (view instanceof o)
            {
                ((o)view).stopNestedScroll();
            }
        }

        public boolean F(View view)
        {
            return view.getWidth() > 0 && view.getHeight() > 0;
        }

        public float G(View view)
        {
            return y(view) + x(view);
        }

        public boolean H(View view)
        {
            return view.getWindowToken() != null;
        }

        public int a(int i1, int j1)
        {
            return i1 | j1;
        }

        public int a(int i1, int j1, int k1)
        {
            return View.resolveSize(i1, j1);
        }

        public int a(View view)
        {
            return 2;
        }

        long a()
        {
            return 10L;
        }

        public am a(View view, am am)
        {
            return am;
        }

        public void a(View view, float f1)
        {
        }

        public void a(View view, int i1, int j1, int k1, int l1)
        {
            view.invalidate(i1, j1, k1, l1);
        }

        public void a(View view, int i1, Paint paint)
        {
        }

        public void a(View view, ColorStateList colorstatelist)
        {
            if (view instanceof v)
            {
                ((v)view).setSupportBackgroundTintList(colorstatelist);
            }
        }

        public void a(View view, Paint paint)
        {
        }

        public void a(View view, android.graphics.PorterDuff.Mode mode)
        {
            if (view instanceof v)
            {
                ((v)view).setSupportBackgroundTintMode(mode);
            }
        }

        public void a(View view, android.support.v4.view.a.c c1)
        {
        }

        public void a(View view, android.support.v4.view.a a1)
        {
        }

        public void a(View view, s s1)
        {
        }

        public void a(View view, AccessibilityEvent accessibilityevent)
        {
        }

        public void a(View view, Runnable runnable)
        {
            view.postDelayed(runnable, a());
        }

        public void a(View view, Runnable runnable, long l1)
        {
            view.postDelayed(runnable, a() + l1);
        }

        public void a(View view, boolean flag)
        {
        }

        public void a(ViewGroup viewgroup)
        {
        }

        public boolean a(View view, int i1)
        {
            if (!(view instanceof u)) goto _L2; else goto _L1
_L1:
            int j1;
            int k1;
            view = (u)view;
            j1 = view.computeHorizontalScrollOffset();
            k1 = view.computeHorizontalScrollRange() - view.computeHorizontalScrollExtent();
            if (k1 == 0) goto _L4; else goto _L3
_L3:
            if (i1 >= 0) goto _L6; else goto _L5
_L5:
            if (j1 > 0)
            {
                i1 = 1;
            } else
            {
                i1 = 0;
            }
_L7:
            if (i1 != 0)
            {
                return true;
            }
            break; /* Loop/switch isn't completed */
_L6:
            if (j1 < k1 - 1)
            {
                i1 = 1;
                continue; /* Loop/switch isn't completed */
            }
_L4:
            i1 = 0;
            if (true) goto _L7; else goto _L2
_L2:
            return false;
        }

        public boolean a(View view, int i1, Bundle bundle)
        {
            return false;
        }

        public am b(View view, am am)
        {
            return am;
        }

        public void b(View view, float f1)
        {
        }

        public void b(View view, int i1, int j1, int k1, int l1)
        {
            view.setPadding(i1, j1, k1, l1);
        }

        public boolean b(View view)
        {
            return false;
        }

        public boolean b(View view, int i1)
        {
            if (!(view instanceof u)) goto _L2; else goto _L1
_L1:
            int j1;
            int k1;
            view = (u)view;
            j1 = view.computeVerticalScrollOffset();
            k1 = view.computeVerticalScrollRange() - view.computeVerticalScrollExtent();
            if (k1 == 0) goto _L4; else goto _L3
_L3:
            if (i1 >= 0) goto _L6; else goto _L5
_L5:
            if (j1 > 0)
            {
                i1 = 1;
            } else
            {
                i1 = 0;
            }
_L7:
            if (i1 != 0)
            {
                return true;
            }
            break; /* Loop/switch isn't completed */
_L6:
            if (j1 < k1 - 1)
            {
                i1 = 1;
                continue; /* Loop/switch isn't completed */
            }
_L4:
            i1 = 0;
            if (true) goto _L7; else goto _L2
_L2:
            return false;
        }

        public void c(View view, float f1)
        {
        }

        public void c(View view, int i1)
        {
        }

        public boolean c(View view)
        {
            return false;
        }

        public void d(View view)
        {
            view.invalidate();
        }

        public void d(View view, float f1)
        {
        }

        public void d(View view, int i1)
        {
        }

        public int e(View view)
        {
            return 0;
        }

        public void e(View view, float f1)
        {
        }

        public float f(View view)
        {
            return 1.0F;
        }

        public void f(View view, float f1)
        {
        }

        public int g(View view)
        {
            return 0;
        }

        public int h(View view)
        {
            return 0;
        }

        public ViewParent i(View view)
        {
            return view.getParent();
        }

        public boolean j(View view)
        {
            boolean flag1 = false;
            view = view.getBackground();
            boolean flag = flag1;
            if (view != null)
            {
                flag = flag1;
                if (view.getOpacity() == -1)
                {
                    flag = true;
                }
            }
            return flag;
        }

        public int k(View view)
        {
            return view.getMeasuredWidth();
        }

        public int l(View view)
        {
            return 0;
        }

        public int m(View view)
        {
            return view.getPaddingLeft();
        }

        public int n(View view)
        {
            return view.getPaddingRight();
        }

        public boolean o(View view)
        {
            return true;
        }

        public float p(View view)
        {
            return 0.0F;
        }

        public float q(View view)
        {
            return 0.0F;
        }

        public float r(View view)
        {
            return 0.0F;
        }

        public int s(View view)
        {
            return android.support.v4.view.y.a(view);
        }

        public int t(View view)
        {
            return android.support.v4.view.y.b(view);
        }

        public af u(View view)
        {
            return new af(view);
        }

        public int v(View view)
        {
            return 0;
        }

        public void w(View view)
        {
        }

        public float x(View view)
        {
            return 0.0F;
        }

        public float y(View view)
        {
            return 0.0F;
        }

        public boolean z(View view)
        {
            return false;
        }

        a()
        {
            a = null;
        }
    }

    static class b extends a
    {

        public final void a(ViewGroup viewgroup)
        {
            if (z.a == null)
            {
                try
                {
                    z.a = android/view/ViewGroup.getDeclaredMethod("setChildrenDrawingOrderEnabled", new Class[] {
                        Boolean.TYPE
                    });
                }
                catch (NoSuchMethodException nosuchmethodexception)
                {
                    Log.e("ViewCompat", "Unable to find childrenDrawingOrderEnabled", nosuchmethodexception);
                }
                z.a.setAccessible(true);
            }
            try
            {
                z.a.invoke(viewgroup, new Object[] {
                    Boolean.valueOf(true)
                });
                return;
            }
            // Misplaced declaration of an exception variable
            catch (ViewGroup viewgroup)
            {
                Log.e("ViewCompat", "Unable to invoke childrenDrawingOrderEnabled", viewgroup);
                return;
            }
            // Misplaced declaration of an exception variable
            catch (ViewGroup viewgroup)
            {
                Log.e("ViewCompat", "Unable to invoke childrenDrawingOrderEnabled", viewgroup);
                return;
            }
            // Misplaced declaration of an exception variable
            catch (ViewGroup viewgroup)
            {
                Log.e("ViewCompat", "Unable to invoke childrenDrawingOrderEnabled", viewgroup);
            }
        }

        public final boolean j(View view)
        {
            return view.isOpaque();
        }

        b()
        {
        }
    }

    static class c extends b
    {

        public final int a(View view)
        {
            return view.getOverScrollMode();
        }

        public final void c(View view, int i1)
        {
            view.setOverScrollMode(i1);
        }

        c()
        {
        }
    }

    static class d extends c
    {

        public final void A(View view)
        {
            view.jumpDrawablesToCurrentState();
        }

        public final void B(View view)
        {
            view.setSaveFromParentEnabled(false);
        }

        public final int a(int i1, int j1)
        {
            return View.combineMeasuredStates(i1, j1);
        }

        public final int a(int i1, int j1, int k1)
        {
            return View.resolveSizeAndState(i1, j1, k1);
        }

        final long a()
        {
            return ValueAnimator.getFrameDelay();
        }

        public final void a(View view, float f1)
        {
            view.setTranslationX(f1);
        }

        public final void a(View view, int i1, Paint paint)
        {
            view.setLayerType(i1, paint);
        }

        public void a(View view, Paint paint)
        {
            view.setLayerType(view.getLayerType(), paint);
            view.invalidate();
        }

        public final void a(View view, boolean flag)
        {
            view.setActivated(flag);
        }

        public final void b(View view, float f1)
        {
            view.setTranslationY(f1);
        }

        public final void c(View view, float f1)
        {
            view.setAlpha(f1);
        }

        public final void d(View view, float f1)
        {
            view.setScaleX(f1);
        }

        public final void e(View view, float f1)
        {
            view.setScaleY(f1);
        }

        public final float f(View view)
        {
            return view.getAlpha();
        }

        public final int g(View view)
        {
            return view.getLayerType();
        }

        public final int k(View view)
        {
            return view.getMeasuredWidthAndState();
        }

        public final int l(View view)
        {
            return view.getMeasuredState();
        }

        public final float p(View view)
        {
            return view.getTranslationX();
        }

        public final float q(View view)
        {
            return view.getTranslationY();
        }

        public final float r(View view)
        {
            return view.getScaleX();
        }

        d()
        {
        }
    }

    static class e extends d
    {

        static Field b;
        static boolean c = false;

        public final void a(View view, android.support.v4.view.a.c c1)
        {
            view.onInitializeAccessibilityNodeInfo((AccessibilityNodeInfo)c1.b);
        }

        public final void a(View view, android.support.v4.view.a a1)
        {
            if (a1 == null)
            {
                a1 = null;
            } else
            {
                a1 = ((android.support.v4.view.a) (a1.getBridge()));
            }
            view.setAccessibilityDelegate((android.view.View.AccessibilityDelegate)a1);
        }

        public final void a(View view, AccessibilityEvent accessibilityevent)
        {
            view.onInitializeAccessibilityEvent(accessibilityevent);
        }

        public final boolean a(View view, int i1)
        {
            return view.canScrollHorizontally(i1);
        }

        public final boolean b(View view)
        {
            if (!c)
            {
                if (b == null)
                {
                    try
                    {
                        Field field = android/view/View.getDeclaredField("mAccessibilityDelegate");
                        b = field;
                        field.setAccessible(true);
                    }
                    // Misplaced declaration of an exception variable
                    catch (View view)
                    {
                        c = true;
                        return false;
                    }
                }
                try
                {
                    view = ((View) (b.get(view)));
                }
                // Misplaced declaration of an exception variable
                catch (View view)
                {
                    c = true;
                    return false;
                }
                if (view != null)
                {
                    return true;
                }
            }
            return false;
        }

        public final boolean b(View view, int i1)
        {
            return view.canScrollVertically(i1);
        }

        public final af u(View view)
        {
            if (a == null)
            {
                a = new WeakHashMap();
            }
            af af2 = (af)a.get(view);
            af af1 = af2;
            if (af2 == null)
            {
                af1 = new af(view);
                a.put(view, af1);
            }
            return af1;
        }


        e()
        {
        }
    }

    static class f extends e
    {

        public final void a(View view, int i1, int j1, int k1, int l1)
        {
            view.postInvalidate(i1, j1, k1, l1);
        }

        public final void a(View view, Runnable runnable)
        {
            view.postOnAnimation(runnable);
        }

        public final void a(View view, Runnable runnable, long l1)
        {
            view.postOnAnimationDelayed(runnable, l1);
        }

        public final boolean a(View view, int i1, Bundle bundle)
        {
            return view.performAccessibilityAction(i1, bundle);
        }

        public final boolean c(View view)
        {
            return view.hasTransientState();
        }

        public final void d(View view)
        {
            view.postInvalidateOnAnimation();
        }

        public void d(View view, int i1)
        {
            int j1 = i1;
            if (i1 == 4)
            {
                j1 = 2;
            }
            view.setImportantForAccessibility(j1);
        }

        public final int e(View view)
        {
            return view.getImportantForAccessibility();
        }

        public final ViewParent i(View view)
        {
            return view.getParentForAccessibility();
        }

        public final boolean o(View view)
        {
            return view.hasOverlappingRendering();
        }

        public final int s(View view)
        {
            return view.getMinimumWidth();
        }

        public final int t(View view)
        {
            return view.getMinimumHeight();
        }

        public void w(View view)
        {
            view.requestFitSystemWindows();
        }

        public final boolean z(View view)
        {
            return view.getFitsSystemWindows();
        }

        f()
        {
        }
    }

    static class g extends f
    {

        public final boolean C(View view)
        {
            return view.isPaddingRelative();
        }

        public final void a(View view, Paint paint)
        {
            view.setLayerPaint(paint);
        }

        public final void b(View view, int i1, int j1, int k1, int l1)
        {
            view.setPaddingRelative(i1, j1, k1, l1);
        }

        public final int h(View view)
        {
            return view.getLayoutDirection();
        }

        public final int m(View view)
        {
            return view.getPaddingStart();
        }

        public final int n(View view)
        {
            return view.getPaddingEnd();
        }

        public final int v(View view)
        {
            return view.getWindowSystemUiVisibility();
        }

        g()
        {
        }
    }

    static class h extends g
    {

        h()
        {
        }
    }

    static class i extends h
    {

        public final boolean F(View view)
        {
            return view.isLaidOut();
        }

        public final boolean H(View view)
        {
            return view.isAttachedToWindow();
        }

        public final void d(View view, int i1)
        {
            view.setImportantForAccessibility(i1);
        }

        i()
        {
        }
    }

    static final class j extends i
    {

        public final boolean D(View view)
        {
            return view.isNestedScrollingEnabled();
        }

        public final void E(View view)
        {
            view.stopNestedScroll();
        }

        public final float G(View view)
        {
            return view.getZ();
        }

        public final am a(View view, am am)
        {
            Object obj = am;
            if (am instanceof an)
            {
                android.view.WindowInsets windowinsets = ((an)am).a;
                view = view.onApplyWindowInsets(windowinsets);
                obj = am;
                if (view != windowinsets)
                {
                    obj = new an(view);
                }
            }
            return ((am) (obj));
        }

        public final void a(View view, ColorStateList colorstatelist)
        {
            view.setBackgroundTintList(colorstatelist);
        }

        public final void a(View view, android.graphics.PorterDuff.Mode mode)
        {
            view.setBackgroundTintMode(mode);
        }

        public final void a(View view, s s1)
        {
            view.setOnApplyWindowInsetsListener(new aa._cls1(s1));
        }

        public final am b(View view, am am)
        {
            Object obj = am;
            if (am instanceof an)
            {
                android.view.WindowInsets windowinsets = ((an)am).a;
                view = view.dispatchApplyWindowInsets(windowinsets);
                obj = am;
                if (view != windowinsets)
                {
                    obj = new an(view);
                }
            }
            return ((am) (obj));
        }

        public final void f(View view, float f1)
        {
            view.setElevation(f1);
        }

        public final void w(View view)
        {
            view.requestApplyInsets();
        }

        public final float x(View view)
        {
            return view.getElevation();
        }

        public final float y(View view)
        {
            return view.getTranslationZ();
        }

        j()
        {
        }
    }

    static interface k
    {

        public abstract void A(View view);

        public abstract void B(View view);

        public abstract boolean C(View view);

        public abstract boolean D(View view);

        public abstract void E(View view);

        public abstract boolean F(View view);

        public abstract float G(View view);

        public abstract boolean H(View view);

        public abstract int a(int i1, int j1);

        public abstract int a(int i1, int j1, int k1);

        public abstract int a(View view);

        public abstract am a(View view, am am);

        public abstract void a(View view, float f1);

        public abstract void a(View view, int i1, int j1, int k1, int l1);

        public abstract void a(View view, int i1, Paint paint);

        public abstract void a(View view, ColorStateList colorstatelist);

        public abstract void a(View view, Paint paint);

        public abstract void a(View view, android.graphics.PorterDuff.Mode mode);

        public abstract void a(View view, android.support.v4.view.a.c c1);

        public abstract void a(View view, android.support.v4.view.a a1);

        public abstract void a(View view, s s1);

        public abstract void a(View view, AccessibilityEvent accessibilityevent);

        public abstract void a(View view, Runnable runnable);

        public abstract void a(View view, Runnable runnable, long l1);

        public abstract void a(View view, boolean flag);

        public abstract void a(ViewGroup viewgroup);

        public abstract boolean a(View view, int i1);

        public abstract boolean a(View view, int i1, Bundle bundle);

        public abstract am b(View view, am am);

        public abstract void b(View view, float f1);

        public abstract void b(View view, int i1, int j1, int k1, int l1);

        public abstract boolean b(View view);

        public abstract boolean b(View view, int i1);

        public abstract void c(View view, float f1);

        public abstract void c(View view, int i1);

        public abstract boolean c(View view);

        public abstract void d(View view);

        public abstract void d(View view, float f1);

        public abstract void d(View view, int i1);

        public abstract int e(View view);

        public abstract void e(View view, float f1);

        public abstract float f(View view);

        public abstract void f(View view, float f1);

        public abstract int g(View view);

        public abstract int h(View view);

        public abstract ViewParent i(View view);

        public abstract boolean j(View view);

        public abstract int k(View view);

        public abstract int l(View view);

        public abstract int m(View view);

        public abstract int n(View view);

        public abstract boolean o(View view);

        public abstract float p(View view);

        public abstract float q(View view);

        public abstract float r(View view);

        public abstract int s(View view);

        public abstract int t(View view);

        public abstract af u(View view);

        public abstract int v(View view);

        public abstract void w(View view);

        public abstract float x(View view);

        public abstract boolean z(View view);
    }


    static final k a;

    public static boolean A(View view)
    {
        return a.o(view);
    }

    public static boolean B(View view)
    {
        return a.C(view);
    }

    public static boolean C(View view)
    {
        return a.D(view);
    }

    public static void D(View view)
    {
        a.E(view);
    }

    public static boolean E(View view)
    {
        return a.F(view);
    }

    public static float F(View view)
    {
        return a.G(view);
    }

    public static boolean G(View view)
    {
        return a.H(view);
    }

    public static int a(int i1, int j1)
    {
        return a.a(i1, j1);
    }

    public static int a(int i1, int j1, int k1)
    {
        return a.a(i1, j1, k1);
    }

    public static int a(View view)
    {
        return a.a(view);
    }

    public static am a(View view, am am)
    {
        return a.a(view, am);
    }

    public static void a(View view, float f1)
    {
        a.a(view, f1);
    }

    public static void a(View view, int i1, int j1, int k1, int l1)
    {
        a.a(view, i1, j1, k1, l1);
    }

    public static void a(View view, int i1, Paint paint)
    {
        a.a(view, i1, paint);
    }

    public static void a(View view, ColorStateList colorstatelist)
    {
        a.a(view, colorstatelist);
    }

    public static void a(View view, Paint paint)
    {
        a.a(view, paint);
    }

    public static void a(View view, android.graphics.PorterDuff.Mode mode)
    {
        a.a(view, mode);
    }

    public static void a(View view, android.support.v4.view.a.c c1)
    {
        a.a(view, c1);
    }

    public static void a(View view, android.support.v4.view.a a1)
    {
        a.a(view, a1);
    }

    public static void a(View view, s s1)
    {
        a.a(view, s1);
    }

    public static void a(View view, AccessibilityEvent accessibilityevent)
    {
        a.a(view, accessibilityevent);
    }

    public static void a(View view, Runnable runnable)
    {
        a.a(view, runnable);
    }

    public static void a(View view, Runnable runnable, long l1)
    {
        a.a(view, runnable, l1);
    }

    public static void a(View view, boolean flag)
    {
        a.a(view, flag);
    }

    public static void a(ViewGroup viewgroup)
    {
        a.a(viewgroup);
    }

    public static boolean a(View view, int i1)
    {
        return a.a(view, i1);
    }

    public static boolean a(View view, int i1, Bundle bundle)
    {
        return a.a(view, i1, bundle);
    }

    public static am b(View view, am am)
    {
        return a.b(view, am);
    }

    public static void b(View view, float f1)
    {
        a.b(view, f1);
    }

    public static void b(View view, int i1, int j1, int k1, int l1)
    {
        a.b(view, i1, j1, k1, l1);
    }

    public static boolean b(View view)
    {
        return a.b(view);
    }

    public static boolean b(View view, int i1)
    {
        return a.b(view, i1);
    }

    public static void c(View view, float f1)
    {
        a.c(view, f1);
    }

    public static void c(View view, int i1)
    {
        a.c(view, i1);
    }

    public static boolean c(View view)
    {
        return a.c(view);
    }

    public static void d(View view)
    {
        a.d(view);
    }

    public static void d(View view, float f1)
    {
        a.d(view, f1);
    }

    public static void d(View view, int i1)
    {
        a.d(view, i1);
    }

    public static int e(View view)
    {
        return a.e(view);
    }

    public static void e(View view, float f1)
    {
        a.e(view, f1);
    }

    public static void e(View view, int i1)
    {
        view.offsetTopAndBottom(i1);
        if (i1 != 0 && android.os.Build.VERSION.SDK_INT < 11)
        {
            view.invalidate();
        }
    }

    public static float f(View view)
    {
        return a.f(view);
    }

    public static void f(View view, float f1)
    {
        a.f(view, f1);
    }

    public static void f(View view, int i1)
    {
        view.offsetLeftAndRight(i1);
        if (i1 != 0 && android.os.Build.VERSION.SDK_INT < 11)
        {
            view.invalidate();
        }
    }

    public static int g(View view)
    {
        return a.g(view);
    }

    public static int h(View view)
    {
        return a.h(view);
    }

    public static ViewParent i(View view)
    {
        return a.i(view);
    }

    public static boolean j(View view)
    {
        return a.j(view);
    }

    public static int k(View view)
    {
        return a.k(view);
    }

    public static int l(View view)
    {
        return a.l(view);
    }

    public static int m(View view)
    {
        return a.m(view);
    }

    public static int n(View view)
    {
        return a.n(view);
    }

    public static float o(View view)
    {
        return a.p(view);
    }

    public static float p(View view)
    {
        return a.q(view);
    }

    public static int q(View view)
    {
        return a.s(view);
    }

    public static int r(View view)
    {
        return a.t(view);
    }

    public static af s(View view)
    {
        return a.u(view);
    }

    public static float t(View view)
    {
        return a.r(view);
    }

    public static float u(View view)
    {
        return a.x(view);
    }

    public static int v(View view)
    {
        return a.v(view);
    }

    public static void w(View view)
    {
        a.w(view);
    }

    public static boolean x(View view)
    {
        return a.z(view);
    }

    public static void y(View view)
    {
        a.A(view);
    }

    public static void z(View view)
    {
        a.B(view);
    }

    static 
    {
        int i1 = android.os.Build.VERSION.SDK_INT;
        if (i1 >= 21)
        {
            a = new j();
        } else
        if (i1 >= 19)
        {
            a = new i();
        } else
        if (i1 >= 17)
        {
            a = new g();
        } else
        if (i1 >= 16)
        {
            a = new f();
        } else
        if (i1 >= 14)
        {
            a = new e();
        } else
        if (i1 >= 11)
        {
            a = new d();
        } else
        if (i1 >= 9)
        {
            a = new c();
        } else
        if (i1 >= 7)
        {
            a = new b();
        } else
        {
            a = new a();
        }
    }
}
