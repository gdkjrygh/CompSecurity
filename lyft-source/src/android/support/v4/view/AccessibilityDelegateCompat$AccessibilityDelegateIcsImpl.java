// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.view;

import android.support.v4.view.accessibility.AccessibilityNodeInfoCompat;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;

// Referenced classes of package android.support.v4.view:
//            AccessibilityDelegateCompatIcs, AccessibilityDelegateCompat

class _cls1.a extends 
{

    public Object a()
    {
        return AccessibilityDelegateCompatIcs.a();
    }

    public Object a(AccessibilityDelegateCompat accessibilitydelegatecompat)
    {
        return AccessibilityDelegateCompatIcs.a(new AccessibilityDelegateCompatIcs.AccessibilityDelegateBridge(accessibilitydelegatecompat) {

            final AccessibilityDelegateCompat a;
            final AccessibilityDelegateCompat.AccessibilityDelegateIcsImpl b;

            public void a(View view, int i)
            {
                a.a(view, i);
            }

            public void a(View view, Object obj)
            {
                a.a(view, new AccessibilityNodeInfoCompat(obj));
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
                b = AccessibilityDelegateCompat.AccessibilityDelegateIcsImpl.this;
                a = accessibilitydelegatecompat;
                super();
            }
        });
    }

    public void a(Object obj, View view, int i)
    {
        AccessibilityDelegateCompatIcs.a(obj, view, i);
    }

    public void a(Object obj, View view, AccessibilityNodeInfoCompat accessibilitynodeinfocompat)
    {
        AccessibilityDelegateCompatIcs.a(obj, view, accessibilitynodeinfocompat.a());
    }

    public boolean a(Object obj, View view, AccessibilityEvent accessibilityevent)
    {
        return AccessibilityDelegateCompatIcs.a(obj, view, accessibilityevent);
    }

    public boolean a(Object obj, ViewGroup viewgroup, View view, AccessibilityEvent accessibilityevent)
    {
        return AccessibilityDelegateCompatIcs.a(obj, viewgroup, view, accessibilityevent);
    }

    public void b(Object obj, View view, AccessibilityEvent accessibilityevent)
    {
        AccessibilityDelegateCompatIcs.b(obj, view, accessibilityevent);
    }

    public void c(Object obj, View view, AccessibilityEvent accessibilityevent)
    {
        AccessibilityDelegateCompatIcs.c(obj, view, accessibilityevent);
    }

    public void d(Object obj, View view, AccessibilityEvent accessibilityevent)
    {
        AccessibilityDelegateCompatIcs.d(obj, view, accessibilityevent);
    }

    _cls1.a()
    {
    }
}
