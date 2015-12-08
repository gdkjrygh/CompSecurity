// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.waveform;

import android.content.Context;
import com.soundcloud.android.commands.ClearTableCommand;
import com.soundcloud.android.model.Urn;
import com.soundcloud.android.storage.Table;
import rx.R;
import rx.b;

// Referenced classes of package com.soundcloud.android.waveform:
//            WaveformFetchCommand, WaveformStorage, WaveformParser

public class WaveformOperations
{

    private static final String DEFAULT_WAVEFORM_ASSET_FILE = "default_waveform.json";
    public static final int DEFAULT_WAVEFORM_CACHE_SIZE = 20;
    private final ClearTableCommand clearTableCommand;
    private final Context context;
    private final R scheduler;
    private final WaveformFetchCommand waveformFetcher;
    private final WaveformParser waveformParser;
    private final WaveformStorage waveformStorage;

    WaveformOperations(Context context1, WaveformFetchCommand waveformfetchcommand, WaveformStorage waveformstorage, WaveformParser waveformparser, ClearTableCommand cleartablecommand, R r)
    {
        context = context1;
        waveformFetcher = waveformfetchcommand;
        waveformStorage = waveformstorage;
        clearTableCommand = cleartablecommand;
        scheduler = r;
        waveformParser = waveformparser;
    }

    private b fetchAndStore(Urn urn, String s)
    {
        return waveformFetcher.toObservable(s).doOnNext(storeAction(urn)).onErrorResumeNext(fetchDefault());
    }

    private rx.b.b storeAction(final Urn trackUrn)
    {
        return new _cls2();
    }

    public void clearWaveforms()
    {
        clearTableCommand.call(Table.Waveforms);
    }

    protected b fetchDefault()
    {
        return b.create(new _cls1());
    }

    public b waveformDataFor(Urn urn, String s)
    {
        return waveformStorage.load(urn).switchIfEmpty(fetchAndStore(urn, s)).subscribeOn(scheduler);
    }




    private class _cls2
        implements rx.b.b
    {

        final WaveformOperations this$0;
        final Urn val$trackUrn;

        public void call(WaveformData waveformdata)
        {
            DefaultSubscriber.fireAndForget(waveformStorage.store(trackUrn, waveformdata));
        }

        public volatile void call(Object obj)
        {
            call((WaveformData)obj);
        }

        _cls2()
        {
            this$0 = WaveformOperations.this;
            trackUrn = urn;
            super();
        }
    }


    private class _cls1
        implements rx.b.f
    {

        final WaveformOperations this$0;

        public volatile void call(Object obj)
        {
            call((X)obj);
        }

        public void call(X x)
        {
            try
            {
                x.onNext(waveformParser.parse(context.getAssets().open("default_waveform.json")));
                x.onCompleted();
                return;
            }
            catch (Exception exception)
            {
                x.onError(exception);
            }
        }

        _cls1()
        {
            this$0 = WaveformOperations.this;
            super();
        }
    }

}
