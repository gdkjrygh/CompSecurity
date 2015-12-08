// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.splitfare;

import me.lyft.android.adapters.ContactsAdapter;
import rx.functions.Action1;

// Referenced classes of package me.lyft.android.ui.splitfare:
//            ContactsSearchDialogView

class this._cls0
    implements Action1
{

    final ContactsSearchDialogView this$0;

    public volatile void call(Object obj)
    {
        call((archResult)obj);
    }

    public void call(archResult archresult)
    {
        archresult = ContactsSearchDialogView.access$200(ContactsSearchDialogView.this, archresult);
        adapter.swapData(archresult);
    }

    archResult()
    {
        this$0 = ContactsSearchDialogView.this;
        super();
    }
}
