// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.view;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import p.f.a;
import p.f.e;

// Referenced classes of package android.support.v4.view:
//            a, c

static class _cls1.a extends _cls1.a
{

    public Object a(android.support.v4.view.a a1)
    {
        return android.support.v4.view.c.a(new c.a(a1) {

            final android.support.v4.view.a a;
            final a.c b;

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
                a.a(view, new a(obj));
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
                b = a.c.this;
                a = a1;
                super();
            }
        });
    }

    public e a(Object obj, View view)
    {
        obj = android.support.v4.view.c.a(obj, view);
        if (obj != null)
        {
            return new e(obj);
        } else
        {
            return null;
        }
    }

    public boolean a(Object obj, View view, int i, Bundle bundle)
    {
        return android.support.v4.view.c.a(obj, view, i, bundle);
    }

    _cls1.a()
    {
    }
}
