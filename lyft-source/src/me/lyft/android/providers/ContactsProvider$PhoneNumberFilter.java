// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.providers;

import java.util.HashSet;
import java.util.Set;
import me.lyft.android.ui.splitfare.SearchHelper;
import rx.functions.Func1;

// Referenced classes of package me.lyft.android.providers:
//            UserContact, ContactPhone

public class 
    implements Func1
{

    private final Set addedPhoneNumbers = new HashSet();

    public Boolean call(UserContact usercontact)
    {
        usercontact = SearchHelper.normalizeNumber(usercontact.getPhoneNumber().getPhoneNumber());
        if (!addedPhoneNumbers.contains(usercontact) && SearchHelper.isNormalizedNumberValid(usercontact))
        {
            addedPhoneNumbers.add(usercontact);
            return Boolean.valueOf(true);
        } else
        {
            return Boolean.valueOf(false);
        }
    }

    public volatile Object call(Object obj)
    {
        return call((UserContact)obj);
    }

    public ()
    {
    }
}
