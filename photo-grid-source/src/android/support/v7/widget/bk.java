// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.widget;

import android.os.Bundle;
import android.support.v4.view.AccessibilityDelegateCompat;
import android.support.v4.view.accessibility.AccessibilityNodeInfoCompat;
import android.view.View;

// Referenced classes of package android.support.v7.widget:
//            bj, RecyclerView, au

final class bk extends AccessibilityDelegateCompat
{

    final bj a;

    bk(bj bj1)
    {
        a = bj1;
        super();
    }

    public final void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfoCompat accessibilitynodeinfocompat)
    {
        super.onInitializeAccessibilityNodeInfo(view, accessibilitynodeinfocompat);
        if (!a.a.g() && a.a.b() != null)
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
            if (!a.a.g())
            {
                flag = flag1;
                if (a.a.b() != null)
                {
                    view = a.a.b();
                    bundle = ((au) (view)).r.a;
                    view = ((au) (view)).r.e;
                    return false;
                }
            }
        }
        return flag;
    }
}
