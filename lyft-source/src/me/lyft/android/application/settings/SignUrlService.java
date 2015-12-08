// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.application.settings;

import me.lyft.android.analytics.CallAnalytics;
import me.lyft.android.analytics.SpanningAnalytics;
import me.lyft.android.infrastructure.lyft.ILyftApi;
import me.lyft.android.infrastructure.lyft.signing.SignedUrlDTO;
import rx.Observable;
import rx.functions.Action1;
import rx.functions.Func1;

// Referenced classes of package me.lyft.android.application.settings:
//            ISignUrlService

public class SignUrlService
    implements ISignUrlService
{

    private ILyftApi lyftApi;

    public SignUrlService(ILyftApi ilyftapi)
    {
        lyftApi = ilyftapi;
    }

    public Observable getSignedUrl(String s)
    {
        final CallAnalytics analytics = (CallAnalytics)(new CallAnalytics(me.lyft.android.analytics.definitions.CallEvent.Call.GENERATE_SIGNED_URL)).setParameter(s).trackInitiation();
        return lyftApi.generateSignedUrl(s).flatMap(new Func1() {

            final SignUrlService this$0;

            public volatile Object call(Object obj)
            {
                return call((SignedUrlDTO)obj);
            }

            public Observable call(SignedUrlDTO signedurldto)
            {
                return Observable.just(signedurldto.getSignedUrl());
            }

            
            {
                this$0 = SignUrlService.this;
                super();
            }
        }).doOnNext(new Action1() {

            final SignUrlService this$0;
            final CallAnalytics val$analytics;

            public volatile void call(Object obj)
            {
                call((String)obj);
            }

            public void call(String s1)
            {
                analytics.trackSuccess();
            }

            
            {
                this$0 = SignUrlService.this;
                analytics = callanalytics;
                super();
            }
        }).doOnError(new Action1() {

            final SignUrlService this$0;
            final CallAnalytics val$analytics;

            public volatile void call(Object obj)
            {
                call((Throwable)obj);
            }

            public void call(Throwable throwable)
            {
                analytics.trackFailure(throwable);
            }

            
            {
                this$0 = SignUrlService.this;
                analytics = callanalytics;
                super();
            }
        });
    }
}
