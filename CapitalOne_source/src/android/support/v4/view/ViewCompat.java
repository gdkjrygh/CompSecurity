// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.view;

import android.support.v4.view.accessibility.AccessibilityNodeInfoCompat;
import android.support.v4.view.accessibility.AccessibilityNodeProviderCompat;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;

// Referenced classes of package android.support.v4.view:
//            AccessibilityDelegateCompat, ViewCompatGingerbread, ViewCompatHC, ViewCompatICS, 
//            ViewCompatJB

public class ViewCompat
{
    static class BaseViewCompatImpl
        implements ViewCompatImpl
    {

        public boolean canScrollHorizontally(View view, int i)
        {
            return false;
        }

        public boolean canScrollVertically(View view, int i)
        {
            return false;
        }

        public AccessibilityNodeProviderCompat getAccessibilityNodeProvider(View view)
        {
            return null;
        }

        long getFrameTime()
        {
            return 10L;
        }

        public int getImportantForAccessibility(View view)
        {
            return 0;
        }

        public int getOverScrollMode(View view)
        {
            return 2;
        }

        public boolean hasTransientState(View view)
        {
            return false;
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

        public void postInvalidateOnAnimation(View view)
        {
            view.postInvalidateDelayed(getFrameTime());
        }

        public void postInvalidateOnAnimation(View view, int i, int j, int k, int l)
        {
            view.postInvalidateDelayed(getFrameTime(), i, j, k, l);
        }

        public void postOnAnimation(View view, Runnable runnable)
        {
            view.postDelayed(runnable, getFrameTime());
        }

        public void postOnAnimationDelayed(View view, Runnable runnable, long l)
        {
            view.postDelayed(runnable, getFrameTime() + l);
        }

        public void setAccessibilityDelegate(View view, AccessibilityDelegateCompat accessibilitydelegatecompat)
        {
        }

        public void setHasTransientState(View view, boolean flag)
        {
        }

        public void setImportantForAccessibility(View view, int i)
        {
        }

        public void setOverScrollMode(View view, int i)
        {
        }

        BaseViewCompatImpl()
        {
        }
    }

    static class GBViewCompatImpl extends BaseViewCompatImpl
    {

        public int getOverScrollMode(View view)
        {
            return ViewCompatGingerbread.getOverScrollMode(view);
        }

        public void setOverScrollMode(View view, int i)
        {
            ViewCompatGingerbread.setOverScrollMode(view, i);
        }

        GBViewCompatImpl()
        {
        }
    }

    static class HCViewCompatImpl extends GBViewCompatImpl
    {

        long getFrameTime()
        {
            return ViewCompatHC.getFrameTime();
        }

        HCViewCompatImpl()
        {
        }
    }

    static class ICSViewCompatImpl extends HCViewCompatImpl
    {

        public boolean canScrollHorizontally(View view, int i)
        {
            return ViewCompatICS.canScrollHorizontally(view, i);
        }

        public boolean canScrollVertically(View view, int i)
        {
            return ViewCompatICS.canScrollVertically(view, i);
        }

        public void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityevent)
        {
            ViewCompatICS.onInitializeAccessibilityEvent(view, accessibilityevent);
        }

        public void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfoCompat accessibilitynodeinfocompat)
        {
            ViewCompatICS.onInitializeAccessibilityNodeInfo(view, accessibilitynodeinfocompat.getInfo());
        }

