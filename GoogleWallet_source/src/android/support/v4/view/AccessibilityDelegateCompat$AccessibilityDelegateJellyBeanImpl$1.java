// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.view;

import android.os.Bundle;
import android.support.v4.view.accessibility.AccessibilityNodeInfoCompat;
import android.support.v4.view.accessibility.AccessibilityNodeProviderCompat;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;

// Referenced classes of package android.support.v4.view:
//            AccessibilityDelegateCompat

final class val.compat
    implements ellyBean
{

    final val.compat this$0;
    final AccessibilityDelegateCompat val$compat;

    public final boolean dispatchPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityevent)
    {
        return val$compat.dispatchPopulateAccessibilityEvent(view, accessibilityevent);
    }

    public final Object getAccessibilityNodeProvider(View view)
    {
        AccessibilityDelegateCompat accessibilitydelegatecompat = val$compat;
        view = AccessibilityDelegateCompat.getAccessibilityNodeProvider(view);
        if (view != null)
        {
            return view.getProvider();
        } else
        {
            return null;
        }
    }

    public final void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityevent)
    {
        val$compat.onInitializeAccessibilityEvent(view, accessibilityevent);
    }

    public final void onInitializeAccessibilityNodeInfo(View view, Object obj)
    {
        val$compat.onInitializeAccessibilityNodeInfo(view, new AccessibilityNodeInfoCompat(obj));
    }

    public final void onPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityevent)
    {
        AccessibilityDelegateCompat accessibilitydelegatecompat = val$compat;
        AccessibilityDelegateCompat.onPopulateAccessibilityEvent(view, accessibilityevent);
    }

    public final boolean onRequestSendAccessibilityEvent(ViewGroup viewgroup, View view, AccessibilityEvent accessibilityevent)
    {
        return val$compat.onRequestSendAccessibilityEvent(viewgroup, view, accessibilityevent);
    }

    public final boolean performAccessibilityAction(View view, int i, Bundle bundle)
    {
        return val$compat.performAccessibilityAction(view, i, bundle);
    }

    public final void sendAccessibilityEvent(View view, int i)
    {
        AccessibilityDelegateCompat accessibilitydelegatecompat = val$compat;
        AccessibilityDelegateCompat.sendAccessibilityEvent(view, i);
    }

    public final void sendAccessibilityEventUnchecked(View view, AccessibilityEvent accessibilityevent)
    {
        AccessibilityDelegateCompat accessibilitydelegatecompat = val$compat;
        AccessibilityDelegateCompat.sendAccessibilityEventUnchecked(view, accessibilityevent);
    }

    ellyBean()
    {
        this$0 = final_ellybean;
        val$compat = AccessibilityDelegateCompat.this;
        super();
    }
}
