// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.view;

import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;

final class AccessibilityDelegateCompatIcs
{
    public static interface AccessibilityDelegateBridge
    {

        public abstract boolean dispatchPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityevent);

        public abstract void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityevent);

        public abstract void onInitializeAccessibilityNodeInfo(View view, Object obj);

        public abstract void onPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityevent);

        public abstract boolean onRequestSendAccessibilityEvent(ViewGroup viewgroup, View view, AccessibilityEvent accessibilityevent);

        public abstract void sendAccessibilityEvent(View view, int i);

        public abstract void sendAccessibilityEventUnchecked(View view, AccessibilityEvent accessibilityevent);
    }


    // Unreferenced inner class android/support/v4/view/AccessibilityDelegateCompatIcs$1

/* anonymous class */
    static final class _cls1 extends android.view.View.AccessibilityDelegate
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

            
            {
                bridge = accessibilitydelegatebridge;
                super();
            }
    }

}
