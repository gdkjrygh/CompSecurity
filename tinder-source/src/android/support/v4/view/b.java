// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.view;

import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;

final class b
{
    public static interface a
    {

        public abstract void a(View view, int i);

        public abstract void a(View view, Object obj);

        public abstract boolean a(View view, AccessibilityEvent accessibilityevent);

        public abstract boolean a(ViewGroup viewgroup, View view, AccessibilityEvent accessibilityevent);

        public abstract void b(View view, AccessibilityEvent accessibilityevent);

        public abstract void c(View view, AccessibilityEvent accessibilityevent);

        public abstract void d(View view, AccessibilityEvent accessibilityevent);
    }


    // Unreferenced inner class android/support/v4/view/b$1

/* anonymous class */
    static final class _cls1 extends android.view.View.AccessibilityDelegate
    {

        final a a;

        public final boolean dispatchPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityevent)
        {
            return a.a(view, accessibilityevent);
        }

        public final void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityevent)
        {
            a.b(view, accessibilityevent);
        }

        public final void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilitynodeinfo)
        {
            a.a(view, accessibilitynodeinfo);
        }

        public final void onPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityevent)
        {
            a.c(view, accessibilityevent);
        }

        public final boolean onRequestSendAccessibilityEvent(ViewGroup viewgroup, View view, AccessibilityEvent accessibilityevent)
        {
            return a.a(viewgroup, view, accessibilityevent);
        }

        public final void sendAccessibilityEvent(View view, int i)
        {
            a.a(view, i);
        }

        public final void sendAccessibilityEventUnchecked(View view, AccessibilityEvent accessibilityevent)
        {
            a.d(view, accessibilityevent);
        }

            
            {
                a = a1;
                super();
            }
    }

}
