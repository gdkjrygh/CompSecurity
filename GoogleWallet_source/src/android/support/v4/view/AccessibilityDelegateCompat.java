// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.view;

import android.os.Bundle;
import android.support.v4.view.accessibility.AccessibilityNodeInfoCompat;
import android.support.v4.view.accessibility.AccessibilityNodeProviderCompat;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;

// Referenced classes of package android.support.v4.view:
//            AccessibilityDelegateCompatIcs, AccessibilityDelegateCompatJellyBean

public class AccessibilityDelegateCompat
{
    static class AccessibilityDelegateIcsImpl extends AccessibilityDelegateImpl
    {

        public final boolean dispatchPopulateAccessibilityEvent(Object obj, View view, AccessibilityEvent accessibilityevent)
        {
            return AccessibilityDelegateCompatIcs.dispatchPopulateAccessibilityEvent(obj, view, accessibilityevent);
        }

        public Object newAccessiblityDelegateBridge(AccessibilityDelegateCompat accessibilitydelegatecompat)
        {
            return AccessibilityDelegateCompatIcs.newAccessibilityDelegateBridge(accessibilitydelegatecompat. new AccessibilityDelegateCompatIcs.AccessibilityDelegateBridge() {

                final AccessibilityDelegateIcsImpl this$0;
                final AccessibilityDelegateCompat val$compat;

                public final boolean dispatchPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityevent)
                {
                    return compat.dispatchPopulateAccessibilityEvent(view, accessibilityevent);
                }

                public final void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityevent)
                {
                    compat.onInitializeAccessibilityEvent(view, accessibilityevent);
                }

                public final void onInitializeAccessibilityNodeInfo(View view, Object obj)
                {
                    compat.onInitializeAccessibilityNodeInfo(view, new AccessibilityNodeInfoCompat(obj));
                }

                public final void onPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityevent)
                {
                    AccessibilityDelegateCompat accessibilitydelegatecompat = compat;
                    AccessibilityDelegateCompat.onPopulateAccessibilityEvent(view, accessibilityevent);
                }

                public final boolean onRequestSendAccessibilityEvent(ViewGroup viewgroup, View view, AccessibilityEvent accessibilityevent)
                {
                    return compat.onRequestSendAccessibilityEvent(viewgroup, view, accessibilityevent);
                }

                public final void sendAccessibilityEvent(View view, int i)
                {
                    AccessibilityDelegateCompat accessibilitydelegatecompat = compat;
                    AccessibilityDelegateCompat.sendAccessibilityEvent(view, i);
                }

