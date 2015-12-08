// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.view.accessibility;

import android.view.accessibility.AccessibilityManager;
import java.util.List;

// Referenced classes of package android.support.v4.view.accessibility:
//            AccessibilityManagerCompat, AccessibilityManagerCompatIcs

static class _cls1.val.listener extends 
{

    public boolean addAccessibilityStateChangeListener(AccessibilityManager accessibilitymanager, enerCompat enercompat)
    {
        return AccessibilityManagerCompatIcs.addAccessibilityStateChangeListener(accessibilitymanager, enercompat.mListener);
    }

    public List getEnabledAccessibilityServiceList(AccessibilityManager accessibilitymanager, int i)
    {
        return AccessibilityManagerCompatIcs.getEnabledAccessibilityServiceList(accessibilitymanager, i);
    }

    public List getInstalledAccessibilityServiceList(AccessibilityManager accessibilitymanager)
    {
        return AccessibilityManagerCompatIcs.getInstalledAccessibilityServiceList(accessibilitymanager);
    }

    public boolean isTouchExplorationEnabled(AccessibilityManager accessibilitymanager)
    {
        return AccessibilityManagerCompatIcs.isTouchExplorationEnabled(accessibilitymanager);
    }

    public Object newAccessiblityStateChangeListener(final enerCompat listener)
    {
        return AccessibilityManagerCompatIcs.newAccessibilityStateChangeListener(new AccessibilityManagerCompatIcs.AccessibilityStateChangeListenerBridge() {

            final AccessibilityManagerCompat.AccessibilityManagerIcsImpl this$0;
            final AccessibilityManagerCompat.AccessibilityStateChangeListenerCompat val$listener;

            public void onAccessibilityStateChanged(boolean flag)
            {
                listener.onAccessibilityStateChanged(flag);
            }

            
            {
                this$0 = AccessibilityManagerCompat.AccessibilityManagerIcsImpl.this;
                listener = accessibilitystatechangelistenercompat;
                super();
            }
        });
    }

    public boolean removeAccessibilityStateChangeListener(AccessibilityManager accessibilitymanager, enerCompat enercompat)
    {
        return AccessibilityManagerCompatIcs.removeAccessibilityStateChangeListener(accessibilitymanager, enercompat.mListener);
    }

    _cls1.val.listener()
    {
    }
}
