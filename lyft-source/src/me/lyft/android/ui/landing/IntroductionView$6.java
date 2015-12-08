// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.landing;

import android.widget.TextView;
import me.lyft.android.ILyftPreferences;
import rx.functions.Action1;

// Referenced classes of package me.lyft.android.ui.landing:
//            IntroductionView

class this._cls0
    implements Action1
{

    final IntroductionView this$0;

    public void call(Boolean boolean1)
    {
        boolean flag = lyftPreferences.isProductionEnvironment();
        if (boolean1.booleanValue() || !flag)
        {
            environmentName.setText(lyftPreferences.getEnvironmentName().toUpperCase());
            environmentName.setVisibility(0);
            developmentView.setVisibility(0);
            return;
        } else
        {
            environmentName.setVisibility(8);
            developmentView.setVisibility(8);
            return;
        }
    }

    public volatile void call(Object obj)
    {
        call((Boolean)obj);
    }

    ()
    {
        this$0 = IntroductionView.this;
        super();
    }
}
