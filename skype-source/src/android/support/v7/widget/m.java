// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.widget;

import android.os.Bundle;
import android.support.v4.view.a;
import android.support.v4.view.accessibility.c;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;

// Referenced classes of package android.support.v7.widget:
//            RecyclerView

public final class m extends a
{

    final RecyclerView a;
    final a c = new a() {

        final m a;

        public final void a(View view, c c1)
        {
            super.a(view, c1);
            if (!a.a.hasPendingAdapterUpdates() && a.a.getLayoutManager() != null)
            {
                a.a.getLayoutManager().onInitializeAccessibilityNodeInfoForItem(view, c1);
            }
        }

        public final boolean a(View view, int i, Bundle bundle)
        {
            if (super.a(view, i, bundle))
            {
                return true;
            }
            if (!a.a.hasPendingAdapterUpdates() && a.a.getLayoutManager() != null)
            {
                return a.a.getLayoutManager().performAccessibilityActionForItem(view, i, bundle);
            } else
            {
                return false;
            }
        }

            
            {
                a = m.this;
                super();
            }
    };

    public m(RecyclerView recyclerview)
    {
        a = recyclerview;
    }

    public final void a(View view, c c1)
    {
        super.a(view, c1);
        c1.b(android/support/v7/widget/RecyclerView.getName());
        if (!a.hasPendingAdapterUpdates() && a.getLayoutManager() != null)
        {
            a.getLayoutManager().onInitializeAccessibilityNodeInfo(c1);
        }
    }

    public final void a(View view, AccessibilityEvent accessibilityevent)
    {
        super.a(view, accessibilityevent);
        accessibilityevent.setClassName(android/support/v7/widget/RecyclerView.getName());
        if ((view instanceof RecyclerView) && !a.hasPendingAdapterUpdates())
        {
            view = (RecyclerView)view;
            if (view.getLayoutManager() != null)
            {
                view.getLayoutManager().onInitializeAccessibilityEvent(accessibilityevent);
            }
        }
    }

    public final boolean a(View view, int i, Bundle bundle)
    {
        if (super.a(view, i, bundle))
        {
            return true;
        }
        if (!a.hasPendingAdapterUpdates() && a.getLayoutManager() != null)
        {
            return a.getLayoutManager().performAccessibilityAction(i, bundle);
        } else
        {
            return false;
        }
    }
}
