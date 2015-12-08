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
//            bk, RecyclerView, au

public final class bj extends AccessibilityDelegateCompat
{

    final RecyclerView a;
    final AccessibilityDelegateCompat b = new bk(this);

    public bj(RecyclerView recyclerview)
    {
        a = recyclerview;
    }

    public final void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityevent)
    {
        super.onInitializeAccessibilityEvent(view, accessibilityevent);
        accessibilityevent.setClassName(android/support/v7/widget/RecyclerView.getName());
        if ((view instanceof RecyclerView) && !a.g())
        {
            view = (RecyclerView)view;
            if (view.b() != null)
            {
                view.b().a(accessibilityevent);
            }
        }
    }

    public final void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfoCompat accessibilitynodeinfocompat)
    {
        super.onInitializeAccessibilityNodeInfo(view, accessibilitynodeinfocompat);
        accessibilitynodeinfocompat.setClassName(android/support/v7/widget/RecyclerView.getName());
        if (!a.g() && a.b() != null)
        {
            view = a.b();
            az az = ((au) (view)).r.a;
            bf bf = ((au) (view)).r.e;
            if (ViewCompat.canScrollVertically(((au) (view)).r, -1) || ViewCompat.canScrollHorizontally(((au) (view)).r, -1))
            {
                accessibilitynodeinfocompat.addAction(8192);
                accessibilitynodeinfocompat.setScrollable(true);
            }
            if (ViewCompat.canScrollVertically(((au) (view)).r, 1) || ViewCompat.canScrollHorizontally(((au) (view)).r, 1))
            {
                accessibilitynodeinfocompat.addAction(4096);
                accessibilitynodeinfocompat.setScrollable(true);
            }
            accessibilitynodeinfocompat.setCollectionInfo(android.support.v4.view.accessibility.AccessibilityNodeInfoCompat.CollectionInfoCompat.obtain(view.a(az, bf), view.b(az, bf), false, 0));
        }
    }

    public final boolean performAccessibilityAction(View view, int i, Bundle bundle)
    {
        boolean flag1 = false;
        if (!super.performAccessibilityAction(view, i, bundle)) goto _L2; else goto _L1
_L1:
        boolean flag = true;
_L4:
        return flag;
_L2:
        flag = flag1;
        if (a.g()) goto _L4; else goto _L3
_L3:
        flag = flag1;
        if (a.b() == null) goto _L4; else goto _L5
_L5:
        view = a.b();
        bundle = ((au) (view)).r.a;
        bundle = ((au) (view)).r.e;
        flag = flag1;
        if (((au) (view)).r == null) goto _L4; else goto _L6
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
        ((au) (view)).r.scrollBy(i, j);
        return true;
_L9:
        int k;
        int l;
        int i1;
        if (ViewCompat.canScrollVertically(((au) (view)).r, -1))
        {
            i = -(view.t() - view.v() - view.x());
        } else
        {
            i = 0;
        }
        j = i;
        if (!ViewCompat.canScrollHorizontally(((au) (view)).r, -1)) goto _L12; else goto _L11
_L11:
        k = -(view.s() - view.u() - view.w());
        j = i;
        i = k;
          goto _L13
_L8:
        if (ViewCompat.canScrollVertically(((au) (view)).r, 1))
        {
            i = view.t() - view.v() - view.x();
        } else
        {
            i = 0;
        }
        j = i;
        if (!ViewCompat.canScrollHorizontally(((au) (view)).r, 1)) goto _L12; else goto _L14
_L14:
        k = view.s();
        l = view.u();
        i1 = view.w();
        j = i;
        i = k - l - i1;
          goto _L13
_L12:
        i = 0;
          goto _L13
    }
}
