// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.view;

import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;

class AccessibilityDelegateCompatIcs
{

    AccessibilityDelegateCompatIcs()
    {
    }

    public static boolean dispatchPopulateAccessibilityEvent(Object obj, View view, AccessibilityEvent accessibilityevent)
    {
        return ((android.view.View.AccessibilityDelegate)obj).dispatchPopulateAccessibilityEvent(view, accessibilityevent);
    }

    public static Object newAccessibilityDelegateBridge(final AccessibilityDelegateBridge bridge)
    {
        return new _cls1();
    }

    public static Object newAccessibilityDelegateDefaultImpl()
    {
        return new android.view.View.AccessibilityDelegate();
    }

    public static void onInitializeAccessibilityEvent(Object obj, View view, AccessibilityEvent accessibilityevent)
    {
        ((android.view.View.AccessibilityDelegate)obj).onInitializeAccessibilityEvent(view, accessibilityevent);
    }

    public static void onInitializeAccessibilityNodeInfo(Object obj, View view, Object obj1)
    {
        ((android.view.View.AccessibilityDelegate)obj).onInitializeAccessibilityNodeInfo(view, (AccessibilityNodeInfo)obj1);
    }

    public static void onPopulateAccessibilityEvent(Object obj, View view, AccessibilityEvent accessibilityevent)
    {
        ((android.view.View.AccessibilityDelegate)obj).onPopulateAccessibilityEvent(view, accessibilityevent);
    }

    public static boolean onRequestSendAccessibilityEvent(Object obj, ViewGroup viewgroup, View view, AccessibilityEvent accessibilityevent)
    {
        return ((android.view.View.AccessibilityDelegate)obj).onRequestSendAccessibilityEvent(viewgroup, view, accessibilityevent);
    }

    public static void sendAccessibilityEvent(Object obj, View view, int i)
    {
        ((android.view.View.AccessibilityDelegate)obj).sendAccessibilityEvent(view, i);
    }

    public static void sendAccessibilityEventUnchecked(Object obj, View view, AccessibilityEvent accessibilityevent)
    {
        ((android.view.View.AccessibilityDelegate)obj).sendAccessibilityEventUnchecked(view, accessibilityevent);
    }

    private class _cls1 extends android.view.View.AccessibilityDelegate
    {

        final AccessibilityDelegateBridge val$bridge;

        public final boolean dispatchPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityevent)
        {
            return bridge.dispatchPopulateAccessibilityEvent(view, accessibilityevent);
        }

        public final void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityevent)
        {
            bridge.onInitializeAccessibilityEvent(view, accessibilityevent);
        }

        public final void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilitynodeinfo)
        {
            bridge.onInitializeAccessibilityNodeInfo(view, accessibilitynodeinfo);
        }

        public final void onPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityevent)
        {
            bridge.onPopulateAccessibilityEvent(view, accessibilityevent);
        }

        public final boolean onRequestSendAccessibilityEvent(ViewGroup viewgroup, View view, AccessibilityEvent accessibilityevent)
        {
            return bridge.onRequestSendAccessibilityEvent(viewgroup, view, accessibilityevent);
        }

        public final void sendAccessibilityEvent(View view, int i)
        {
            bridge.sendAccessibilityEvent(view, i);
        }

        public final void sendAccessibilityEventUnchecked(View view, AccessibilityEvent accessibilityevent)
        {
            bridge.sendAccessibilityEventUnchecked(view, accessibilityevent);
        }

        _cls1()
        {
            bridge = accessibilitydelegatebridge;
            super();
        }

        private class AccessibilityDelegateBridge
        {

            public abstract boolean dispatchPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityevent);

            public abstract void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityevent);

            public abstract void onInitializeAccessibilityNodeInfo(View view, Object obj);

            public abstract void onPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityevent);

            public abstract boolean onRequestSendAccessibilityEvent(ViewGroup viewgroup, View view, AccessibilityEvent accessibilityevent);

            public abstract void sendAccessibilityEvent(View view, int i);

            public abstract void sendAccessibilityEventUnchecked(View view, AccessibilityEvent accessibilityevent);
        }

    }

}
