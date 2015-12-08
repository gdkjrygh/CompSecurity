// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.splitfare;

import java.util.List;
import me.lyft.android.adapters.ContactsAdapter;
import me.lyft.android.infrastructure.splitfare.ISplitFareService;
import me.lyft.android.providers.ContactPhone;
import me.lyft.android.providers.UserContact;
import rx.functions.Action1;

// Referenced classes of package me.lyft.android.ui.splitfare:
//            InviteToSplitView

class this._cls0
    implements Action1
{

    final InviteToSplitView this$0;

    public volatile void call(Object obj)
    {
        call((UserContact)obj);
    }

    public void call(UserContact usercontact)
    {
        int i = contactsAdapter.getData().indexOf(usercontact);
        if (i != -1)
        {
            InviteToSplitView.access$000(InviteToSplitView.this, i);
        } else
        if (usercontact.getPhoneNumber() != null)
        {
            splitFareService.addUnknownPhoneNumber(usercontact.getPhoneNumber().getPhoneNumber());
            contactsAdapter.addCheckedContact(usercontact);
            InviteToSplitView.access$100(InviteToSplitView.this);
            return;
        }
    }

    reService()
    {
        this$0 = InviteToSplitView.this;
        super();
    }
}
