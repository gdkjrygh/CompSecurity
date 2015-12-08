// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nbcsports.liveextra.library.tve;

import android.content.Context;
import android.os.Handler;
import android.text.TextUtils;
import rx.Subscriber;
import timber.log.Timber;

// Referenced classes of package com.nbcsports.liveextra.library.tve:
//            PlaybackDelegate

class this._cls0 extends Subscriber
{

    final PlaybackDelegate this$0;

    public void onCompleted()
    {
    }

    public void onError(Throwable throwable)
    {
        Timber.d("Error while checking anvato entitlement", new Object[] {
            throwable
        });
        PlaybackDelegate.access$800(PlaybackDelegate.this).post(new Runnable() {

            final PlaybackDelegate._cls5 this$1;

            public void run()
            {
                PlaybackDelegate.access$600(this$0, PlaybackDelegate.access$500(this$0).getString(0x7f070179), PlaybackDelegate.access$500(this$0).getString(0x7f070178));
            }

            
            {
                this$1 = PlaybackDelegate._cls5.this;
                super();
            }
        });
    }

    public volatile void onNext(Object obj)
    {
        onNext((String)obj);
    }

    public void onNext(final String entitled)
    {
        PlaybackDelegate.access$800(PlaybackDelegate.this).post(new Runnable() {

            final PlaybackDelegate._cls5 this$1;
            final String val$entitled;

            public void run()
            {
                if (TextUtils.isEmpty(entitled))
                {
                    sendSuccess(PlaybackDelegate.access$900(this$0), PlaybackDelegate.access$1000(this$0));
                    return;
                } else
                {
                    PlaybackDelegate.access$600(this$0, PlaybackDelegate.access$500(this$0).getString(0x7f07017a), PlaybackDelegate.access$500(this$0).getString(0x7f07006b));
                    return;
                }
            }

            
            {
                this$1 = PlaybackDelegate._cls5.this;
                entitled = s;
                super();
            }
        });
    }

    _cls2.val.entitled()
    {
        this$0 = PlaybackDelegate.this;
        super();
    }
}
