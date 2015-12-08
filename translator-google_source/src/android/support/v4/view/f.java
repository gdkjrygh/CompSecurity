// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.view;

import android.os.Bundle;
import android.support.v4.view.a.q;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;

// Referenced classes of package android.support.v4.view:
//            m, a, e

final class f
    implements m
{

    final a a;
    final e b;

    f(e e, a a1)
    {
        b = e;
        a = a1;
        super();
    }

    public final Object a(View view)
    {
        view = android.support.v4.view.a.a(view);
        if (view != null)
        {
            return ((q) (view)).a;
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
        a.a(view, new android.support.v4.view.a.f(obj));
    }

    public final boolean a(View view, int i, Bundle bundle)
    {
        return a.a(view, i, bundle);
    }

    public final boolean a(View view, AccessibilityEvent accessibilityevent)
    {
        return a.b(view, accessibilityevent);
    }

    public final boolean a(ViewGroup viewgroup, View view, AccessibilityEvent accessibilityevent)
    {
        return a.a(viewgroup, view, accessibilityevent);
    }

    public final void b(View view, AccessibilityEvent accessibilityevent)
    {
        a.d(view, accessibilityevent);
    }

    public final void c(View view, AccessibilityEvent accessibilityevent)
    {
        android.support.v4.view.a.c(view, accessibilityevent);
    }

    public final void d(View view, AccessibilityEvent accessibilityevent)
    {
        android.support.v4.view.a.a(view, accessibilityevent);
    }
}
