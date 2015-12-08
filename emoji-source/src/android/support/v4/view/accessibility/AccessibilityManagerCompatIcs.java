// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.view.accessibility;

import android.view.accessibility.AccessibilityManager;
import java.util.List;

class AccessibilityManagerCompatIcs
{
    static interface AccessibilityStateChangeListenerBridge
    {

        public abstract void onAccessibilityStateChanged(boolean flag);
    }


    AccessibilityManagerCompatIcs()
    {
    }

    public static boolean addAccessibilityStateChangeListener(AccessibilityManager accessibilitymanager, Object obj)
    {
        return accessibilitymanager.addAccessibilityStateChangeListener((android.view.accessibility.AccessibilityManager.AccessibilityStateChangeListener)obj);
    }

    public static List getEnabledAccessibilityServiceList(AccessibilityManager accessibilitymanager, int i)
    {
        return accessibilitymanager.getEnabledAccessibilityServiceList(i);
    }

    public static List getInstalledAccessibilityServiceList(AccessibilityManager accessibilitymanager)
    {
        return accessibilitymanager.getInstalledAccessibilityServiceList();
    }

    public static boolean isTouchExplorationEnabled(AccessibilityManager accessibilitymanager)
    {
        return accessibilitymanager.isTouchExplorationEnabled();
    }

    public static Object newAccessibilityStateChangeListener(AccessibilityStateChangeListenerBridge accessibilitystatechangelistenerbridge)
    {
        return new android.view.accessibility.AccessibilityManager.AccessibilityStateChangeListener(accessibilitystatechangelistenerbridge) {

            final AccessibilityStateChangeListenerBridge val$bridge;

            public void onAccessibilityStateChanged(boolean flag)
            {
                bridge.onAccessibilityStateChanged(flag);
            }

            
            {
                bridge = accessibilitystatechangelistenerbridge;
                super();
            }
        };
    }

    public static boolean removeAccessibilityStateChangeListener(AccessibilityManager accessibilitymanager, Object obj)
    {
        return accessibilitymanager.removeAccessibilityStateChangeListener((android.view.accessibility.AccessibilityManager.AccessibilityStateChangeListener)obj);
    }
}
