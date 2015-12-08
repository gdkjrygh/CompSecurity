// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.widget;

import android.os.Bundle;
import android.support.v4.view.AccessibilityDelegateCompat;
import android.support.v4.view.ViewCompat;
import android.support.v4.view.accessibility.AccessibilityNodeInfoCompat;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;

// Referenced classes of package android.support.v7.widget:
//            z, RecyclerView

public class RecyclerViewAccessibilityDelegate extends AccessibilityDelegateCompat
{

    final RecyclerView a;
    final AccessibilityDelegateCompat b = new z(this);

    public RecyclerViewAccessibilityDelegate(RecyclerView recyclerview)
    {
        a = recyclerview;
    }

    static boolean a(RecyclerViewAccessibilityDelegate recyclerviewaccessibilitydelegate)
    {
        return recyclerviewaccessibilitydelegate.a.f();
    }

    public void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityevent)
    {
        super.onInitializeAccessibilityEvent(view, accessibilityevent);
        accessibilityevent.setClassName(android/support/v7/widget/RecyclerView.getName());
        if ((view instanceof RecyclerView) && !a.f())
        {
            view = (RecyclerView)view;
            if (view.b() != null)
            {
                view.b().a(accessibilityevent);
            }
        }
    }

    public void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfoCompat accessibilitynodeinfocompat)
    {
        super.onInitializeAccessibilityNodeInfo(view, accessibilitynodeinfocompat);
        accessibilitynodeinfocompat.setClassName(android/support/v7/widget/RecyclerView.getName());
        if (!a.f() && a.b() != null)
        {
            view = a.b();
            RecyclerView.m m = ((RecyclerView.i) (view)).r.a;
            RecyclerView.q q = ((RecyclerView.i) (view)).r.e;
            if (ViewCompat.canScrollVertically(((RecyclerView.i) (view)).r, -1) || ViewCompat.canScrollHorizontally(((RecyclerView.i) (view)).r, -1))
            {
                accessibilitynodeinfocompat.addAction(8192);
                accessibilitynodeinfocompat.setScrollable(true);
            }
            if (ViewCompat.canScrollVertically(((RecyclerView.i) (view)).r, 1) || ViewCompat.canScrollHorizontally(((RecyclerView.i) (view)).r, 1))
            {
                accessibilitynodeinfocompat.addAction(4096);
                accessibilitynodeinfocompat.setScrollable(true);
            }
            accessibilitynodeinfocompat.setCollectionInfo(android.support.v4.view.accessibility.AccessibilityNodeInfoCompat.CollectionInfoCompat.obtain(view.a(m, q), view.b(m, q), false, 0));
        }
    }

    public boolean performAccessibilityAction(View view, int i, Bundle bundle)
    {
        boolean flag1 = false;
        if (!super.performAccessibilityAction(view, i, bundle)) goto _L2; else goto _L1
_L1:
        boolean flag = true;
_L4:
        return flag;
_L2:
        flag = flag1;
        if (a.f()) goto _L4; else goto _L3
_L3:
        flag = flag1;
        if (a.b() == null) goto _L4; else goto _L5
_L5:
        view = a.b();
        bundle = ((RecyclerView.i) (view)).r.a;
        bundle = ((RecyclerView.i) (view)).r.e;
        flag = flag1;
        if (((RecyclerView.i) (view)).r == null) goto _L4; else goto _L6
_L6:
        i;
        JVM INSTR lookupswitch 2: default 108
    //                   4096: 205
    //                   8192: 138;
           goto _L7 _L8 _L9
_L7:
        int j;
        i = 0;
        j = 0;
_L13:
        if (j != 0)
        {
            break; /* Loop/switch isn't completed */
        }
        flag = flag1;
        if (i == 0) goto _L4; else goto _L10
_L10:
        ((RecyclerView.i) (view)).r.scrollBy(i, j);
        return true;
_L9:
        int k;
        int l;
        int i1;
        if (ViewCompat.canScrollVertically(((RecyclerView.i) (view)).r, -1))
        {
            i = -(view.r() - view.t() - view.v());
        } else
        {
            i = 0;
        }
        j = i;
        if (!ViewCompat.canScrollHorizontally(((RecyclerView.i) (view)).r, -1)) goto _L12; else goto _L11
_L11:
        k = -(view.q() - view.s() - view.u());
        j = i;
        i = k;
          goto _L13
_L8:
        if (ViewCompat.canScrollVertically(((RecyclerView.i) (view)).r, 1))
        {
            i = view.r() - view.t() - view.v();
        } else
        {
            i = 0;
        }
        j = i;
        if (!ViewCompat.canScrollHorizontally(((RecyclerView.i) (view)).r, 1)) goto _L12; else goto _L14
_L14:
        k = view.q();
        l = view.s();
        i1 = view.u();
        j = i;
        i = k - l - i1;
          goto _L13
_L12:
        i = 0;
          goto _L13
    }
}
