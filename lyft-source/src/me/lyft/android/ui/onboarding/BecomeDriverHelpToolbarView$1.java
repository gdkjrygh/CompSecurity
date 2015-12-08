// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.onboarding;

import me.lyft.android.common.AppFlow;
import rx.functions.Action1;

// Referenced classes of package me.lyft.android.ui.onboarding:
//            BecomeDriverHelpToolbarView

class this._cls0
    implements Action1
{

    final BecomeDriverHelpToolbarView this$0;

    public void call(Integer integer)
    {
        if (integer.intValue() == 0x7f0d0016)
        {
            appFlow.goTo(new dingHelp());
        }
    }

    public volatile void call(Object obj)
    {
        call((Integer)obj);
    }

    dingHelp()
    {
        this$0 = BecomeDriverHelpToolbarView.this;
        super();
    }
}
