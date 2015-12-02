// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.view;

import android.content.res.ColorStateList;
import android.graphics.Paint;
import android.graphics.Rect;
import android.os.Bundle;
import android.support.v4.view.accessibility.AccessibilityNodeInfoCompat;
import android.support.v4.view.accessibility.AccessibilityNodeProviderCompat;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;

// Referenced classes of package android.support.v4.view:
//            ViewPropertyAnimatorCompat, WindowInsetsCompat, AccessibilityDelegateCompat, OnApplyWindowInsetsListener

public class ViewCompat
{

    public static final int ACCESSIBILITY_LIVE_REGION_ASSERTIVE = 2;
    public static final int ACCESSIBILITY_LIVE_REGION_NONE = 0;
    public static final int ACCESSIBILITY_LIVE_REGION_POLITE = 1;
    private static final long FAKE_FRAME_TIME = 10L;
    static final ViewCompatImpl IMPL;
    public static final int IMPORTANT_FOR_ACCESSIBILITY_AUTO = 0;
    public static final int IMPORTANT_FOR_ACCESSIBILITY_NO = 2;
    public static final int IMPORTANT_FOR_ACCESSIBILITY_NO_HIDE_DESCENDANTS = 4;
    public static final int IMPORTANT_FOR_ACCESSIBILITY_YES = 1;
    public static final int LAYER_TYPE_HARDWARE = 2;
    public static final int LAYER_TYPE_NONE = 0;
    public static final int LAYER_TYPE_SOFTWARE = 1;
    public static final int LAYOUT_DIRECTION_INHERIT = 2;
    public static final int LAYOUT_DIRECTION_LOCALE = 3;
    public static final int LAYOUT_DIRECTION_LTR = 0;
    public static final int LAYOUT_DIRECTION_RTL = 1;
    public static final int MEASURED_HEIGHT_STATE_SHIFT = 16;
    public static final int MEASURED_SIZE_MASK = 0xffffff;
    public static final int MEASURED_STATE_MASK = 0xff000000;
    public static final int MEASURED_STATE_TOO_SMALL = 0x1000000;
    public static final int OVER_SCROLL_ALWAYS = 0;
    public static final int OVER_SCROLL_IF_CONTENT_SCROLLS = 1;
    public static final int OVER_SCROLL_NEVER = 2;
    public static final int SCROLL_AXIS_HORIZONTAL = 1;
    public static final int SCROLL_AXIS_NONE = 0;
    public static final int SCROLL_AXIS_VERTICAL = 2;
    private static final String TAG = "ViewCompat";

    public ViewCompat()
    {
    }

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

    public static void dispatchFinishTemporaryDetach(View view)
    {
        IMPL.dispatchFinishTemporaryDetach(view);
    }

    public static boolean dispatchNestedFling(View view, float f, float f1, boolean flag)
    {
        return IMPL.dispatchNestedFling(view, f, f1, flag);
    }

    public static boolean dispatchNestedPreFling(View view, float f, float f1)
    {
        return IMPL.dispatchNestedPreFling(view, f, f1);
    }

    public static boolean dispatchNestedPreScroll(View view, int i, int j, int ai[], int ai1[])
    {
        return IMPL.dispatchNestedPreScroll(view, i, j, ai, ai1);
    }

    public static boolean dispatchNestedScroll(View view, int i, int j, int k, int l, int ai[])
    {
        return IMPL.dispatchNestedScroll(view, i, j, k, l, ai);
    }

    public static void dispatchStartTemporaryDetach(View view)
    {
        IMPL.dispatchStartTemporaryDetach(view);
    }

    public static int getAccessibilityLiveRegion(View view)
    {
        return IMPL.getAccessibilityLiveRegion(view);
    }

    public static AccessibilityNodeProviderCompat getAccessibilityNodeProvider(View view)
    {
        return IMPL.getAccessibilityNodeProvider(view);
    }

    public static float getAlpha(View view)
    {
        return IMPL.getAlpha(view);
    }

