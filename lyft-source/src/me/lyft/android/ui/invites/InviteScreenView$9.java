// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.invites;

import me.lyft.android.adapters.ContactsAdapter;
import me.lyft.android.common.DialogFlow;
import rx.functions.Action1;

// Referenced classes of package me.lyft.android.ui.invites:
//            InviteScreenView

class this._cls0
    implements Action1
{

    final InviteScreenView this$0;

    public void call(Integer integer)
    {
        switch (integer.intValue())
        {
        case 2131558438: 
        case 2131558439: 
        default:
            return;

        case 2131558440: 
            showBottomSheet();
            return;

        case 2131558437: 
            integer = contactsAdapter.getData();
            java.util.List list = contactsAdapter.getCheckedData();
            java.util.List list1 = contactsAdapter.getDisabledData();
            dialogFlow.show(new me.lyft.android.ui.splitfare.ntactsSearchDialog(integer, list, list1));
            return;
        }
    }

    public volatile void call(Object obj)
    {
        call((Integer)obj);
    }

    ContactsSearchDialog()
    {
        this$0 = InviteScreenView.this;
        super();
    }
}
