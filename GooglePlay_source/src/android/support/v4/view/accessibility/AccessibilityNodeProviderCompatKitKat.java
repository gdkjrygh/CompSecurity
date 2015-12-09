// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.view.accessibility;

import android.os.Bundle;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import java.util.List;

final class AccessibilityNodeProviderCompatKitKat
{
    static interface AccessibilityNodeInfoBridge
    {

        public abstract Object createAccessibilityNodeInfo$54cf32c4();

        public abstract List findAccessibilityNodeInfosByText$2393931d();

        public abstract Object findFocus$54cf32c4();

        public abstract boolean performAction$5985f823();
    }


    // Unreferenced inner class android/support/v4/view/accessibility/AccessibilityNodeProviderCompatKitKat$1

/* anonymous class */
    static final class _cls1 extends AccessibilityNodeProvider
    {

        final AccessibilityNodeInfoBridge val$bridge;

        public final AccessibilityNodeInfo createAccessibilityNodeInfo(int i)
        {
            bridge._mth54cf32c4();
            return null;
        }

        public final List findAccessibilityNodeInfosByText(String s, int i)
        {
            return bridge._mth2393931d();
        }

        public final AccessibilityNodeInfo findFocus(int i)
        {
            bridge._mth54cf32c4();
            return null;
        }

        public final boolean performAction(int i, int j, Bundle bundle)
        {
            return bridge._mth5985f823();
        }

            
            {
                bridge = accessibilitynodeinfobridge;
                super();
            }
    }

}
