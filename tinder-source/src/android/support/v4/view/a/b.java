// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.view.a;

import android.view.accessibility.AccessibilityManager;

public final class android.support.v4.view.a.b
{
    static final class a extends b
    {

        public final boolean a(AccessibilityManager accessibilitymanager)
        {
            return accessibilitymanager.isTouchExplorationEnabled();
        }

        a()
        {
        }
    }

    static class b
        implements c
    {

        public boolean a(AccessibilityManager accessibilitymanager)
        {
            return false;
        }

        b()
        {
        }
    }

    static interface c
    {

        public abstract boolean a(AccessibilityManager accessibilitymanager);
    }


    private static final c a;

    public static boolean a(AccessibilityManager accessibilitymanager)
    {
        return a.a(accessibilitymanager);
    }

    static 
    {
        if (android.os.Build.VERSION.SDK_INT >= 14)
        {
            a = new a();
        } else
        {
            a = new b();
        }
    }
}
