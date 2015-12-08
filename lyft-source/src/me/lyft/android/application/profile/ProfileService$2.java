// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.application.profile;

import me.lyft.android.analytics.AsyncActionAnalytics;
import rx.Observable;
import rx.functions.Func1;

// Referenced classes of package me.lyft.android.application.profile:
//            ProfileService

class val.savePhoto
    implements Func1
{

    final ProfileService this$0;
    final AsyncActionAnalytics val$savePhoto;

    public volatile Object call(Object obj)
    {
        return call((Throwable)obj);
    }

    public Observable call(Throwable throwable)
    {
        val$savePhoto.trackResponseFailure(throwable);
        return Observable.empty();
    }

    ()
    {
        this$0 = final_profileservice;
        val$savePhoto = AsyncActionAnalytics.this;
        super();
    }
}
