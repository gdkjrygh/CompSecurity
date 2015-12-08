// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.miteksystems.misnap;

import android.accessibilityservice.AccessibilityServiceInfo;
import android.content.Context;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import java.util.Iterator;
import java.util.List;

public final class i
{

    Context a;
    private boolean b;

    public i(Context context)
    {
        b = false;
        a = null;
        a = context.getApplicationContext();
        b();
    }

    private void b()
    {
        if (android.os.Build.VERSION.SDK_INT < 14)
        {
            break MISSING_BLOCK_LABEL_79;
        }
        Object obj = (AccessibilityManager)a.getSystemService("accessibility");
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_84;
        }
        obj = ((AccessibilityManager) (obj)).getEnabledAccessibilityServiceList(1);
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_84;
        }
        obj = ((List) (obj)).iterator();
_L2:
        if (!((Iterator) (obj)).hasNext())
        {
            return;
        }
        if (!"com.google.android.marvin.talkback.TalkBackPreferencesActivity".equals(((AccessibilityServiceInfo)((Iterator) (obj)).next()).getSettingsActivityName())) goto _L2; else goto _L1
_L1:
        b = true;
        return;
        Exception exception;
        exception;
        b = false;
    }

    public final void a(View view)
    {
        while (!b || view == null || android.os.Build.VERSION.SDK_INT < 16) 
        {
            return;
        }
        try
        {
            view.setImportantForAccessibility(2);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (View view)
        {
            return;
        }
    }

    public final void a(View view, int j)
    {
        if (!b || view == null)
        {
            return;
        }
        try
        {
            view.setContentDescription(a.getString(j));
            return;
        }
        // Misplaced declaration of an exception variable
        catch (View view)
        {
            return;
        }
    }

    public final void a(View view, String s)
    {
        if (!b || view == null)
        {
            return;
        }
        try
        {
            view.setContentDescription(s);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (View view)
        {
            return;
        }
    }

    public final boolean a()
    {
        return b;
    }

    public final void b(View view)
    {
        while (!b || view == null || android.os.Build.VERSION.SDK_INT < 16) 
        {
            return;
        }
        try
        {
            view.setImportantForAccessibility(1);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (View view)
        {
            return;
        }
    }
}
