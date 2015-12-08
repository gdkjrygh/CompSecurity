// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.settings;

import me.lyft.android.common.AppFlow;
import me.lyft.android.common.Unit;
import rx.functions.Action1;

// Referenced classes of package me.lyft.android.ui.settings:
//            PersonalInsuranceView

class this._cls0
    implements Action1
{

    final PersonalInsuranceView this$0;

    public volatile void call(Object obj)
    {
        call((Unit)obj);
    }

    public void call(Unit unit)
    {
        appFlow.goTo(new PersonalInsuranceScreen());
    }

    PersonalInsuranceScreen()
    {
        this$0 = PersonalInsuranceView.this;
        super();
    }
}
