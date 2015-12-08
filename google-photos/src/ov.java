// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.accessibility.AccessibilityEvent;

final class ov extends ou
{

    ov()
    {
    }

    public final int a(AccessibilityEvent accessibilityevent)
    {
        return accessibilityevent.getContentChangeTypes();
    }

    public final void a(AccessibilityEvent accessibilityevent, int i)
    {
        accessibilityevent.setContentChangeTypes(i);
    }
}
