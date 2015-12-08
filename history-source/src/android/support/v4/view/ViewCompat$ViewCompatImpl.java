// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.view;

import android.graphics.Paint;
import android.os.Bundle;
import android.support.v4.view.accessibility.AccessibilityNodeInfoCompat;
import android.support.v4.view.accessibility.AccessibilityNodeProviderCompat;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;

// Referenced classes of package android.support.v4.view:
//            ViewCompat, ViewPropertyAnimatorCompat, AccessibilityDelegateCompat, OnApplyWindowInsetsListener

static interface r
{

    public abstract ViewPropertyAnimatorCompat animate(View view);

    public abstract boolean canScrollHorizontally(View view, int i);

    public abstract boolean canScrollVertically(View view, int i);

    public abstract void dispatchFinishTemporaryDetach(View view);

    public abstract void dispatchStartTemporaryDetach(View view);

    public abstract int getAccessibilityLiveRegion(View view);

    public abstract AccessibilityNodeProviderCompat getAccessibilityNodeProvider(View view);

    public abstract float getAlpha(View view);

    public abstract float getElevation(View view);

    public abstract boolean getFitsSystemWindows(View view);

    public abstract int getImportantForAccessibility(View view);

    public abstract int getLabelFor(View view);

    public abstract int getLayerType(View view);

    public abstract int getLayoutDirection(View view);

    public abstract int getMeasuredHeightAndState(View view);

    public abstract int getMeasuredState(View view);

    public abstract int getMeasuredWidthAndState(View view);

    public abstract int getMinimumHeight(View view);

    public abstract int getMinimumWidth(View view);

    public abstract int getOverScrollMode(View view);

    public abstract int getPaddingEnd(View view);

    public abstract int getPaddingStart(View view);

    public abstract ViewParent getParentForAccessibility(View view);

    public abstract float getPivotX(View view);

    public abstract float getPivotY(View view);

    public abstract float getRotation(View view);

    public abstract float getRotationX(View view);

    public abstract float getRotationY(View view);

    public abstract float getScaleX(View view);

    public abstract float getScaleY(View view);

    public abstract String getTransitionName(View view);

    public abstract float getTranslationX(View view);

    public abstract float getTranslationY(View view);

    public abstract float getTranslationZ(View view);

    public abstract int getWindowSystemUiVisibility(View view);

    public abstract float getX(View view);

    public abstract float getY(View view);

    public abstract boolean hasAccessibilityDelegate(View view);

    public abstract boolean hasTransientState(View view);

    public abstract boolean isOpaque(View view);

    public abstract void jumpDrawablesToCurrentState(View view);

    public abstract void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityevent);

    public abstract void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfoCompat accessibilitynodeinfocompat);

    public abstract void onPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityevent);

    public abstract boolean performAccessibilityAction(View view, int i, Bundle bundle);

    public abstract void postInvalidateOnAnimation(View view);

    public abstract void postInvalidateOnAnimation(View view, int i, int j, int k, int l);

    public abstract void postOnAnimation(View view, Runnable runnable);

    public abstract void postOnAnimationDelayed(View view, Runnable runnable, long l);

    public abstract void requestApplyInsets(View view);

    public abstract int resolveSizeAndState(int i, int j, int k);

    public abstract void setAccessibilityDelegate(View view, AccessibilityDelegateCompat accessibilitydelegatecompat);

    public abstract void setAccessibilityLiveRegion(View view, int i);

    public abstract void setAlpha(View view, float f);

    public abstract void setChildrenDrawingOrderEnabled(ViewGroup viewgroup, boolean flag);

    public abstract void setElevation(View view, float f);

    public abstract void setHasTransientState(View view, boolean flag);

    public abstract void setImportantForAccessibility(View view, int i);

    public abstract void setLabelFor(View view, int i);

    public abstract void setLayerPaint(View view, Paint paint);

    public abstract void setLayerType(View view, int i, Paint paint);

    public abstract void setLayoutDirection(View view, int i);

    public abstract void setOnApplyWindowInsetsListener(View view, OnApplyWindowInsetsListener onapplywindowinsetslistener);

    public abstract void setOverScrollMode(View view, int i);

    public abstract void setPaddingRelative(View view, int i, int j, int k, int l);

    public abstract void setPivotX(View view, float f);

    public abstract void setPivotY(View view, float f);

    public abstract void setRotation(View view, float f);

    public abstract void setRotationX(View view, float f);

    public abstract void setRotationY(View view, float f);

    public abstract void setScaleX(View view, float f);

    public abstract void setScaleY(View view, float f);

    public abstract void setTransitionName(View view, String s);

    public abstract void setTranslationX(View view, float f);

    public abstract void setTranslationY(View view, float f);

    public abstract void setTranslationZ(View view, float f);

    public abstract void setX(View view, float f);

    public abstract void setY(View view, float f);
}
