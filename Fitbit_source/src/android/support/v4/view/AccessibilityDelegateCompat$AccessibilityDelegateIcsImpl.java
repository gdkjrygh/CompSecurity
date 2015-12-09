// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.view;

import android.support.v4.view.accessibility.AccessibilityNodeInfoCompat;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;

// Referenced classes of package android.support.v4.view:
//            AccessibilityDelegateCompat, AccessibilityDelegateCompatIcs

static class _cls1.val.compat extends 
{

    public boolean dispatchPopulateAccessibilityEvent(Object obj, View view, AccessibilityEvent accessibilityevent)
    {
        return AccessibilityDelegateCompatIcs.dispatchPopulateAccessibilityEvent(obj, view, accessibilityevent);
    }

    public Object newAccessiblityDelegateBridge(final AccessibilityDelegateCompat compat)
    {
        return AccessibilityDelegateCompatIcs.newAccessibilityDelegateBridge(new AccessibilityDelegateCompatIcs.AccessibilityDelegateBridge() {

            final AccessibilityDelegateCompat.AccessibilityDelegateIcsImpl this$0;
            final AccessibilityDelegateCompat val$compat;

            public boolean dispatchPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityevent)
            {
                return compat.dispatchPopulateAccessibilityEvent(view, accessibilityevent);
            }

            public void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityevent)
            {
                compat.onInitializeAccessibilityEvent(view, accessibilityevent);
            }

            public void onInitializeAccessibilityNodeInfo(View view, Object obj)
            {
                compat.onInitializeAccessibilityNodeInfo(view, new AccessibilityNodeInfoCompat(obj));
            }

            public void onPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityevent)
            {
                compat.onPopulateAccessibilityEvent(view, accessibilityevent);
            }

            public boolean onRequestSendAccessibilityEvent(ViewGroup viewgroup, View view, AccessibilityEvent accessibilityevent)
            {
                return compat.onRequestSendAccessibilityEvent(viewgroup, view, accessibilityevent);
            }

            public void sendAccessibilityEvent(View view, int i)
            {
                compat.sendAccessibilityEvent(view, i);
            }

            public void sendAccessibilityEventUnchecked(View view, AccessibilityEvent accessibilityevent)
            {
                compat.sendAccessibilityEventUnchecked(view, accessibilityevent);
            }

            
            {
                this$0 = AccessibilityDelegateCompat.AccessibilityDelegateIcsImpl.this;
                compat = accessibilitydelegatecompat;
                super();
            }
        });
    }

    public Object newAccessiblityDelegateDefaultImpl()
    {
        return AccessibilityDelegateCompatIcs.newAccessibilityDelegateDefaultImpl();
    }

    public void onInitializeAccessibilityEvent(Object obj, View view, AccessibilityEvent accessibilityevent)
    {
        AccessibilityDelegateCompatIcs.onInitializeAccessibilityEvent(obj, view, accessibilityevent);
    }

    public void onInitializeAccessibilityNodeInfo(Object obj, View view, AccessibilityNodeInfoCompat accessibilitynodeinfocompat)
    {
        AccessibilityDelegateCompatIcs.onInitializeAccessibilityNodeInfo(obj, view, accessibilitynodeinfocompat.getInfo());
    }

    public void onPopulateAccessibilityEvent(Object obj, View view, AccessibilityEvent accessibilityevent)
    {
        AccessibilityDelegateCompatIcs.onPopulateAccessibilityEvent(obj, view, accessibilityevent);
    }

    public boolean onRequestSendAccessibilityEvent(Object obj, ViewGroup viewgroup, View view, AccessibilityEvent accessibilityevent)
    {
        return AccessibilityDelegateCompatIcs.onRequestSendAccessibilityEvent(obj, viewgroup, view, accessibilityevent);
    }

    public void sendAccessibilityEvent(Object obj, View view, int i)
    {
        AccessibilityDelegateCompatIcs.sendAccessibilityEvent(obj, view, i);
    }

    public void sendAccessibilityEventUnchecked(Object obj, View view, AccessibilityEvent accessibilityevent)
    {
        AccessibilityDelegateCompatIcs.sendAccessibilityEventUnchecked(obj, view, accessibilityevent);
    }

    _cls1.val.compat()
    {
    }
}
