// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.providers;

import java.util.Set;
import me.lyft.android.common.Strings;
import rx.functions.Func1;

// Referenced classes of package me.lyft.android.providers:
//            TopContactsProvider, UserContact

class val.addedContacts
    implements Func1
{

    final TopContactsProvider this$0;
    final Set val$addedContacts;

    public Boolean call(UserContact usercontact)
    {
        String s;
        boolean flag;
        if (usercontact.getName() == null)
        {
            s = "";
        } else
        {
            s = usercontact.getName().trim();
        }
        if (!Strings.isNullOrEmpty(usercontact.getEmail()) && !Strings.isNullOrEmpty(s) && !val$addedContacts.contains(usercontact.getName()))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        return Boolean.valueOf(flag);
    }

    public volatile Object call(Object obj)
    {
        return call((UserContact)obj);
    }

    ()
    {
        this$0 = final_topcontactsprovider;
        val$addedContacts = Set.this;
        super();
    }
}
