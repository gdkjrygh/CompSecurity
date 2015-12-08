// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.providers;

import rx.functions.Func1;

// Referenced classes of package me.lyft.android.providers:
//            ContactsProvider, UserContact

class this._cls0
    implements Func1
{

    final ContactsProvider this$0;

    public Boolean call(UserContact usercontact)
    {
        boolean flag;
        if (usercontact.getEmail().length() < 40)
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
        this$0 = ContactsProvider.this;
        super();
    }
}