                public final void sendAccessibilityEventUnchecked(View view, AccessibilityEvent accessibilityevent)
                {
                    AccessibilityDelegateCompat accessibilitydelegatecompat = compat;
                    AccessibilityDelegateCompat.sendAccessibilityEventUnchecked(view, accessibilityevent);
                }

            
            {
                this$0 = final_accessibilitydelegateicsimpl;
                compat = AccessibilityDelegateCompat.this;
                super();
            }
            });
        }

        public final Object newAccessiblityDelegateDefaultImpl()
        {
            return AccessibilityDelegateCompatIcs.newAccessibilityDelegateDefaultImpl();
        }

        public final void onInitializeAccessibilityEvent(Object obj, View view, AccessibilityEvent accessibilityevent)
        {
            AccessibilityDelegateCompatIcs.onInitializeAccessibilityEvent(obj, view, accessibilityevent);
        }

        public final void onInitializeAccessibilityNodeInfo(Object obj, View view, AccessibilityNodeInfoCompat accessibilitynodeinfocompat)
        {
            AccessibilityDelegateCompatIcs.onInitializeAccessibilityNodeInfo(obj, view, accessibilitynodeinfocompat.getInfo());
        }

        public final void onPopulateAccessibilityEvent(Object obj, View view, AccessibilityEvent accessibilityevent)
        {
            AccessibilityDelegateCompatIcs.onPopulateAccessibilityEvent(obj, view, accessibilityevent);
        }

        public final boolean onRequestSendAccessibilityEvent(Object obj, ViewGroup viewgroup, View view, AccessibilityEvent accessibilityevent)
        {
            return AccessibilityDelegateCompatIcs.onRequestSendAccessibilityEvent(obj, viewgroup, view, accessibilityevent);
        }

        public final void sendAccessibilityEvent(Object obj, View view, int i)
        {
            AccessibilityDelegateCompatIcs.sendAccessibilityEvent(obj, view, i);
        }

        public final void sendAccessibilityEventUnchecked(Object obj, View view, AccessibilityEvent accessibilityevent)
        {
            AccessibilityDelegateCompatIcs.sendAccessibilityEventUnchecked(obj, view, accessibilityevent);
        }

        AccessibilityDelegateIcsImpl()
        {
        }
    }

    static class AccessibilityDelegateImpl
    {

        public boolean dispatchPopulateAccessibilityEvent(Object obj, View view, AccessibilityEvent accessibilityevent)
        {
            return false;
        }

        public AccessibilityNodeProviderCompat getAccessibilityNodeProvider(Object obj, View view)
        {
            return null;
        }

        public Object newAccessiblityDelegateBridge(AccessibilityDelegateCompat accessibilitydelegatecompat)
        {
            return null;
        }

        public Object newAccessiblityDelegateDefaultImpl()
        {
            return null;
        }

        public void onInitializeAccessibilityEvent(Object obj, View view, AccessibilityEvent accessibilityevent)
        {
        }

        public void onInitializeAccessibilityNodeInfo(Object obj, View view, AccessibilityNodeInfoCompat accessibilitynodeinfocompat)
        {
        }

        public void onPopulateAccessibilityEvent(Object obj, View view, AccessibilityEvent accessibilityevent)
        {
        }

        public boolean onRequestSendAccessibilityEvent(Object obj, ViewGroup viewgroup, View view, AccessibilityEvent accessibilityevent)
        {
            return true;
        }

        public boolean performAccessibilityAction(Object obj, View view, int i, Bundle bundle)
        {
            return false;
        }

        public void sendAccessibilityEvent(Object obj, View view, int i)
        {
        }

        public void sendAccessibilityEventUnchecked(Object obj, View view, AccessibilityEvent accessibilityevent)
        {
        }

        AccessibilityDelegateImpl()
        {
        }
    }

    static final class AccessibilityDelegateJellyBeanImpl extends AccessibilityDelegateIcsImpl
    {

        public final AccessibilityNodeProviderCompat getAccessibilityNodeProvider(Object obj, View view)
        {
            obj = AccessibilityDelegateCompatJellyBean.getAccessibilityNodeProvider(obj, view);
            if (obj != null)
            {
                return new AccessibilityNodeProviderCompat(obj);
            } else
            {
                return null;
            }
        }

        public final Object newAccessiblityDelegateBridge(AccessibilityDelegateCompat accessibilitydelegatecompat)
        {
            return AccessibilityDelegateCompatJellyBean.newAccessibilityDelegateBridge(accessibilitydelegatecompat. new AccessibilityDelegateCompatJellyBean.AccessibilityDelegateBridgeJellyBean() {

                final AccessibilityDelegateJellyBeanImpl this$0;
                final AccessibilityDelegateCompat val$compat;

                public final boolean dispatchPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityevent)
                {
                    return compat.dispatchPopulateAccessibilityEvent(view, accessibilityevent);
                }

                public final Object getAccessibilityNodeProvider(View view)
                {
                    AccessibilityDelegateCompat accessibilitydelegatecompat = compat;
                    view = AccessibilityDelegateCompat.getAccessibilityNodeProvider(view);
                    if (view != null)
                    {
                        return view.getProvider();
                    } else
                    {
                        return null;
                    }
                }

                public final void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityevent)
                {
                    compat.onInitializeAccessibilityEvent(view, accessibilityevent);
                }

                public final void onInitializeAccessibilityNodeInfo(View view, Object obj)
                {
                    compat.onInitializeAccessibilityNodeInfo(view, new AccessibilityNodeInfoCompat(obj));
                }

                public final void onPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityevent)
                {
                    AccessibilityDelegateCompat accessibilitydelegatecompat = compat;
                    AccessibilityDelegateCompat.onPopulateAccessibilityEvent(view, accessibilityevent);
                }

                public final boolean onRequestSendAccessibilityEvent(ViewGroup viewgroup, View view, AccessibilityEvent accessibilityevent)
                {
                    return compat.onRequestSendAccessibilityEvent(viewgroup, view, accessibilityevent);
                }

                public final boolean performAccessibilityAction(View view, int i, Bundle bundle)
                {
                    return compat.performAccessibilityAction(view, i, bundle);
                }

                public final void sendAccessibilityEvent(View view, int i)
                {
                    AccessibilityDelegateCompat accessibilitydelegatecompat = compat;
                    AccessibilityDelegateCompat.sendAccessibilityEvent(view, i);
                }

                public final void sendAccessibilityEventUnchecked(View view, AccessibilityEvent accessibilityevent)
                {
                    AccessibilityDelegateCompat accessibilitydelegatecompat = compat;
                    AccessibilityDelegateCompat.sendAccessibilityEventUnchecked(view, accessibilityevent);
                }

            
            {
                this$0 = final_accessibilitydelegatejellybeanimpl;
                compat = AccessibilityDelegateCompat.this;
                super();
            }
            });
        }

        public final boolean performAccessibilityAction(Object obj, View view, int i, Bundle bundle)
        {
            return AccessibilityDelegateCompatJellyBean.performAccessibilityAction(obj, view, i, bundle);
        }

        AccessibilityDelegateJellyBeanImpl()
        {
        }
    }


    private static final Object DEFAULT_DELEGATE;
    private static final AccessibilityDelegateImpl IMPL;
    final Object mBridge;

    public AccessibilityDelegateCompat()
    {
        mBridge = IMPL.newAccessiblityDelegateBridge(this);
    }

    public static AccessibilityNodeProviderCompat getAccessibilityNodeProvider(View view)
    {
        return IMPL.getAccessibilityNodeProvider(DEFAULT_DELEGATE, view);
    }

    public static void onPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityevent)
    {
        IMPL.onPopulateAccessibilityEvent(DEFAULT_DELEGATE, view, accessibilityevent);
    }

    public static void sendAccessibilityEvent(View view, int i)
    {
        IMPL.sendAccessibilityEvent(DEFAULT_DELEGATE, view, i);
    }

    public static void sendAccessibilityEventUnchecked(View view, AccessibilityEvent accessibilityevent)
    {
        IMPL.sendAccessibilityEventUnchecked(DEFAULT_DELEGATE, view, accessibilityevent);
    }

    public boolean dispatchPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityevent)
    {
        return IMPL.dispatchPopulateAccessibilityEvent(DEFAULT_DELEGATE, view, accessibilityevent);
    }

    final Object getBridge()
    {
        return mBridge;
    }

    public void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityevent)
    {
        IMPL.onInitializeAccessibilityEvent(DEFAULT_DELEGATE, view, accessibilityevent);
    }

    public void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfoCompat accessibilitynodeinfocompat)
    {
        IMPL.onInitializeAccessibilityNodeInfo(DEFAULT_DELEGATE, view, accessibilitynodeinfocompat);
    }

    public boolean onRequestSendAccessibilityEvent(ViewGroup viewgroup, View view, AccessibilityEvent accessibilityevent)
    {
        return IMPL.onRequestSendAccessibilityEvent(DEFAULT_DELEGATE, viewgroup, view, accessibilityevent);
    }

    public boolean performAccessibilityAction(View view, int i, Bundle bundle)
    {
        return IMPL.performAccessibilityAction(DEFAULT_DELEGATE, view, i, bundle);
    }

    static 
    {
        if (android.os.Build.VERSION.SDK_INT >= 16)
        {
            IMPL = new AccessibilityDelegateJellyBeanImpl();
        } else
        if (android.os.Build.VERSION.SDK_INT >= 14)
        {
            IMPL = new AccessibilityDelegateIcsImpl();
        } else
        {
            IMPL = new AccessibilityDelegateImpl();
        }
        DEFAULT_DELEGATE = IMPL.newAccessiblityDelegateDefaultImpl();
    }
}
