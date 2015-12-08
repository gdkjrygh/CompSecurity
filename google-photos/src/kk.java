// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;

public final class kk extends android.view.View.AccessibilityDelegate
{

    private kl a;

    public kk(kl kl1)
    {
        a = kl1;
        super();
    }

    public final boolean dispatchPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityevent)
    {
        return a.a(view, accessibilityevent);
    }

    public final AccessibilityNodeProvider getAccessibilityNodeProvider(View view)
    {
        return (AccessibilityNodeProvider)a.a(view);
    }

    public final void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityevent)
    {
        a.b(view, accessibilityevent);
    }

    public final void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilitynodeinfo)
    {
        a.a(view, accessibilitynodeinfo);
    }

    public final void onPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityevent)
    {
        a.c(view, accessibilityevent);
    }

    public final boolean onRequestSendAccessibilityEvent(ViewGroup viewgroup, View view, AccessibilityEvent accessibilityevent)
    {
        return a.a(viewgroup, view, accessibilityevent);
    }

    public final boolean performAccessibilityAction(View view, int i, Bundle bundle)
    {
        return a.a(view, i, bundle);
    }

    public final void sendAccessibilityEvent(View view, int i)
    {
        a.a(view, i);
    }

    public final void sendAccessibilityEventUnchecked(View view, AccessibilityEvent accessibilityevent)
    {
        a.d(view, accessibilityevent);
    }
}
