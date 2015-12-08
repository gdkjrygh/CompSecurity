// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.view.accessibility;

import android.view.accessibility.AccessibilityEvent;

class AccessibilityEventCompatKitKat
{

    public static int getContentChangeTypes(AccessibilityEvent accessibilityevent)
    {
        return accessibilityevent.getContentChangeTypes();
    }

    public static void setContentChangeTypes(AccessibilityEvent accessibilityevent, int i)
    {
        accessibilityevent.setContentChangeTypes(i);
    }
}
