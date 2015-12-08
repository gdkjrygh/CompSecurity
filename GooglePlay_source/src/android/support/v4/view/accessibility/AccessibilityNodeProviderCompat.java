// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.view.accessibility;

import java.util.ArrayList;
import java.util.List;

// Referenced classes of package android.support.v4.view.accessibility:
//            AccessibilityNodeInfoCompat

public final class AccessibilityNodeProviderCompat
{
    static interface AccessibilityNodeProviderImpl
    {

        public abstract Object newAccessibilityNodeProviderBridge(AccessibilityNodeProviderCompat accessibilitynodeprovidercompat);
    }

    static final class AccessibilityNodeProviderJellyBeanImpl extends AccessibilityNodeProviderStubImpl
    {

        public final Object newAccessibilityNodeProviderBridge(AccessibilityNodeProviderCompat accessibilitynodeprovidercompat)
        {
            return new AccessibilityNodeProviderCompatJellyBean._cls1(accessibilitynodeprovidercompat. new AccessibilityNodeProviderCompatJellyBean.AccessibilityNodeInfoBridge() {

                final AccessibilityNodeProviderJellyBeanImpl this$0;
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

                public final boolean performAction$5985f823()
                {
                    return AccessibilityNodeProviderCompat.performAction$5985f823();
                }

            
            {
                this$0 = final_accessibilitynodeproviderjellybeanimpl;
                compat = AccessibilityNodeProviderCompat.this;
                super();
            }
            });
        }

        AccessibilityNodeProviderJellyBeanImpl()
        {
        }
    }

    static final class AccessibilityNodeProviderKitKatImpl extends AccessibilityNodeProviderStubImpl
    {

        public final Object newAccessibilityNodeProviderBridge(AccessibilityNodeProviderCompat accessibilitynodeprovidercompat)
        {
            return new AccessibilityNodeProviderCompatKitKat._cls1(accessibilitynodeprovidercompat. new AccessibilityNodeProviderCompatKitKat.AccessibilityNodeInfoBridge() {

                final AccessibilityNodeProviderKitKatImpl this$0;
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
                this$0 = final_accessibilitynodeproviderkitkatimpl;
                compat = AccessibilityNodeProviderCompat.this;
                super();
            }
            });
        }

        AccessibilityNodeProviderKitKatImpl()
        {
        }
    }

    static class AccessibilityNodeProviderStubImpl
        implements AccessibilityNodeProviderImpl
    {

        public Object newAccessibilityNodeProviderBridge(AccessibilityNodeProviderCompat accessibilitynodeprovidercompat)
        {
            return null;
        }

        AccessibilityNodeProviderStubImpl()
        {
        }
    }


    private static final AccessibilityNodeProviderImpl IMPL;
    public final Object mProvider;

    public AccessibilityNodeProviderCompat()
    {
        mProvider = IMPL.newAccessibilityNodeProviderBridge(this);
    }

    public AccessibilityNodeProviderCompat(Object obj)
    {
        mProvider = obj;
    }

    public static AccessibilityNodeInfoCompat createAccessibilityNodeInfo$f3a5639()
    {
        return null;
    }

    public static List findAccessibilityNodeInfosByText$2393931d()
    {
        return null;
    }

    public static AccessibilityNodeInfoCompat findFocus$f3a5639()
    {
        return null;
    }

    public static boolean performAction$5985f823()
    {
        return false;
    }

    static 
    {
        if (android.os.Build.VERSION.SDK_INT >= 19)
        {
            IMPL = new AccessibilityNodeProviderKitKatImpl();
        } else
        if (android.os.Build.VERSION.SDK_INT >= 16)
        {
            IMPL = new AccessibilityNodeProviderJellyBeanImpl();
        } else
        {
            IMPL = new AccessibilityNodeProviderStubImpl();
        }
    }
}
