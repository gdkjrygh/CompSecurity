// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.view.accessibility;

import android.os.Bundle;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import java.util.List;

class AccessibilityNodeProviderCompatJellyBean
{
    static interface AccessibilityNodeInfoBridge
    {

        public abstract Object createAccessibilityNodeInfo(int i);

        public abstract List findAccessibilityNodeInfosByText(String s, int i);

        public abstract boolean performAction(int i, int j, Bundle bundle);
    }


    AccessibilityNodeProviderCompatJellyBean()
    {
    }

    public static Object newAccessibilityNodeProviderBridge(AccessibilityNodeInfoBridge accessibilitynodeinfobridge)
    {
        return new AccessibilityNodeProvider(accessibilitynodeinfobridge) {

            final AccessibilityNodeInfoBridge val$bridge;

            public AccessibilityNodeInfo createAccessibilityNodeInfo(int i)
            {
                return (AccessibilityNodeInfo)bridge.createAccessibilityNodeInfo(i);
            }

            public List findAccessibilityNodeInfosByText(String s, int i)
            {
                return bridge.findAccessibilityNodeInfosByText(s, i);
            }

            public boolean performAction(int i, int j, Bundle bundle)
            {
                return bridge.performAction(i, j, bundle);
            }

            
            {
                bridge = accessibilitynodeinfobridge;
                super();
            }
        };
    }
}
