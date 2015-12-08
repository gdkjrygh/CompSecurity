// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.driver;

import android.view.View;
import me.lyft.android.common.DialogFlow;

// Referenced classes of package me.lyft.android.ui.driver:
//            DriverOverflowMenuView

class this._cls0
    implements android.view.owMenuView._cls2
{

    final DriverOverflowMenuView this$0;

    public void onClick(View view)
    {
        dialogFlow.dismiss();
        DriverOverflowMenuView.access$000(DriverOverflowMenuView.this, view.getId());
    }

    ()
    {
        this$0 = DriverOverflowMenuView.this;
        super();
    }
}
