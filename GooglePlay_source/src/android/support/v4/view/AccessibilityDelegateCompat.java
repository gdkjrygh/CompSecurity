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
import android.view.accessibility.AccessibilityNodeInfo;

public class AccessibilityDelegateCompat
{
    static class AccessibilityDelegateIcsImpl extends AccessibilityDelegateStubImpl
    {

        public final boolean dispatchPopulateAccessibilityEvent(Object obj, View view, AccessibilityEvent accessibilityevent)
        {
            return ((android.view.View.AccessibilityDelegate)obj).dispatchPopulateAccessibilityEvent(view, accessibilityevent);
        }

        public Object newAccessiblityDelegateBridge(AccessibilityDelegateCompat accessibilitydelegatecompat)
        {
            return new AccessibilityDelegateCompatIcs._cls1(accessibilitydelegatecompat. new AccessibilityDelegateCompatIcs.AccessibilityDelegateBridge() {

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
                    AccessibilityDelegateCompat.onPopulateAccessibilityEvent(view, accessibilityevent);
                }

                public final boolean onRequestSendAccessibilityEvent(ViewGroup viewgroup, View view, AccessibilityEvent accessibilityevent)
                {
                    return compat.onRequestSendAccessibilityEvent(viewgroup, view, accessibilityevent);
                }

                public final void sendAccessibilityEvent(View view, int i)
                {
                    AccessibilityDelegateCompat.sendAccessibilityEvent(view, i);
                }

                public final void sendAccessibilityEventUnchecked(View view, AccessibilityEvent accessibilityevent)
                {
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
            return new android.view.View.AccessibilityDelegate();
        }

        public final void onInitializeAccessibilityEvent(Object obj, View view, AccessibilityEvent accessibilityevent)
        {
            ((android.view.View.AccessibilityDelegate)obj).onInitializeAccessibilityEvent(view, accessibilityevent);
        }

        public final void onInitializeAccessibilityNodeInfo(Object obj, View view, AccessibilityNodeInfoCompat accessibilitynodeinfocompat)
        {
            accessibilitynodeinfocompat = ((AccessibilityNodeInfoCompat) (accessibilitynodeinfocompat.mInfo));
            ((android.view.View.AccessibilityDelegate)obj).onInitializeAccessibilityNodeInfo(view, (AccessibilityNodeInfo)accessibilitynodeinfocompat);
        }

        public final void onPopulateAccessibilityEvent(Object obj, View view, AccessibilityEvent accessibilityevent)
        {
            ((android.view.View.AccessibilityDelegate)obj).onPopulateAccessibilityEvent(view, accessibilityevent);
        }

        public final boolean onRequestSendAccessibilityEvent(Object obj, ViewGroup viewgroup, View view, AccessibilityEvent accessibilityevent)
        {
            return ((android.view.View.AccessibilityDelegate)obj).onRequestSendAccessibilityEvent(viewgroup, view, accessibilityevent);
        }

        public final void sendAccessibilityEvent(Object obj, View view, int i)
        {
            ((android.view.View.AccessibilityDelegate)obj).sendAccessibilityEvent(view, i);
        }

        public final void sendAccessibilityEventUnchecked(Object obj, View view, AccessibilityEvent accessibilityevent)
        {
            ((android.view.View.AccessibilityDelegate)obj).sendAccessibilityEventUnchecked(view, accessibilityevent);
        }

        AccessibilityDelegateIcsImpl()
        {
        }
    }

    static interface AccessibilityDelegateImpl
    {

        public abstract boolean dispatchPopulateAccessibilityEvent(Object obj, View view, AccessibilityEvent accessibilityevent);

        public abstract AccessibilityNodeProviderCompat getAccessibilityNodeProvider(Object obj, View view);

        public abstract Object newAccessiblityDelegateBridge(AccessibilityDelegateCompat accessibilitydelegatecompat);

        public abstract Object newAccessiblityDelegateDefaultImpl();

        public abstract void onInitializeAccessibilityEvent(Object obj, View view, AccessibilityEvent accessibilityevent);

        public abstract void onInitializeAccessibilityNodeInfo(Object obj, View view, AccessibilityNodeInfoCompat accessibilitynodeinfocompat);

        public abstract void onPopulateAccessibilityEvent(Object obj, View view, AccessibilityEvent accessibilityevent);

        public abstract boolean onRequestSendAccessibilityEvent(Object obj, ViewGroup viewgroup, View view, AccessibilityEvent accessibilityevent);

        public abstract boolean performAccessibilityAction(Object obj, View view, int i, Bundle bundle);

        public abstract void sendAccessibilityEvent(Object obj, View view, int i);

        public abstract void sendAccessibilityEventUnchecked(Object obj, View view, AccessibilityEvent accessibilityevent);
    }

    static final class AccessibilityDelegateJellyBeanImpl extends AccessibilityDelegateIcsImpl
    {

        public final AccessibilityNodeProviderCompat getAccessibilityNodeProvider(Object obj, View view)
        {
            obj = ((android.view.View.AccessibilityDelegate)obj).getAccessibilityNodeProvider(view);
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
            return new AccessibilityDelegateCompatJellyBean._cls1(accessibilitydelegatecompat. new AccessibilityDelegateCompatJellyBean.AccessibilityDelegateBridgeJellyBean() {

                final AccessibilityDelegateJellyBeanImpl this$0;
                final AccessibilityDelegateCompat val$compat;

                public final boolean dispatchPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityevent)
                {
                    return compat.dispatchPopulateAccessibilityEvent(view, accessibilityevent);
                }

                public final Object getAccessibilityNodeProvider(View view)
                {
                    view = AccessibilityDelegateCompat.getAccessibilityNodeProvider(view);
                    if (view != null)
                    {
                        return ((AccessibilityNodeProviderCompat) (view)).mProvider;
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
                    AccessibilityDelegateCompat.sendAccessibilityEvent(view, i);
                }

                public final void sendAccessibilityEventUnchecked(View view, AccessibilityEvent accessibilityevent)
                {
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
            return ((android.view.View.AccessibilityDelegate)obj).performAccessibilityAction(view, i, bundle);
        }

        AccessibilityDelegateJellyBeanImpl()
        {
        }
    }

    static class AccessibilityDelegateStubImpl
        implements AccessibilityDelegateImpl
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

        AccessibilityDelegateStubImpl()
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
            IMPL = new AccessibilityDelegateStubImpl();
        }
        DEFAULT_DELEGATE = IMPL.newAccessiblityDelegateDefaultImpl();
    }
}
