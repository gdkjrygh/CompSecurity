// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.infrastructure.splitfare;

import me.lyft.android.analytics.studies.SplitFareAnalytics;
import me.lyft.android.infrastructure.lyft.LyftApiException;
import rx.Observable;
import rx.functions.Func1;

// Referenced classes of package me.lyft.android.infrastructure.splitfare:
//            SplitFareService, SplitFareServiceException

class this._cls0
    implements Func1
{

    final SplitFareService this$0;

    public volatile Object call(Object obj)
    {
        return call((Throwable)obj);
    }

    public Observable call(Throwable throwable)
    {
        Object obj = throwable;
        if (throwable instanceof LyftApiException)
        {
            obj = throwable;
            if (((LyftApiException)throwable).getStatusCode() == 422)
            {
                obj = new SplitFareServiceException("splitfare_request_lapsed");
            }
        }
        SplitFareAnalytics.trackSplitResponseFailure(((Throwable) (obj)));
        return Observable.error(((Throwable) (obj)));
    }

    eption()
    {
        this$0 = SplitFareService.this;
        super();
    }
}
