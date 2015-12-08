// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;

public class ke
    implements kj, mau
{

    private kc a;

    public ke()
    {
    }

    ke(kd kd, kc kc1)
    {
        a = kc1;
        super();
    }

    public lzx a(jyw jyw)
    {
        return new mao(jyw);
    }

    public final void a(View view, int i)
    {
        kc.a(view, i);
    }

    public final void a(View view, Object obj)
    {
        a.a(view, new pa(obj));
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
        kc.c(view, accessibilityevent);
    }

    public final void d(View view, AccessibilityEvent accessibilityevent)
    {
        kc.a(view, accessibilityevent);
    }
}
