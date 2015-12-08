// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.jobs;

import me.lyft.android.application.landing.ILandingService;
import rx.Observable;
import rx.functions.Func1;

// Referenced classes of package me.lyft.android.jobs:
//            UpdateFacebookTokenJob

class this._cls0
    implements Func1
{

    final UpdateFacebookTokenJob this$0;

    public volatile Object call(Object obj)
    {
        return call((Long)obj);
    }

    public Observable call(Long long1)
    {
        return landingService.refreshFacebookToken();
    }

    rvice()
    {
        this$0 = UpdateFacebookTokenJob.this;
        super();
    }
}
