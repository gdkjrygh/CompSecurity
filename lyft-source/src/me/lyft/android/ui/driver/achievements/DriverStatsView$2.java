// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.driver.achievements;

import android.widget.TextView;
import java.util.List;
import rx.functions.Action1;

// Referenced classes of package me.lyft.android.ui.driver.achievements:
//            DriverStatsView

class this._cls0
    implements Action1
{

    final DriverStatsView this$0;

    public void call(Integer integer)
    {
        statsDisclaimer.setText((CharSequence)DriverStatsView.access$100(DriverStatsView.this).get(integer.intValue()));
    }

    public volatile void call(Object obj)
    {
        call((Integer)obj);
    }

    ()
    {
        this$0 = DriverStatsView.this;
        super();
    }
}
