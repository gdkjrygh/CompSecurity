// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.view.accessibility;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package android.support.v4.view.accessibility:
//            AccessibilityNodeProviderCompat, AccessibilityNodeProviderCompatKitKat, AccessibilityNodeInfoCompat

static final class _cls1.val.compat extends _cls1.val.compat
{

    public final Object newAccessibilityNodeProviderBridge(final AccessibilityNodeProviderCompat compat)
    {
        return AccessibilityNodeProviderCompatKitKat.newAccessibilityNodeProviderBridge(new AccessibilityNodeProviderCompatKitKat.AccessibilityNodeInfoBridge() {

            final AccessibilityNodeProviderCompat.AccessibilityNodeProviderKitKatImpl this$0;
            final AccessibilityNodeProviderCompat val$compat;

            public final Object createAccessibilityNodeInfo(int i)
            {
                Object obj = compat;
                obj = AccessibilityNodeProviderCompat.createAccessibilityNodeInfo(i);
                if (obj == null)
                {
                    return null;
                } else
                {
                    return ((AccessibilityNodeInfoCompat) (obj)).getInfo();
                }
            }

            public final List findAccessibilityNodeInfosByText(String s, int i)
            {
                Object obj = compat;
                s = AccessibilityNodeProviderCompat.findAccessibilityNodeInfosByText(s, i);
                obj = new ArrayList();
                int j = s.size();
                for (i = 0; i < j; i++)
                {
                    ((List) (obj)).add(((AccessibilityNodeInfoCompat)s.get(i)).getInfo());
                }

                return ((List) (obj));
            }

            public final Object findFocus(int i)
            {
                Object obj = compat;
                obj = AccessibilityNodeProviderCompat.findFocus(i);
                if (obj == null)
                {
                    return null;
                } else
                {
                    return ((AccessibilityNodeInfoCompat) (obj)).getInfo();
                }
            }

            public final boolean performAction(int i, int j, Bundle bundle)
            {
                AccessibilityNodeProviderCompat accessibilitynodeprovidercompat = compat;
                return AccessibilityNodeProviderCompat.performAction(i, j, bundle);
            }

            
            {
                this$0 = AccessibilityNodeProviderCompat.AccessibilityNodeProviderKitKatImpl.this;
                compat = accessibilitynodeprovidercompat;
                super();
            }
        });
    }

    _cls1.val.compat()
    {
    }
}
