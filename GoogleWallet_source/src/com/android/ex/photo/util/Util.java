// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.android.ex.photo.util;

import android.content.Context;
import android.support.v4.view.accessibility.AccessibilityEventCompat;
import android.support.v4.view.accessibility.AccessibilityRecordCompat;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import java.util.List;

public final class Util
{

    public static void announceForAccessibility(View view, AccessibilityManager accessibilitymanager, CharSequence charsequence)
    {
        if (android.os.Build.VERSION.SDK_INT >= 16)
        {
            view.announceForAccessibility(charsequence);
        } else
        {
            Context context = view.getContext().getApplicationContext();
            AccessibilityManager accessibilitymanager1 = accessibilitymanager;
            if (accessibilitymanager == null)
            {
                accessibilitymanager1 = (AccessibilityManager)context.getSystemService("accessibility");
            }
            if (accessibilitymanager1.isEnabled())
            {
                accessibilitymanager = AccessibilityEvent.obtain(8);
                accessibilitymanager.getText().add(charsequence);
                accessibilitymanager.setEnabled(view.isEnabled());
                accessibilitymanager.setClassName(view.getClass().getName());
                accessibilitymanager.setPackageName(context.getPackageName());
                AccessibilityEventCompat.asRecord(accessibilitymanager).setSource(view);
                if (android.os.Build.VERSION.SDK_INT >= 14)
                {
                    view.getParent().requestSendAccessibilityEvent(view, accessibilitymanager);
                    return;
                } else
                {
                    accessibilitymanager1.sendAccessibilityEvent(accessibilitymanager);
                    return;
                }
            }
        }
    }

    public static boolean isTouchExplorationEnabled(AccessibilityManager accessibilitymanager)
    {
        if (android.os.Build.VERSION.SDK_INT >= 14)
        {
            return accessibilitymanager.isTouchExplorationEnabled();
        } else
        {
            return false;
        }
    }
}
