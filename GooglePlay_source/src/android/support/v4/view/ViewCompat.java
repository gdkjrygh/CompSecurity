// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.view;

import android.animation.ValueAnimator;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.WeakHashMap;

// Referenced classes of package android.support.v4.view:
//            ViewPropertyAnimatorCompat, WindowInsetsCompat, AccessibilityDelegateCompat, OnApplyWindowInsetsListener, 
//            ScrollingView, ViewCompatBase, NestedScrollingChild, ViewCompatEclairMr1, 
//            WindowInsetsCompatApi21

public final class ViewCompat
{
    static class BaseViewCompatImpl
        implements ViewCompatImpl
    {

        WeakHashMap mViewPropertyAnimatorCompatMap;

        public ViewPropertyAnimatorCompat animate(View view)
        {
            return new ViewPropertyAnimatorCompat(view);
        }

        public boolean canScrollHorizontally(View view, int i)
        {
            if (!(view instanceof ScrollingView)) goto _L2; else goto _L1
_L1:
            int j;
            int k;
            view = (ScrollingView)view;
            j = view.computeHorizontalScrollOffset();
            k = view.computeHorizontalScrollRange() - view.computeHorizontalScrollExtent();
            if (k == 0) goto _L4; else goto _L3
_L3:
            if (i >= 0) goto _L6; else goto _L5
_L5:
            if (j > 0)
            {
                i = 1;
            } else
            {
                i = 0;
            }
_L7:
            if (i != 0)
            {
                return true;
            }
            break; /* Loop/switch isn't completed */
_L6:
            if (j < k - 1)
            {
                i = 1;
                continue; /* Loop/switch isn't completed */
            }
_L4:
            i = 0;
            if (true) goto _L7; else goto _L2
_L2:
            return false;
        }

        public boolean canScrollVertically(View view, int i)
        {
            if (!(view instanceof ScrollingView)) goto _L2; else goto _L1
_L1:
            int j;
            int k;
            view = (ScrollingView)view;
            j = view.computeVerticalScrollOffset();
            k = view.computeVerticalScrollRange() - view.computeVerticalScrollExtent();
            if (k == 0) goto _L4; else goto _L3
_L3:
            if (i >= 0) goto _L6; else goto _L5
_L5:
            if (j > 0)
            {
                i = 1;
            } else
            {
                i = 0;
            }
_L7:
            if (i != 0)
            {
                return true;
            }
            break; /* Loop/switch isn't completed */
_L6:
            if (j < k - 1)
            {
                i = 1;
                continue; /* Loop/switch isn't completed */
            }
_L4:
            i = 0;
            if (true) goto _L7; else goto _L2
_L2:
            return false;
        }

        public float getAlpha(View view)
        {
            return 1.0F;
        }

        public boolean getFitsSystemWindows(View view)
        {
            return false;
        }

        long getFrameTime()
        {
            return 10L;
        }

        public int getImportantForAccessibility(View view)
        {
            return 0;
        }

        public int getLayerType(View view)
        {
            return 0;
        }

        public int getLayoutDirection(View view)
        {
            return 0;
        }

        public int getMeasuredState(View view)
        {
            return 0;
        }

        public int getMeasuredWidthAndState(View view)
        {
            return view.getMeasuredWidth();
        }

        public int getMinimumHeight(View view)
        {
            return ViewCompatBase.getMinimumHeight(view);
        }

        public int getMinimumWidth(View view)
        {
            return ViewCompatBase.getMinimumWidth(view);
        }

        public int getOverScrollMode(View view)
        {
            return 2;
        }

        public int getPaddingEnd(View view)
        {
            return view.getPaddingRight();
        }

        public int getPaddingStart(View view)
        {
            return view.getPaddingLeft();
        }

        public ViewParent getParentForAccessibility(View view)
        {
            return view.getParent();
        }

        public float getTranslationX(View view)
        {
            return 0.0F;
        }

        public float getTranslationY(View view)
        {
            return 0.0F;
        }

        public int getWindowSystemUiVisibility(View view)
        {
            return 0;
        }

        public boolean hasAccessibilityDelegate(View view)
        {
            return false;
        }

        public boolean hasTransientState(View view)
        {
            return false;
        }

        public boolean isAttachedToWindow(View view)
        {
            return view.getWindowToken() != null;
        }

        public boolean isLaidOut(View view)
        {
            return view.getWidth() > 0 && view.getHeight() > 0;
        }

        public boolean isOpaque(View view)
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

        public void jumpDrawablesToCurrentState(View view)
        {
        }

        public WindowInsetsCompat onApplyWindowInsets(View view, WindowInsetsCompat windowinsetscompat)
        {
            return windowinsetscompat;
        }

        public void postInvalidateOnAnimation(View view)
        {
            view.invalidate();
        }

        public void postInvalidateOnAnimation(View view, int i, int j, int k, int l)
        {
            view.invalidate(i, j, k, l);
        }

        public void postOnAnimation(View view, Runnable runnable)
        {
            view.postDelayed(runnable, getFrameTime());
        }

        public void postOnAnimationDelayed(View view, Runnable runnable, long l)
        {
            view.postDelayed(runnable, getFrameTime() + l);
        }

        public void requestApplyInsets(View view)
        {
        }

        public int resolveSizeAndState(int i, int j, int k)
        {
            return View.resolveSize(i, j);
        }

        public void setAccessibilityDelegate(View view, AccessibilityDelegateCompat accessibilitydelegatecompat)
        {
        }

        public void setActivated(View view, boolean flag)
        {
        }

        public void setAlpha(View view, float f)
        {
        }

        public void setChildrenDrawingOrderEnabled(ViewGroup viewgroup, boolean flag)
        {
        }

        public void setElevation(View view, float f)
        {
        }

        public void setImportantForAccessibility(View view, int i)
        {
        }

        public void setLayerPaint(View view, Paint paint)
        {
        }

        public void setLayerType(View view, int i, Paint paint)
        {
        }

        public void setOnApplyWindowInsetsListener(View view, OnApplyWindowInsetsListener onapplywindowinsetslistener)
        {
        }

        public void setPaddingRelative(View view, int i, int j, int k, int l)
        {
            view.setPadding(i, j, k, l);
        }

        public void setSaveFromParentEnabled(View view, boolean flag)
        {
        }

        public void setScaleX(View view, float f)
        {
        }

        public void setScaleY(View view, float f)
        {
        }

        public void setTranslationX(View view, float f)
        {
        }

        public void setTranslationY(View view, float f)
        {
        }

        public void stopNestedScroll(View view)
        {
            if (view instanceof NestedScrollingChild)
            {
                ((NestedScrollingChild)view).stopNestedScroll();
            }
        }

        BaseViewCompatImpl()
        {
            mViewPropertyAnimatorCompatMap = null;
        }
    }

