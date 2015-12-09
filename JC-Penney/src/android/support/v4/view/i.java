// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.view;

import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;

// Referenced classes of package android.support.v4.view:
//            j

final class i extends android.view.View.AccessibilityDelegate
{

    final j a;

    i(j j1)
    {
        a = j1;
        super();
    }

    public boolean dispatchPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityevent)
    {
        return a.a(view, accessibilityevent);
    }

    public void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityevent)
    {
        a.b(view, accessibilityevent);
    }

    public void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilitynodeinfo)
    {
        a.a(view, accessibilitynodeinfo);
    }

    public void onPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityevent)
    {
        a.c(view, accessibilityevent);
    }

    public boolean onRequestSendAccessibilityEvent(ViewGroup viewgroup, View view, AccessibilityEvent accessibilityevent)
    {
        return a.a(viewgroup, view, accessibilityevent);
    }

    public void sendAccessibilityEvent(View view, int k)
    {
        a.a(view, k);
    }

    public void sendAccessibilityEventUnchecked(View view, AccessibilityEvent accessibilityevent)
    {
        a.d(view, accessibilityevent);
    }
}
