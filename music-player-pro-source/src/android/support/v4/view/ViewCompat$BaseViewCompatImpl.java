// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.view;

import android.support.v4.view.accessibility.AccessibilityNodeInfoCompat;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;

// Referenced classes of package android.support.v4.view:
//            ViewCompat, AccessibilityDelegateCompat

static class eInfoCompat
    implements eInfoCompat
{

    public boolean canScrollHorizontally(View view, int i)
    {
        return false;
    }

    public boolean canScrollVertically(View view, int i)
    {
        return false;
    }

    public int getOverScrollMode(View view)
    {
        return 2;
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

    public void setAccessibilityDelegate(View view, AccessibilityDelegateCompat accessibilitydelegatecompat)
    {
    }

    public void setOverScrollMode(View view, int i)
    {
    }

    eInfoCompat()
    {
    }
}
