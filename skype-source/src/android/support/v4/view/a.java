// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.view;

import android.os.Bundle;
import android.support.v4.view.accessibility.c;
import android.support.v4.view.accessibility.d;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;

public class android.support.v4.view.a
{
    static class a extends d
    {

        public final Object a()
        {
            return new android.view.View.AccessibilityDelegate();
        }

        public Object a(android.support.v4.view.a a1)
        {
            return new b._cls1(new b.a(this, a1) {

                final android.support.v4.view.a a;
                final a b;

                public final void a(View view, int i)
                {
                    android.support.v4.view.a.a(view, i);
                }

                public final void a(View view, Object obj)
                {
                    a.a(view, new android.support.v4.view.accessibility.c(obj));
                }

                public final boolean a(View view, AccessibilityEvent accessibilityevent)
                {
                    return a.d(view, accessibilityevent);
                }

                public final boolean a(ViewGroup viewgroup, View view, AccessibilityEvent accessibilityevent)
                {
                    return a.a(viewgroup, view, accessibilityevent);
                }

                public final void b(View view, AccessibilityEvent accessibilityevent)
                {
                    a.a(view, accessibilityevent);
                }

                public final void c(View view, AccessibilityEvent accessibilityevent)
                {
                    a.b(view, accessibilityevent);
                }

                public final void d(View view, AccessibilityEvent accessibilityevent)
                {
                    android.support.v4.view.a.c(view, accessibilityevent);
                }

            
            {
                b = a1;
                a = a2;
                super();
            }
            });
        }

        public final void a(Object obj, View view, int i)
        {
            ((android.view.View.AccessibilityDelegate)obj).sendAccessibilityEvent(view, i);
        }

        public final void a(Object obj, View view, android.support.v4.view.accessibility.c c1)
        {
            c1 = ((android.support.v4.view.accessibility.c) (c1.a()));
            ((android.view.View.AccessibilityDelegate)obj).onInitializeAccessibilityNodeInfo(view, (AccessibilityNodeInfo)c1);
        }

        public final boolean a(Object obj, View view, AccessibilityEvent accessibilityevent)
        {
            return ((android.view.View.AccessibilityDelegate)obj).dispatchPopulateAccessibilityEvent(view, accessibilityevent);
        }

        public final boolean a(Object obj, ViewGroup viewgroup, View view, AccessibilityEvent accessibilityevent)
        {
            return ((android.view.View.AccessibilityDelegate)obj).onRequestSendAccessibilityEvent(viewgroup, view, accessibilityevent);
        }

        public final void b(Object obj, View view, AccessibilityEvent accessibilityevent)
        {
            ((android.view.View.AccessibilityDelegate)obj).onInitializeAccessibilityEvent(view, accessibilityevent);
        }

        public final void c(Object obj, View view, AccessibilityEvent accessibilityevent)
        {
            ((android.view.View.AccessibilityDelegate)obj).onPopulateAccessibilityEvent(view, accessibilityevent);
        }

        public final void d(Object obj, View view, AccessibilityEvent accessibilityevent)
        {
            ((android.view.View.AccessibilityDelegate)obj).sendAccessibilityEventUnchecked(view, accessibilityevent);
        }

        a()
        {
        }
    }

    static interface b
    {

        public abstract android.support.v4.view.accessibility.d a(Object obj, View view);

        public abstract Object a();

        public abstract Object a(android.support.v4.view.a a1);

        public abstract void a(Object obj, View view, int i);

        public abstract void a(Object obj, View view, android.support.v4.view.accessibility.c c1);

        public abstract boolean a(Object obj, View view, int i, Bundle bundle);

        public abstract boolean a(Object obj, View view, AccessibilityEvent accessibilityevent);

        public abstract boolean a(Object obj, ViewGroup viewgroup, View view, AccessibilityEvent accessibilityevent);

        public abstract void b(Object obj, View view, AccessibilityEvent accessibilityevent);

        public abstract void c(Object obj, View view, AccessibilityEvent accessibilityevent);

        public abstract void d(Object obj, View view, AccessibilityEvent accessibilityevent);
    }

    static final class c extends a
    {

        public final android.support.v4.view.accessibility.d a(Object obj, View view)
        {
            obj = ((android.view.View.AccessibilityDelegate)obj).getAccessibilityNodeProvider(view);
            if (obj != null)
            {
                return new android.support.v4.view.accessibility.d(obj);
            } else
            {
                return null;
            }
        }

