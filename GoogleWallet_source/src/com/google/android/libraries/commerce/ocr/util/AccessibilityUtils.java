// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.commerce.ocr.util;

import android.content.Context;
import android.support.v4.view.accessibility.AccessibilityEventCompat;
import android.support.v4.view.accessibility.AccessibilityRecordCompat;
import android.util.Log;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import java.util.List;

public final class AccessibilityUtils
{

    private final AccessibilityManager accessibilityManager;
    private final Context context;

    public AccessibilityUtils(Context context1)
    {
        context = context1;
        accessibilityManager = (AccessibilityManager)context1.getSystemService("accessibility");
    }

    public final void sendAnnouncementEventForViewContentDescription(View view)
    {
        if (view == null)
        {
            Log.w("AccessibilityUtils", "Could not send announcement for null view");
        } else
        {
            if (android.os.Build.VERSION.SDK_INT >= 16)
            {
                view.announceForAccessibility(view.getContentDescription());
                return;
            }
            if (accessibilityManager.isEnabled())
            {
                char c = '\b';
                if (android.os.Build.VERSION.SDK_INT >= 16)
                {
                    c = '\u4000';
                }
                AccessibilityEvent accessibilityevent = AccessibilityEvent.obtain(c);
                accessibilityevent.setEnabled(true);
                accessibilityevent.getText().add(view.getContentDescription());
                accessibilityevent.setClassName(view.getClass().getName());
                accessibilityevent.setPackageName(context.getPackageName());
                AccessibilityEventCompat.asRecord(accessibilityevent).setSource(view);
                accessibilityManager.sendAccessibilityEvent(accessibilityevent);
                return;
            }
        }
    }
}
