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
//            AccessibilityDelegateCompat

static final class _cls1.val.compat extends _cls1.val.compat
{

    public final AccessibilityNodeProviderCompat getAccessibilityNodeProvider(Object obj, View view)
    {
        obj = ((android.view.lyBeanImpl)obj).lyBeanImpl(view);
        if (obj != null)
        {
            return new AccessibilityNodeProviderCompat(obj);
        } else
        {
            return null;
        }
    }

    public final Object newAccessiblityDelegateBridge(final AccessibilityDelegateCompat compat)
    {
        return new eJellyBean(new AccessibilityDelegateCompatJellyBean.AccessibilityDelegateBridgeJellyBean() {

            final AccessibilityDelegateCompat.AccessibilityDelegateJellyBeanImpl this$0;
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
                this$0 = AccessibilityDelegateCompat.AccessibilityDelegateJellyBeanImpl.this;
                compat = accessibilitydelegatecompat;
                super();
            }
        });
    }

    public final boolean performAccessibilityAction(Object obj, View view, int i, Bundle bundle)
    {
        return ((android.view.lyBeanImpl)obj).lyBeanImpl(view, i, bundle);
    }

    _cls1.val.compat()
    {
    }
}
