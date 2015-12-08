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

    public static Object a(AccessibilityNodeInfoBridge accessibilitynodeinfobridge)
    {
        return new AccessibilityNodeProvider(accessibilitynodeinfobridge) {

            final AccessibilityNodeInfoBridge a;

            public AccessibilityNodeInfo createAccessibilityNodeInfo(int i)
            {
                return (AccessibilityNodeInfo)a.a(i);
            }

            public List findAccessibilityNodeInfosByText(String s, int i)
            {
                return a.a(s, i);
            }

            public boolean performAction(int i, int j, Bundle bundle)
            {
                return a.a(i, j, bundle);
            }

            
            {
                a = accessibilitynodeinfobridge;
                super();
            }

            private class AccessibilityNodeInfoBridge
            {

                public abstract Object a(int i);

                public abstract List a(String s, int i);

                public abstract boolean a(int i, int j, Bundle bundle);
            }

        };
    }
}
