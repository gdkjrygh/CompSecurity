// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.view;

import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;

// Referenced classes of package android.support.v4.view:
//            b, c

public class android.support.v4.view.a
{
    static class a extends d
    {

        public Object a()
        {
            return android.support.v4.view.b.a();
        }

        public Object a(android.support.v4.view.a a1)
        {
            return android.support.v4.view.b.a(new b.a(this, a1) {

                final android.support.v4.view.a a;
                final a b;

                public void a(View view, int i)
                {
                    a.a(view, i);
                }

                public void a(View view, Object obj)
                {
                    a.a(view, new android.support.v4.view.a.a(obj));
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
                b = a1;
                a = a2;
                super();
            }
            });
        }

        public void a(Object obj, View view, int i)
        {
            android.support.v4.view.b.a(obj, view, i);
        }

        public void a(Object obj, View view, android.support.v4.view.a.a a1)
        {
            android.support.v4.view.b.a(obj, view, a1.a());
        }

        public boolean a(Object obj, View view, AccessibilityEvent accessibilityevent)
        {
            return android.support.v4.view.b.a(obj, view, accessibilityevent);
        }

        public boolean a(Object obj, ViewGroup viewgroup, View view, AccessibilityEvent accessibilityevent)
        {
            return android.support.v4.view.b.a(obj, viewgroup, view, accessibilityevent);
        }

        public void b(Object obj, View view, AccessibilityEvent accessibilityevent)
        {
            android.support.v4.view.b.b(obj, view, accessibilityevent);
        }

        public void c(Object obj, View view, AccessibilityEvent accessibilityevent)
        {
            android.support.v4.view.b.c(obj, view, accessibilityevent);
        }

        public void d(Object obj, View view, AccessibilityEvent accessibilityevent)
        {
            android.support.v4.view.b.d(obj, view, accessibilityevent);
        }

        a()
        {
        }
    }

    static interface b
    {

        public abstract Object a();

        public abstract Object a(android.support.v4.view.a a1);

        public abstract void a(Object obj, View view, int i);

        public abstract void a(Object obj, View view, android.support.v4.view.a.a a1);

        public abstract boolean a(Object obj, View view, AccessibilityEvent accessibilityevent);

        public abstract boolean a(Object obj, ViewGroup viewgroup, View view, AccessibilityEvent accessibilityevent);

        public abstract void b(Object obj, View view, AccessibilityEvent accessibilityevent);

        public abstract void c(Object obj, View view, AccessibilityEvent accessibilityevent);

        public abstract void d(Object obj, View view, AccessibilityEvent accessibilityevent);
    }

    static class c extends a
    {

        public Object a(android.support.v4.view.a a1)
        {
            return android.support.v4.view.c.a(new c.a(this, a1) {

                final android.support.v4.view.a a;
                final c b;

                public void a(View view, int i)
                {
                    a.a(view, i);
                }

                public void a(View view, Object obj)
                {
                    a.a(view, new android.support.v4.view.a.a(obj));
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
                b = c1;
                a = a1;
                super();
            }
            });
        }

        c()
        {
        }
    }

    static class d
        implements b
    {

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

        public void a(Object obj, View view, android.support.v4.view.a.a a1)
        {
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


    private static final b b;
    private static final Object c;
    final Object a;

    public android.support.v4.view.a()
    {
        a = b.a(this);
    }

    Object a()
    {
        return a;
    }

    public void a(View view, int i)
    {
        b.a(c, view, i);
    }

    public void a(View view, android.support.v4.view.a.a a1)
    {
        b.a(c, view, a1);
    }

    public void a(View view, AccessibilityEvent accessibilityevent)
    {
        b.d(c, view, accessibilityevent);
    }

    public boolean a(ViewGroup viewgroup, View view, AccessibilityEvent accessibilityevent)
    {
        return b.a(c, viewgroup, view, accessibilityevent);
    }

    public boolean b(View view, AccessibilityEvent accessibilityevent)
    {
        return b.a(c, view, accessibilityevent);
    }

    public void c(View view, AccessibilityEvent accessibilityevent)
    {
        b.c(c, view, accessibilityevent);
    }

    public void d(View view, AccessibilityEvent accessibilityevent)
    {
        b.b(c, view, accessibilityevent);
    }

    static 
    {
        if (android.os.Build.VERSION.SDK_INT >= 16)
        {
            b = new c();
        } else
        if (android.os.Build.VERSION.SDK_INT >= 14)
        {
            b = new a();
        } else
        {
            b = new d();
        }
        c = b.a();
    }
}
