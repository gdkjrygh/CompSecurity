// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.enterprise;

import me.lyft.android.infrastructure.lyft.work.UserOrganizationDTO;
import me.lyft.android.providers.ContactsProvider;
import rx.Observable;
import rx.functions.Func1;

// Referenced classes of package me.lyft.android.ui.enterprise:
//            WorkPerksEnterEmailView

class this._cls0
    implements Func1
{

    final WorkPerksEnterEmailView this$0;

    public volatile Object call(Object obj)
    {
        return call((UserOrganizationDTO)obj);
    }

    public Observable call(UserOrganizationDTO userorganizationdto)
    {
        WorkPerksEnterEmailView.access$202(WorkPerksEnterEmailView.this, userorganizationdto);
        return contactsProvider.create().mails().hones().ompanies().bserve();
    }

    nDTO()
    {
        this$0 = WorkPerksEnterEmailView.this;
        super();
    }
}
