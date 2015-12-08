// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.view.accessibility;

import java.util.ArrayList;
import java.util.List;

// Referenced classes of package android.support.v4.view.accessibility:
//            AccessibilityNodeProviderCompat

static final class _cls1.val.compat extends _cls1.val.compat
{

    public final Object newAccessibilityNodeProviderBridge(final AccessibilityNodeProviderCompat compat)
    {
        return new _cls1.val.compat(new AccessibilityNodeProviderCompatKitKat.AccessibilityNodeInfoBridge() {

            final AccessibilityNodeProviderCompat.AccessibilityNodeProviderKitKatImpl this$0;
            final AccessibilityNodeProviderCompat val$compat;

            public final Object createAccessibilityNodeInfo$54cf32c4()
            {
                AccessibilityNodeProviderCompat.createAccessibilityNodeInfo$f3a5639();
                return null;
            }

            public final List findAccessibilityNodeInfosByText$2393931d()
            {
                AccessibilityNodeProviderCompat.findAccessibilityNodeInfosByText$2393931d();
                new ArrayList();
                throw new NullPointerException();
            }

            public final Object findFocus$54cf32c4()
            {
                AccessibilityNodeProviderCompat.findFocus$f3a5639();
                return null;
            }

            public final boolean performAction$5985f823()
            {
                return AccessibilityNodeProviderCompat.performAction$5985f823();
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
