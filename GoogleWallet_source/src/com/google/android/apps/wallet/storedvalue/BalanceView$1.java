// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.storedvalue;

import android.content.Context;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.TextView;

// Referenced classes of package com.google.android.apps.wallet.storedvalue:
//            BalanceView

final class this._cls0 extends android.view.lityDelegate
{

    final BalanceView this$0;

    public final void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilitynodeinfo)
    {
        super.onInitializeAccessibilityNodeInfo(view, accessibilitynodeinfo);
        StringBuilder stringbuilder = new StringBuilder();
        stringbuilder.append(((TextView)view.findViewById(com.google.android.apps.walletnfcrel.ount)).getText());
        stringbuilder.append(", ");
        stringbuilder.append(((TextView)view.findViewById(com.google.android.apps.walletnfcrel.scription)).getText());
        stringbuilder.append(view.getContext().getString(com.google.android.apps.walletnfcrel.n_announce_suffix));
        accessibilitynodeinfo.setContentDescription(stringbuilder.toString());
    }

    ()
    {
        this$0 = BalanceView.this;
        super();
    }
}
