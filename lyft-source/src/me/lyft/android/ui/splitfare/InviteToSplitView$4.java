// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.splitfare;

import me.lyft.android.adapters.ContactsAdapter;
import me.lyft.android.common.DialogFlow;
import rx.functions.Action1;

// Referenced classes of package me.lyft.android.ui.splitfare:
//            InviteToSplitView

class this._cls0
    implements Action1
{

    final InviteToSplitView this$0;

    public void call(Integer integer)
    {
        switch (integer.intValue())
        {
        default:
            return;

        case 2131558437: 
            integer = contactsAdapter.getData();
            break;
        }
        java.util.List list = contactsAdapter.getCheckedData();
        java.util.List list1 = contactsAdapter.getDisabledData();
        dialogFlow.show(new tactsSearchDialog(integer, list, list1));
    }

    public volatile void call(Object obj)
    {
        call((Integer)obj);
    }

    tactsSearchDialog()
    {
        this$0 = InviteToSplitView.this;
        super();
    }
}
