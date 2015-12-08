// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.view.accessibility;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package android.support.v4.view.accessibility:
//            AccessibilityNodeInfoCompat, AccessibilityNodeProviderCompatJellyBean, AccessibilityNodeProviderCompatKitKat

public final class AccessibilityNodeProviderCompat
{
    static class AccessibilityNodeProviderImpl
    {

        public Object newAccessibilityNodeProviderBridge(AccessibilityNodeProviderCompat accessibilitynodeprovidercompat)
        {
            return null;
        }

        AccessibilityNodeProviderImpl()
        {
        }
    }

    static final class AccessibilityNodeProviderJellyBeanImpl extends AccessibilityNodeProviderImpl
    {

        public final Object newAccessibilityNodeProviderBridge(AccessibilityNodeProviderCompat accessibilitynodeprovidercompat)
        {
            return AccessibilityNodeProviderCompatJellyBean.newAccessibilityNodeProviderBridge(accessibilitynodeprovidercompat. new AccessibilityNodeProviderCompatJellyBean.AccessibilityNodeInfoBridge() {

                final AccessibilityNodeProviderJellyBeanImpl this$0;
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

                public final boolean performAction(int i, int j, Bundle bundle)
                {
                    AccessibilityNodeProviderCompat accessibilitynodeprovidercompat = compat;
                    return AccessibilityNodeProviderCompat.performAction(i, j, bundle);
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

    static final class AccessibilityNodeProviderKitKatImpl extends AccessibilityNodeProviderImpl
    {

        public final Object newAccessibilityNodeProviderBridge(AccessibilityNodeProviderCompat accessibilitynodeprovidercompat)
        {
            return AccessibilityNodeProviderCompatKitKat.newAccessibilityNodeProviderBridge(accessibilitynodeprovidercompat. new AccessibilityNodeProviderCompatKitKat.AccessibilityNodeInfoBridge() {

                final AccessibilityNodeProviderKitKatImpl this$0;
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


    private static final AccessibilityNodeProviderImpl IMPL;
    private final Object mProvider;

    public AccessibilityNodeProviderCompat()
    {
        mProvider = IMPL.newAccessibilityNodeProviderBridge(this);
    }

    public AccessibilityNodeProviderCompat(Object obj)
    {
        mProvider = obj;
    }

    public static AccessibilityNodeInfoCompat createAccessibilityNodeInfo(int i)
    {
        return null;
    }

    public static List findAccessibilityNodeInfosByText(String s, int i)
    {
        return null;
    }

    public static AccessibilityNodeInfoCompat findFocus(int i)
    {
        return null;
    }

    public static boolean performAction(int i, int j, Bundle bundle)
    {
        return false;
    }

    public final Object getProvider()
    {
        return mProvider;
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
            IMPL = new AccessibilityNodeProviderImpl();
        }
    }
}
