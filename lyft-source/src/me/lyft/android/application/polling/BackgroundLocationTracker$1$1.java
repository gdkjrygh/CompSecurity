// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.application.polling;

import me.lyft.android.domain.location.Location;
import me.lyft.android.logging.L;
import me.lyft.android.rx.RetryWithDelay;
import me.lyft.android.rx.SimpleSubscriber;
import rx.Observable;

// Referenced classes of package me.lyft.android.application.polling:
//            BackgroundLocationTracker, ILocationUpdateService

class this._cls1 extends SimpleSubscriber
{

    final this._cls1 this$1;

    public void onError(Throwable throwable)
    {
        L.e(throwable, "location update failed in background location tracker", new Object[0]);
    }

    is._cls0()
    {
        this$1 = this._cls1.this;
        super();
    }

    // Unreferenced inner class me/lyft/android/application/polling/BackgroundLocationTracker$1

/* anonymous class */
    class BackgroundLocationTracker._cls1 extends SimpleSubscriber
    {

        final BackgroundLocationTracker this$0;

        public void onError(Throwable throwable)
        {
            super.onError(throwable);
            L.e(throwable, "location update failed in background location tracker", new Object[0]);
        }

        public volatile void onNext(Object obj)
        {
            onNext((Location)obj);
        }

        public void onNext(Location location)
        {
            locationUpdateService.updateBackgroundLocation(location).retryWhen(new RetryWithDelay(5, 30000)).subscribe(new BackgroundLocationTracker._cls1._cls1());
        }

            
            {
                this$0 = BackgroundLocationTracker.this;
                super();
            }
    }

}