    static class EclairMr1ViewCompatImpl extends BaseViewCompatImpl
    {

        public final boolean isOpaque(View view)
        {
            return view.isOpaque();
        }

        public final void setChildrenDrawingOrderEnabled(ViewGroup viewgroup, boolean flag)
        {
            if (ViewCompatEclairMr1.sChildrenDrawingOrderMethod == null)
            {
                try
                {
                    ViewCompatEclairMr1.sChildrenDrawingOrderMethod = android/view/ViewGroup.getDeclaredMethod("setChildrenDrawingOrderEnabled", new Class[] {
                        Boolean.TYPE
                    });
                }
                catch (NoSuchMethodException nosuchmethodexception)
                {
                    Log.e("ViewCompat", "Unable to find childrenDrawingOrderEnabled", nosuchmethodexception);
                }
                ViewCompatEclairMr1.sChildrenDrawingOrderMethod.setAccessible(true);
            }
            try
            {
                ViewCompatEclairMr1.sChildrenDrawingOrderMethod.invoke(viewgroup, new Object[] {
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

        EclairMr1ViewCompatImpl()
        {
        }
    }

    static class GBViewCompatImpl extends EclairMr1ViewCompatImpl
    {

        public final int getOverScrollMode(View view)
        {
            return view.getOverScrollMode();
        }

        GBViewCompatImpl()
        {
        }
    }

    static class HCViewCompatImpl extends GBViewCompatImpl
    {

        public final float getAlpha(View view)
        {
            return view.getAlpha();
        }

        final long getFrameTime()
        {
            return ValueAnimator.getFrameDelay();
        }

        public final int getLayerType(View view)
        {
            return view.getLayerType();
        }

        public final int getMeasuredState(View view)
        {
            return view.getMeasuredState();
        }

        public final int getMeasuredWidthAndState(View view)
        {
            return view.getMeasuredWidthAndState();
        }

        public final float getTranslationX(View view)
        {
            return view.getTranslationX();
        }

        public final float getTranslationY(View view)
        {
            return view.getTranslationY();
        }

        public final void jumpDrawablesToCurrentState(View view)
        {
            view.jumpDrawablesToCurrentState();
        }

        public final int resolveSizeAndState(int i, int j, int k)
        {
            return View.resolveSizeAndState(i, j, k);
        }

        public final void setActivated(View view, boolean flag)
        {
            view.setActivated(flag);
        }

        public final void setAlpha(View view, float f)
        {
            view.setAlpha(f);
        }

        public void setLayerPaint(View view, Paint paint)
        {
            setLayerType(view, view.getLayerType(), paint);
            view.invalidate();
        }

        public final void setLayerType(View view, int i, Paint paint)
        {
            view.setLayerType(i, paint);
        }

        public final void setSaveFromParentEnabled(View view, boolean flag)
        {
            view.setSaveFromParentEnabled(false);
        }

        public final void setScaleX(View view, float f)
        {
            view.setScaleX(f);
        }

        public final void setScaleY(View view, float f)
        {
            view.setScaleY(f);
        }

        public final void setTranslationX(View view, float f)
        {
            view.setTranslationX(f);
        }

        public final void setTranslationY(View view, float f)
        {
            view.setTranslationY(f);
        }

        HCViewCompatImpl()
        {
        }
    }

    static class ICSViewCompatImpl extends HCViewCompatImpl
    {

        static boolean accessibilityDelegateCheckFailed = false;
        static Field mAccessibilityDelegateField;

        public final ViewPropertyAnimatorCompat animate(View view)
        {
            if (mViewPropertyAnimatorCompatMap == null)
            {
                mViewPropertyAnimatorCompatMap = new WeakHashMap();
            }
            ViewPropertyAnimatorCompat viewpropertyanimatorcompat1 = (ViewPropertyAnimatorCompat)mViewPropertyAnimatorCompatMap.get(view);
            ViewPropertyAnimatorCompat viewpropertyanimatorcompat = viewpropertyanimatorcompat1;
            if (viewpropertyanimatorcompat1 == null)
            {
                viewpropertyanimatorcompat = new ViewPropertyAnimatorCompat(view);
                mViewPropertyAnimatorCompatMap.put(view, viewpropertyanimatorcompat);
            }
            return viewpropertyanimatorcompat;
        }

        public final boolean canScrollHorizontally(View view, int i)
        {
            return view.canScrollHorizontally(i);
        }

        public final boolean canScrollVertically(View view, int i)
        {
            return view.canScrollVertically(i);
        }

        public final boolean hasAccessibilityDelegate(View view)
        {
            if (!accessibilityDelegateCheckFailed)
            {
                if (mAccessibilityDelegateField == null)
                {
                    try
                    {
                        Field field = android/view/View.getDeclaredField("mAccessibilityDelegate");
                        mAccessibilityDelegateField = field;
                        field.setAccessible(true);
                    }
                    // Misplaced declaration of an exception variable
                    catch (View view)
                    {
                        accessibilityDelegateCheckFailed = true;
                        return false;
                    }
                }
                try
                {
                    view = ((View) (mAccessibilityDelegateField.get(view)));
                }
                // Misplaced declaration of an exception variable
                catch (View view)
                {
                    accessibilityDelegateCheckFailed = true;
                    return false;
                }
                if (view != null)
                {
                    return true;
                }
            }
            return false;
        }

        public final void setAccessibilityDelegate(View view, AccessibilityDelegateCompat accessibilitydelegatecompat)
        {
            if (accessibilitydelegatecompat == null)
            {
                accessibilitydelegatecompat = null;
            } else
            {
                accessibilitydelegatecompat = ((AccessibilityDelegateCompat) (accessibilitydelegatecompat.mBridge));
            }
            view.setAccessibilityDelegate((android.view.View.AccessibilityDelegate)accessibilitydelegatecompat);
        }


        ICSViewCompatImpl()
        {
        }
    }

    static class JBViewCompatImpl extends ICSViewCompatImpl
    {

        public final boolean getFitsSystemWindows(View view)
        {
            return view.getFitsSystemWindows();
        }

        public final int getImportantForAccessibility(View view)
        {
            return view.getImportantForAccessibility();
        }

        public final int getMinimumHeight(View view)
        {
            return view.getMinimumHeight();
        }

        public final int getMinimumWidth(View view)
        {
            return view.getMinimumWidth();
        }

        public final ViewParent getParentForAccessibility(View view)
        {
            return view.getParentForAccessibility();
        }

        public final boolean hasTransientState(View view)
        {
            return view.hasTransientState();
        }

        public final void postInvalidateOnAnimation(View view)
        {
            view.postInvalidateOnAnimation();
        }

        public final void postInvalidateOnAnimation(View view, int i, int j, int k, int l)
        {
            view.postInvalidate(i, j, k, l);
        }

        public final void postOnAnimation(View view, Runnable runnable)
        {
            view.postOnAnimation(runnable);
        }

        public final void postOnAnimationDelayed(View view, Runnable runnable, long l)
        {
            view.postOnAnimationDelayed(runnable, l);
        }

        public void requestApplyInsets(View view)
        {
            view.requestFitSystemWindows();
        }

        public void setImportantForAccessibility(View view, int i)
        {
            int j = i;
            if (i == 4)
            {
                j = 2;
            }
            view.setImportantForAccessibility(j);
        }

        JBViewCompatImpl()
        {
        }
    }

    static class JbMr1ViewCompatImpl extends JBViewCompatImpl
    {

        public final int getLayoutDirection(View view)
        {
            return view.getLayoutDirection();
        }

        public final int getPaddingEnd(View view)
        {
            return view.getPaddingEnd();
        }

        public final int getPaddingStart(View view)
        {
            return view.getPaddingStart();
        }

        public final int getWindowSystemUiVisibility(View view)
        {
            return view.getWindowSystemUiVisibility();
        }

        public final void setLayerPaint(View view, Paint paint)
        {
            view.setLayerPaint(paint);
        }

        public final void setPaddingRelative(View view, int i, int j, int k, int l)
        {
            view.setPaddingRelative(i, j, k, l);
        }

        JbMr1ViewCompatImpl()
        {
        }
    }

    static class KitKatViewCompatImpl extends JbMr1ViewCompatImpl
    {

        public final boolean isAttachedToWindow(View view)
        {
            return view.isAttachedToWindow();
        }

        public final boolean isLaidOut(View view)
        {
            return view.isLaidOut();
        }

        public final void setImportantForAccessibility(View view, int i)
        {
            view.setImportantForAccessibility(i);
        }

        KitKatViewCompatImpl()
        {
        }
    }

    static final class LollipopViewCompatImpl extends KitKatViewCompatImpl
    {

        public final WindowInsetsCompat onApplyWindowInsets(View view, WindowInsetsCompat windowinsetscompat)
        {
            Object obj = windowinsetscompat;
            if (windowinsetscompat instanceof WindowInsetsCompatApi21)
            {
                android.view.WindowInsets windowinsets = ((WindowInsetsCompatApi21)windowinsetscompat).mSource;
                view = view.onApplyWindowInsets(windowinsets);
                obj = windowinsetscompat;
                if (view != windowinsets)
                {
                    obj = new WindowInsetsCompatApi21(view);
                }
            }
            return ((WindowInsetsCompat) (obj));
        }

        public final void requestApplyInsets(View view)
        {
            view.requestApplyInsets();
        }

        public final void setElevation(View view, float f)
        {
            view.setElevation(f);
        }

        public final void setOnApplyWindowInsetsListener(View view, OnApplyWindowInsetsListener onapplywindowinsetslistener)
        {
            view.setOnApplyWindowInsetsListener(new ViewCompatLollipop._cls1(onapplywindowinsetslistener));
        }

        public final void stopNestedScroll(View view)
        {
            view.stopNestedScroll();
        }

        LollipopViewCompatImpl()
        {
        }
    }

    static interface ViewCompatImpl
    {

        public abstract ViewPropertyAnimatorCompat animate(View view);

        public abstract boolean canScrollHorizontally(View view, int i);

        public abstract boolean canScrollVertically(View view, int i);

        public abstract float getAlpha(View view);

        public abstract boolean getFitsSystemWindows(View view);

        public abstract int getImportantForAccessibility(View view);

        public abstract int getLayerType(View view);

        public abstract int getLayoutDirection(View view);

        public abstract int getMeasuredState(View view);

        public abstract int getMeasuredWidthAndState(View view);

        public abstract int getMinimumHeight(View view);

        public abstract int getMinimumWidth(View view);

        public abstract int getOverScrollMode(View view);

        public abstract int getPaddingEnd(View view);

        public abstract int getPaddingStart(View view);

        public abstract ViewParent getParentForAccessibility(View view);

        public abstract float getTranslationX(View view);

        public abstract float getTranslationY(View view);

        public abstract int getWindowSystemUiVisibility(View view);

        public abstract boolean hasAccessibilityDelegate(View view);

        public abstract boolean hasTransientState(View view);

        public abstract boolean isAttachedToWindow(View view);

        public abstract boolean isLaidOut(View view);

        public abstract boolean isOpaque(View view);

        public abstract void jumpDrawablesToCurrentState(View view);

        public abstract WindowInsetsCompat onApplyWindowInsets(View view, WindowInsetsCompat windowinsetscompat);

        public abstract void postInvalidateOnAnimation(View view);

        public abstract void postInvalidateOnAnimation(View view, int i, int j, int k, int l);

        public abstract void postOnAnimation(View view, Runnable runnable);

        public abstract void postOnAnimationDelayed(View view, Runnable runnable, long l);

        public abstract void requestApplyInsets(View view);

        public abstract int resolveSizeAndState(int i, int j, int k);

        public abstract void setAccessibilityDelegate(View view, AccessibilityDelegateCompat accessibilitydelegatecompat);

        public abstract void setActivated(View view, boolean flag);

        public abstract void setAlpha(View view, float f);

        public abstract void setChildrenDrawingOrderEnabled(ViewGroup viewgroup, boolean flag);

        public abstract void setElevation(View view, float f);

        public abstract void setImportantForAccessibility(View view, int i);

        public abstract void setLayerPaint(View view, Paint paint);

        public abstract void setLayerType(View view, int i, Paint paint);

        public abstract void setOnApplyWindowInsetsListener(View view, OnApplyWindowInsetsListener onapplywindowinsetslistener);

        public abstract void setPaddingRelative(View view, int i, int j, int k, int l);

        public abstract void setSaveFromParentEnabled(View view, boolean flag);

        public abstract void setScaleX(View view, float f);

        public abstract void setScaleY(View view, float f);

        public abstract void setTranslationX(View view, float f);

        public abstract void setTranslationY(View view, float f);

        public abstract void stopNestedScroll(View view);
    }


    static final ViewCompatImpl IMPL;

    public static ViewPropertyAnimatorCompat animate(View view)
    {
        return IMPL.animate(view);
    }

    public static boolean canScrollHorizontally(View view, int i)
    {
        return IMPL.canScrollHorizontally(view, i);
    }

    public static boolean canScrollVertically(View view, int i)
    {
        return IMPL.canScrollVertically(view, i);
    }

    public static float getAlpha(View view)
    {
        return IMPL.getAlpha(view);
    }

    public static boolean getFitsSystemWindows(View view)
    {
        return IMPL.getFitsSystemWindows(view);
    }

    public static int getImportantForAccessibility(View view)
    {
        return IMPL.getImportantForAccessibility(view);
    }

    public static int getLayerType(View view)
    {
        return IMPL.getLayerType(view);
    }

    public static int getLayoutDirection(View view)
    {
        return IMPL.getLayoutDirection(view);
    }

    public static int getMeasuredState(View view)
    {
        return IMPL.getMeasuredState(view);
    }

    public static int getMeasuredWidthAndState(View view)
    {
        return IMPL.getMeasuredWidthAndState(view);
    }

    public static int getMinimumHeight(View view)
    {
        return IMPL.getMinimumHeight(view);
    }

    public static int getMinimumWidth(View view)
    {
        return IMPL.getMinimumWidth(view);
    }

    public static int getOverScrollMode(View view)
    {
        return IMPL.getOverScrollMode(view);
    }

    public static int getPaddingEnd(View view)
    {
        return IMPL.getPaddingEnd(view);
    }

    public static int getPaddingStart(View view)
    {
        return IMPL.getPaddingStart(view);
    }

    public static ViewParent getParentForAccessibility(View view)
    {
        return IMPL.getParentForAccessibility(view);
    }

    public static float getTranslationX(View view)
    {
        return IMPL.getTranslationX(view);
    }

    public static float getTranslationY(View view)
    {
        return IMPL.getTranslationY(view);
    }

    public static int getWindowSystemUiVisibility(View view)
    {
        return IMPL.getWindowSystemUiVisibility(view);
    }

    public static boolean hasAccessibilityDelegate(View view)
    {
        return IMPL.hasAccessibilityDelegate(view);
    }

    public static boolean hasTransientState(View view)
    {
        return IMPL.hasTransientState(view);
    }

    public static boolean isAttachedToWindow(View view)
    {
        return IMPL.isAttachedToWindow(view);
    }

    public static boolean isLaidOut(View view)
    {
        return IMPL.isLaidOut(view);
    }

    public static boolean isOpaque(View view)
    {
        return IMPL.isOpaque(view);
    }

    public static void jumpDrawablesToCurrentState(View view)
    {
        IMPL.jumpDrawablesToCurrentState(view);
    }

    public static WindowInsetsCompat onApplyWindowInsets(View view, WindowInsetsCompat windowinsetscompat)
    {
        return IMPL.onApplyWindowInsets(view, windowinsetscompat);
    }

    public static void postInvalidateOnAnimation(View view)
    {
        IMPL.postInvalidateOnAnimation(view);
    }

    public static void postInvalidateOnAnimation(View view, int i, int j, int k, int l)
    {
        IMPL.postInvalidateOnAnimation(view, i, j, k, l);
    }

    public static void postOnAnimation(View view, Runnable runnable)
    {
        IMPL.postOnAnimation(view, runnable);
    }

    public static void postOnAnimationDelayed(View view, Runnable runnable, long l)
    {
        IMPL.postOnAnimationDelayed(view, runnable, l);
    }

    public static void requestApplyInsets(View view)
    {
        IMPL.requestApplyInsets(view);
    }

    public static int resolveSizeAndState(int i, int j, int k)
    {
        return IMPL.resolveSizeAndState(i, j, k);
    }

    public static void setAccessibilityDelegate(View view, AccessibilityDelegateCompat accessibilitydelegatecompat)
    {
        IMPL.setAccessibilityDelegate(view, accessibilitydelegatecompat);
    }

    public static void setActivated(View view, boolean flag)
    {
        IMPL.setActivated(view, flag);
    }

    public static void setAlpha(View view, float f)
    {
        IMPL.setAlpha(view, f);
    }

    public static void setChildrenDrawingOrderEnabled$4d3af60(ViewGroup viewgroup)
    {
        IMPL.setChildrenDrawingOrderEnabled(viewgroup, true);
    }

    public static void setElevation(View view, float f)
    {
        IMPL.setElevation(view, f);
    }

    public static void setImportantForAccessibility(View view, int i)
    {
        IMPL.setImportantForAccessibility(view, i);
    }

    public static void setLayerPaint(View view, Paint paint)
    {
        IMPL.setLayerPaint(view, paint);
    }

    public static void setLayerType(View view, int i, Paint paint)
    {
        IMPL.setLayerType(view, i, paint);
    }

    public static void setOnApplyWindowInsetsListener(View view, OnApplyWindowInsetsListener onapplywindowinsetslistener)
    {
        IMPL.setOnApplyWindowInsetsListener(view, onapplywindowinsetslistener);
    }

    public static void setPaddingRelative(View view, int i, int j, int k, int l)
    {
        IMPL.setPaddingRelative(view, i, j, k, l);
    }

    public static void setSaveFromParentEnabled$53599cc9(View view)
    {
        IMPL.setSaveFromParentEnabled(view, false);
    }

    public static void setScaleX(View view, float f)
    {
        IMPL.setScaleX(view, f);
    }

    public static void setScaleY(View view, float f)
    {
        IMPL.setScaleY(view, f);
    }

    public static void setTranslationX(View view, float f)
    {
        IMPL.setTranslationX(view, f);
    }

    public static void setTranslationY(View view, float f)
    {
        IMPL.setTranslationY(view, f);
    }

    public static void stopNestedScroll(View view)
    {
        IMPL.stopNestedScroll(view);
    }

    static 
    {
        int i = android.os.Build.VERSION.SDK_INT;
        if (i >= 21)
        {
            IMPL = new LollipopViewCompatImpl();
        } else
        if (i >= 19)
        {
            IMPL = new KitKatViewCompatImpl();
        } else
        if (i >= 17)
        {
            IMPL = new JbMr1ViewCompatImpl();
        } else
        if (i >= 16)
        {
            IMPL = new JBViewCompatImpl();
        } else
        if (i >= 14)
        {
            IMPL = new ICSViewCompatImpl();
        } else
        if (i >= 11)
        {
            IMPL = new HCViewCompatImpl();
        } else
        if (i >= 9)
        {
            IMPL = new GBViewCompatImpl();
        } else
        if (i >= 7)
        {
            IMPL = new EclairMr1ViewCompatImpl();
        } else
        {
            IMPL = new BaseViewCompatImpl();
        }
    }
}
