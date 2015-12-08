// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;

class nx extends ny
{

    nx()
    {
    }

    public final boolean a(ViewParent viewparent, View view, AccessibilityEvent accessibilityevent)
    {
        return viewparent.requestSendAccessibilityEvent(view, accessibilityevent);
    }
}
