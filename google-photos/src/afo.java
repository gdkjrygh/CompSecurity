// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;

public final class afo extends kc
{

    final RecyclerView b;
    final kc c = new afp(this);

    public afo(RecyclerView recyclerview)
    {
        b = recyclerview;
    }

    public final void a(View view, pa pa1)
    {
        super.a(view, pa1);
        pa1.b(android/support/v7/widget/RecyclerView.getName());
        if (!a() && b.e != null)
        {
            b.e.onInitializeAccessibilityNodeInfo(pa1);
        }
    }

    boolean a()
    {
        RecyclerView recyclerview = b;
        return !recyclerview.i || recyclerview.l || recyclerview.b.d();
    }

    public final boolean a(View view, int i, Bundle bundle)
    {
        if (super.a(view, i, bundle))
        {
            return true;
        }
        if (!a() && b.e != null)
        {
            return b.e.performAccessibilityAction(i, bundle);
        } else
        {
            return false;
        }
    }

    public final void d(View view, AccessibilityEvent accessibilityevent)
    {
        super.d(view, accessibilityevent);
        accessibilityevent.setClassName(android/support/v7/widget/RecyclerView.getName());
        if ((view instanceof RecyclerView) && !a())
        {
            view = (RecyclerView)view;
            if (((RecyclerView) (view)).e != null)
            {
                ((RecyclerView) (view)).e.onInitializeAccessibilityEvent(accessibilityevent);
            }
        }
    }
}
