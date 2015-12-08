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

class val.compat
    implements ellyBean
{

    final val.compat this$0;
    final AccessibilityDelegateCompat val$compat;

    public boolean dispatchPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityevent)
    {
        return val$compat.dispatchPopulateAccessibilityEvent(view, accessibilityevent);
    }

    public Object getAccessibilityNodeProvider(View view)
    {
        view = val$compat.getAccessibilityNodeProvider(view);
        if (view != null)
        {
            return view.getProvider();
        } else
        {
            return null;
        }
    }

    public void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityevent)
    {
        val$compat.onInitializeAccessibilityEvent(view, accessibilityevent);
    }

    public void onInitializeAccessibilityNodeInfo(View view, Object obj)
    {
        val$compat.onInitializeAccessibilityNodeInfo(view, new AccessibilityNodeInfoCompat(obj));
    }

    public void onPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityevent)
    {
        val$compat.onPopulateAccessibilityEvent(view, accessibilityevent);
    }

    public boolean onRequestSendAccessibilityEvent(ViewGroup viewgroup, View view, AccessibilityEvent accessibilityevent)
    {
        return val$compat.onRequestSendAccessibilityEvent(viewgroup, view, accessibilityevent);
    }

    public boolean performAccessibilityAction(View view, int i, Bundle bundle)
    {
        return val$compat.performAccessibilityAction(view, i, bundle);
    }

    public void sendAccessibilityEvent(View view, int i)
    {
        val$compat.sendAccessibilityEvent(view, i);
    }

    public void sendAccessibilityEventUnchecked(View view, AccessibilityEvent accessibilityevent)
    {
        val$compat.sendAccessibilityEventUnchecked(view, accessibilityevent);
    }

    ellyBean()
    {
        this$0 = final_ellybean;
        val$compat = AccessibilityDelegateCompat.this;
        super();
    }
}
