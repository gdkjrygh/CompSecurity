// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.view;

import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;

public interface j
{

    public abstract void a(View view, int i);

    public abstract void a(View view, Object obj);

    public abstract boolean a(View view, AccessibilityEvent accessibilityevent);

    public abstract boolean a(ViewGroup viewgroup, View view, AccessibilityEvent accessibilityevent);

    public abstract void b(View view, AccessibilityEvent accessibilityevent);

    public abstract void c(View view, AccessibilityEvent accessibilityevent);

    public abstract void d(View view, AccessibilityEvent accessibilityevent);
}
