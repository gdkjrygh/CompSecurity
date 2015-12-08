// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.view.accessibility;

import android.view.accessibility.AccessibilityEvent;

// Referenced classes of package android.support.v4.view.accessibility:
//            AccessibilityEventCompat, AccessibilityEventCompatKitKat

static class a extends a
{

    public int getContentChangeTypes(AccessibilityEvent accessibilityevent)
    {
        return AccessibilityEventCompatKitKat.getContentChangeTypes(accessibilityevent);
    }

    public void setContentChangeTypes(AccessibilityEvent accessibilityevent, int i)
    {
        AccessibilityEventCompatKitKat.setContentChangeTypes(accessibilityevent, i);
    }

    a()
    {
    }
}