        public final Object a(android.support.v4.view.a a1)
        {
            return new c._cls1(new c.a(this, a1) {

                final android.support.v4.view.a a;
                final c b;

                public final Object a(View view)
                {
                    view = android.support.v4.view.a.a(view);
                    if (view != null)
                    {
                        return view.a();
                    } else
                    {
                        return null;
                    }
                }

                public final void a(View view, int i)
                {
                    android.support.v4.view.a.a(view, i);
                }

                public final void a(View view, Object obj)
                {
                    a.a(view, new android.support.v4.view.accessibility.c(obj));
                }

                public final boolean a(View view, int i, Bundle bundle)
                {
                    return a.a(view, i, bundle);
                }

                public final boolean a(View view, AccessibilityEvent accessibilityevent)
                {
                    return a.d(view, accessibilityevent);
                }

                public final boolean a(ViewGroup viewgroup, View view, AccessibilityEvent accessibilityevent)
                {
                    return a.a(viewgroup, view, accessibilityevent);
                }

                public final void b(View view, AccessibilityEvent accessibilityevent)
                {
                    a.a(view, accessibilityevent);
                }

                public final void c(View view, AccessibilityEvent accessibilityevent)
                {
                    a.b(view, accessibilityevent);
                }

                public final void d(View view, AccessibilityEvent accessibilityevent)
                {
                    android.support.v4.view.a.c(view, accessibilityevent);
                }

            
            {
                b = c1;
                a = a1;
                super();
            }
            });
        }

        public final boolean a(Object obj, View view, int i, Bundle bundle)
        {
            return ((android.view.View.AccessibilityDelegate)obj).performAccessibilityAction(view, i, bundle);
        }

        c()
        {
        }
    }

    static class d
        implements b
    {

        public android.support.v4.view.accessibility.d a(Object obj, View view)
        {
            return null;
        }

        public Object a()
        {
            return null;
        }

        public Object a(android.support.v4.view.a a1)
        {
            return null;
        }

        public void a(Object obj, View view, int i)
        {
        }

        public void a(Object obj, View view, android.support.v4.view.accessibility.c c1)
        {
        }

        public boolean a(Object obj, View view, int i, Bundle bundle)
        {
            return false;
        }

        public boolean a(Object obj, View view, AccessibilityEvent accessibilityevent)
        {
            return false;
        }

        public boolean a(Object obj, ViewGroup viewgroup, View view, AccessibilityEvent accessibilityevent)
        {
            return true;
        }

        public void b(Object obj, View view, AccessibilityEvent accessibilityevent)
        {
        }

        public void c(Object obj, View view, AccessibilityEvent accessibilityevent)
        {
        }

        public void d(Object obj, View view, AccessibilityEvent accessibilityevent)
        {
        }

        d()
        {
        }
    }


    private static final b a;
    private static final Object c;
    final Object b;

    public android.support.v4.view.a()
    {
        b = a.a(this);
    }

    public static android.support.v4.view.accessibility.d a(View view)
    {
        return a.a(c, view);
    }

    public static void a(View view, int i)
    {
        a.a(c, view, i);
    }

    public static void c(View view, AccessibilityEvent accessibilityevent)
    {
        a.d(c, view, accessibilityevent);
    }

    public void a(View view, android.support.v4.view.accessibility.c c1)
    {
        a.a(c, view, c1);
    }

    public void a(View view, AccessibilityEvent accessibilityevent)
    {
        a.b(c, view, accessibilityevent);
    }

    public boolean a(View view, int i, Bundle bundle)
    {
        return a.a(c, view, i, bundle);
    }

    public boolean a(ViewGroup viewgroup, View view, AccessibilityEvent accessibilityevent)
    {
        return a.a(c, viewgroup, view, accessibilityevent);
    }

    public void b(View view, AccessibilityEvent accessibilityevent)
    {
        a.c(c, view, accessibilityevent);
    }

    public boolean d(View view, AccessibilityEvent accessibilityevent)
    {
        return a.a(c, view, accessibilityevent);
    }

    static 
    {
        if (android.os.Build.VERSION.SDK_INT >= 16)
        {
            a = new c();
        } else
        if (android.os.Build.VERSION.SDK_INT >= 14)
        {
            a = new a();
        } else
        {
            a = new d();
        }
        c = a.a();
    }
}
