// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.view;

import android.support.v4.view.accessibility.AccessibilityNodeInfoCompat;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;

// Referenced classes of package android.support.v4.view:
//            AccessibilityDelegateCompatIcs

public class AccessibilityDelegateCompat
{
    static class AccessibilityDelegateIcsImpl extends AccessibilityDelegateStubImpl
    {

        public boolean dispatchPopulateAccessibilityEvent(Object obj, View view, AccessibilityEvent accessibilityevent)
        {
            return AccessibilityDelegateCompatIcs.dispatchPopulateAccessibilityEvent(obj, view, accessibilityevent);
        }

        public Object newAccessiblityDelegateBridge(AccessibilityDelegateCompat accessibilitydelegatecompat)
        {
            return AccessibilityDelegateCompatIcs.newAccessibilityDelegateBridge(accessibilitydelegatecompat. new AccessibilityDelegateCompatIcs.AccessibilityDelegateBridge() {

                final AccessibilityDelegateIcsImpl this$0;
                final AccessibilityDelegateCompat val$compat;

                public boolean dispatchPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityevent)
                {
                    return compat.dispatchPopulateAccessibilityEvent(view, accessibilityevent);
                }

                public void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityevent)
                {
                    compat.onInitializeAccessibilityEvent(view, accessibilityevent);
                }

                public void onInitializeAccessibilityNodeInfo(View view, Object obj)
                {
                    compat.onInitializeAccessibilityNodeInfo(view, new AccessibilityNodeInfoCompat(obj));
                }

                public void onPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityevent)
                {
                    compat.onPopulateAccessibilityEvent(view, accessibilityevent);
                }

                public boolean onRequestSendAccessibilityEvent(ViewGroup viewgroup, View view, AccessibilityEvent accessibilityevent)
                {
                    return compat.onRequestSendAccessibilityEvent(viewgroup, view, accessibilityevent);
                }

                public void sendAccessibilityEvent(View view, int i)
                {
                    compat.sendAccessibilityEvent(view, i);
                }

                public void sendAccessibilityEventUnchecked(View view, AccessibilityEvent accessibilityevent)
                {
                    compat.sendAccessibilityEventUnchecked(view, accessibilityevent);
                }

            
            {
                this$0 = final_accessibilitydelegateicsimpl;
                compat = AccessibilityDelegateCompat.this;
                super();
            }
            });
        }

        public Object newAccessiblityDelegateDefaultImpl()
        {
            return AccessibilityDelegateCompatIcs.newAccessibilityDelegateDefaultImpl();
        }

        public void onInitializeAccessibilityEvent(Object obj, View view, AccessibilityEvent accessibilityevent)
        {
            AccessibilityDelegateCompatIcs.onInitializeAccessibilityEvent(obj, view, accessibilityevent);
        }

        public void onInitializeAccessibilityNodeInfo(Object obj, View view, Object obj1)
        {
            AccessibilityDelegateCompatIcs.onInitializeAccessibilityNodeInfo(obj, view, obj1);
        }

        public void onPopulateAccessibilityEvent(Object obj, View view, AccessibilityEvent accessibilityevent)
        {
            AccessibilityDelegateCompatIcs.onPopulateAccessibilityEvent(obj, view, accessibilityevent);
        }

        public boolean onRequestSendAccessibilityEvent(Object obj, ViewGroup viewgroup, View view, AccessibilityEvent accessibilityevent)
        {
            return AccessibilityDelegateCompatIcs.onRequestSendAccessibilityEvent(obj, viewgroup, view, accessibilityevent);
        }

        public void sendAccessibilityEvent(Object obj, View view, int i)
        {
            AccessibilityDelegateCompatIcs.sendAccessibilityEvent(obj, view, i);
        }

        public void sendAccessibilityEventUnchecked(Object obj, View view, AccessibilityEvent accessibilityevent)
        {
            AccessibilityDelegateCompatIcs.sendAccessibilityEventUnchecked(obj, view, accessibilityevent);
        }

        AccessibilityDelegateIcsImpl()
        {
        }
    }

    static interface AccessibilityDelegateImpl
    {

        public abstract boolean dispatchPopulateAccessibilityEvent(Object obj, View view, AccessibilityEvent accessibilityevent);

        public abstract Object newAccessiblityDelegateBridge(AccessibilityDelegateCompat accessibilitydelegatecompat);

        public abstract Object newAccessiblityDelegateDefaultImpl();

        public abstract void onInitializeAccessibilityEvent(Object obj, View view, AccessibilityEvent accessibilityevent);

        public abstract void onInitializeAccessibilityNodeInfo(Object obj, View view, Object obj1);

        public abstract void onPopulateAccessibilityEvent(Object obj, View view, AccessibilityEvent accessibilityevent);

        public abstract boolean onRequestSendAccessibilityEvent(Object obj, ViewGroup viewgroup, View view, AccessibilityEvent accessibilityevent);

        public abstract void sendAccessibilityEvent(Object obj, View view, int i);

        public abstract void sendAccessibilityEventUnchecked(Object obj, View view, AccessibilityEvent accessibilityevent);
    }

    static class AccessibilityDelegateStubImpl
        implements AccessibilityDelegateImpl
    {

        public boolean dispatchPopulateAccessibilityEvent(Object obj, View view, AccessibilityEvent accessibilityevent)
        {
            return false;
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

        public void onInitializeAccessibilityNodeInfo(Object obj, View view, Object obj1)
        {
        }

        public void onPopulateAccessibilityEvent(Object obj, View view, AccessibilityEvent accessibilityevent)
        {
        }

        public boolean onRequestSendAccessibilityEvent(Object obj, ViewGroup viewgroup, View view, AccessibilityEvent accessibilityevent)
        {
            return true;
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

    public boolean dispatchPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityevent)
    {
        return IMPL.dispatchPopulateAccessibilityEvent(DEFAULT_DELEGATE, view, accessibilityevent);
    }

    Object getBridge()
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

    public void onPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityevent)
    {
        IMPL.onPopulateAccessibilityEvent(DEFAULT_DELEGATE, view, accessibilityevent);
    }

    public boolean onRequestSendAccessibilityEvent(ViewGroup viewgroup, View view, AccessibilityEvent accessibilityevent)
    {
        return IMPL.onRequestSendAccessibilityEvent(DEFAULT_DELEGATE, viewgroup, view, accessibilityevent);
    }

    public void sendAccessibilityEvent(View view, int i)
    {
        IMPL.sendAccessibilityEvent(DEFAULT_DELEGATE, view, i);
    }

    public void sendAccessibilityEventUnchecked(View view, AccessibilityEvent accessibilityevent)
    {
        IMPL.sendAccessibilityEventUnchecked(DEFAULT_DELEGATE, view, accessibilityevent);
    }

    static 
    {
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
