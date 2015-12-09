// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.loyalty;

import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import com.google.android.apps.wallet.util.view.Views;

// Referenced classes of package com.google.android.apps.wallet.loyalty:
//            LoyaltyCardsHandler

final class val.checkboxId extends android.view.gate
{

    final int val$checkboxId;
    final View val$view;

    public final void onInitializeAccessibilityEvent(View view1, AccessibilityEvent accessibilityevent)
    {
        Views.findViewById(val$view, val$checkboxId).onInitializeAccessibilityEvent(accessibilityevent);
    }

    public final void onInitializeAccessibilityNodeInfo(View view1, AccessibilityNodeInfo accessibilitynodeinfo)
    {
        Views.findViewById(val$view, val$checkboxId).onInitializeAccessibilityNodeInfo(accessibilitynodeinfo);
    }

    ()
    {
        val$view = view1;
        val$checkboxId = i;
        super();
    }
}
