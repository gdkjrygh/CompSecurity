// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.widget;

import android.os.Bundle;
import android.support.v4.view.AccessibilityDelegateCompat;
import android.support.v4.view.accessibility.AccessibilityNodeInfoCompat;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;

// Referenced classes of package android.support.v7.widget:
//            RecyclerView

public class RecyclerViewAccessibilityDelegate extends AccessibilityDelegateCompat
{

    final RecyclerView b;
    final AccessibilityDelegateCompat c = new AccessibilityDelegateCompat() {

        final RecyclerViewAccessibilityDelegate b;

        public void a(View view, AccessibilityNodeInfoCompat accessibilitynodeinfocompat)
        {
            super.a(view, accessibilitynodeinfocompat);
            if (!RecyclerViewAccessibilityDelegate.a(b) && b.b.getLayoutManager() != null)
            {
                b.b.getLayoutManager().a(view, accessibilitynodeinfocompat);
            }
        }

        public boolean a(View view, int i, Bundle bundle)
        {
            if (super.a(view, i, bundle))
            {
                return true;
            }
            if (!RecyclerViewAccessibilityDelegate.a(b) && b.b.getLayoutManager() != null)
            {
                return b.b.getLayoutManager().a(view, i, bundle);
            } else
            {
                return false;
            }
        }

            
            {
                b = RecyclerViewAccessibilityDelegate.this;
                super();
            }
    };

    public RecyclerViewAccessibilityDelegate(RecyclerView recyclerview)
    {
        b = recyclerview;
    }

    static boolean a(RecyclerViewAccessibilityDelegate recyclerviewaccessibilitydelegate)
    {
        return recyclerviewaccessibilitydelegate.c();
    }

    private boolean c()
    {
        return b.hasPendingAdapterUpdates();
    }

    public void a(View view, AccessibilityNodeInfoCompat accessibilitynodeinfocompat)
    {
        super.a(view, accessibilitynodeinfocompat);
        accessibilitynodeinfocompat.b(android/support/v7/widget/RecyclerView.getName());
        if (!c() && b.getLayoutManager() != null)
        {
            b.getLayoutManager().a(accessibilitynodeinfocompat);
        }
    }

    public boolean a(View view, int i, Bundle bundle)
    {
        if (super.a(view, i, bundle))
        {
            return true;
        }
        if (!c() && b.getLayoutManager() != null)
        {
            return b.getLayoutManager().a(i, bundle);
        } else
        {
            return false;
        }
    }

    AccessibilityDelegateCompat b()
    {
        return c;
    }

    public void d(View view, AccessibilityEvent accessibilityevent)
    {
        super.d(view, accessibilityevent);
        accessibilityevent.setClassName(android/support/v7/widget/RecyclerView.getName());
        if ((view instanceof RecyclerView) && !c())
        {
            view = (RecyclerView)view;
            if (view.getLayoutManager() != null)
            {
                view.getLayoutManager().a(accessibilityevent);
            }
        }
    }
}
