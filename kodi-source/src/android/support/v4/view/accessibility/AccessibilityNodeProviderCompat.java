// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.view.accessibility;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package android.support.v4.view.accessibility:
//            AccessibilityNodeInfoCompat, AccessibilityNodeProviderCompatJellyBean, AccessibilityNodeProviderCompatKitKat

public class AccessibilityNodeProviderCompat
{
    static interface AccessibilityNodeProviderImpl
    {

        public abstract Object newAccessibilityNodeProviderBridge(AccessibilityNodeProviderCompat accessibilitynodeprovidercompat);
    }

    static class AccessibilityNodeProviderJellyBeanImpl extends AccessibilityNodeProviderStubImpl
    {

        public Object newAccessibilityNodeProviderBridge(AccessibilityNodeProviderCompat accessibilitynodeprovidercompat)
        {
            return AccessibilityNodeProviderCompatJellyBean.newAccessibilityNodeProviderBridge(accessibilitynodeprovidercompat. new AccessibilityNodeProviderCompatJellyBean.AccessibilityNodeInfoBridge() {

                final AccessibilityNodeProviderJellyBeanImpl this$0;
                final AccessibilityNodeProviderCompat val$compat;

                public Object createAccessibilityNodeInfo(int i)
                {
                    AccessibilityNodeInfoCompat accessibilitynodeinfocompat = compat.createAccessibilityNodeInfo(i);
                    if (accessibilitynodeinfocompat == null)
                    {
                        return null;
                    } else
                    {
                        return accessibilitynodeinfocompat.getInfo();
                    }
                }

                public List findAccessibilityNodeInfosByText(String s, int i)
                {
                    s = compat.findAccessibilityNodeInfosByText(s, i);
                    ArrayList arraylist = new ArrayList();
                    int j = s.size();
                    for (i = 0; i < j; i++)
                    {
                        arraylist.add(((AccessibilityNodeInfoCompat)s.get(i)).getInfo());
                    }

                    return arraylist;
                }

                public boolean performAction(int i, int j, Bundle bundle)
                {
                    return compat.performAction(i, j, bundle);
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

    static class AccessibilityNodeProviderKitKatImpl extends AccessibilityNodeProviderStubImpl
    {

        public Object newAccessibilityNodeProviderBridge(AccessibilityNodeProviderCompat accessibilitynodeprovidercompat)
        {
            return AccessibilityNodeProviderCompatKitKat.newAccessibilityNodeProviderBridge(accessibilitynodeprovidercompat. new AccessibilityNodeProviderCompatKitKat.AccessibilityNodeInfoBridge() {

                final AccessibilityNodeProviderKitKatImpl this$0;
                final AccessibilityNodeProviderCompat val$compat;

                public Object createAccessibilityNodeInfo(int i)
                {
                    AccessibilityNodeInfoCompat accessibilitynodeinfocompat = compat.createAccessibilityNodeInfo(i);
                    if (accessibilitynodeinfocompat == null)
                    {
                        return null;
                    } else
                    {
                        return accessibilitynodeinfocompat.getInfo();
                    }
                }

                public List findAccessibilityNodeInfosByText(String s, int i)
                {
                    s = compat.findAccessibilityNodeInfosByText(s, i);
                    ArrayList arraylist = new ArrayList();
                    int j = s.size();
                    for (i = 0; i < j; i++)
                    {
                        arraylist.add(((AccessibilityNodeInfoCompat)s.get(i)).getInfo());
                    }

                    return arraylist;
                }

                public Object findFocus(int i)
                {
                    AccessibilityNodeInfoCompat accessibilitynodeinfocompat = compat.findFocus(i);
                    if (accessibilitynodeinfocompat == null)
                    {
                        return null;
                    } else
                    {
                        return accessibilitynodeinfocompat.getInfo();
                    }
                }

                public boolean performAction(int i, int j, Bundle bundle)
                {
                    return compat.performAction(i, j, bundle);
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
    private final Object mProvider;

    public AccessibilityNodeProviderCompat()
    {
        mProvider = IMPL.newAccessibilityNodeProviderBridge(this);
    }

    public AccessibilityNodeProviderCompat(Object obj)
    {
        mProvider = obj;
    }

    public AccessibilityNodeInfoCompat createAccessibilityNodeInfo(int i)
    {
        return null;
    }

    public List findAccessibilityNodeInfosByText(String s, int i)
    {
        return null;
    }

    public AccessibilityNodeInfoCompat findFocus(int i)
    {
        return null;
    }

    public Object getProvider()
    {
        return mProvider;
    }

    public boolean performAction(int i, int j, Bundle bundle)
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
