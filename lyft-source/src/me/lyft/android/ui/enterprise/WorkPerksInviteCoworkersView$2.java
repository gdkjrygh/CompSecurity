// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.enterprise;

import me.lyft.android.common.AppFlow;
import rx.functions.Action1;

// Referenced classes of package me.lyft.android.ui.enterprise:
//            WorkPerksInviteCoworkersView

class this._cls0
    implements Action1
{

    final WorkPerksInviteCoworkersView this$0;

    public void call(Integer integer)
    {
        if (integer.intValue() == 0x7f0d0017)
        {
            appFlow.goTo(new EmailScreen(email, userOrganization));
        }
    }

    public volatile void call(Object obj)
    {
        call((Integer)obj);
    }

    EmailScreen()
    {
        this$0 = WorkPerksInviteCoworkersView.this;
        super();
    }
}
