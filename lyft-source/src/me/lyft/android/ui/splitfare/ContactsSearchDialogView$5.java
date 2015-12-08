// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.splitfare;

import me.lyft.android.providers.UserContact;
import rx.functions.Func1;

// Referenced classes of package me.lyft.android.ui.splitfare:
//            ContactsSearchDialogView

class val.number
    implements Func1
{

    final ContactsSearchDialogView this$0;
    final String val$number;
    final String val$query;

    public Boolean call(UserContact usercontact)
    {
        return Boolean.valueOf(ContactsSearchDialogView.access$100(ContactsSearchDialogView.this, usercontact, val$query, val$number));
    }

    public volatile Object call(Object obj)
    {
        return call((UserContact)obj);
    }

    ()
    {
        this$0 = final_contactssearchdialogview;
        val$query = s;
        val$number = String.this;
        super();
    }
}