    public static ColorStateList getBackgroundTintList(View view)
    {
        return IMPL.getBackgroundTintList(view);
    }

    public static android.graphics.PorterDuff.Mode getBackgroundTintMode(View view)
    {
        return IMPL.getBackgroundTintMode(view);
    }

    public static Rect getClipBounds(View view)
    {
        return IMPL.getClipBounds(view);
    }

    public static float getElevation(View view)
    {
        return IMPL.getElevation(view);
    }

    public static boolean getFitsSystemWindows(View view)
    {
        return IMPL.getFitsSystemWindows(view);
    }

    public static int getImportantForAccessibility(View view)
    {
        return IMPL.getImportantForAccessibility(view);
    }

    public static int getLabelFor(View view)
    {
        return IMPL.getLabelFor(view);
    }

    public static int getLayerType(View view)
    {
        return IMPL.getLayerType(view);
    }

    public static int getLayoutDirection(View view)
    {
        return IMPL.getLayoutDirection(view);
    }

    public static int getMeasuredHeightAndState(View view)
    {
        return IMPL.getMeasuredHeightAndState(view);
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

    public static float getPivotX(View view)
    {
        return IMPL.getPivotX(view);
    }

    public static float getPivotY(View view)
    {
        return IMPL.getPivotY(view);
    }

    public static float getRotation(View view)
    {
        return IMPL.getRotation(view);
    }

    public static float getRotationX(View view)
    {
        return IMPL.getRotationX(view);
    }

    public static float getRotationY(View view)
    {
        return IMPL.getRotationY(view);
    }

    public static float getScaleX(View view)
    {
        return IMPL.getScaleX(view);
    }

    public static float getScaleY(View view)
    {
        return IMPL.getScaleY(view);
    }

    public static String getTransitionName(View view)
    {
        return IMPL.getTransitionName(view);
    }

    public static float getTranslationX(View view)
    {
        return IMPL.getTranslationX(view);
    }

    public static float getTranslationY(View view)
    {
        return IMPL.getTranslationY(view);
    }

    public static float getTranslationZ(View view)
    {
        return IMPL.getTranslationZ(view);
    }

    public static int getWindowSystemUiVisibility(View view)
    {
        return IMPL.getWindowSystemUiVisibility(view);
    }

    public static float getX(View view)
    {
        return IMPL.getX(view);
    }

    public static float getY(View view)
    {
        return IMPL.getY(view);
    }

    public static float getZ(View view)
    {
        return IMPL.getZ(view);
    }

    public static boolean hasAccessibilityDelegate(View view)
    {
        return IMPL.hasAccessibilityDelegate(view);
    }

    public static boolean hasNestedScrollingParent(View view)
    {
        return IMPL.hasNestedScrollingParent(view);
    }

    public static boolean hasOverlappingRendering(View view)
    {
        return IMPL.hasOverlappingRendering(view);
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

    public static boolean isNestedScrollingEnabled(View view)
    {
        return IMPL.isNestedScrollingEnabled(view);
    }

    public static boolean isOpaque(View view)
    {
        return IMPL.isOpaque(view);
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

    public static void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityevent)
    {
        IMPL.onInitializeAccessibilityEvent(view, accessibilityevent);
    }

    public static void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfoCompat accessibilitynodeinfocompat)
    {
        IMPL.onInitializeAccessibilityNodeInfo(view, accessibilitynodeinfocompat);
    }

    public static void onPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityevent)
    {
        IMPL.onPopulateAccessibilityEvent(view, accessibilityevent);
    }

