// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.driver;

import android.view.View;
import me.lyft.android.common.AppFlow;

// Referenced classes of package me.lyft.android.ui.driver:
//            DriverDestinyView

class this._cls0
    implements android.view.
{

    final DriverDestinyView this$0;

    public void onClick(View view)
    {
        appFlow.goTo(new StatsScreen());
    }

    StatsScreen()
    {
        this$0 = DriverDestinyView.this;
        super();
    }
}
