// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.infrastructure.splitfare;

import me.lyft.android.providers.UserContact;
import rx.functions.Action1;

// Referenced classes of package me.lyft.android.infrastructure.splitfare:
//            SplitFareService

class val.recentCategory
    implements Action1
{

    final SplitFareService this$0;
    final String val$recentCategory;

    public volatile void call(Object obj)
    {
        call((UserContact)obj);
    }

    public void call(UserContact usercontact)
    {
        usercontact.setCategory(val$recentCategory);
    }

    A()
    {
        this$0 = final_splitfareservice;
        val$recentCategory = String.this;
        super();
    }
}
