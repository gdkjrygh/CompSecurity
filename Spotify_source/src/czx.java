// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.View;

final class czx extends android.view.View.AccessibilityDelegate
{

    android.view.View.AccessibilityDelegate a;
    czw b;

    public czx(czw czw1, android.view.View.AccessibilityDelegate accessibilitydelegate)
    {
        b = czw1;
        super();
        a = accessibilitydelegate;
    }

    public final void sendAccessibilityEvent(View view, int i)
    {
        if (i == b.c)
        {
            b.c(view);
        }
        if (a != null)
        {
            a.sendAccessibilityEvent(view, i);
        }
    }
}
