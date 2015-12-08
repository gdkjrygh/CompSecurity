// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.util.accessibility;

import android.app.Application;
import android.content.res.Resources;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import com.google.android.apps.wallet.android.AndroidApiMethods;
import java.util.List;

public class AccessibilityUtil
{

    private final Application application;
    private final AccessibilityManager manager;

    AccessibilityUtil(Application application1, AccessibilityManager accessibilitymanager)
    {
        application = application1;
        manager = accessibilitymanager;
    }

    public final void announce(View view, int i)
    {
        announce(view, application.getResources().getText(i));
    }

    public final void announce(View view, CharSequence charsequence)
    {
        if (!manager.isEnabled())
        {
            return;
        }
        if (AndroidApiMethods.VIEW_ANNOUNCE_FOR_ACCESSIBILITY.isAvailable())
        {
            view.announceForAccessibility(charsequence);
            return;
        } else
        {
            AccessibilityEvent accessibilityevent = AccessibilityEvent.obtain(8);
            accessibilityevent.getText().add(charsequence);
            accessibilityevent.setEnabled(view.isEnabled());
            accessibilityevent.setClassName(view.getClass().getName());
            accessibilityevent.setPackageName(application.getPackageName());
            accessibilityevent.setSource(view);
            manager.sendAccessibilityEvent(accessibilityevent);
            return;
        }
    }
}
