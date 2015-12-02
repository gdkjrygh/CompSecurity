// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.view;

import android.support.v4.view.a.a;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;

// Referenced classes of package android.support.v4.view:
//            a, c

static class _cls1.a extends _cls1.a
{

    public Object a(android.support.v4.view.a a1)
    {
        return android.support.v4.view.c.a(new c.a(a1) {

            final android.support.v4.view.a a;
            final a.c b;

            public void a(View view, int i)
            {
                a.(view, i);
            }

            public void a(View view, Object obj)
            {
                a.(view, new a(obj));
            }

            public boolean a(View view, AccessibilityEvent accessibilityevent)
            {
                return a.b(view, accessibilityevent);
            }

            public boolean a(ViewGroup viewgroup, View view, AccessibilityEvent accessibilityevent)
            {
                return a.(viewgroup, view, accessibilityevent);
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
                a.(view, accessibilityevent);
            }

            
            {
                b = a.c.this;
                a = a1;
                super();
            }
        });
    }

    _cls1.a()
    {
    }
}