    public static boolean performAccessibilityAction(View view, int i, Bundle bundle)
    {
        return IMPL.performAccessibilityAction(view, i, bundle);
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

    public static void setAccessibilityLiveRegion(View view, int i)
    {
        IMPL.setAccessibilityLiveRegion(view, i);
    }

    public static void setActivated(View view, boolean flag)
    {
        IMPL.setActivated(view, flag);
    }

    public static void setAlpha(View view, float f)
    {
        IMPL.setAlpha(view, f);
    }

    public static void setBackgroundTintList(View view, ColorStateList colorstatelist)
    {
        IMPL.setBackgroundTintList(view, colorstatelist);
    }

    public static void setBackgroundTintMode(View view, android.graphics.PorterDuff.Mode mode)
    {
        IMPL.setBackgroundTintMode(view, mode);
    }

    public static void setChildrenDrawingOrderEnabled(ViewGroup viewgroup, boolean flag)
    {
        IMPL.setChildrenDrawingOrderEnabled(viewgroup, flag);
    }

    public static void setClipBounds(View view, Rect rect)
    {
        IMPL.setClipBounds(view, rect);
    }

    public static void setElevation(View view, float f)
    {
        IMPL.setElevation(view, f);
    }

    public static void setFitsSystemWindows(View view, boolean flag)
    {
        IMPL.setFitsSystemWindows(view, flag);
    }

    public static void setHasTransientState(View view, boolean flag)
    {
        IMPL.setHasTransientState(view, flag);
    }

    public static void setImportantForAccessibility(View view, int i)
    {
        IMPL.setImportantForAccessibility(view, i);
    }

    public static void setLabelFor(View view, int i)
    {
        IMPL.setLabelFor(view, i);
    }

    public static void setLayerPaint(View view, Paint paint)
    {
        IMPL.setLayerPaint(view, paint);
    }

    public static void setLayerType(View view, int i, Paint paint)
    {
        IMPL.setLayerType(view, i, paint);
    }

    public static void setLayoutDirection(View view, int i)
    {
        IMPL.setLayoutDirection(view, i);
    }

    public static void setNestedScrollingEnabled(View view, boolean flag)
    {
        IMPL.setNestedScrollingEnabled(view, flag);
    }

    public static void setOnApplyWindowInsetsListener(View view, OnApplyWindowInsetsListener onapplywindowinsetslistener)
    {
        IMPL.setOnApplyWindowInsetsListener(view, onapplywindowinsetslistener);
    }

    public static void setOverScrollMode(View view, int i)
    {
        IMPL.setOverScrollMode(view, i);
    }

    public static void setPaddingRelative(View view, int i, int j, int k, int l)
    {
        IMPL.setPaddingRelative(view, i, j, k, l);
    }

    public static void setPivotX(View view, float f)
    {
        IMPL.setPivotX(view, f);
    }

    public static void setPivotY(View view, float f)
    {
        IMPL.setPivotX(view, f);
    }

    public static void setRotation(View view, float f)
    {
        IMPL.setRotation(view, f);
    }

    public static void setRotationX(View view, float f)
    {
        IMPL.setRotationX(view, f);
    }

    public static void setRotationY(View view, float f)
    {
        IMPL.setRotationY(view, f);
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

    public static void setTransitionName(View view, String s)
    {
        IMPL.setTransitionName(view, s);
    }

    public static void setTranslationX(View view, float f)
    {
        IMPL.setTranslationX(view, f);
    }

    public static void setTranslationY(View view, float f)
    {
        IMPL.setTranslationY(view, f);
    }

    public static void setTranslationZ(View view, float f)
    {
        IMPL.setTranslationZ(view, f);
    }

    public static void setX(View view, float f)
    {
        IMPL.setX(view, f);
    }

    public static void setY(View view, float f)
    {
        IMPL.setY(view, f);
    }

    public static boolean startNestedScroll(View view, int i)
    {
        return IMPL.startNestedScroll(view, i);
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

    /* member class not found */
    class ViewCompatImpl {}


    /* member class not found */
    class LollipopViewCompatImpl {}


    /* member class not found */
    class KitKatViewCompatImpl {}


    /* member class not found */
    class JbMr1ViewCompatImpl {}


    /* member class not found */
    class JBViewCompatImpl {}


    /* member class not found */
    class ICSViewCompatImpl {}


    /* member class not found */
    class HCViewCompatImpl {}


    /* member class not found */
    class GBViewCompatImpl {}


    /* member class not found */
    class EclairMr1ViewCompatImpl {}


    /* member class not found */
    class BaseViewCompatImpl {}

}
