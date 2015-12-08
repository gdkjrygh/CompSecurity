// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.playback;

import com.soundcloud.android.cast.CastOperations;
import com.soundcloud.android.rx.RxUtils;
import com.soundcloud.android.rx.observers.DefaultSubscriber;
import java.lang.ref.WeakReference;
import rx.Y;
import rx.b;
import rx.f.k;

public class ProgressReporter
{
    public static interface ProgressPuller
    {

        public abstract void pullProgress();
    }

    private class ProgressTickSubscriber extends DefaultSubscriber
    {

        final ProgressReporter this$0;

        public volatile void onNext(Object obj)
        {
            onNext((k)obj);
        }

        public void onNext(k k1)
        {
            if (progressPullerReference != null)
            {
                k1 = (ProgressPuller)progressPullerReference.get();
                if (k1 != null)
                {
                    k1.pullProgress();
                }
            }
        }

        private ProgressTickSubscriber()
        {
            this$0 = ProgressReporter.this;
            super();
        }

        ProgressTickSubscriber(_cls1 _pcls1)
        {
            this();
        }
    }


    private final CastOperations castOperations;
    private WeakReference progressPullerReference;
    private Y subscription;

    ProgressReporter(CastOperations castoperations)
    {
        subscription = RxUtils.invalidSubscription();
        castOperations = castoperations;
    }

    public void setProgressPuller(ProgressPuller progresspuller)
    {
        progressPullerReference = new WeakReference(progresspuller);
    }

    public void start()
    {
        subscription.unsubscribe();
        subscription = castOperations.intervalForProgressPull().subscribe(new ProgressTickSubscriber(null));
    }

    public void stop()
    {
        subscription.unsubscribe();
    }

}
