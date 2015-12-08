// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.splitfare;

import android.view.View;
import android.widget.TextView;
import java.util.Iterator;
import java.util.List;
import me.lyft.android.adapters.ContactsAdapter;
import me.lyft.android.application.splitfare.ISplitFareStateRepository;
import me.lyft.android.domain.splitfare.SplitFareState;
import me.lyft.android.providers.ContactPhone;
import me.lyft.android.providers.UserContact;
import me.lyft.android.rx.AsyncCall;

// Referenced classes of package me.lyft.android.ui.splitfare:
//            InviteToSplitView

class this._cls0 extends AsyncCall
{

    final InviteToSplitView this$0;

    public volatile void onSuccess(Object obj)
    {
        onSuccess((List)obj);
    }

    public void onSuccess(List list)
    {
        contactsAdapter.swapData(list);
        Iterator iterator;
        if (contactsAdapter.isEmpty())
        {
            emptyView.setVisibility(0);
            splitPaymentFee.setVisibility(8);
        } else
        {
            emptyView.setVisibility(8);
            splitPaymentFee.setVisibility(0);
        }
        list = splitFareStateRepository.getSplitFareState();
        iterator = contactsAdapter.getData().iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            UserContact usercontact = (UserContact)iterator.next();
            if (list.hasPhoneNumberBeenInvited(usercontact.getPhoneNumber().getPhoneNumber()))
            {
                contactsAdapter.addCheckedContact(usercontact);
                contactsAdapter.addDisabledContact(usercontact);
            }
        } while (true);
        list = contactsAdapter;
        boolean flag;
        if (contactsAdapter.getCheckedItemCount() >= maxContributors)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        list.setHasMaxInvitesBeenHit(flag);
    }

    tateRepository()
    {
        this$0 = InviteToSplitView.this;
        super();
    }
}
