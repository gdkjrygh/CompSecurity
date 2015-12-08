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
//            AccessibilityDelegateCompatJellyBean, AccessibilityDelegateCompat

class _cls1.a extends _cls1.a
{

    public AccessibilityNodeProviderCompat a(Object obj, View view)
    {
        obj = AccessibilityDelegateCompatJellyBean.a(obj, view);
        if (obj != null)
        {
            return new AccessibilityNodeProviderCompat(obj);
        } else
        {
            return null;
        }
    }

    public Object a(AccessibilityDelegateCompat accessibilitydelegatecompat)
    {
        return AccessibilityDelegateCompatJellyBean.a(new AccessibilityDelegateCompatJellyBean.AccessibilityDelegateBridgeJellyBean(accessibilitydelegatecompat) {

            final AccessibilityDelegateCompat a;
            final AccessibilityDelegateCompat.AccessibilityDelegateJellyBeanImpl b;

            public Object a(View view)
            {
                view = a.a(view);
                if (view != null)
                {
                    return view.a();
                } else
                {
                    return null;
                }
            }

            public void a(View view, int i)
            {
                a.a(view, i);
            }

            public void a(View view, Object obj)
            {
                a.a(view, new AccessibilityNodeInfoCompat(obj));
            }

            public boolean a(View view, int i, Bundle bundle)
            {
                return a.a(view, i, bundle);
            }

            public boolean a(View view, AccessibilityEvent accessibilityevent)
            {
                return a.b(view, accessibilityevent);
            }

            public boolean a(ViewGroup viewgroup, View view, AccessibilityEvent accessibilityevent)
            {
                return a.a(viewgroup, view, accessibilityevent);
            }

            public void b(View view, AccessibilityEvent accessibilityevent)
            {
                a.d(view, accessibilityevent);
            }

            public void c(View view, AccessibilityEvent accessibilityevent)
            {
                a.c(view, accessibilityevent);
            }

            public void d(View view, AccessibilityEvent accessibilityevent)
            {
                a.a(view, accessibilityevent);
            }

            
            {
                b = AccessibilityDelegateCompat.AccessibilityDelegateJellyBeanImpl.this;
                a = accessibilitydelegatecompat;
                super();
            }
        });
    }

    public boolean a(Object obj, View view, int i, Bundle bundle)
    {
        return AccessibilityDelegateCompatJellyBean.a(obj, view, i, bundle);
    }

    _cls1.a()
    {
    }
}
