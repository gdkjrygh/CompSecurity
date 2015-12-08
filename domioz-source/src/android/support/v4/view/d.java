// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.view;

import android.os.Bundle;
import android.support.v4.view.a.f;
import android.support.v4.view.a.q;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;

// Referenced classes of package android.support.v4.view:
//            a

interface d
{

    public abstract q a(Object obj, View view);

    public abstract Object a();

    public abstract Object a(a a1);

    public abstract void a(Object obj, View view, int i);

    public abstract void a(Object obj, View view, f f);

    public abstract boolean a(Object obj, View view, int i, Bundle bundle);

    public abstract boolean a(Object obj, View view, AccessibilityEvent accessibilityevent);

    public abstract boolean a(Object obj, ViewGroup viewgroup, View view, AccessibilityEvent accessibilityevent);

    public abstract void b(Object obj, View view, AccessibilityEvent accessibilityevent);

    public abstract void c(Object obj, View view, AccessibilityEvent accessibilityevent);

    public abstract void d(Object obj, View view, AccessibilityEvent accessibilityevent);
}
