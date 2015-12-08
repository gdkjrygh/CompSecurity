// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.baselib.hlistview;

import android.os.Bundle;
import android.support.v4.view.AccessibilityDelegateCompat;
import android.support.v4.view.accessibility.AccessibilityNodeInfoCompat;
import android.view.View;
import android.widget.ListAdapter;

// Referenced classes of package com.roidapp.baselib.hlistview:
//            AbsHListView

final class i extends AccessibilityDelegateCompat
{

    final AbsHListView a;

    i(AbsHListView abshlistview)
    {
        a = abshlistview;
        super();
    }

    public final void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfoCompat accessibilitynodeinfocompat)
    {
        int j;
        super.onInitializeAccessibilityNodeInfo(view, accessibilitynodeinfocompat);
        j = a.a(view);
        view = (ListAdapter)a.p();
        break MISSING_BLOCK_LABEL_26;
        if (j != -1 && view != null && a.isEnabled() && view.isEnabled(j))
        {
            if (j == a.q())
            {
                accessibilitynodeinfocompat.setSelected(true);
                accessibilitynodeinfocompat.addAction(8);
            } else
            {
                accessibilitynodeinfocompat.addAction(4);
            }
            if (a.isClickable())
            {
                accessibilitynodeinfocompat.addAction(16);
                accessibilitynodeinfocompat.setClickable(true);
            }
            if (a.isLongClickable())
            {
                accessibilitynodeinfocompat.addAction(32);
                accessibilitynodeinfocompat.setLongClickable(true);
                return;
            }
        }
        return;
    }

    public final boolean performAccessibilityAction(View view, int j, Bundle bundle)
    {
        if (super.performAccessibilityAction(view, j, bundle))
        {
            return true;
        }
        int k = a.a(view);
        bundle = (ListAdapter)a.p();
        if (k == -1 || bundle == null)
        {
            return false;
        }
        if (!a.isEnabled() || !bundle.isEnabled(k))
        {
            return false;
        }
        long l = a.k(k);
        switch (j)
        {
        default:
            return false;

        case 8: // '\b'
            if (a.q() == k)
            {
                a.i(-1);
                return true;
            } else
            {
                return false;
            }

        case 4: // '\004'
            if (a.q() != k)
            {
                a.i(k);
                return true;
            } else
            {
                return false;
            }

        case 16: // '\020'
            if (a.isClickable())
            {
                return a.a(view, k, l);
            } else
            {
                return false;
            }

        case 32: // ' '
            break;
        }
        if (a.isLongClickable())
        {
            return a.b(view, k, l);
        } else
        {
            return false;
        }
    }
}
