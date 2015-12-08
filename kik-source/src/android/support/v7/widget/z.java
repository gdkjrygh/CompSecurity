// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.widget;

import android.os.Bundle;
import android.support.v4.view.AccessibilityDelegateCompat;
import android.support.v4.view.accessibility.AccessibilityNodeInfoCompat;
import android.view.View;

// Referenced classes of package android.support.v7.widget:
//            RecyclerViewAccessibilityDelegate, RecyclerView

final class z extends AccessibilityDelegateCompat
{

    final RecyclerViewAccessibilityDelegate a;

    z(RecyclerViewAccessibilityDelegate recyclerviewaccessibilitydelegate)
    {
        a = recyclerviewaccessibilitydelegate;
        super();
    }

    public final void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfoCompat accessibilitynodeinfocompat)
    {
        super.onInitializeAccessibilityNodeInfo(view, accessibilitynodeinfocompat);
        if (!RecyclerViewAccessibilityDelegate.a(a) && a.a.b() != null)
        {
            a.a.b().a(view, accessibilitynodeinfocompat);
        }
    }

    public final boolean performAccessibilityAction(View view, int i, Bundle bundle)
    {
        boolean flag1 = false;
        boolean flag;
        if (super.performAccessibilityAction(view, i, bundle))
        {
            flag = true;
        } else
        {
            flag = flag1;
            if (!RecyclerViewAccessibilityDelegate.a(a))
            {
                flag = flag1;
                if (a.a.b() != null)
                {
                    view = a.a.b();
                    bundle = ((RecyclerView.i) (view)).r.a;
                    view = ((RecyclerView.i) (view)).r.e;
                    return false;
                }
            }
        }
        return flag;
    }
}
