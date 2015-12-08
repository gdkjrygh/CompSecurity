// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.enterprise;

import java.util.List;
import me.lyft.android.rx.SecureSubscriber;

// Referenced classes of package me.lyft.android.ui.enterprise:
//            WorkPerksInviteCoworkersViaContactsView

class this._cls0 extends SecureSubscriber
{

    final WorkPerksInviteCoworkersViaContactsView this$0;

    public volatile void onSafeNext(Object obj)
    {
        onSafeNext((List)obj);
    }

    public void onSafeNext(List list)
    {
        userContacts = list;
        WorkPerksInviteCoworkersViaContactsView.access$100(WorkPerksInviteCoworkersViaContactsView.this);
        WorkPerksInviteCoworkersViaContactsView.access$200(WorkPerksInviteCoworkersViaContactsView.this);
        WorkPerksInviteCoworkersViaContactsView.access$300(WorkPerksInviteCoworkersViaContactsView.this);
    }

    ()
    {
        this$0 = WorkPerksInviteCoworkersViaContactsView.this;
        super();
    }
}
