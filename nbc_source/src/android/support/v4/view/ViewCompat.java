// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.view;

import android.graphics.Paint;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import java.lang.reflect.Field;
import java.util.WeakHashMap;

// Referenced classes of package android.support.v4.view:
//            ViewPropertyAnimatorCompat, WindowInsetsCompat, AccessibilityDelegateCompat, OnApplyWindowInsetsListener, 
//            ScrollingView, ViewCompatBase, NestedScrollingChild, ViewCompatEclairMr1, 
//            ViewCompatGingerbread, ViewCompatHC, ViewCompatICS, ViewCompatJB, 
//            ViewCompatJellybeanMr1, ViewCompatKitKat, ViewCompatLollipop

public class ViewCompat
{
    static class BaseViewCompatImpl
        implements ViewCompatImpl
    {

        WeakHashMap mViewPropertyAnimatorCompatMap;

        private boolean canScrollingViewScrollHorizontally(ScrollingView scrollingview, int i)
        {
            int j;
            int k;
            boolean flag;
            flag = true;
            j = scrollingview.computeHorizontalScrollOffset();
            k = scrollingview.computeHorizontalScrollRange() - scrollingview.computeHorizontalScrollExtent();
            if (k != 0) goto _L2; else goto _L1
_L1:
            flag = false;
_L4:
            return flag;
_L2:
            if (i >= 0)
            {
                continue; /* Loop/switch isn't completed */
            }
            if (j > 0) goto _L4; else goto _L3
_L3:
            return false;
            if (j < k - 1) goto _L4; else goto _L5
_L5:
            return false;
        }

        private boolean canScrollingViewScrollVertically(ScrollingView scrollingview, int i)
        {
            int j;
            int k;
            boolean flag;
            flag = true;
            j = scrollingview.computeVerticalScrollOffset();
            k = scrollingview.computeVerticalScrollRange() - scrollingview.computeVerticalScrollExtent();
            if (k != 0) goto _L2; else goto _L1
_L1:
            flag = false;
_L4:
            return flag;
_L2:
            if (i >= 0)
            {
                continue; /* Loop/switch isn't completed */
            }
            if (j > 0) goto _L4; else goto _L3
_L3:
            return false;
            if (j < k - 1) goto _L4; else goto _L5
_L5:
            return false;
        }

        public ViewPropertyAnimatorCompat animate(View view)
        {
            return new ViewPropertyAnimatorCompat(view);
        }

        public boolean canScrollHorizontally(View view, int i)
        {
            return (view instanceof ScrollingView) && canScrollingViewScrollHorizontally((ScrollingView)view, i);
        }

        public boolean canScrollVertically(View view, int i)
        {
            return (view instanceof ScrollingView) && canScrollingViewScrollVertically((ScrollingView)view, i);
        }

        public int combineMeasuredStates(int i, int j)
        {
            return i | j;
        }

        public WindowInsetsCompat dispatchApplyWindowInsets(View view, WindowInsetsCompat windowinsetscompat)
        {
            return windowinsetscompat;
        }

        public float getAlpha(View view)
        {
            return 1.0F;
        }

        public float getElevation(View view)
        {
            return 0.0F;
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

        public float getScaleX(View view)
        {
            return 0.0F;
        }

        public float getTranslationX(View view)
        {
            return 0.0F;
        }

        public float getTranslationY(View view)
        {
            return 0.0F;
        }

        public float getTranslationZ(View view)
        {
            return 0.0F;
        }

        public int getWindowSystemUiVisibility(View view)
        {
            return 0;
        }

        public float getZ(View view)
        {
            return getTranslationZ(view) + getElevation(view);
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
            return ViewCompatBase.isAttachedToWindow(view);
        }

        public boolean isLaidOut(View view)
        {
            return ViewCompatBase.isLaidOut(view);
        }

        public boolean isPaddingRelative(View view)
        {
            return false;
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

        public void setFitsSystemWindows(View view, boolean flag)
        {
        }

        public void setImportantForAccessibility(View view, int i)
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

        public void setChildrenDrawingOrderEnabled(ViewGroup viewgroup, boolean flag)
        {
            ViewCompatEclairMr1.setChildrenDrawingOrderEnabled(viewgroup, flag);
        }

        EclairMr1ViewCompatImpl()
        {
        }
    }

    static class GBViewCompatImpl extends EclairMr1ViewCompatImpl
    {

        public int getOverScrollMode(View view)
        {
            return ViewCompatGingerbread.getOverScrollMode(view);
        }

        GBViewCompatImpl()
        {
        }
    }

    static class HCViewCompatImpl extends GBViewCompatImpl
    {

        public int combineMeasuredStates(int i, int j)
        {
            return ViewCompatHC.combineMeasuredStates(i, j);
        }

        public float getAlpha(View view)
        {
            return ViewCompatHC.getAlpha(view);
        }

        long getFrameTime()
        {
            return ViewCompatHC.getFrameTime();
        }

        public int getMeasuredState(View view)
        {
            return ViewCompatHC.getMeasuredState(view);
        }

        public int getMeasuredWidthAndState(View view)
        {
            return ViewCompatHC.getMeasuredWidthAndState(view);
        }

        public float getScaleX(View view)
        {
            return ViewCompatHC.getScaleX(view);
        }

        public float getTranslationX(View view)
        {
            return ViewCompatHC.getTranslationX(view);
        }

        public float getTranslationY(View view)
        {
            return ViewCompatHC.getTranslationY(view);
        }

        public void jumpDrawablesToCurrentState(View view)
        {
            ViewCompatHC.jumpDrawablesToCurrentState(view);
        }

        public int resolveSizeAndState(int i, int j, int k)
        {
            return ViewCompatHC.resolveSizeAndState(i, j, k);
        }

        public void setActivated(View view, boolean flag)
        {
            ViewCompatHC.setActivated(view, flag);
        }

        public void setAlpha(View view, float f)
        {
            ViewCompatHC.setAlpha(view, f);
        }

        public void setLayerType(View view, int i, Paint paint)
        {
            ViewCompatHC.setLayerType(view, i, paint);
        }

        public void setSaveFromParentEnabled(View view, boolean flag)
        {
            ViewCompatHC.setSaveFromParentEnabled(view, flag);
        }

        public void setScaleX(View view, float f)
        {
            ViewCompatHC.setScaleX(view, f);
        }

        public void setScaleY(View view, float f)
        {
            ViewCompatHC.setScaleY(view, f);
        }

        public void setTranslationX(View view, float f)
        {
            ViewCompatHC.setTranslationX(view, f);
        }

        public void setTranslationY(View view, float f)
        {
            ViewCompatHC.setTranslationY(view, f);
        }

        HCViewCompatImpl()
        {
        }
    }

    static class ICSViewCompatImpl extends HCViewCompatImpl
    {

        static boolean accessibilityDelegateCheckFailed = false;
        static Field mAccessibilityDelegateField;

        public ViewPropertyAnimatorCompat animate(View view)
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

        public boolean canScrollHorizontally(View view, int i)
        {
            return ViewCompatICS.canScrollHorizontally(view, i);
        }

        public boolean canScrollVertically(View view, int i)
        {
            return ViewCompatICS.canScrollVertically(view, i);
        }

        public boolean hasAccessibilityDelegate(View view)
        {
            boolean flag = true;
            if (accessibilityDelegateCheckFailed)
            {
                return false;
            }
            if (mAccessibilityDelegateField == null)
            {
                try
                {
                    mAccessibilityDelegateField = android/view/View.getDeclaredField("mAccessibilityDelegate");
                    mAccessibilityDelegateField.setAccessible(true);
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
            if (view == null)
            {
                flag = false;
            }
            return flag;
        }

        public void setAccessibilityDelegate(View view, AccessibilityDelegateCompat accessibilitydelegatecompat)
        {
            if (accessibilitydelegatecompat == null)
            {
                accessibilitydelegatecompat = null;
            } else
            {
                accessibilitydelegatecompat = ((AccessibilityDelegateCompat) (accessibilitydelegatecompat.getBridge()));
            }
            ViewCompatICS.setAccessibilityDelegate(view, accessibilitydelegatecompat);
        }

        public void setFitsSystemWindows(View view, boolean flag)
        {
            ViewCompatICS.setFitsSystemWindows(view, flag);
        }


        ICSViewCompatImpl()
        {
        }
    }

    static class JBViewCompatImpl extends ICSViewCompatImpl
    {

        public boolean getFitsSystemWindows(View view)
        {
            return ViewCompatJB.getFitsSystemWindows(view);
        }

        public int getImportantForAccessibility(View view)
        {
            return ViewCompatJB.getImportantForAccessibility(view);
        }

        public int getMinimumHeight(View view)
        {
            return ViewCompatJB.getMinimumHeight(view);
        }

        public int getMinimumWidth(View view)
        {
            return ViewCompatJB.getMinimumWidth(view);
        }

        public ViewParent getParentForAccessibility(View view)
        {
            return ViewCompatJB.getParentForAccessibility(view);
        }

        public boolean hasTransientState(View view)
        {
            return ViewCompatJB.hasTransientState(view);
        }

        public void postInvalidateOnAnimation(View view)
        {
            ViewCompatJB.postInvalidateOnAnimation(view);
        }

        public void postOnAnimation(View view, Runnable runnable)
        {
            ViewCompatJB.postOnAnimation(view, runnable);
        }

        public void postOnAnimationDelayed(View view, Runnable runnable, long l)
        {
            ViewCompatJB.postOnAnimationDelayed(view, runnable, l);
        }

        public void requestApplyInsets(View view)
        {
            ViewCompatJB.requestApplyInsets(view);
        }

        public void setImportantForAccessibility(View view, int i)
        {
            int j = i;
            if (i == 4)
            {
                j = 2;
            }
            ViewCompatJB.setImportantForAccessibility(view, j);
        }

        JBViewCompatImpl()
        {
        }
    }

    static class JbMr1ViewCompatImpl extends JBViewCompatImpl
    {

        public int getLayoutDirection(View view)
        {
            return ViewCompatJellybeanMr1.getLayoutDirection(view);
        }

        public int getPaddingEnd(View view)
        {
            return ViewCompatJellybeanMr1.getPaddingEnd(view);
        }

        public int getPaddingStart(View view)
        {
            return ViewCompatJellybeanMr1.getPaddingStart(view);
        }

        public int getWindowSystemUiVisibility(View view)
        {
            return ViewCompatJellybeanMr1.getWindowSystemUiVisibility(view);
        }

        public boolean isPaddingRelative(View view)
        {
            return ViewCompatJellybeanMr1.isPaddingRelative(view);
        }

        public void setPaddingRelative(View view, int i, int j, int k, int l)
        {
            ViewCompatJellybeanMr1.setPaddingRelative(view, i, j, k, l);
        }

        JbMr1ViewCompatImpl()
        {
        }
    }

    static class KitKatViewCompatImpl extends JbMr1ViewCompatImpl
    {

        public boolean isAttachedToWindow(View view)
        {
            return ViewCompatKitKat.isAttachedToWindow(view);
        }

        public boolean isLaidOut(View view)
        {
            return ViewCompatKitKat.isLaidOut(view);
        }

        public void setImportantForAccessibility(View view, int i)
        {
            ViewCompatJB.setImportantForAccessibility(view, i);
        }

        KitKatViewCompatImpl()
        {
        }
    }

    static class LollipopViewCompatImpl extends KitKatViewCompatImpl
    {

        public WindowInsetsCompat dispatchApplyWindowInsets(View view, WindowInsetsCompat windowinsetscompat)
        {
            return ViewCompatLollipop.dispatchApplyWindowInsets(view, windowinsetscompat);
        }

        public float getElevation(View view)
        {
            return ViewCompatLollipop.getElevation(view);
        }

        public float getTranslationZ(View view)
        {
            return ViewCompatLollipop.getTranslationZ(view);
        }

        public float getZ(View view)
        {
            return ViewCompatLollipop.getZ(view);
        }

        public WindowInsetsCompat onApplyWindowInsets(View view, WindowInsetsCompat windowinsetscompat)
        {
            return ViewCompatLollipop.onApplyWindowInsets(view, windowinsetscompat);
        }

        public void requestApplyInsets(View view)
        {
            ViewCompatLollipop.requestApplyInsets(view);
        }

        public void setElevation(View view, float f)
        {
            ViewCompatLollipop.setElevation(view, f);
        }

        public void setOnApplyWindowInsetsListener(View view, OnApplyWindowInsetsListener onapplywindowinsetslistener)
        {
            ViewCompatLollipop.setOnApplyWindowInsetsListener(view, onapplywindowinsetslistener);
        }

        public void stopNestedScroll(View view)
        {
            ViewCompatLollipop.stopNestedScroll(view);
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

        public abstract int combineMeasuredStates(int i, int j);

        public abstract WindowInsetsCompat dispatchApplyWindowInsets(View view, WindowInsetsCompat windowinsetscompat);

        public abstract float getAlpha(View view);

        public abstract boolean getFitsSystemWindows(View view);

        public abstract int getImportantForAccessibility(View view);

        public abstract int getLayoutDirection(View view);

        public abstract int getMeasuredState(View view);

        public abstract int getMeasuredWidthAndState(View view);

        public abstract int getMinimumHeight(View view);

        public abstract int getMinimumWidth(View view);

        public abstract int getOverScrollMode(View view);

        public abstract int getPaddingEnd(View view);

        public abstract int getPaddingStart(View view);

        public abstract ViewParent getParentForAccessibility(View view);

        public abstract float getScaleX(View view);

        public abstract float getTranslationX(View view);

        public abstract float getTranslationY(View view);

        public abstract int getWindowSystemUiVisibility(View view);

        public abstract float getZ(View view);

        public abstract boolean hasAccessibilityDelegate(View view);

        public abstract boolean hasTransientState(View view);

        public abstract boolean isAttachedToWindow(View view);

        public abstract boolean isLaidOut(View view);

        public abstract boolean isPaddingRelative(View view);

        public abstract void jumpDrawablesToCurrentState(View view);

        public abstract WindowInsetsCompat onApplyWindowInsets(View view, WindowInsetsCompat windowinsetscompat);

        public abstract void postInvalidateOnAnimation(View view);

        public abstract void postOnAnimation(View view, Runnable runnable);

        public abstract void postOnAnimationDelayed(View view, Runnable runnable, long l);

        public abstract void requestApplyInsets(View view);

        public abstract int resolveSizeAndState(int i, int j, int k);

        public abstract void setAccessibilityDelegate(View view, AccessibilityDelegateCompat accessibilitydelegatecompat);

        public abstract void setActivated(View view, boolean flag);

        public abstract void setAlpha(View view, float f);

        public abstract void setChildrenDrawingOrderEnabled(ViewGroup viewgroup, boolean flag);

        public abstract void setElevation(View view, float f);

        public abstract void setFitsSystemWindows(View view, boolean flag);

        public abstract void setImportantForAccessibility(View view, int i);

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

    public static int combineMeasuredStates(int i, int j)
    {
        return IMPL.combineMeasuredStates(i, j);
    }

    public static WindowInsetsCompat dispatchApplyWindowInsets(View view, WindowInsetsCompat windowinsetscompat)
    {
        return IMPL.dispatchApplyWindowInsets(view, windowinsetscompat);
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

    public static float getScaleX(View view)
    {
        return IMPL.getScaleX(view);
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

    public static float getZ(View view)
    {
        return IMPL.getZ(view);
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

    public static boolean isPaddingRelative(View view)
    {
        return IMPL.isPaddingRelative(view);
    }

    public static void jumpDrawablesToCurrentState(View view)
    {
        IMPL.jumpDrawablesToCurrentState(view);
    }

    public static void offsetLeftAndRight(View view, int i)
    {
        view.offsetLeftAndRight(i);
        if (i != 0 && android.os.Build.VERSION.SDK_INT < 11)
        {
            view.invalidate();
        }
    }

    public static void offsetTopAndBottom(View view, int i)
    {
        view.offsetTopAndBottom(i);
        if (i != 0 && android.os.Build.VERSION.SDK_INT < 11)
        {
            view.invalidate();
        }
    }

    public static WindowInsetsCompat onApplyWindowInsets(View view, WindowInsetsCompat windowinsetscompat)
    {
        return IMPL.onApplyWindowInsets(view, windowinsetscompat);
    }

    public static void postInvalidateOnAnimation(View view)
    {
        IMPL.postInvalidateOnAnimation(view);
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

    public static void setChildrenDrawingOrderEnabled(ViewGroup viewgroup, boolean flag)
    {
        IMPL.setChildrenDrawingOrderEnabled(viewgroup, flag);
    }

    public static void setElevation(View view, float f)
    {
        IMPL.setElevation(view, f);
    }

    public static void setFitsSystemWindows(View view, boolean flag)
    {
        IMPL.setFitsSystemWindows(view, flag);
    }

    public static void setImportantForAccessibility(View view, int i)
    {
        IMPL.setImportantForAccessibility(view, i);
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

    public static void setSaveFromParentEnabled(View view, boolean flag)
    {
        IMPL.setSaveFromParentEnabled(view, flag);
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
