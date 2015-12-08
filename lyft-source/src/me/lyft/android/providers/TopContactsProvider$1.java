// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.providers;

import java.util.Set;
import me.lyft.android.common.Strings;
import rx.functions.Action1;

// Referenced classes of package me.lyft.android.providers:
//            TopContactsProvider, UserContact

class val.addedContacts
    implements Action1
{

    final TopContactsProvider this$0;
    final Set val$addedContacts;

    public volatile void call(Object obj)
    {
        call((UserContact)obj);
    }

    public void call(UserContact usercontact)
    {
        val$addedContacts.add(usercontact.getName());
        if (Strings.isNullOrEmpty(usercontact.getPhotoUri()))
        {
            usercontact.setPhotoUri(TopContactsProvider.access$000(TopContactsProvider.this, usercontact.getName()));
        }
    }

    ()
    {
        this$0 = final_topcontactsprovider;
        val$addedContacts = Set.this;
        super();
    }
}