        public void onPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityevent)
        {
            ViewCompatICS.onPopulateAccessibilityEvent(view, accessibilityevent);
        }

        public void setAccessibilityDelegate(View view, AccessibilityDelegateCompat accessibilitydelegatecompat)
        {
            ViewCompatICS.setAccessibilityDelegate(view, accessibilitydelegatecompat.getBridge());
        }

        ICSViewCompatImpl()
        {
        }
    }

    static class JBViewCompatImpl extends ICSViewCompatImpl
    {

        public AccessibilityNodeProviderCompat getAccessibilityNodeProvider(View view)
        {
            view = ((View) (ViewCompatJB.getAccessibilityNodeProvider(view)));
            if (view != null)
            {
                return new AccessibilityNodeProviderCompat(view);
            } else
            {
                return null;
            }
        }

        public int getImportantForAccessibility(View view)
        {
            return ViewCompatJB.getImportantForAccessibility(view);
        }

        public boolean hasTransientState(View view)
        {
            return ViewCompatJB.hasTransientState(view);
        }

        public void postInvalidateOnAnimation(View view)
        {
            ViewCompatJB.postInvalidateOnAnimation(view);
        }

        public void postInvalidateOnAnimation(View view, int i, int j, int k, int l)
        {
            ViewCompatJB.postInvalidateOnAnimation(view, i, j, k, l);
        }

        public void postOnAnimation(View view, Runnable runnable)
        {
            ViewCompatJB.postOnAnimation(view, runnable);
        }

        public void postOnAnimationDelayed(View view, Runnable runnable, long l)
        {
            ViewCompatJB.postOnAnimationDelayed(view, runnable, l);
        }

        public void setHasTransientState(View view, boolean flag)
        {
            ViewCompatJB.setHasTransientState(view, flag);
        }

        public void setImportantForAccessibility(View view, int i)
        {
            ViewCompatJB.setImportantForAccessibility(view, i);
        }

        JBViewCompatImpl()
        {
        }
    }

    static interface ViewCompatImpl
    {

        public abstract boolean canScrollHorizontally(View view, int i);

        public abstract boolean canScrollVertically(View view, int i);

        public abstract AccessibilityNodeProviderCompat getAccessibilityNodeProvider(View view);

        public abstract int getImportantForAccessibility(View view);

        public abstract int getOverScrollMode(View view);

        public abstract boolean hasTransientState(View view);

        public abstract void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityevent);

        public abstract void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfoCompat accessibilitynodeinfocompat);

        public abstract void onPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityevent);

        public abstract void postInvalidateOnAnimation(View view);

        public abstract void postInvalidateOnAnimation(View view, int i, int j, int k, int l);

        public abstract void postOnAnimation(View view, Runnable runnable);

        public abstract void postOnAnimationDelayed(View view, Runnable runnable, long l);

        public abstract void setAccessibilityDelegate(View view, AccessibilityDelegateCompat accessibilitydelegatecompat);

        public abstract void setHasTransientState(View view, boolean flag);

        public abstract void setImportantForAccessibility(View view, int i);

        public abstract void setOverScrollMode(View view, int i);
    }


    private static final long FAKE_FRAME_TIME = 10L;
    static final ViewCompatImpl IMPL;
    public static final int IMPORTANT_FOR_ACCESSIBILITY_AUTO = 0;
    public static final int IMPORTANT_FOR_ACCESSIBILITY_NO = 2;
    public static final int IMPORTANT_FOR_ACCESSIBILITY_YES = 1;
    public static final int OVER_SCROLL_ALWAYS = 0;
    public static final int OVER_SCROLL_IF_CONTENT_SCROLLS = 1;
    public static final int OVER_SCROLL_NEVER = 2;

    public ViewCompat()
    {
    }

    public static boolean canScrollHorizontally(View view, int i)
    {
        return IMPL.canScrollHorizontally(view, i);
    }

    public static boolean canScrollVertically(View view, int i)
    {
        return IMPL.canScrollVertically(view, i);
    }

    public static AccessibilityNodeProviderCompat getAccessibilityNodeProvider(View view)
    {
        return IMPL.getAccessibilityNodeProvider(view);
    }

    public static int getImportantForAccessibility(View view)
    {
        return IMPL.getImportantForAccessibility(view);
    }

    public static int getOverScrollMode(View view)
    {
        return IMPL.getOverScrollMode(view);
    }

    public static boolean hasTransientState(View view)
    {
        return IMPL.hasTransientState(view);
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

    public static void setAccessibilityDelegate(View view, AccessibilityDelegateCompat accessibilitydelegatecompat)
    {
        IMPL.setAccessibilityDelegate(view, accessibilitydelegatecompat);
    }

    public static void setHasTransientState(View view, boolean flag)
    {
        IMPL.setHasTransientState(view, flag);
    }

    public static void setImportantForAccessibility(View view, int i)
    {
        IMPL.setImportantForAccessibility(view, i);
    }

    public static void setOverScrollMode(View view, int i)
    {
        IMPL.setOverScrollMode(view, i);
    }

    static 
    {
        int i = android.os.Build.VERSION.SDK_INT;
        if (i >= 16 || android.os.Build.VERSION.CODENAME.equals("JellyBean"))
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
        {
            IMPL = new BaseViewCompatImpl();
        }
    }
}
