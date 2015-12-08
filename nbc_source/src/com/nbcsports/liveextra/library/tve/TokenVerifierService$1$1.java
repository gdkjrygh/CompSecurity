// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nbcsports.liveextra.library.tve;

import rx.Scheduler;
import rx.Subscriber;
import rx.functions.Action0;
import rx.schedulers.Schedulers;

// Referenced classes of package com.nbcsports.liveextra.library.tve:
//            TokenVerifierService

class this._cls1
    implements Action0
{

    final l.videoUrl this$1;

    public void call()
    {
        TokenVerifierService.access$300(_fld0, resource, token, videoUrl);
    }

    l.videoUrl()
    {
        this$1 = this._cls1.this;
        super();
    }

    // Unreferenced inner class com/nbcsports/liveextra/library/tve/TokenVerifierService$1

/* anonymous class */
    class TokenVerifierService._cls1
        implements rx.Observable.OnSubscribe
    {

        final TokenVerifierService this$0;
        final String val$resource;
        final String val$token;
        final String val$videoUrl;

        public volatile void call(Object obj)
        {
            call((Subscriber)obj);
        }

        public void call(Subscriber subscriber)
        {
            TokenVerifierService.access$002(TokenVerifierService.this, subscriber);
            TokenVerifierService.access$102(TokenVerifierService.this, Schedulers.io().createWorker());
            TokenVerifierService.access$202(TokenVerifierService.this, new TokenVerifierService._cls1._cls1());
            TokenVerifierService.access$100(TokenVerifierService.this).schedule(TokenVerifierService.access$200(TokenVerifierService.this));
        }

            
            {
                this$0 = final_tokenverifierservice;
                resource = s;
                token = s1;
                videoUrl = String.this;
                super();
            }
    }

}
