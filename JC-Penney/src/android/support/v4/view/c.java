// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.view;

import android.support.v4.view.a.a;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;

// Referenced classes of package android.support.v4.view:
//            j, a, b

class c
    implements j
{

    final android.support.v4.view.a a;
    final b b;

    c(b b1, android.support.v4.view.a a1)
    {
        b = b1;
        a = a1;
        super();
    }

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
}
