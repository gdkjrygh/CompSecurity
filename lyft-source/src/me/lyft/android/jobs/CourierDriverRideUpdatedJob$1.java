// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.jobs;

import me.lyft.android.infrastructure.lyft.profile.UserDTO;
import rx.functions.Func1;

// Referenced classes of package me.lyft.android.jobs:
//            CourierDriverRideUpdatedJob

class this._cls0
    implements Func1
{

    final CourierDriverRideUpdatedJob this$0;

    public volatile Object call(Object obj)
    {
        return call((UserDTO)obj);
    }

    public String call(UserDTO userdto)
    {
        return userdto.getId();
    }

    ()
    {
        this$0 = CourierDriverRideUpdatedJob.this;
        super();
    }
}
