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

class b extends AccessibilityDelegateCompat
{

    final RecyclerViewAccessibilityDelegate b;

    public void a(View view, AccessibilityNodeInfoCompat accessibilitynodeinfocompat)
    {
        super.a(view, accessibilitynodeinfocompat);
        if (!RecyclerViewAccessibilityDelegate.a(b) && b.b.getLayoutManager() != null)
        {
            b.b.getLayoutManager().b(view, accessibilitynodeinfocompat);
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
            return b.b.getLayoutManager().b(view, i, bundle);
        } else
        {
            return false;
        }
    }

    pat(RecyclerViewAccessibilityDelegate recyclerviewaccessibilitydelegate)
    {
        b = recyclerviewaccessibilitydelegate;
        super();
    }
}
