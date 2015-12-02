// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.view;

import android.os.Bundle;
import android.support.v4.view.a.a;
import android.support.v4.view.a.g;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;

// Referenced classes of package android.support.v4.view:
//            m, a, e

class f
    implements m
{

    final android.support.v4.view.a a;
    final e b;

    f(e e, android.support.v4.view.a a1)
    {
        b = e;
        a = a1;
        super();
    }

    public Object a(View view)
    {
        view = a.(view);
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
        a.(view, i);
    }

    public void a(View view, Object obj)
    {
        a.(view, new a(obj));
    }

    public boolean a(View view, int i, Bundle bundle)
    {
        return a.(view, i, bundle);
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
}
