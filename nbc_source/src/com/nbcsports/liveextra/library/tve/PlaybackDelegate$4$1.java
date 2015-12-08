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
//            PlaybackDelegate, AnvatoResponse, AuthService

class val.response
    implements Runnable
{

    final is._cls0 this$1;
    final AnvatoResponse val$response;

    public void run()
    {
        Pair pair = val$response.getError(config, PlaybackDelegate.access$500(_fld0).getResources());
        if (pair != null)
        {
            PlaybackDelegate.access$600(_fld0, (String)pair.first, (String)pair.second);
            return;
        } else
        {
            PlaybackDelegate.access$600(_fld0, PlaybackDelegate.access$500(_fld0).getString(0x7f07017a), PlaybackDelegate.access$500(_fld0).getString(0x7f07006b));
            return;
        }
    }

    is._cls0()
    {
        this$1 = final__pcls0;
        val$response = AnvatoResponse.this;
        super();
    }

    // Unreferenced inner class com/nbcsports/liveextra/library/tve/PlaybackDelegate$4

/* anonymous class */
    class PlaybackDelegate._cls4 extends Subscriber
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

        public void onNext(AnvatoResponse anvatoresponse)
        {
            if (anvatoresponse == null)
            {
                PlaybackDelegate.access$200(PlaybackDelegate.this).add(PlaybackDelegate.access$300(PlaybackDelegate.this));
                return;
            } else
            {
                PlaybackDelegate.access$800(PlaybackDelegate.this).post(anvatoresponse. new PlaybackDelegate._cls4._cls1());
                return;
            }
        }

        public volatile void onNext(Object obj)
        {
            onNext((AnvatoResponse)obj);
        }

            
            {
                this$0 = PlaybackDelegate.this;
                super();
            }
    }

}
