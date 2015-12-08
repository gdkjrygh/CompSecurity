// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.accessibility.AccessibilityManager;

final class oy extends oz
{

    oy()
    {
    }

    public final boolean a(AccessibilityManager accessibilitymanager)
    {
        return accessibilitymanager.isTouchExplorationEnabled();
    }
}
