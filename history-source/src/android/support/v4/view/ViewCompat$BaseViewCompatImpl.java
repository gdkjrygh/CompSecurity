// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.view;

import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.v4.view.accessibility.AccessibilityNodeInfoCompat;
import android.support.v4.view.accessibility.AccessibilityNodeProviderCompat;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import java.lang.reflect.Method;
import java.util.WeakHashMap;

// Referenced classes of package android.support.v4.view:
//            ViewCompat, ViewPropertyAnimatorCompat, AccessibilityDelegateCompat, OnApplyWindowInsetsListener

static class mViewPropertyAnimatorCompatMap
    implements mViewPropertyAnimatorCompatMap
{

    private Method mDispatchFinishTemporaryDetach;
    private Method mDispatchStartTemporaryDetach;
    private boolean mTempDetachBound;
    WeakHashMap mViewPropertyAnimatorCompatMap;

    private void bindTempDetach()
    {
        try
        {
            mDispatchStartTemporaryDetach = android/view/View.getDeclaredMethod("dispatchStartTemporaryDetach", new Class[0]);
            mDispatchFinishTemporaryDetach = android/view/View.getDeclaredMethod("dispatchFinishTemporaryDetach", new Class[0]);
        }
        catch (NoSuchMethodException nosuchmethodexception)
        {
            Log.e("ViewCompat", "Couldn't find method", nosuchmethodexception);
        }
        mTempDetachBound = true;
    }

    public ViewPropertyAnimatorCompat animate(View view)
    {
        return new ViewPropertyAnimatorCompat(view);
    }

    public boolean canScrollHorizontally(View view, int i)
    {
        return false;
    }

    public boolean canScrollVertically(View view, int i)
    {
        return false;
    }

    public void dispatchFinishTemporaryDetach(View view)
    {
        if (!mTempDetachBound)
        {
            bindTempDetach();
        }
        if (mDispatchFinishTemporaryDetach != null)
        {
            try
            {
                mDispatchFinishTemporaryDetach.invoke(view, new Object[0]);
                return;
            }
            // Misplaced declaration of an exception variable
            catch (View view)
            {
                Log.d("ViewCompat", "Error calling dispatchFinishTemporaryDetach", view);
            }
            return;
        } else
        {
            view.onFinishTemporaryDetach();
            return;
        }
    }

    public void dispatchStartTemporaryDetach(View view)
    {
        if (!mTempDetachBound)
        {
            bindTempDetach();
        }
        if (mDispatchStartTemporaryDetach != null)
        {
            try
            {
                mDispatchStartTemporaryDetach.invoke(view, new Object[0]);
                return;
            }
            // Misplaced declaration of an exception variable
            catch (View view)
            {
                Log.d("ViewCompat", "Error calling dispatchStartTemporaryDetach", view);
            }
            return;
        } else
        {
            view.onStartTemporaryDetach();
            return;
        }
    }

    public int getAccessibilityLiveRegion(View view)
    {
        return 0;
    }

    public AccessibilityNodeProviderCompat getAccessibilityNodeProvider(View view)
    {
        return null;
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

    public int getLabelFor(View view)
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

    public int getMeasuredHeightAndState(View view)
    {
        return view.getMeasuredHeight();
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
        return 0;
    }

    public int getMinimumWidth(View view)
    {
        return 0;
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

    public float getPivotX(View view)
    {
        return 0.0F;
    }

    public float getPivotY(View view)
    {
        return 0.0F;
    }

    public float getRotation(View view)
    {
        return 0.0F;
    }

    public float getRotationX(View view)
    {
        return 0.0F;
    }

    public float getRotationY(View view)
    {
        return 0.0F;
    }

    public float getScaleX(View view)
    {
        return 0.0F;
    }

    public float getScaleY(View view)
    {
        return 0.0F;
    }

    public String getTransitionName(View view)
    {
        return null;
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

    public float getX(View view)
    {
        return 0.0F;
    }

    public float getY(View view)
    {
        return 0.0F;
    }

    public boolean hasAccessibilityDelegate(View view)
    {
        return false;
    }

    public boolean hasTransientState(View view)
    {
        return false;
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

    public void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityevent)
    {
    }

    public void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfoCompat accessibilitynodeinfocompat)
    {
    }

    public void onPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityevent)
    {
    }

    public boolean performAccessibilityAction(View view, int i, Bundle bundle)
    {
        return false;
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

    public void setAccessibilityLiveRegion(View view, int i)
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

    public void setHasTransientState(View view, boolean flag)
    {
    }

    public void setImportantForAccessibility(View view, int i)
    {
    }

    public void setLabelFor(View view, int i)
    {
    }

    public void setLayerPaint(View view, Paint paint)
    {
    }

    public void setLayerType(View view, int i, Paint paint)
    {
    }

    public void setLayoutDirection(View view, int i)
    {
    }

    public void setOnApplyWindowInsetsListener(View view, OnApplyWindowInsetsListener onapplywindowinsetslistener)
    {
    }

    public void setOverScrollMode(View view, int i)
    {
    }

    public void setPaddingRelative(View view, int i, int j, int k, int l)
    {
        view.setPadding(i, j, k, l);
    }

    public void setPivotX(View view, float f)
    {
    }

    public void setPivotY(View view, float f)
    {
    }

    public void setRotation(View view, float f)
    {
    }

    public void setRotationX(View view, float f)
    {
    }

    public void setRotationY(View view, float f)
    {
    }

    public void setScaleX(View view, float f)
    {
    }

    public void setScaleY(View view, float f)
    {
    }

    public void setTransitionName(View view, String s)
    {
    }

    public void setTranslationX(View view, float f)
    {
    }

    public void setTranslationY(View view, float f)
    {
    }

    public void setTranslationZ(View view, float f)
    {
    }

    public void setX(View view, float f)
    {
    }

    public void setY(View view, float f)
    {
    }

    eInfoCompat()
    {
        mViewPropertyAnimatorCompatMap = null;
    }
}
