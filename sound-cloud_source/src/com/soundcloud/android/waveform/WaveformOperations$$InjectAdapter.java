// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.waveform;

import android.content.Context;
import com.soundcloud.android.commands.ClearTableCommand;
import dagger.a.b;
import dagger.a.l;
import java.util.Set;
import javax.inject.Provider;
import rx.R;

// Referenced classes of package com.soundcloud.android.waveform:
//            WaveformOperations, WaveformFetchCommand, WaveformStorage, WaveformParser

public final class  extends b
    implements Provider
{

    private b clearTableCommand;
    private b context;
    private b scheduler;
    private b storage;
    private b waveformFetcher;
    private b waveformParser;

    public final void attach(l l1)
    {
        context = l1.a("android.content.Context", com/soundcloud/android/waveform/WaveformOperations, getClass().getClassLoader());
        waveformFetcher = l1.a("com.soundcloud.android.waveform.WaveformFetchCommand", com/soundcloud/android/waveform/WaveformOperations, getClass().getClassLoader());
        storage = l1.a("com.soundcloud.android.waveform.WaveformStorage", com/soundcloud/android/waveform/WaveformOperations, getClass().getClassLoader());
        waveformParser = l1.a("com.soundcloud.android.waveform.WaveformParser", com/soundcloud/android/waveform/WaveformOperations, getClass().getClassLoader());
        clearTableCommand = l1.a("com.soundcloud.android.commands.ClearTableCommand", com/soundcloud/android/waveform/WaveformOperations, getClass().getClassLoader());
        scheduler = l1.a("@javax.inject.Named(value=LowPriority)/rx.Scheduler", com/soundcloud/android/waveform/WaveformOperations, getClass().getClassLoader());
    }

    public final WaveformOperations get()
    {
        return new WaveformOperations((Context)context.get(), (WaveformFetchCommand)waveformFetcher.get(), (WaveformStorage)storage.get(), (WaveformParser)waveformParser.get(), (ClearTableCommand)clearTableCommand.get(), (R)scheduler.get());
    }

    public final volatile Object get()
    {
        return get();
    }

    public final void getDependencies(Set set, Set set1)
    {
        set.add(context);
        set.add(waveformFetcher);
        set.add(storage);
        set.add(waveformParser);
        set.add(clearTableCommand);
        set.add(scheduler);
    }

    public ()
    {
        super("com.soundcloud.android.waveform.WaveformOperations", "members/com.soundcloud.android.waveform.WaveformOperations", false, com/soundcloud/android/waveform/WaveformOperations);
    }
}
