// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nbcsports.liveextra.library.tve;

import android.content.Context;
import android.os.Handler;
import android.util.Pair;
import com.nbcsports.liveextra.library.api.models.Asset;
import rx.Subscriber;
import rx.subscriptions.CompositeSubscription;
import timber.log.Timber;

// Referenced classes of package com.nbcsports.liveextra.library.tve:
//            PlaybackDelegate, AuthService, AnvatoResponse

class this._cls0 extends Subscriber
{

    final PlaybackDelegate this$0;

    public void onCompleted()
    {
    }

    public void onError(Throwable throwable)
    {
        Timber.d("Error while checking blackout restriction", new Object[] {
            throwable
        });
        pass.checkAuthorization(PlaybackDelegate.access$700(PlaybackDelegate.this).getChannel());
    }

    public void onNext(final AnvatoResponse response)
    {
        if (response == null)
        {
            PlaybackDelegate.access$200(PlaybackDelegate.this).add(PlaybackDelegate.access$300(PlaybackDelegate.this));
            return;
        } else
        {
            PlaybackDelegate.access$800(PlaybackDelegate.this).post(new Runnable() {

                final PlaybackDelegate._cls4 this$1;
                final AnvatoResponse val$response;

                public void run()
                {
                    Pair pair = response.getError(config, PlaybackDelegate.access$500(this$0).getResources());
                    if (pair != null)
                    {
                        PlaybackDelegate.access$600(this$0, (String)pair.first, (String)pair.second);
                        return;
                    } else
                    {
                        PlaybackDelegate.access$600(this$0, PlaybackDelegate.access$500(this$0).getString(0x7f07017a), PlaybackDelegate.access$500(this$0).getString(0x7f07006b));
                        return;
                    }
                }

            
            {
                this$1 = PlaybackDelegate._cls4.this;
                response = anvatoresponse;
                super();
            }
            });
            return;
        }
    }

    public volatile void onNext(Object obj)
    {
        onNext((AnvatoResponse)obj);
    }

    _cls1.val.response()
    {
        this$0 = PlaybackDelegate.this;
        super();
    }
}
