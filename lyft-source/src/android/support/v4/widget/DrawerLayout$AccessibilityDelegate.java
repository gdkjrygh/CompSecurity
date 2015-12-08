// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.widget;

import android.graphics.Rect;
import android.support.v4.view.AccessibilityDelegateCompat;
import android.support.v4.view.ViewCompat;
import android.support.v4.view.accessibility.AccessibilityNodeInfoCompat;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import java.util.List;

// Referenced classes of package android.support.v4.widget:
//            DrawerLayout

class b extends AccessibilityDelegateCompat
{

    final DrawerLayout b;
    private final Rect c = new Rect();

    private void a(AccessibilityNodeInfoCompat accessibilitynodeinfocompat, AccessibilityNodeInfoCompat accessibilitynodeinfocompat1)
    {
        Rect rect = c;
        accessibilitynodeinfocompat1.a(rect);
        accessibilitynodeinfocompat.b(rect);
        accessibilitynodeinfocompat1.c(rect);
        accessibilitynodeinfocompat.d(rect);
        accessibilitynodeinfocompat.c(accessibilitynodeinfocompat1.g());
        accessibilitynodeinfocompat.a(accessibilitynodeinfocompat1.o());
        accessibilitynodeinfocompat.b(accessibilitynodeinfocompat1.p());
        accessibilitynodeinfocompat.c(accessibilitynodeinfocompat1.r());
        accessibilitynodeinfocompat.h(accessibilitynodeinfocompat1.l());
        accessibilitynodeinfocompat.f(accessibilitynodeinfocompat1.j());
        accessibilitynodeinfocompat.a(accessibilitynodeinfocompat1.e());
        accessibilitynodeinfocompat.b(accessibilitynodeinfocompat1.f());
        accessibilitynodeinfocompat.d(accessibilitynodeinfocompat1.h());
        accessibilitynodeinfocompat.e(accessibilitynodeinfocompat1.i());
        accessibilitynodeinfocompat.g(accessibilitynodeinfocompat1.k());
        accessibilitynodeinfocompat.a(accessibilitynodeinfocompat1.b());
    }

    private void a(AccessibilityNodeInfoCompat accessibilitynodeinfocompat, ViewGroup viewgroup)
    {
        int j = viewgroup.getChildCount();
        for (int i = 0; i < j; i++)
        {
            View view = viewgroup.getChildAt(i);
            if (DrawerLayout.l(view))
            {
                accessibilitynodeinfocompat.b(view);
            }
        }

    }

    public void a(View view, AccessibilityNodeInfoCompat accessibilitynodeinfocompat)
    {
        if (DrawerLayout.e())
        {
            super.a(view, accessibilitynodeinfocompat);
        } else
        {
            AccessibilityNodeInfoCompat accessibilitynodeinfocompat1 = AccessibilityNodeInfoCompat.a(accessibilitynodeinfocompat);
            super.a(view, accessibilitynodeinfocompat1);
            accessibilitynodeinfocompat.a(view);
            android.view.ViewParent viewparent = ViewCompat.i(view);
            if (viewparent instanceof View)
            {
                accessibilitynodeinfocompat.c((View)viewparent);
            }
            a(accessibilitynodeinfocompat, accessibilitynodeinfocompat1);
            accessibilitynodeinfocompat1.s();
            a(accessibilitynodeinfocompat, (ViewGroup)view);
        }
        accessibilitynodeinfocompat.b(android/support/v4/widget/DrawerLayout.getName());
        accessibilitynodeinfocompat.a(false);
        accessibilitynodeinfocompat.b(false);
        accessibilitynodeinfocompat.a(android.support.v4.view.accessibility.bilityActionCompat.a);
        accessibilitynodeinfocompat.a(android.support.v4.view.accessibility.bilityActionCompat.b);
    }

    public boolean a(ViewGroup viewgroup, View view, AccessibilityEvent accessibilityevent)
    {
        if (DrawerLayout.e() || DrawerLayout.l(view))
        {
            return super.a(viewgroup, view, accessibilityevent);
        } else
        {
            return false;
        }
    }

    public boolean b(View view, AccessibilityEvent accessibilityevent)
    {
        if (accessibilityevent.getEventType() == 32)
        {
            view = accessibilityevent.getText();
            accessibilityevent = DrawerLayout.a(b);
            if (accessibilityevent != null)
            {
                int i = b.e(accessibilityevent);
                accessibilityevent = b.a(i);
                if (accessibilityevent != null)
                {
                    view.add(accessibilityevent);
                }
            }
            return true;
        } else
        {
            return super.b(view, accessibilityevent);
        }
    }

    public void d(View view, AccessibilityEvent accessibilityevent)
    {
        super.d(view, accessibilityevent);
        accessibilityevent.setClassName(android/support/v4/widget/DrawerLayout.getName());
    }

    mpat(DrawerLayout drawerlayout)
    {
        b = drawerlayout;
        super();
    }
}
