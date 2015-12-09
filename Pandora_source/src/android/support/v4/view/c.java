// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.view;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;

class c
{
    public static interface a
    {

        public abstract Object a(View view);

        public abstract void a(View view, int i);

        public abstract void a(View view, Object obj);

        public abstract boolean a(View view, int i, Bundle bundle);

        public abstract boolean a(View view, AccessibilityEvent accessibilityevent);

        public abstract boolean a(ViewGroup viewgroup, View view, AccessibilityEvent accessibilityevent);

        public abstract void b(View view, AccessibilityEvent accessibilityevent);

        public abstract void c(View view, AccessibilityEvent accessibilityevent);

        public abstract void d(View view, AccessibilityEvent accessibilityevent);
    }


    public static Object a(a a1)
    {
        return new android.view.View.AccessibilityDelegate(a1) {

            final a a;

            public boolean dispatchPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityevent)
            {
                return a.a(view, accessibilityevent);
            }

            public AccessibilityNodeProvider getAccessibilityNodeProvider(View view)
            {
                return (AccessibilityNodeProvider)a.a(view);
            }

            public void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityevent)
            {
                a.b(view, accessibilityevent);
            }

            public void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilitynodeinfo)
            {
                a.a(view, accessibilitynodeinfo);
            }

            public void onPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityevent)
            {
                a.c(view, accessibilityevent);
            }

            public boolean onRequestSendAccessibilityEvent(ViewGroup viewgroup, View view, AccessibilityEvent accessibilityevent)
            {
                return a.a(viewgroup, view, accessibilityevent);
            }

            public boolean performAccessibilityAction(View view, int i, Bundle bundle)
            {
                return a.a(view, i, bundle);
            }

            public void sendAccessibilityEvent(View view, int i)
            {
                a.a(view, i);
            }

            public void sendAccessibilityEventUnchecked(View view, AccessibilityEvent accessibilityevent)
            {
                a.d(view, accessibilityevent);
            }

            
            {
                a = a1;
                super();
            }
        };
    }

    public static Object a(Object obj, View view)
    {
        return ((android.view.View.AccessibilityDelegate)obj).getAccessibilityNodeProvider(view);
    }

    public static boolean a(Object obj, View view, int i, Bundle bundle)
    {
        return ((android.view.View.AccessibilityDelegate)obj).performAccessibilityAction(view, i, bundle);
    }
}
