// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.enterprise;

import me.lyft.android.common.AppFlow;
import rx.functions.Action1;

// Referenced classes of package me.lyft.android.ui.enterprise:
//            WorkPerksInviteCoworkersViaContactsView

class this._cls0
    implements Action1
{

    final WorkPerksInviteCoworkersViaContactsView this$0;

    public void call(Integer integer)
    {
        if (integer.intValue() == 0x7f0d0017)
        {
            appFlow.replaceWith(new en(WorkPerksInviteCoworkersViaContactsView.access$600(WorkPerksInviteCoworkersViaContactsView.this), userOrganization));
        }
    }

    public volatile void call(Object obj)
    {
        call((Integer)obj);
    }

    en()
    {
        this$0 = WorkPerksInviteCoworkersViaContactsView.this;
        super();
    }
}
