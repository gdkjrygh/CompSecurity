// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.view;

import android.graphics.Paint;
import android.os.Bundle;
import android.support.v4.view.accessibility.AccessibilityNodeInfoCompat;
import android.support.v4.view.accessibility.AccessibilityNodeProviderCompat;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;

// Referenced classes of package android.support.v4.view:
//            ViewCompat, AccessibilityDelegateCompat

static interface t
{

    public abstract boolean canScrollHorizontally(View view, int i);

    public abstract boolean canScrollVertically(View view, int i);

    public abstract AccessibilityNodeProviderCompat getAccessibilityNodeProvider(View view);

    public abstract float getAlpha(View view);

    public abstract int getImportantForAccessibility(View view);

    public abstract int getLabelFor(View view);

    public abstract int getLayerType(View view);

    public abstract int getLayoutDirection(View view);

    public abstract int getOverScrollMode(View view);

    public abstract ViewParent getParentForAccessibility(View view);

    public abstract boolean hasTransientState(View view);

    public abstract boolean isOpaque(View view);

    public abstract void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityevent);

    public abstract void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfoCompat accessibilitynodeinfocompat);

    public abstract void onPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityevent);

    public abstract boolean performAccessibilityAction(View view, int i, Bundle bundle);

    public abstract void postInvalidateOnAnimation(View view);

    public abstract void postInvalidateOnAnimation(View view, int i, int j, int k, int l);

    public abstract void postOnAnimation(View view, Runnable runnable);

    public abstract void postOnAnimationDelayed(View view, Runnable runnable, long l);

    public abstract void setAccessibilityDelegate(View view, AccessibilityDelegateCompat accessibilitydelegatecompat);

    public abstract void setHasTransientState(View view, boolean flag);

    public abstract void setImportantForAccessibility(View view, int i);

    public abstract void setLabelFor(View view, int i);

    public abstract void setLayerPaint(View view, Paint paint);

    public abstract void setLayerType(View view, int i, Paint paint);

    public abstract void setLayoutDirection(View view, int i);

    public abstract void setOverScrollMode(View view, int i);
}
