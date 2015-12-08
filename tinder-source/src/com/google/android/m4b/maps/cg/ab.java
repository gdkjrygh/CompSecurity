// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.cg;

import android.content.Context;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import java.util.List;

public final class ab
{

    public static void a(View view, String s)
    {
        if (android.os.Build.VERSION.SDK_INT >= 16)
        {
            view.announceForAccessibility(s);
        } else
        if (android.os.Build.VERSION.SDK_INT >= 14)
        {
            AccessibilityEvent accessibilityevent = AccessibilityEvent.obtain(8);
            accessibilityevent.getText().add(s);
            accessibilityevent.setEnabled(view.isEnabled());
            accessibilityevent.setClassName(view.getClass().getName());
            accessibilityevent.setPackageName(view.getContext().getPackageName());
            view.getParent().requestSendAccessibilityEvent(view, accessibilityevent);
            return;
        }
    }

    public static boolean a(Context context)
    {
        if (context.getSystemService("accessibility") == null)
        {
            return false;
        } else
        {
            return ((AccessibilityManager)context.getSystemService("accessibility")).isEnabled();
        }
    }
}
