// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.providers;

import me.lyft.android.common.Strings;
import rx.functions.Action1;

// Referenced classes of package me.lyft.android.providers:
//            TopContactsProvider, UserContact

class this._cls0
    implements Action1
{

    final TopContactsProvider this$0;

    public volatile void call(Object obj)
    {
        call((UserContact)obj);
    }

    public void call(UserContact usercontact)
    {
        if (Strings.isNullOrEmpty(usercontact.getEmail()))
        {
            usercontact.setEmail(TopContactsProvider.access$100(TopContactsProvider.this, usercontact.getName()));
        }
    }

    ()
    {
        this$0 = TopContactsProvider.this;
        super();
    }
}
