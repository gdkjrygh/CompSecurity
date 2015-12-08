// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.invites;

import android.widget.ListView;
import java.util.List;
import me.lyft.android.adapters.ContactsAdapter;
import me.lyft.android.providers.UserContact;
import rx.functions.Action1;

// Referenced classes of package me.lyft.android.ui.invites:
//            InviteScreenView

class this._cls0
    implements Action1
{

    final InviteScreenView this$0;

    public volatile void call(Object obj)
    {
        call((UserContact)obj);
    }

    public void call(UserContact usercontact)
    {
        int i = contactsAdapter.getData().indexOf(usercontact);
        if (i != -1)
        {
            contactsAdapter.toggleChecked(i);
            InviteScreenView.access$000(InviteScreenView.this);
            contactsList.setSelection(i);
        }
    }

    ()
    {
        this$0 = InviteScreenView.this;
        super();
    }
}
